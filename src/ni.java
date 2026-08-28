import java.util.function.BiConsumer;

public record ni(jp.a a) implements mz {
   @Override
   public void generate(BiConsumer<ala<esy>, esy.a> $$0) {
      jp.b<cxt> $$1 = this.a.a(lv.aX).orElseThrow();
      jp.b<cxr> $$2 = this.a.a(lv.aW).orElseThrow();
      jp.b<daw> $$3 = this.a.b(lv.aL);
      cxq $$4 = new cxq($$2.a(cxs.e).orElseThrow(), $$1.a(cxu.q).orElseThrow());
      cxq $$5 = new cxq($$2.a(cxs.e).orElseThrow(), $$1.a(cxu.r).orElseThrow());
      $$0.accept(
         esp.aj,
         esy.b()
            .a(
               esx.a()
                  .a(ewx.a(1.0F))
                  .a(etm.a(a(cvo.pD, cvo.pE, $$5, $$3).b()).a(4))
                  .a(etm.a(a(cvo.pH, cvo.pI, $$4, $$3).b()).a(2))
                  .a(etm.a(a(cvo.pL, cvo.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         esp.al,
         esy.b()
            .a(esx.a().a(ewx.a(1.0F)).a(etm.a(esp.aj)))
            .a(
               esx.a()
                  .a(ewx.a(1.0F))
                  .a(etg.a(cvo.pc).a(4))
                  .a(etg.a(cvo.pc).a(new euu.a().a($$3.b(dbb.n), ewx.a(1.0F))))
                  .a(etg.a(cvo.pc).a(new euu.a().a($$3.b(dbb.q), ewx.a(1.0F))))
                  .a(etg.a(cvo.ph))
            )
      );
      $$0.accept(
         esp.ak,
         esy.b()
            .a(esx.a().a(ewx.a(1.0F)).a(etm.a(esp.aj)))
            .a(
               esx.a()
                  .a(ewx.a(1.0F))
                  .a(etg.a(cvo.ow).a(2))
                  .a(etg.a(cvo.ow).a(new euu.a().a($$3.b(dbb.y), ewx.a(1.0F))))
                  .a(etg.a(cvo.ow).a(new euu.a().a($$3.b(dbb.z), ewx.a(1.0F))))
            )
      );
   }

   public static esy.a a(cvg $$0, cvg $$1, cxq $$2, jp.b<daw> $$3) {
      return esy.b()
         .a(
            esx.a()
               .a(ewx.a(1.0F))
               .a(ewj.a(0.5F))
               .a(etg.a($$0).a(eup.a(kr.M, $$2)).a(new euu.a().a($$3.b(dbb.a), ewx.a(4.0F)).a($$3.b(dbb.e), ewx.a(4.0F)).a($$3.b(dbb.b), ewx.a(4.0F))))
         )
         .a(
            esx.a()
               .a(ewx.a(1.0F))
               .a(ewj.a(0.5F))
               .a(etg.a($$1).a(eup.a(kr.M, $$2)).a(new euu.a().a($$3.b(dbb.a), ewx.a(4.0F)).a($$3.b(dbb.e), ewx.a(4.0F)).a($$3.b(dbb.b), ewx.a(4.0F))))
         );
   }
}
