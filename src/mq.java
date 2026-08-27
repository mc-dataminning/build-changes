import java.util.function.BiConsumer;

public class mq implements mj {
   @Override
   public void generate(iz.a $$0, BiConsumer<akm<epm>, epm.a> $$1) {
      iz.b<cvx> $$2 = $$0.a(lf.aP).orElseThrow();
      iz.b<cvv> $$3 = $$0.a(lf.aO).orElseThrow();
      cvu $$4 = new cvu($$3.a(cvw.e).orElseThrow(), $$2.a(cvy.q).orElseThrow());
      cvu $$5 = new cvu($$3.a(cvw.e).orElseThrow(), $$2.a(cvy.r).orElseThrow());
      $$1.accept(
         epf.aj,
         epm.b()
            .a(
               epl.a()
                  .a(etg.a(1.0F))
                  .a(eqa.a(a(ctt.pC, ctt.pD, $$5).b()).a(4))
                  .a(eqa.a(a(ctt.pG, ctt.pH, $$4).b()).a(2))
                  .a(eqa.a(a(ctt.pK, ctt.pL, $$4).b()).a(1))
            )
      );
   }

   public static epm.a a(ctl $$0, ctl $$1, cvu $$2) {
      return epm.b()
         .a(epl.a().a(etg.a(1.0F)).a(ess.a(0.5F)).a(epu.a($$0).a(erb.a(kb.J, $$2))))
         .a(epl.a().a(etg.a(1.0F)).a(ess.a(0.5F)).a(epu.a($$1).a(erb.a(kb.J, $$2))));
   }
}
