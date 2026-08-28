import java.util.function.BiConsumer;

public record nb(jl.a a) implements mt {
   @Override
   public void generate(BiConsumer<akj<eqt>, eqt.a> $$0) {
      jl.b<cwh> $$1 = this.a.a(lr.aW).orElseThrow();
      jl.b<cwf> $$2 = this.a.a(lr.aV).orElseThrow();
      jl.b<czj> $$3 = this.a.b(lr.aK);
      cwe $$4 = new cwe($$2.a(cwg.e).orElseThrow(), $$1.a(cwi.q).orElseThrow());
      cwe $$5 = new cwe($$2.a(cwg.e).orElseThrow(), $$1.a(cwi.r).orElseThrow());
      $$0.accept(
         eqk.aj,
         eqt.b()
            .a(
               eqs.a()
                  .a(eus.a(1.0F))
                  .a(erh.a(a(cud.pC, cud.pD, $$5, $$3).b()).a(4))
                  .a(erh.a(a(cud.pG, cud.pH, $$4, $$3).b()).a(2))
                  .a(erh.a(a(cud.pK, cud.pL, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         eqk.al,
         eqt.b()
            .a(eqs.a().a(eus.a(1.0F)).a(erh.a(eqk.aj)))
            .a(
               eqs.a()
                  .a(eus.a(1.0F))
                  .a(erb.a(cud.pa).a(4))
                  .a(erb.a(cud.pa).a(new esp.a().a($$3.b(czo.n), eus.a(1.0F))))
                  .a(erb.a(cud.pa).a(new esp.a().a($$3.b(czo.q), eus.a(1.0F))))
                  .a(erb.a(cud.pf))
            )
      );
      $$0.accept(
         eqk.ak,
         eqt.b()
            .a(eqs.a().a(eus.a(1.0F)).a(erh.a(eqk.aj)))
            .a(
               eqs.a()
                  .a(eus.a(1.0F))
                  .a(erb.a(cud.ou).a(2))
                  .a(erb.a(cud.ou).a(new esp.a().a($$3.b(czo.y), eus.a(1.0F))))
                  .a(erb.a(cud.ou).a(new esp.a().a($$3.b(czo.z), eus.a(1.0F))))
            )
      );
   }

   public static eqt.a a(ctv $$0, ctv $$1, cwe $$2, jl.b<czj> $$3) {
      return eqt.b()
         .a(
            eqs.a()
               .a(eus.a(1.0F))
               .a(eue.a(0.5F))
               .a(erb.a($$0).a(esk.a(kn.K, $$2)).a(new esp.a().a($$3.b(czo.a), eus.a(4.0F)).a($$3.b(czo.e), eus.a(4.0F)).a($$3.b(czo.b), eus.a(4.0F))))
         )
         .a(
            eqs.a()
               .a(eus.a(1.0F))
               .a(eue.a(0.5F))
               .a(erb.a($$1).a(esk.a(kn.K, $$2)).a(new esp.a().a($$3.b(czo.a), eus.a(4.0F)).a($$3.b(czo.e), eus.a(4.0F)).a($$3.b(czo.b), eus.a(4.0F))))
         );
   }
}
