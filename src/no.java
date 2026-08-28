import java.util.function.BiConsumer;

public record no(js.a a) implements nf {
   @Override
   public void generate(BiConsumer<alo<ewn>, ewn.a> $$0) {
      js.b<dfq> $$1 = this.a.d(mb.ba);
      js.b<dfo> $$2 = this.a.d(mb.aZ);
      js.b<ddq> $$3 = this.a.d(mb.aO);
      dfn $$4 = new dfn($$2.b(dfp.e), $$1.b(dfr.q));
      dfn $$5 = new dfn($$2.b(dfp.e), $$1.b(dfr.r));
      $$0.accept(
         ewe.ai,
         ewn.b()
            .a(
               ewm.a()
                  .a(fak.a(1.0F))
                  .a(exb.a(a(cxk.qh, cxk.qi, $$5, $$3).b()).a(4))
                  .a(exb.a(a(cxk.ql, cxk.qm, $$4, $$3).b()).a(2))
                  .a(exb.a(a(cxk.qp, cxk.qq, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ewe.ak,
         ewn.b()
            .a(ewm.a().a(fak.a(1.0F)).a(exb.a(ewe.ai)))
            .a(
               ewm.a()
                  .a(fak.a(1.0F))
                  .a(ewv.a(cxk.pG).a(4))
                  .a(ewv.a(cxk.pG).a(new eyj.a().a($$3.b(ddv.n), fak.a(1.0F))))
                  .a(ewv.a(cxk.pG).a(new eyj.a().a($$3.b(ddv.q), fak.a(1.0F))))
                  .a(ewv.a(cxk.pL))
            )
      );
      $$0.accept(
         ewe.aj,
         ewn.b()
            .a(ewm.a().a(fak.a(1.0F)).a(exb.a(ewe.ai)))
            .a(
               ewm.a()
                  .a(fak.a(1.0F))
                  .a(ewv.a(cxk.pa).a(2))
                  .a(ewv.a(cxk.pa).a(new eyj.a().a($$3.b(ddv.y), fak.a(1.0F))))
                  .a(ewv.a(cxk.pa).a(new eyj.a().a($$3.b(ddv.z), fak.a(1.0F))))
            )
      );
   }

   public static ewn.a a(cxc $$0, cxc $$1, dfn $$2, js.b<ddq> $$3) {
      return ewn.b()
         .a(
            ewm.a()
               .a(fak.a(1.0F))
               .a(ezw.a(0.5F))
               .a(ewv.a($$0).a(eye.a(ku.U, $$2)).a(new eyj.a().a($$3.b(ddv.a), fak.a(4.0F)).a($$3.b(ddv.e), fak.a(4.0F)).a($$3.b(ddv.b), fak.a(4.0F))))
         )
         .a(
            ewm.a()
               .a(fak.a(1.0F))
               .a(ezw.a(0.5F))
               .a(ewv.a($$1).a(eye.a(ku.U, $$2)).a(new eyj.a().a($$3.b(ddv.a), fak.a(4.0F)).a($$3.b(ddv.e), fak.a(4.0F)).a($$3.b(ddv.b), fak.a(4.0F))))
         );
   }
}
