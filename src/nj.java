import java.util.function.BiConsumer;

public record nj(jp.a a) implements mz {
   @Override
   public void generate(BiConsumer<alb<etm>, etm.a> $$0) {
      jp.b<dfh> $$1 = this.a.b(lv.aG);
      $$0.accept(
         etd.ao,
         etm.b()
            .a(
               etl.a()
                  .a(exl.a(1.0F))
                  .a(eua.a(etd.ap).a(10).b(-2))
                  .a(eua.a(etd.aq).a(5).b(2).a(ewv.a(eth.b.a, bv.a.a().a(cb.a(true)))))
                  .a(eua.a(etd.ar).a(85).b(-1))
            )
      );
      $$0.accept(etd.ar, a());
      $$0.accept(
         etd.ap,
         etm.b()
            .a(
               etl.a()
                  .a(etu.a(dhl.fm).a(17))
                  .a(etu.a(cvt.pC).a(10).a(evn.a(exs.a(0.0F, 0.9F))))
                  .a(etu.a(cvt.qE).a(10))
                  .a(etu.a(cvt.rA).a(10))
                  .a(etu.a(cvt.sm).a(10).a(evs.a(cxp.a)))
                  .a(etu.a(cvt.pt).a(5))
                  .a(etu.a(cvt.qW).a(2).a(evn.a(exs.a(0.0F, 0.9F))))
                  .a(etu.a(cvt.ou).a(10))
                  .a(etu.a(cvt.pr).a(5))
                  .a(etu.a(cvt.rg).a(1).a(evm.a(exl.a(10.0F))))
                  .a(etu.a(dhl.fH).a(10))
                  .a(etu.a(cvt.sf).a(10))
                  .a(etu.a(dhl.mZ).a(ewq.a(df.a.a().a(jr.a($$1.b(dfo.x), $$1.b(dfo.y), $$1.b(dfo.z))))).a(10))
            )
      );
      $$0.accept(
         etd.aq,
         etm.b()
            .a(
               etl.a()
                  .a(etu.a(cvt.uN))
                  .a(etu.a(cvt.nL))
                  .a(etu.a(cvt.ow).a(evn.a(exs.a(0.0F, 0.25F))).a(eul.a(this.a, exl.a(30.0F))))
                  .a(etu.a(cvt.qW).a(evn.a(exs.a(0.0F, 0.25F))).a(eul.a(this.a, exl.a(30.0F))))
                  .a(etu.a(cvt.qQ).a(eul.a(this.a, exl.a(30.0F))))
                  .a(etu.a(cvt.vV))
            )
      );
   }

   public static etm.a a() {
      return etm.b().a(etl.a().a(etu.a(cvt.ra).a(60)).a(etu.a(cvt.rb).a(25)).a(etu.a(cvt.rc).a(2)).a(etu.a(cvt.rd).a(13)));
   }

   public jp.a b() {
      return this.a;
   }
}
