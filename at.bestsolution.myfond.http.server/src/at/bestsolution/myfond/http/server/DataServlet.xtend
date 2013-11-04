package at.bestsolution.myfond.http.server

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.ServletException
import java.io.IOException
import org.osgi.framework.FrameworkUtil
import at.bestsolution.myfond.datasource.DatasourceFactory
import at.bestsolution.myfond.model.myfond.MyFond
import at.bestsolution.myfond.model.myfond.Fond
import at.bestsolution.myfond.model.myfond.CurrencyDistribution
import at.bestsolution.myfond.model.myfond.CountryDistribution
import at.bestsolution.myfond.model.myfond.SectorDistribution
import at.bestsolution.myfond.model.myfond.AssetDistribution

class DataServlet extends HttpServlet {
	
	override protected doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		val ds = getDataSource()
		resp.writer.append(ds.root.jsonDoc)
	}
	
	def jsonDoc(MyFond myFond) '''
	{
		data : [
			«myFond.fondList.map[jsonFond].join(",")»
		]
	}
	'''
	
	def jsonFond(Fond f) '''
	{
		risk : "«f.risk.name»",
		id : "«f.id»",
		name : "«f.name»",
		assetFee : «f.assetBasedFee»,
		managementFee : «f.managementFee»,
		description : "«f.targetDefinition»",
		currencyDistribution : [ «f.currencyDistributionList.map[jsonCurrency].join(",")» ],
		assetDistribution : [ «f.assetDistributionList.map[jsonAsset].join(",")» ],
		countryDistribution : [ «f.countryDistributionList.map[jsonCountry].join(",")» ],
		sectorDistribution : [ «f.sectorDistributionList.map[jsonSector].join(",")» ]
	}
	'''
	
	def jsonCurrency(CurrencyDistribution cd) '''
	{
		name : "«cd.currency.name»",
		value : «cd.percentage»
	}
	'''
	
	def jsonCountry(CountryDistribution cd) '''
	{
		name : "«cd.country.name»",
		value : «cd.percentage»
	}
	'''
	
	def jsonSector(SectorDistribution cd) '''
	{
		name : "«cd.sector.name»",
		value : «cd.percentage»
	}
	'''
	
	def jsonAsset(AssetDistribution cd) '''
	{
		name : "«cd.asset.name»",
		value : «cd.percentage»
	}
	'''
	
	def getDataSource() {
		val bundle = FrameworkUtil.getBundle(getClass())
		val context = bundle.getBundleContext()
		val reference = context.getServiceReference(DatasourceFactory)
		val datasourceFactory = context.getService(reference)
		return datasourceFactory.createDatasource()
	}
}