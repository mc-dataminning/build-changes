import java.util.function.BiConsumer;

public record nj(jp.a a) implements mz {
   @Override
   public void generate(BiConsumer<ala<esy>, esy.a> $$0) {
      jp.b<det> $$1 = this.a.b(lv.aF);
      $$0.accept(
         esp.ao,
         esy.b()
            .a(
               esx.a()
                  .a(ewx.a(1.0F))
                  .a(etm.a(esp.ap).a(10).b(-2))
                  .a(etm.a(esp.aq).a(5).b(2).a(ewh.a(est.b.a, bv.a.a().a(cb.a(true)))))
                  .a(etm.a(esp.ar).a(85).b(-1))
            )
      );
      $$0.accept(esp.ar, a());
      $$0.accept(
         esp.ap,
         esy.b()
            .a(
               esx.a()
                  .a(etg.a(dgx.fm).a(17))
                  .a(etg.a(cvo.pC).a(10).a(euz.a(exe.a(0.0F, 0.9F))))
                  .a(etg.a(cvo.qE).a(10))
                  .a(etg.a(cvo.rA).a(10))
                  .a(etg.a(cvo.sl).a(10).a(eve.a(cxo.a)))
                  .a(etg.a(cvo.pt).a(5))
                  .a(etg.a(cvo.qW).a(2).a(euz.a(exe.a(0.0F, 0.9F))))
                  .a(etg.a(cvo.ou).a(10))
                  .a(etg.a(cvo.pr).a(5))
                  .a(etg.a(cvo.rg).a(1).a(euy.a(ewx.a(10.0F))))
                  .a(etg.a(dgx.fH).a(10))
                  .a(etg.a(cvo.sf).a(10))
                  .a(etg.a(dgx.mZ).a(ewc.a(df.a.a().a(jr.a($$1.b(dfa.x), $$1.b(dfa.y), $$1.b(dfa.z))))).a(10))
            )
      );
      $$0.accept(
         esp.aq,
         esy.b()
            .a(
               esx.a()
                  .a(etg.a(cvo.uN))
                  .a(etg.a(cvo.nL))
                  .a(etg.a(cvo.ow).a(euz.a(exe.a(0.0F, 0.25F))).a(etx.a(this.a, ewx.a(30.0F))))
                  .a(etg.a(cvo.qW).a(euz.a(exe.a(0.0F, 0.25F))).a(etx.a(this.a, ewx.a(30.0F))))
                  .a(etg.a(cvo.qQ).a(etx.a(this.a, ewx.a(30.0F))))
                  .a(etg.a(cvo.vV))
            )
      );
   }

   public static esy.a a() {
      return esy.b().a(esx.a().a(etg.a(cvo.ra).a(60)).a(etg.a(cvo.rb).a(25)).a(etg.a(cvo.rc).a(2)).a(etg.a(cvo.rd).a(13)));
   }

   public jp.a b() {
      return this.a;
   }
}
