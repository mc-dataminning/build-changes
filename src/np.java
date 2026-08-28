import java.util.function.BiConsumer;

public record np(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<aku<evv>, evv.a> $$0) {
      jt.b<dey> $$1 = this.a.d(mc.ba);
      jt.b<dew> $$2 = this.a.d(mc.aZ);
      jt.b<dcy> $$3 = this.a.d(mc.aO);
      dev $$4 = new dev($$2.b(dex.e), $$1.b(dez.q));
      dev $$5 = new dev($$2.b(dex.e), $$1.b(dez.r));
      $$0.accept(
         evm.ai,
         evv.b()
            .a(
               evu.a()
                  .a(ezs.a(1.0F))
                  .a(ewj.a(a(cws.qh, cws.qi, $$5, $$3).b()).a(4))
                  .a(ewj.a(a(cws.ql, cws.qm, $$4, $$3).b()).a(2))
                  .a(ewj.a(a(cws.qp, cws.qq, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         evm.ak,
         evv.b()
            .a(evu.a().a(ezs.a(1.0F)).a(ewj.a(evm.ai)))
            .a(
               evu.a()
                  .a(ezs.a(1.0F))
                  .a(ewd.a(cws.pG).a(4))
                  .a(ewd.a(cws.pG).a(new exr.a().a($$3.b(ddd.n), ezs.a(1.0F))))
                  .a(ewd.a(cws.pG).a(new exr.a().a($$3.b(ddd.q), ezs.a(1.0F))))
                  .a(ewd.a(cws.pL))
            )
      );
      $$0.accept(
         evm.aj,
         evv.b()
            .a(evu.a().a(ezs.a(1.0F)).a(ewj.a(evm.ai)))
            .a(
               evu.a()
                  .a(ezs.a(1.0F))
                  .a(ewd.a(cws.pa).a(2))
                  .a(ewd.a(cws.pa).a(new exr.a().a($$3.b(ddd.y), ezs.a(1.0F))))
                  .a(ewd.a(cws.pa).a(new exr.a().a($$3.b(ddd.z), ezs.a(1.0F))))
            )
      );
   }

   public static evv.a a(cwk $$0, cwk $$1, dev $$2, jt.b<dcy> $$3) {
      return evv.b()
         .a(
            evu.a()
               .a(ezs.a(1.0F))
               .a(eze.a(0.5F))
               .a(ewd.a($$0).a(exm.a(kv.U, $$2)).a(new exr.a().a($$3.b(ddd.a), ezs.a(4.0F)).a($$3.b(ddd.e), ezs.a(4.0F)).a($$3.b(ddd.b), ezs.a(4.0F))))
         )
         .a(
            evu.a()
               .a(ezs.a(1.0F))
               .a(eze.a(0.5F))
               .a(ewd.a($$1).a(exm.a(kv.U, $$2)).a(new exr.a().a($$3.b(ddd.a), ezs.a(4.0F)).a($$3.b(ddd.e), ezs.a(4.0F)).a($$3.b(ddd.b), ezs.a(4.0F))))
         );
   }
}
