
package views.html.photos

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Photo],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(group: String, photos: List[Photo]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.38*/("""
<div class="row">
	"""),_display_(Seq[Any](/*3.3*/for(  photo  <- photos.take(3) ) yield /*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
            """),_display_(Seq[Any](/*4.14*/views/*4.19*/.html.photos.item(photo))),format.raw/*4.43*/("""
	""")))})),format.raw/*5.3*/("""
</div>
<div class="row">
        """),_display_(Seq[Any](/*8.10*/for(  photo  <- photos.drop(3).take(3) ) yield /*8.50*/ {_display_(Seq[Any](format.raw/*8.52*/("""
            """),_display_(Seq[Any](/*9.14*/views/*9.19*/.html.photos.item(photo))),format.raw/*9.43*/("""
        """)))})),format.raw/*10.10*/("""
</div>
<div class="row">
        """),_display_(Seq[Any](/*13.10*/for(  photo  <- photos.drop(6).take(3) ) yield /*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
            """),_display_(Seq[Any](/*14.14*/views/*14.19*/.html.photos.item(photo))),format.raw/*14.43*/("""
        """)))})),format.raw/*15.10*/("""
</div>
<div class="row">
        """),_display_(Seq[Any](/*18.10*/for(  photo  <- photos.drop(9).take(3) ) yield /*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
            """),_display_(Seq[Any](/*19.14*/views/*19.19*/.html.photos.item(photo))),format.raw/*19.43*/("""
        """)))})),format.raw/*20.10*/("""
</div>
"""))}
    }
    
    def render(group:String,photos:List[Photo]): play.api.templates.HtmlFormat.Appendable = apply(group,photos)
    
    def f:((String,List[Photo]) => play.api.templates.HtmlFormat.Appendable) = (group,photos) => apply(group,photos)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 23:15:54 CST 2014
                    SOURCE: /home/jimmy/git/playframework/samples/java/zentasks/app/views/photos/group.scala.html
                    HASH: e8dede1b2f4c30606e69dfed27930c555646f4fc
                    MATRIX: 793->1|923->37|978->58|1025->90|1064->92|1113->106|1126->111|1171->135|1204->138|1274->173|1329->213|1368->215|1417->229|1430->234|1475->258|1517->268|1588->303|1644->343|1684->345|1734->359|1748->364|1794->388|1836->398|1907->433|1963->473|2003->475|2053->489|2067->494|2113->518|2155->528
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|41->13|41->13|41->13|42->14|42->14|42->14|43->15|46->18|46->18|46->18|47->19|47->19|47->19|48->20
                    -- GENERATED --
                */
            