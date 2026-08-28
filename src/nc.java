import java.util.function.BiConsumer;

public record nc(jl.a a) implements mt {
   @Override
   public void generate(BiConsumer<akj<erb>, erb.a> $$0) {
      jl.b<ddg> $$1 = this.a.b(lr.aE);
      $$0.accept(
         eqs.aC,
         erb.b()
            .a(
               era.a()
                  .a(eva.a(1.0F))
                  .a(erp.a(eqs.aD).a(10).b(-2))
                  .a(erp.a(eqs.aE).a(5).b(2).a(euk.a(eqw.b.a, bu.a.a().a(ca.a(true)))))
                  .a(erp.a(eqs.aF).a(85).b(-1))
            )
      );
      $$0.accept(eqs.aF, a());
      $$0.accept(
         eqs.aD,
         erb.b()
            .a(
               era.a()
                  .a(erj.a(dfk.fm).a(17))
                  .a(erj.a(cug.pB).a(10).a(etc.a(evh.a(0.0F, 0.9F))))
                  .a(erj.a(cug.qD).a(10))
                  .a(erj.a(cug.rz).a(10))
                  .a(erj.a(cug.sk).a(10).a(eth.a(cwf.a)))
                  .a(erj.a(cug.ps).a(5))
                  .a(erj.a(cug.qV).a(2).a(etc.a(evh.a(0.0F, 0.9F))))
                  .a(erj.a(cug.ot).a(10))
                  .a(erj.a(cug.pq).a(5))
                  .a(erj.a(cug.rf).a(1).a(etb.a(eva.a(10.0F))))
                  .a(erj.a(dfk.fH).a(10))
                  .a(erj.a(cug.se).a(10))
                  .a(erj.a(dfk.mZ).a(euf.a(dc.a.a().a(jn.a($$1.b(ddn.x), $$1.b(ddn.y), $$1.b(ddn.z))))).a(10))
            )
      );
      $$0.accept(
         eqs.aE,
         erb.b()
            .a(
               era.a()
                  .a(erj.a(cug.uL))
                  .a(erj.a(cug.nL))
                  .a(erj.a(cug.ov).a(etc.a(evh.a(0.0F, 0.25F))).a(esa.a(this.a, eva.a(30.0F))))
                  .a(erj.a(cug.qV).a(etc.a(evh.a(0.0F, 0.25F))).a(esa.a(this.a, eva.a(30.0F))))
                  .a(erj.a(cug.qP).a(esa.a(this.a, eva.a(30.0F))))
                  .a(erj.a(cug.vU))
            )
      );
   }

   public static erb.a a() {
      return erb.b().a(era.a().a(erj.a(cug.qZ).a(60)).a(erj.a(cug.ra).a(25)).a(erj.a(cug.rb).a(2)).a(erj.a(cug.rc).a(13)));
   }

   public jl.a b() {
      return this.a;
   }
}
