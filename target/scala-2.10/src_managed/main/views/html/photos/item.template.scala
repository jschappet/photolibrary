
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Photo,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(photo: Photo):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""


  <div class="col-md-4" data-photo=""""),_display_(Seq[Any](/*4.38*/photo/*4.43*/.id)),format.raw/*4.46*/("""">
        <div style="height: 200px">
                <a rel="group" href=""""),_display_(Seq[Any](/*6.39*/photo/*6.44*/.url)),format.raw/*6.48*/("""">
                <img  src=""""),_display_(Seq[Any](/*7.29*/photo/*7.34*/.url)),format.raw/*7.38*/(""""" alt=""""),_display_(Seq[Any](/*7.47*/photo/*7.52*/.name)),format.raw/*7.57*/(""""  style="max-height: 100%; max-width: 100%" /> </a>
        </div>
  </div>

"""))}
    }
    
    def render(photo:Photo): play.api.templates.HtmlFormat.Appendable = apply(photo)
    
    def f:((Photo) => play.api.templates.HtmlFormat.Appendable) = (photo) => apply(photo)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 02:56:11 CST 2014
                    SOURCE: /home/jimmy/git/playframework/samples/java/zentasks/app/views/photos/item.scala.html
                    HASH: 3d391994c8009f639ebe99fa4c941ace8a4770fd
                    MATRIX: 779->1|887->15|962->55|975->60|999->63|1111->140|1124->145|1149->149|1215->180|1228->185|1253->189|1297->198|1310->203|1336->208
                    LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|34->6|35->7|35->7|35->7|35->7|35->7|35->7
                    -- GENERATED --
                */
            