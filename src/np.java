import java.util.function.BiConsumer;

public record np(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<akt<ewt>, ewt.a> $$0) {
      jt.b<dfr> $$1 = this.a.d(mc.bc);
      jt.b<dfp> $$2 = this.a.d(mc.bb);
      jt.b<ddr> $$3 = this.a.d(mc.aP);
      dfo $$4 = new dfo($$2.b(dfq.e), $$1.b(dfs.q));
      dfo $$5 = new dfo($$2.b(dfq.e), $$1.b(dfs.r));
      $$0.accept(
         ewk.ai,
         ewt.b()
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exh.a(a(cxl.qj, cxl.qk, $$5, $$3).b()).a(4))
                  .a(exh.a(a(cxl.qn, cxl.qo, $$4, $$3).b()).a(2))
                  .a(exh.a(a(cxl.qr, cxl.qs, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ewk.ak,
         ewt.b()
            .a(ews.a().a(faq.a(1.0F)).a(exh.a(ewk.ai)))
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exb.a(cxl.pI).a(4))
                  .a(exb.a(cxl.pI).a(new eyp.a().a($$3.b(ddw.n), faq.a(1.0F))))
                  .a(exb.a(cxl.pI).a(new eyp.a().a($$3.b(ddw.q), faq.a(1.0F))))
                  .a(exb.a(cxl.pN))
            )
      );
      $$0.accept(
         ewk.aj,
         ewt.b()
            .a(ews.a().a(faq.a(1.0F)).a(exh.a(ewk.ai)))
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exb.a(cxl.pc).a(2))
                  .a(exb.a(cxl.pc).a(new eyp.a().a($$3.b(ddw.y), faq.a(1.0F))))
                  .a(exb.a(cxl.pc).a(new eyp.a().a($$3.b(ddw.z), faq.a(1.0F))))
            )
      );
   }

   public static ewt.a a(cxd $$0, cxd $$1, dfo $$2, jt.b<ddr> $$3) {
      return ewt.b()
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(fac.a(0.5F))
               .a(exb.a($$0).a(eyk.a(kv.W, $$2)).a(new eyp.a().a($$3.b(ddw.a), faq.a(4.0F)).a($$3.b(ddw.e), faq.a(4.0F)).a($$3.b(ddw.b), faq.a(4.0F))))
         )
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(fac.a(0.5F))
               .a(exb.a($$1).a(eyk.a(kv.W, $$2)).a(new eyp.a().a($$3.b(ddw.a), faq.a(4.0F)).a($$3.b(ddw.e), faq.a(4.0F)).a($$3.b(ddw.b), faq.a(4.0F))))
         );
   }
}
