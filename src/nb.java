import java.util.function.BiConsumer;

public record nb(jl.a a) implements mt {
   @Override
   public void generate(BiConsumer<akj<eqz>, eqz.a> $$0) {
      jl.b<cwj> $$1 = this.a.a(lr.aW).orElseThrow();
      jl.b<cwh> $$2 = this.a.a(lr.aV).orElseThrow();
      jl.b<czl> $$3 = this.a.b(lr.aK);
      cwg $$4 = new cwg($$2.a(cwi.e).orElseThrow(), $$1.a(cwk.q).orElseThrow());
      cwg $$5 = new cwg($$2.a(cwi.e).orElseThrow(), $$1.a(cwk.r).orElseThrow());
      $$0.accept(
         eqq.aj,
         eqz.b()
            .a(
               eqy.a()
                  .a(euy.a(1.0F))
                  .a(ern.a(a(cuf.pC, cuf.pD, $$5, $$3).b()).a(4))
                  .a(ern.a(a(cuf.pG, cuf.pH, $$4, $$3).b()).a(2))
                  .a(ern.a(a(cuf.pK, cuf.pL, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         eqq.al,
         eqz.b()
            .a(eqy.a().a(euy.a(1.0F)).a(ern.a(eqq.aj)))
            .a(
               eqy.a()
                  .a(euy.a(1.0F))
                  .a(erh.a(cuf.pb).a(4))
                  .a(erh.a(cuf.pb).a(new esv.a().a($$3.b(czq.n), euy.a(1.0F))))
                  .a(erh.a(cuf.pb).a(new esv.a().a($$3.b(czq.q), euy.a(1.0F))))
                  .a(erh.a(cuf.pg))
            )
      );
      $$0.accept(
         eqq.ak,
         eqz.b()
            .a(eqy.a().a(euy.a(1.0F)).a(ern.a(eqq.aj)))
            .a(
               eqy.a()
                  .a(euy.a(1.0F))
                  .a(erh.a(cuf.ov).a(2))
                  .a(erh.a(cuf.ov).a(new esv.a().a($$3.b(czq.y), euy.a(1.0F))))
                  .a(erh.a(cuf.ov).a(new esv.a().a($$3.b(czq.z), euy.a(1.0F))))
            )
      );
   }

   public static eqz.a a(ctx $$0, ctx $$1, cwg $$2, jl.b<czl> $$3) {
      return eqz.b()
         .a(
            eqy.a()
               .a(euy.a(1.0F))
               .a(euk.a(0.5F))
               .a(erh.a($$0).a(esq.a(kn.K, $$2)).a(new esv.a().a($$3.b(czq.a), euy.a(4.0F)).a($$3.b(czq.e), euy.a(4.0F)).a($$3.b(czq.b), euy.a(4.0F))))
         )
         .a(
            eqy.a()
               .a(euy.a(1.0F))
               .a(euk.a(0.5F))
               .a(erh.a($$1).a(esq.a(kn.K, $$2)).a(new esv.a().a($$3.b(czq.a), euy.a(4.0F)).a($$3.b(czq.e), euy.a(4.0F)).a($$3.b(czq.b), euy.a(4.0F))))
         );
   }
}
