import java.util.function.BiConsumer;

public record nq(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<akt<ewt>, ewt.a> $$0) {
      jt.b<dic> $$1 = this.a.d(mc.aJ);
      $$0.accept(
         ewk.am,
         ewt.b()
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exh.a(ewk.an).a(10).b(-2))
                  .a(exh.a(ewk.ao).a(5).b(2).a(faa.a(ewo.b.a, bx.a.a().a(cd.a(true)))))
                  .a(exh.a(ewk.ap).a(85).b(-1))
            )
      );
      $$0.accept(ewk.ap, a());
      $$0.accept(
         ewk.an,
         ewt.b()
            .a(
               ews.a()
                  .a(exb.a(dkg.fB).a(17))
                  .a(exb.a(cxl.qi).a(10).a(eyu.a(fax.a(0.0F, 0.9F))))
                  .a(exb.a(cxl.rm).a(10))
                  .a(exb.a(cxl.sy).a(10))
                  .a(exb.a(cxl.tk).a(10).a(eyz.a(czf.a)))
                  .a(exb.a(cxl.pZ).a(5))
                  .a(exb.a(cxl.rU).a(2).a(eyu.a(fax.a(0.0F, 0.9F))))
                  .a(exb.a(cxl.pa).a(10))
                  .a(exb.a(cxl.pX).a(5))
                  .a(exb.a(cxl.se).a(1).a(eyt.a(faq.a(10.0F))))
                  .a(exb.a(dkg.gc).a(10))
                  .a(exb.a(cxl.td).a(10))
                  .a(exb.a(dkg.nB).a(ezv.a(di.a.a().a(jv.a($$1.b(dij.y), $$1.b(dij.z), $$1.b(dij.A))))).a(10))
            )
      );
      $$0.accept(
         ewk.ao,
         ewt.b()
            .a(
               ews.a()
                  .a(exb.a(cxl.vN))
                  .a(exb.a(cxl.op))
                  .a(exb.a(cxl.pc).a(eyu.a(fax.a(0.0F, 0.25F))).a(exs.a(this.a, faq.a(30.0F))))
                  .a(exb.a(cxl.rU).a(eyu.a(fax.a(0.0F, 0.25F))).a(exs.a(this.a, faq.a(30.0F))))
                  .a(exb.a(cxl.ry).a(exs.a(this.a, faq.a(30.0F))))
                  .a(exb.a(cxl.wV))
            )
      );
   }

   public static ewt.a a() {
      return ewt.b().a(ews.a().a(exb.a(cxl.rY).a(60)).a(exb.a(cxl.rZ).a(25)).a(exb.a(cxl.sa).a(2)).a(exb.a(cxl.sb).a(13)));
   }

   public jt.a b() {
      return this.a;
   }
}
