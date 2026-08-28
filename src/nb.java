import java.util.function.BiConsumer;

public class nb implements mu {
   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqp>, eqp.a> $$1) {
      jk.b<cwy> $$2 = $$0.a(lq.aP).orElseThrow();
      jk.b<cww> $$3 = $$0.a(lq.aO).orElseThrow();
      cwv $$4 = new cwv($$3.a(cwx.e).orElseThrow(), $$2.a(cwz.q).orElseThrow());
      cwv $$5 = new cwv($$3.a(cwx.e).orElseThrow(), $$2.a(cwz.r).orElseThrow());
      $$1.accept(
         eqg.aj,
         eqp.b()
            .a(
               eqo.a()
                  .a(eun.a(1.0F))
                  .a(erd.a(a(cuu.pC, cuu.pD, $$5).b()).a(4))
                  .a(erd.a(a(cuu.pG, cuu.pH, $$4).b()).a(2))
                  .a(erd.a(a(cuu.pK, cuu.pL, $$4).b()).a(1))
            )
      );
      $$1.accept(
         eqg.al,
         eqp.b()
            .a(eqo.a().a(eun.a(1.0F)).a(erd.a(eqg.aj)))
            .a(
               eqo.a()
                  .a(eun.a(1.0F))
                  .a(eqx.a(cuu.pa).a(4))
                  .a(eqx.a(cuu.pa).a(new esl.a().a(daf.n, eun.a(1.0F))))
                  .a(eqx.a(cuu.pa).a(new esl.a().a(daf.q, eun.a(1.0F))))
                  .a(eqx.a(cuu.pf))
            )
      );
      $$1.accept(
         eqg.ak,
         eqp.b()
            .a(eqo.a().a(eun.a(1.0F)).a(erd.a(eqg.aj)))
            .a(
               eqo.a()
                  .a(eun.a(1.0F))
                  .a(eqx.a(cuu.ou).a(2))
                  .a(eqx.a(cuu.ou).a(new esl.a().a(daf.y, eun.a(1.0F))))
                  .a(eqx.a(cuu.ou).a(new esl.a().a(daf.z, eun.a(1.0F))))
            )
      );
   }

   public static eqp.a a(cum $$0, cum $$1, cwv $$2) {
      return eqp.b()
         .a(
            eqo.a()
               .a(eun.a(1.0F))
               .a(etz.a(0.5F))
               .a(eqx.a($$0).a(esg.a(km.K, $$2)).a(new esl.a().a(daf.a, eun.a(4.0F)).a(daf.e, eun.a(4.0F)).a(daf.b, eun.a(4.0F))))
         )
         .a(
            eqo.a()
               .a(eun.a(1.0F))
               .a(etz.a(0.5F))
               .a(eqx.a($$1).a(esg.a(km.K, $$2)).a(new esl.a().a(daf.a, eun.a(4.0F)).a(daf.e, eun.a(4.0F)).a(daf.b, eun.a(4.0F))))
         );
   }
}
