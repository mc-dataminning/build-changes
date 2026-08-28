import java.util.function.BiConsumer;

public record nc(jl.a a) implements mt {
   @Override
   public void generate(BiConsumer<akj<eqz>, eqz.a> $$0) {
      jl.b<ddf> $$1 = this.a.b(lr.aE);
      $$0.accept(
         eqq.aC,
         eqz.b()
            .a(
               eqy.a()
                  .a(euy.a(1.0F))
                  .a(ern.a(eqq.aD).a(10).b(-2))
                  .a(ern.a(eqq.aE).a(5).b(2).a(eui.a(equ.b.a, bu.a.a().a(ca.a(true)))))
                  .a(ern.a(eqq.aF).a(85).b(-1))
            )
      );
      $$0.accept(eqq.aF, a());
      $$0.accept(
         eqq.aD,
         eqz.b()
            .a(
               eqy.a()
                  .a(erh.a(dfj.fm).a(17))
                  .a(erh.a(cuf.pB).a(10).a(eta.a(evf.a(0.0F, 0.9F))))
                  .a(erh.a(cuf.qD).a(10))
                  .a(erh.a(cuf.rz).a(10))
                  .a(erh.a(cuf.sk).a(10).a(etf.a(cwe.a)))
                  .a(erh.a(cuf.ps).a(5))
                  .a(erh.a(cuf.qV).a(2).a(eta.a(evf.a(0.0F, 0.9F))))
                  .a(erh.a(cuf.ot).a(10))
                  .a(erh.a(cuf.pq).a(5))
                  .a(erh.a(cuf.rf).a(1).a(esz.a(euy.a(10.0F))))
                  .a(erh.a(dfj.fH).a(10))
                  .a(erh.a(cuf.se).a(10))
                  .a(erh.a(dfj.mZ).a(eud.a(dc.a.a().a(jn.a($$1.b(ddm.x), $$1.b(ddm.y), $$1.b(ddm.z))))).a(10))
            )
      );
      $$0.accept(
         eqq.aE,
         eqz.b()
            .a(
               eqy.a()
                  .a(erh.a(cuf.uL))
                  .a(erh.a(cuf.nL))
                  .a(erh.a(cuf.ov).a(eta.a(evf.a(0.0F, 0.25F))).a(ery.a(this.a, euy.a(30.0F))))
                  .a(erh.a(cuf.qV).a(eta.a(evf.a(0.0F, 0.25F))).a(ery.a(this.a, euy.a(30.0F))))
                  .a(erh.a(cuf.qP).a(ery.a(this.a, euy.a(30.0F))))
                  .a(erh.a(cuf.vU))
            )
      );
   }

   public static eqz.a a() {
      return eqz.b().a(eqy.a().a(erh.a(cuf.qZ).a(60)).a(erh.a(cuf.ra).a(25)).a(erh.a(cuf.rb).a(2)).a(erh.a(cuf.rc).a(13)));
   }

   public jl.a b() {
      return this.a;
   }
}
