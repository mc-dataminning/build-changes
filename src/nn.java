import java.util.function.BiConsumer;

public record nn(js.a a) implements ne {
   @Override
   public void generate(BiConsumer<ali<eus>, eus.a> $$0) {
      js.b<ded> $$1 = this.a.d(ma.aY);
      js.b<deb> $$2 = this.a.d(ma.aX);
      js.b<dcd> $$3 = this.a.d(ma.aM);
      dea $$4 = new dea($$2.b(dec.e), $$1.b(dee.q));
      dea $$5 = new dea($$2.b(dec.e), $$1.b(dee.r));
      $$0.accept(
         euj.ai,
         eus.b()
            .a(
               eur.a()
                  .a(eyr.a(1.0F))
                  .a(evg.a(a(cwq.pD, cwq.pE, $$5, $$3).b()).a(4))
                  .a(evg.a(a(cwq.pH, cwq.pI, $$4, $$3).b()).a(2))
                  .a(evg.a(a(cwq.pL, cwq.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         euj.ak,
         eus.b()
            .a(eur.a().a(eyr.a(1.0F)).a(evg.a(euj.ai)))
            .a(
               eur.a()
                  .a(eyr.a(1.0F))
                  .a(eva.a(cwq.pc).a(4))
                  .a(eva.a(cwq.pc).a(new ewo.a().a($$3.b(dci.n), eyr.a(1.0F))))
                  .a(eva.a(cwq.pc).a(new ewo.a().a($$3.b(dci.q), eyr.a(1.0F))))
                  .a(eva.a(cwq.ph))
            )
      );
      $$0.accept(
         euj.aj,
         eus.b()
            .a(eur.a().a(eyr.a(1.0F)).a(evg.a(euj.ai)))
            .a(
               eur.a()
                  .a(eyr.a(1.0F))
                  .a(eva.a(cwq.ow).a(2))
                  .a(eva.a(cwq.ow).a(new ewo.a().a($$3.b(dci.y), eyr.a(1.0F))))
                  .a(eva.a(cwq.ow).a(new ewo.a().a($$3.b(dci.z), eyr.a(1.0F))))
            )
      );
   }

   public static eus.a a(cwi $$0, cwi $$1, dea $$2, js.b<dcd> $$3) {
      return eus.b()
         .a(
            eur.a()
               .a(eyr.a(1.0F))
               .a(eyd.a(0.5F))
               .a(eva.a($$0).a(ewj.a(ku.U, $$2)).a(new ewo.a().a($$3.b(dci.a), eyr.a(4.0F)).a($$3.b(dci.e), eyr.a(4.0F)).a($$3.b(dci.b), eyr.a(4.0F))))
         )
         .a(
            eur.a()
               .a(eyr.a(1.0F))
               .a(eyd.a(0.5F))
               .a(eva.a($$1).a(ewj.a(ku.U, $$2)).a(new ewo.a().a($$3.b(dci.a), eyr.a(4.0F)).a($$3.b(dci.e), eyr.a(4.0F)).a($$3.b(dci.b), eyr.a(4.0F))))
         );
   }
}
