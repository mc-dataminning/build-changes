import java.util.function.BiConsumer;

public record ni(jp.a a) implements mz {
   @Override
   public void generate(BiConsumer<alb<etm>, etm.a> $$0) {
      jp.b<cxu> $$1 = this.a.a(lv.aY).orElseThrow();
      jp.b<cxs> $$2 = this.a.a(lv.aX).orElseThrow();
      jp.b<dbk> $$3 = this.a.b(lv.aM);
      cxr $$4 = new cxr($$2.a(cxt.e).orElseThrow(), $$1.a(cxv.q).orElseThrow());
      cxr $$5 = new cxr($$2.a(cxt.e).orElseThrow(), $$1.a(cxv.r).orElseThrow());
      $$0.accept(
         etd.aj,
         etm.b()
            .a(
               etl.a()
                  .a(exl.a(1.0F))
                  .a(eua.a(a(cvt.pD, cvt.pE, $$5, $$3).b()).a(4))
                  .a(eua.a(a(cvt.pH, cvt.pI, $$4, $$3).b()).a(2))
                  .a(eua.a(a(cvt.pL, cvt.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         etd.al,
         etm.b()
            .a(etl.a().a(exl.a(1.0F)).a(eua.a(etd.aj)))
            .a(
               etl.a()
                  .a(exl.a(1.0F))
                  .a(etu.a(cvt.pc).a(4))
                  .a(etu.a(cvt.pc).a(new evi.a().a($$3.b(dbp.n), exl.a(1.0F))))
                  .a(etu.a(cvt.pc).a(new evi.a().a($$3.b(dbp.q), exl.a(1.0F))))
                  .a(etu.a(cvt.ph))
            )
      );
      $$0.accept(
         etd.ak,
         etm.b()
            .a(etl.a().a(exl.a(1.0F)).a(eua.a(etd.aj)))
            .a(
               etl.a()
                  .a(exl.a(1.0F))
                  .a(etu.a(cvt.ow).a(2))
                  .a(etu.a(cvt.ow).a(new evi.a().a($$3.b(dbp.y), exl.a(1.0F))))
                  .a(etu.a(cvt.ow).a(new evi.a().a($$3.b(dbp.z), exl.a(1.0F))))
            )
      );
   }

   public static etm.a a(cvk $$0, cvk $$1, cxr $$2, jp.b<dbk> $$3) {
      return etm.b()
         .a(
            etl.a()
               .a(exl.a(1.0F))
               .a(ewx.a(0.5F))
               .a(etu.a($$0).a(evd.a(kr.P, $$2)).a(new evi.a().a($$3.b(dbp.a), exl.a(4.0F)).a($$3.b(dbp.e), exl.a(4.0F)).a($$3.b(dbp.b), exl.a(4.0F))))
         )
         .a(
            etl.a()
               .a(exl.a(1.0F))
               .a(ewx.a(0.5F))
               .a(etu.a($$1).a(evd.a(kr.P, $$2)).a(new evi.a().a($$3.b(dbp.a), exl.a(4.0F)).a($$3.b(dbp.e), exl.a(4.0F)).a($$3.b(dbp.b), exl.a(4.0F))))
         );
   }
}
