import java.util.function.BiConsumer;

public record nr(js.a a) implements nh {
   @Override
   public void generate(BiConsumer<aly<ewt>, ewt.a> $$0) {
      js.b<dij> $$1 = this.a.d(mb.aI);
      $$0.accept(
         ewk.am,
         ewt.b()
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exh.a(ewk.an).a(10).b(-2))
                  .a(exh.a(ewk.ao).a(5).b(2).a(faa.a(ewo.b.a, bw.a.a().a(cc.a(true)))))
                  .a(exh.a(ewk.ap).a(85).b(-1))
            )
      );
      $$0.accept(ewk.ap, a());
      $$0.accept(
         ewk.an,
         ewt.b()
            .a(
               ews.a()
                  .a(exb.a(dkn.fA).a(17))
                  .a(exb.a(cxs.pX).a(10).a(eyu.a(fax.a(0.0F, 0.9F))))
                  .a(exb.a(cxs.rb).a(10))
                  .a(exb.a(cxs.sn).a(10))
                  .a(exb.a(cxs.sZ).a(10).a(eyz.a(czo.a)))
                  .a(exb.a(cxs.pO).a(5))
                  .a(exb.a(cxs.rJ).a(2).a(eyu.a(fax.a(0.0F, 0.9F))))
                  .a(exb.a(cxs.oP).a(10))
                  .a(exb.a(cxs.pM).a(5))
                  .a(exb.a(cxs.rT).a(1).a(eyt.a(faq.a(10.0F))))
                  .a(exb.a(dkn.fV).a(10))
                  .a(exb.a(cxs.sS).a(10))
                  .a(exb.a(dkn.nu).a(ezv.a(dh.a.a().a(ju.a($$1.b(diq.x), $$1.b(diq.y), $$1.b(diq.z))))).a(10))
            )
      );
      $$0.accept(
         ewk.ao,
         ewt.b()
            .a(
               ews.a()
                  .a(exb.a(cxs.vB))
                  .a(exb.a(cxs.oe))
                  .a(exb.a(cxs.oR).a(eyu.a(fax.a(0.0F, 0.25F))).a(exs.a(this.a, faq.a(30.0F))))
                  .a(exb.a(cxs.rJ).a(eyu.a(fax.a(0.0F, 0.25F))).a(exs.a(this.a, faq.a(30.0F))))
                  .a(exb.a(cxs.rn).a(exs.a(this.a, faq.a(30.0F))))
                  .a(exb.a(cxs.wJ))
            )
      );
   }

   public static ewt.a a() {
      return ewt.b().a(ews.a().a(exb.a(cxs.rN).a(60)).a(exb.a(cxs.rO).a(25)).a(exb.a(cxs.rP).a(2)).a(exb.a(cxs.rQ).a(13)));
   }

   public js.a b() {
      return this.a;
   }
}
