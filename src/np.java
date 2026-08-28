import java.util.function.BiConsumer;

public record np(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<aku<evx>, evx.a> $$0) {
      jt.b<dfa> $$1 = this.a.d(mc.ba);
      jt.b<dey> $$2 = this.a.d(mc.aZ);
      jt.b<dda> $$3 = this.a.d(mc.aO);
      dex $$4 = new dex($$2.b(dez.e), $$1.b(dfb.q));
      dex $$5 = new dex($$2.b(dez.e), $$1.b(dfb.r));
      $$0.accept(
         evo.ai,
         evx.b()
            .a(
               evw.a()
                  .a(ezu.a(1.0F))
                  .a(ewl.a(a(cwu.qh, cwu.qi, $$5, $$3).b()).a(4))
                  .a(ewl.a(a(cwu.ql, cwu.qm, $$4, $$3).b()).a(2))
                  .a(ewl.a(a(cwu.qp, cwu.qq, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         evo.ak,
         evx.b()
            .a(evw.a().a(ezu.a(1.0F)).a(ewl.a(evo.ai)))
            .a(
               evw.a()
                  .a(ezu.a(1.0F))
                  .a(ewf.a(cwu.pG).a(4))
                  .a(ewf.a(cwu.pG).a(new ext.a().a($$3.b(ddf.n), ezu.a(1.0F))))
                  .a(ewf.a(cwu.pG).a(new ext.a().a($$3.b(ddf.q), ezu.a(1.0F))))
                  .a(ewf.a(cwu.pL))
            )
      );
      $$0.accept(
         evo.aj,
         evx.b()
            .a(evw.a().a(ezu.a(1.0F)).a(ewl.a(evo.ai)))
            .a(
               evw.a()
                  .a(ezu.a(1.0F))
                  .a(ewf.a(cwu.pa).a(2))
                  .a(ewf.a(cwu.pa).a(new ext.a().a($$3.b(ddf.y), ezu.a(1.0F))))
                  .a(ewf.a(cwu.pa).a(new ext.a().a($$3.b(ddf.z), ezu.a(1.0F))))
            )
      );
   }

   public static evx.a a(cwm $$0, cwm $$1, dex $$2, jt.b<dda> $$3) {
      return evx.b()
         .a(
            evw.a()
               .a(ezu.a(1.0F))
               .a(ezg.a(0.5F))
               .a(ewf.a($$0).a(exo.a(kv.U, $$2)).a(new ext.a().a($$3.b(ddf.a), ezu.a(4.0F)).a($$3.b(ddf.e), ezu.a(4.0F)).a($$3.b(ddf.b), ezu.a(4.0F))))
         )
         .a(
            evw.a()
               .a(ezu.a(1.0F))
               .a(ezg.a(0.5F))
               .a(ewf.a($$1).a(exo.a(kv.U, $$2)).a(new ext.a().a($$3.b(ddf.a), ezu.a(4.0F)).a($$3.b(ddf.e), ezu.a(4.0F)).a($$3.b(ddf.b), ezu.a(4.0F))))
         );
   }
}
