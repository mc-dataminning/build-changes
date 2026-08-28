import java.util.function.BiConsumer;

public record np(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<akt<evu>, evu.a> $$0) {
      jt.b<dex> $$1 = this.a.d(mc.ba);
      jt.b<dev> $$2 = this.a.d(mc.aZ);
      jt.b<dcx> $$3 = this.a.d(mc.aO);
      deu $$4 = new deu($$2.b(dew.e), $$1.b(dey.q));
      deu $$5 = new deu($$2.b(dew.e), $$1.b(dey.r));
      $$0.accept(
         evl.ai,
         evu.b()
            .a(
               evt.a()
                  .a(ezr.a(1.0F))
                  .a(ewi.a(a(cwr.qh, cwr.qi, $$5, $$3).b()).a(4))
                  .a(ewi.a(a(cwr.ql, cwr.qm, $$4, $$3).b()).a(2))
                  .a(ewi.a(a(cwr.qp, cwr.qq, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         evl.ak,
         evu.b()
            .a(evt.a().a(ezr.a(1.0F)).a(ewi.a(evl.ai)))
            .a(
               evt.a()
                  .a(ezr.a(1.0F))
                  .a(ewc.a(cwr.pG).a(4))
                  .a(ewc.a(cwr.pG).a(new exq.a().a($$3.b(ddc.n), ezr.a(1.0F))))
                  .a(ewc.a(cwr.pG).a(new exq.a().a($$3.b(ddc.q), ezr.a(1.0F))))
                  .a(ewc.a(cwr.pL))
            )
      );
      $$0.accept(
         evl.aj,
         evu.b()
            .a(evt.a().a(ezr.a(1.0F)).a(ewi.a(evl.ai)))
            .a(
               evt.a()
                  .a(ezr.a(1.0F))
                  .a(ewc.a(cwr.pa).a(2))
                  .a(ewc.a(cwr.pa).a(new exq.a().a($$3.b(ddc.y), ezr.a(1.0F))))
                  .a(ewc.a(cwr.pa).a(new exq.a().a($$3.b(ddc.z), ezr.a(1.0F))))
            )
      );
   }

   public static evu.a a(cwj $$0, cwj $$1, deu $$2, jt.b<dcx> $$3) {
      return evu.b()
         .a(
            evt.a()
               .a(ezr.a(1.0F))
               .a(ezd.a(0.5F))
               .a(ewc.a($$0).a(exl.a(kv.U, $$2)).a(new exq.a().a($$3.b(ddc.a), ezr.a(4.0F)).a($$3.b(ddc.e), ezr.a(4.0F)).a($$3.b(ddc.b), ezr.a(4.0F))))
         )
         .a(
            evt.a()
               .a(ezr.a(1.0F))
               .a(ezd.a(0.5F))
               .a(ewc.a($$1).a(exl.a(kv.U, $$2)).a(new exq.a().a($$3.b(ddc.a), ezr.a(4.0F)).a($$3.b(ddc.e), ezr.a(4.0F)).a($$3.b(ddc.b), ezr.a(4.0F))))
         );
   }
}
