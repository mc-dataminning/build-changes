import java.util.function.BiConsumer;

public record nq(js.a a) implements nh {
   @Override
   public void generate(BiConsumer<aly<ewt>, ewt.a> $$0) {
      js.b<dfy> $$1 = this.a.d(mb.ba);
      js.b<dfw> $$2 = this.a.d(mb.aZ);
      js.b<ddy> $$3 = this.a.d(mb.aO);
      dfv $$4 = new dfv($$2.b(dfx.e), $$1.b(dfz.q));
      dfv $$5 = new dfv($$2.b(dfx.e), $$1.b(dfz.r));
      $$0.accept(
         ewk.ai,
         ewt.b()
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exh.a(a(cxs.pY, cxs.pZ, $$5, $$3).b()).a(4))
                  .a(exh.a(a(cxs.qc, cxs.qd, $$4, $$3).b()).a(2))
                  .a(exh.a(a(cxs.qg, cxs.qh, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ewk.ak,
         ewt.b()
            .a(ews.a().a(faq.a(1.0F)).a(exh.a(ewk.ai)))
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exb.a(cxs.px).a(4))
                  .a(exb.a(cxs.px).a(new eyp.a().a($$3.b(ded.n), faq.a(1.0F))))
                  .a(exb.a(cxs.px).a(new eyp.a().a($$3.b(ded.q), faq.a(1.0F))))
                  .a(exb.a(cxs.pC))
            )
      );
      $$0.accept(
         ewk.aj,
         ewt.b()
            .a(ews.a().a(faq.a(1.0F)).a(exh.a(ewk.ai)))
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exb.a(cxs.oR).a(2))
                  .a(exb.a(cxs.oR).a(new eyp.a().a($$3.b(ded.y), faq.a(1.0F))))
                  .a(exb.a(cxs.oR).a(new eyp.a().a($$3.b(ded.z), faq.a(1.0F))))
            )
      );
   }

   public static ewt.a a(cxk $$0, cxk $$1, dfv $$2, js.b<ddy> $$3) {
      return ewt.b()
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(fac.a(0.5F))
               .a(exb.a($$0).a(eyk.a(ku.U, $$2)).a(new eyp.a().a($$3.b(ded.a), faq.a(4.0F)).a($$3.b(ded.e), faq.a(4.0F)).a($$3.b(ded.b), faq.a(4.0F))))
         )
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(fac.a(0.5F))
               .a(exb.a($$1).a(eyk.a(ku.U, $$2)).a(new eyp.a().a($$3.b(ded.a), faq.a(4.0F)).a($$3.b(ded.e), faq.a(4.0F)).a($$3.b(ded.b), faq.a(4.0F))))
         );
   }
}
