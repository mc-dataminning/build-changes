import java.util.function.BiConsumer;

public record nn(js.a a) implements ne {
   @Override
   public void generate(BiConsumer<alk<eul>, eul.a> $$0) {
      js.b<ddw> $$1 = this.a.d(ma.aY);
      js.b<ddu> $$2 = this.a.d(ma.aX);
      js.b<dbw> $$3 = this.a.d(ma.aM);
      ddt $$4 = new ddt($$2.b(ddv.e), $$1.b(ddx.q));
      ddt $$5 = new ddt($$2.b(ddv.e), $$1.b(ddx.r));
      $$0.accept(
         euc.ai,
         eul.b()
            .a(
               euk.a()
                  .a(eyk.a(1.0F))
                  .a(euz.a(a(cwj.pD, cwj.pE, $$5, $$3).b()).a(4))
                  .a(euz.a(a(cwj.pH, cwj.pI, $$4, $$3).b()).a(2))
                  .a(euz.a(a(cwj.pL, cwj.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         euc.ak,
         eul.b()
            .a(euk.a().a(eyk.a(1.0F)).a(euz.a(euc.ai)))
            .a(
               euk.a()
                  .a(eyk.a(1.0F))
                  .a(eut.a(cwj.pc).a(4))
                  .a(eut.a(cwj.pc).a(new ewh.a().a($$3.b(dcb.n), eyk.a(1.0F))))
                  .a(eut.a(cwj.pc).a(new ewh.a().a($$3.b(dcb.q), eyk.a(1.0F))))
                  .a(eut.a(cwj.ph))
            )
      );
      $$0.accept(
         euc.aj,
         eul.b()
            .a(euk.a().a(eyk.a(1.0F)).a(euz.a(euc.ai)))
            .a(
               euk.a()
                  .a(eyk.a(1.0F))
                  .a(eut.a(cwj.ow).a(2))
                  .a(eut.a(cwj.ow).a(new ewh.a().a($$3.b(dcb.y), eyk.a(1.0F))))
                  .a(eut.a(cwj.ow).a(new ewh.a().a($$3.b(dcb.z), eyk.a(1.0F))))
            )
      );
   }

   public static eul.a a(cwb $$0, cwb $$1, ddt $$2, js.b<dbw> $$3) {
      return eul.b()
         .a(
            euk.a()
               .a(eyk.a(1.0F))
               .a(exw.a(0.5F))
               .a(eut.a($$0).a(ewc.a(ku.U, $$2)).a(new ewh.a().a($$3.b(dcb.a), eyk.a(4.0F)).a($$3.b(dcb.e), eyk.a(4.0F)).a($$3.b(dcb.b), eyk.a(4.0F))))
         )
         .a(
            euk.a()
               .a(eyk.a(1.0F))
               .a(exw.a(0.5F))
               .a(eut.a($$1).a(ewc.a(ku.U, $$2)).a(new ewh.a().a($$3.b(dcb.a), eyk.a(4.0F)).a($$3.b(dcb.e), eyk.a(4.0F)).a($$3.b(dcb.b), eyk.a(4.0F))))
         );
   }
}
