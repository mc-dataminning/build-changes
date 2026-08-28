import java.util.function.BiConsumer;

public record np(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<akt<evw>, evw.a> $$0) {
      jt.b<dez> $$1 = this.a.d(mc.ba);
      jt.b<dex> $$2 = this.a.d(mc.aZ);
      jt.b<dcz> $$3 = this.a.d(mc.aO);
      dew $$4 = new dew($$2.b(dey.e), $$1.b(dfa.q));
      dew $$5 = new dew($$2.b(dey.e), $$1.b(dfa.r));
      $$0.accept(
         evn.ai,
         evw.b()
            .a(
               evv.a()
                  .a(ezt.a(1.0F))
                  .a(ewk.a(a(cwt.qh, cwt.qi, $$5, $$3).b()).a(4))
                  .a(ewk.a(a(cwt.ql, cwt.qm, $$4, $$3).b()).a(2))
                  .a(ewk.a(a(cwt.qp, cwt.qq, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         evn.ak,
         evw.b()
            .a(evv.a().a(ezt.a(1.0F)).a(ewk.a(evn.ai)))
            .a(
               evv.a()
                  .a(ezt.a(1.0F))
                  .a(ewe.a(cwt.pG).a(4))
                  .a(ewe.a(cwt.pG).a(new exs.a().a($$3.b(dde.n), ezt.a(1.0F))))
                  .a(ewe.a(cwt.pG).a(new exs.a().a($$3.b(dde.q), ezt.a(1.0F))))
                  .a(ewe.a(cwt.pL))
            )
      );
      $$0.accept(
         evn.aj,
         evw.b()
            .a(evv.a().a(ezt.a(1.0F)).a(ewk.a(evn.ai)))
            .a(
               evv.a()
                  .a(ezt.a(1.0F))
                  .a(ewe.a(cwt.pa).a(2))
                  .a(ewe.a(cwt.pa).a(new exs.a().a($$3.b(dde.y), ezt.a(1.0F))))
                  .a(ewe.a(cwt.pa).a(new exs.a().a($$3.b(dde.z), ezt.a(1.0F))))
            )
      );
   }

   public static evw.a a(cwl $$0, cwl $$1, dew $$2, jt.b<dcz> $$3) {
      return evw.b()
         .a(
            evv.a()
               .a(ezt.a(1.0F))
               .a(ezf.a(0.5F))
               .a(ewe.a($$0).a(exn.a(kv.U, $$2)).a(new exs.a().a($$3.b(dde.a), ezt.a(4.0F)).a($$3.b(dde.e), ezt.a(4.0F)).a($$3.b(dde.b), ezt.a(4.0F))))
         )
         .a(
            evv.a()
               .a(ezt.a(1.0F))
               .a(ezf.a(0.5F))
               .a(ewe.a($$1).a(exn.a(kv.U, $$2)).a(new exs.a().a($$3.b(dde.a), ezt.a(4.0F)).a($$3.b(dde.e), ezt.a(4.0F)).a($$3.b(dde.b), ezt.a(4.0F))))
         );
   }
}
