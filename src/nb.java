import java.util.function.BiConsumer;

public class nb implements mu {
   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqo>, eqo.a> $$1) {
      jk.b<cwx> $$2 = $$0.a(lq.aP).orElseThrow();
      jk.b<cwv> $$3 = $$0.a(lq.aO).orElseThrow();
      cwu $$4 = new cwu($$3.a(cww.e).orElseThrow(), $$2.a(cwy.q).orElseThrow());
      cwu $$5 = new cwu($$3.a(cww.e).orElseThrow(), $$2.a(cwy.r).orElseThrow());
      $$1.accept(
         eqf.aj,
         eqo.b()
            .a(
               eqn.a()
                  .a(eum.a(1.0F))
                  .a(erc.a(a(cut.pC, cut.pD, $$5).b()).a(4))
                  .a(erc.a(a(cut.pG, cut.pH, $$4).b()).a(2))
                  .a(erc.a(a(cut.pK, cut.pL, $$4).b()).a(1))
            )
      );
      $$1.accept(
         eqf.al,
         eqo.b()
            .a(eqn.a().a(eum.a(1.0F)).a(erc.a(eqf.aj)))
            .a(
               eqn.a()
                  .a(eum.a(1.0F))
                  .a(eqw.a(cut.pa).a(4))
                  .a(eqw.a(cut.pa).a(new esk.a().a(dae.n, eum.a(1.0F))))
                  .a(eqw.a(cut.pa).a(new esk.a().a(dae.q, eum.a(1.0F))))
                  .a(eqw.a(cut.pf))
            )
      );
      $$1.accept(
         eqf.ak,
         eqo.b()
            .a(eqn.a().a(eum.a(1.0F)).a(erc.a(eqf.aj)))
            .a(
               eqn.a()
                  .a(eum.a(1.0F))
                  .a(eqw.a(cut.ou).a(2))
                  .a(eqw.a(cut.ou).a(new esk.a().a(dae.y, eum.a(1.0F))))
                  .a(eqw.a(cut.ou).a(new esk.a().a(dae.z, eum.a(1.0F))))
            )
      );
   }

   public static eqo.a a(cul $$0, cul $$1, cwu $$2) {
      return eqo.b()
         .a(
            eqn.a()
               .a(eum.a(1.0F))
               .a(ety.a(0.5F))
               .a(eqw.a($$0).a(esf.a(km.K, $$2)).a(new esk.a().a(dae.a, eum.a(4.0F)).a(dae.e, eum.a(4.0F)).a(dae.b, eum.a(4.0F))))
         )
         .a(
            eqn.a()
               .a(eum.a(1.0F))
               .a(ety.a(0.5F))
               .a(eqw.a($$1).a(esf.a(km.K, $$2)).a(new esk.a().a(dae.a, eum.a(4.0F)).a(dae.e, eum.a(4.0F)).a(dae.b, eum.a(4.0F))))
         );
   }
}
