import java.util.function.BiConsumer;

public class nb implements mu {
   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqn>, eqn.a> $$1) {
      jk.b<cww> $$2 = $$0.a(lq.aP).orElseThrow();
      jk.b<cwu> $$3 = $$0.a(lq.aO).orElseThrow();
      cwt $$4 = new cwt($$3.a(cwv.e).orElseThrow(), $$2.a(cwx.q).orElseThrow());
      cwt $$5 = new cwt($$3.a(cwv.e).orElseThrow(), $$2.a(cwx.r).orElseThrow());
      $$1.accept(
         eqe.aj,
         eqn.b()
            .a(
               eqm.a()
                  .a(eul.a(1.0F))
                  .a(erb.a(a(cus.pC, cus.pD, $$5).b()).a(4))
                  .a(erb.a(a(cus.pG, cus.pH, $$4).b()).a(2))
                  .a(erb.a(a(cus.pK, cus.pL, $$4).b()).a(1))
            )
      );
      $$1.accept(
         eqe.al,
         eqn.b()
            .a(eqm.a().a(eul.a(1.0F)).a(erb.a(eqe.aj)))
            .a(
               eqm.a()
                  .a(eul.a(1.0F))
                  .a(eqv.a(cus.pa).a(4))
                  .a(eqv.a(cus.pa).a(new esj.a().a(dad.n, eul.a(1.0F))))
                  .a(eqv.a(cus.pa).a(new esj.a().a(dad.q, eul.a(1.0F))))
                  .a(eqv.a(cus.pf))
            )
      );
      $$1.accept(
         eqe.ak,
         eqn.b()
            .a(eqm.a().a(eul.a(1.0F)).a(erb.a(eqe.aj)))
            .a(
               eqm.a()
                  .a(eul.a(1.0F))
                  .a(eqv.a(cus.ou).a(2))
                  .a(eqv.a(cus.ou).a(new esj.a().a(dad.y, eul.a(1.0F))))
                  .a(eqv.a(cus.ou).a(new esj.a().a(dad.z, eul.a(1.0F))))
            )
      );
   }

   public static eqn.a a(cuk $$0, cuk $$1, cwt $$2) {
      return eqn.b()
         .a(
            eqm.a()
               .a(eul.a(1.0F))
               .a(etx.a(0.5F))
               .a(eqv.a($$0).a(ese.a(km.K, $$2)).a(new esj.a().a(dad.a, eul.a(4.0F)).a(dad.e, eul.a(4.0F)).a(dad.b, eul.a(4.0F))))
         )
         .a(
            eqm.a()
               .a(eul.a(1.0F))
               .a(etx.a(0.5F))
               .a(eqv.a($$1).a(ese.a(km.K, $$2)).a(new esj.a().a(dad.a, eul.a(4.0F)).a(dad.e, eul.a(4.0F)).a(dad.b, eul.a(4.0F))))
         );
   }
}
