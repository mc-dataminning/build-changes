import java.util.function.BiConsumer;

public record nb(jl.a a) implements mt {
   @Override
   public void generate(BiConsumer<akj<erb>, erb.a> $$0) {
      jl.b<cwk> $$1 = this.a.a(lr.aW).orElseThrow();
      jl.b<cwi> $$2 = this.a.a(lr.aV).orElseThrow();
      jl.b<czm> $$3 = this.a.b(lr.aK);
      cwh $$4 = new cwh($$2.a(cwj.e).orElseThrow(), $$1.a(cwl.q).orElseThrow());
      cwh $$5 = new cwh($$2.a(cwj.e).orElseThrow(), $$1.a(cwl.r).orElseThrow());
      $$0.accept(
         eqs.aj,
         erb.b()
            .a(
               era.a()
                  .a(eva.a(1.0F))
                  .a(erp.a(a(cug.pC, cug.pD, $$5, $$3).b()).a(4))
                  .a(erp.a(a(cug.pG, cug.pH, $$4, $$3).b()).a(2))
                  .a(erp.a(a(cug.pK, cug.pL, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         eqs.al,
         erb.b()
            .a(era.a().a(eva.a(1.0F)).a(erp.a(eqs.aj)))
            .a(
               era.a()
                  .a(eva.a(1.0F))
                  .a(erj.a(cug.pb).a(4))
                  .a(erj.a(cug.pb).a(new esx.a().a($$3.b(czr.n), eva.a(1.0F))))
                  .a(erj.a(cug.pb).a(new esx.a().a($$3.b(czr.q), eva.a(1.0F))))
                  .a(erj.a(cug.pg))
            )
      );
      $$0.accept(
         eqs.ak,
         erb.b()
            .a(era.a().a(eva.a(1.0F)).a(erp.a(eqs.aj)))
            .a(
               era.a()
                  .a(eva.a(1.0F))
                  .a(erj.a(cug.ov).a(2))
                  .a(erj.a(cug.ov).a(new esx.a().a($$3.b(czr.y), eva.a(1.0F))))
                  .a(erj.a(cug.ov).a(new esx.a().a($$3.b(czr.z), eva.a(1.0F))))
            )
      );
   }

   public static erb.a a(cty $$0, cty $$1, cwh $$2, jl.b<czm> $$3) {
      return erb.b()
         .a(
            era.a()
               .a(eva.a(1.0F))
               .a(eum.a(0.5F))
               .a(erj.a($$0).a(ess.a(kn.K, $$2)).a(new esx.a().a($$3.b(czr.a), eva.a(4.0F)).a($$3.b(czr.e), eva.a(4.0F)).a($$3.b(czr.b), eva.a(4.0F))))
         )
         .a(
            era.a()
               .a(eva.a(1.0F))
               .a(eum.a(0.5F))
               .a(erj.a($$1).a(ess.a(kn.K, $$2)).a(new esx.a().a($$3.b(czr.a), eva.a(4.0F)).a($$3.b(czr.e), eva.a(4.0F)).a($$3.b(czr.b), eva.a(4.0F))))
         );
   }
}
