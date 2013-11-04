package application;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import application.model.AssetDistributionValue;
import application.model.CountryDistributionValue;
import application.model.CurrencyDistributionValue;
import application.model.Fond;
import application.model.SectorDistributionValue;

public class DatasourceProvider {
	private ObservableList<Fond> fonds = FXCollections.observableArrayList();
	private static final String HOST = "192.168.1.101";
//	private static final String HOST = "localhost";
	
	public DatasourceProvider() {
		try {
			URL url = new URL("http://"+HOST+":8080/myfonddata");
			fonds.addAll(convert(url.openStream()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		fonds.addAll(convert(getClass().getClassLoader().getResourceAsStream("dummy.json")));
		
		Timer t = new Timer(true);
		t.scheduleAtFixedRate(new UpdateTask(fonds), 10*1000, 10*1000);
		
	}
	
	static class UpdateTask extends TimerTask {
		private final ObservableList<Fond> fonds;
		
		public UpdateTask(ObservableList<Fond> fonds) {
			this.fonds = fonds;
		}
		
		@Override
		public void run() {
			try {
				System.err.println("UPDATING ....");
				URL url = new URL("http://"+HOST+":8080/myfonddata");
				final List<Fond> newFonds = convert(url.openStream());
				final List<Fond> copy = new ArrayList<>(fonds);
				final List<Fond> targetList = fonds;
				Platform.runLater(new Runnable() {
					
					@Override
					public void run() {
						for( Fond f : newFonds ) {
							if( ! merge(f) ) {
								targetList.add(f);
							}
							copy.remove(f);
						}
						
						targetList.removeAll(copy);
					}
				});
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private boolean merge(Fond merge) {
			for( Fond f : fonds ) {
				if( f.equals(merge) ) {
					f.merge(merge);
					return true;
				}
			}
			return false;
		}
	}
	
	private static List<Fond> convert(InputStream in) {
		List<Fond> rv = new ArrayList<>();
		try {
			StringBuffer b = new StringBuffer();
			byte[] buf = new byte[1024];
			int l = 0;
			while( (l = in.read(buf)) != -1 ) {
				b.append(new String(buf,0,l));
			}
			in.close();
			JSONTokener tk = new JSONTokener(b.toString());
			JSONObject o = new JSONObject(tk);
			JSONArray array = o.getJSONArray("data");
			
			for( int i = 0; i < array.length(); i++ ) {
				Fond f = new Fond();
				JSONObject fo = array.getJSONObject(i); 
				f.setId(fo.getString("id"));
				f.setName(fo.getString("name"));
				f.setRisk(fo.getString("risk"));
				f.setAssetFee(fo.getDouble("assetFee"));
				f.setManagementFee(fo.getDouble("managementFee"));
				f.setDescription(fo.getString("description"));
				
				JSONArray currencyDist = fo.getJSONArray("currencyDistribution");
				
				for( int j = 0; j < currencyDist.length(); j++ ) {
					JSONObject vo = currencyDist.getJSONObject(j);
					CurrencyDistributionValue v = new CurrencyDistributionValue();
					v.setName(vo.getString("name"));
					v.setPercentage(vo.getDouble("value"));
					f.getCurrencyDistribution().add(v);
				}
				
				JSONArray countryDist = fo.getJSONArray("countryDistribution");
				
				for( int j = 0; j < countryDist.length(); j++ ) {
					JSONObject vo = countryDist.getJSONObject(j);
					CountryDistributionValue v = new CountryDistributionValue();
					v.setName(vo.getString("name"));
					v.setPercentage(vo.getDouble("value"));
					f.getCountryDistribution().add(v);
				}
				
				JSONArray assetDist = fo.getJSONArray("assetDistribution");
				
				for( int j = 0; j < assetDist.length(); j++ ) {
					JSONObject vo = assetDist.getJSONObject(j);
					AssetDistributionValue v = new AssetDistributionValue();
					v.setName(vo.getString("name"));
					v.setPercentage(vo.getDouble("value"));
					f.getAssetDistribution().add(v);
				}
				
				JSONArray sectorDist = fo.getJSONArray("sectorDistribution");
				
				for( int j = 0; j < sectorDist.length(); j++ ) {
					JSONObject vo = sectorDist.getJSONObject(j);
					SectorDistributionValue v = new SectorDistributionValue();
					v.setName(vo.getString("name"));
					v.setPercentage(vo.getDouble("value"));
					f.getSectorDistribution().add(v);
				}
				
				rv.add(f);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rv;
	}
	
	public ObservableList<Fond> getFonds() {
		return fonds;
	}
}
