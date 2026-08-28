import java.util.function.BiConsumer;

public record nc(jl.a a) implements mt {
   @Override
   public void generate(BiConsumer<akj<eqt>, eqt.a> $$0) {
      jl.b<ddd> $$1 = this.a.b(lr.aE);
      $$0.accept(
         eqk.aC,
         eqt.b()
            .a(
               eqs.a()
                  .a(eus.a(1.0F))
                  .a(erh.a(eqk.aD).a(10).b(-2))
                  .a(erh.a(eqk.aE).a(5).b(2).a(euc.a(eqo.b.a, bu.a.a().a(ca.a(true)))))
                  .a(erh.a(eqk.aF).a(85).b(-1))
            )
      );
      $$0.accept(eqk.aF, a());
      $$0.accept(
         eqk.aD,
         eqt.b()
            .a(
               eqs.a()
                  .a(erb.a(dfh.fm).a(17))
                  .a(erb.a(cud.pB).a(10).a(esu.a(euz.a(0.0F, 0.9F))))
                  .a(erb.a(cud.qD).a(10))
                  .a(erb.a(cud.rz).a(10))
                  .a(erb.a(cud.sk).a(10).a(esz.a(cwc.a)))
                  .a(erb.a(cud.ps).a(5))
                  .a(erb.a(cud.qV).a(2).a(esu.a(euz.a(0.0F, 0.9F))))
                  .a(erb.a(cud.pq).a(10))
                  .a(erb.a(cud.pp).a(5))
                  .a(erb.a(cud.rf).a(1).a(est.a(eus.a(10.0F))))
                  .a(erb.a(dfh.fH).a(10))
                  .a(erb.a(cud.se).a(10))
                  .a(erb.a(dfh.mZ).a(etx.a(dc.a.a().a(jn.a($$1.b(ddk.x), $$1.b(ddk.y), $$1.b(ddk.z))))).a(10))
            )
      );
      $$0.accept(
         eqk.aE,
         eqt.b()
            .a(
               eqs.a()
                  .a(erb.a(cud.uL))
                  .a(erb.a(cud.nL))
                  .a(erb.a(cud.ou).a(esu.a(euz.a(0.0F, 0.25F))).a(ers.a(this.a, eus.a(30.0F))))
                  .a(erb.a(cud.qV).a(esu.a(euz.a(0.0F, 0.25F))).a(ers.a(this.a, eus.a(30.0F))))
                  .a(erb.a(cud.qP).a(ers.a(this.a, eus.a(30.0F))))
                  .a(erb.a(cud.vU))
            )
      );
   }

   public static eqt.a a() {
      return eqt.b().a(eqs.a().a(erb.a(cud.qZ).a(60)).a(erb.a(cud.ra).a(25)).a(erb.a(cud.rb).a(2)).a(erb.a(cud.rc).a(13)));
   }

   public jl.a b() {
      return this.a;
   }
}
