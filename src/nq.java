import java.util.function.BiConsumer;

public record nq(js.a a) implements nh {
   @Override
   public void generate(BiConsumer<aly<ewu>, ewu.a> $$0) {
      js.b<dfz> $$1 = this.a.d(mb.ba);
      js.b<dfx> $$2 = this.a.d(mb.aZ);
      js.b<ddz> $$3 = this.a.d(mb.aO);
      dfw $$4 = new dfw($$2.b(dfy.e), $$1.b(dga.q));
      dfw $$5 = new dfw($$2.b(dfy.e), $$1.b(dga.r));
      $$0.accept(
         ewl.ai,
         ewu.b()
            .a(
               ewt.a()
                  .a(far.a(1.0F))
                  .a(exi.a(a(cxt.pY, cxt.pZ, $$5, $$3).b()).a(4))
                  .a(exi.a(a(cxt.qc, cxt.qd, $$4, $$3).b()).a(2))
                  .a(exi.a(a(cxt.qg, cxt.qh, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ewl.ak,
         ewu.b()
            .a(ewt.a().a(far.a(1.0F)).a(exi.a(ewl.ai)))
            .a(
               ewt.a()
                  .a(far.a(1.0F))
                  .a(exc.a(cxt.px).a(4))
                  .a(exc.a(cxt.px).a(new eyq.a().a($$3.b(dee.n), far.a(1.0F))))
                  .a(exc.a(cxt.px).a(new eyq.a().a($$3.b(dee.q), far.a(1.0F))))
                  .a(exc.a(cxt.pC))
            )
      );
      $$0.accept(
         ewl.aj,
         ewu.b()
            .a(ewt.a().a(far.a(1.0F)).a(exi.a(ewl.ai)))
            .a(
               ewt.a()
                  .a(far.a(1.0F))
                  .a(exc.a(cxt.oR).a(2))
                  .a(exc.a(cxt.oR).a(new eyq.a().a($$3.b(dee.y), far.a(1.0F))))
                  .a(exc.a(cxt.oR).a(new eyq.a().a($$3.b(dee.z), far.a(1.0F))))
            )
      );
   }

   public static ewu.a a(cxl $$0, cxl $$1, dfw $$2, js.b<ddz> $$3) {
      return ewu.b()
         .a(
            ewt.a()
               .a(far.a(1.0F))
               .a(fad.a(0.5F))
               .a(exc.a($$0).a(eyl.a(ku.U, $$2)).a(new eyq.a().a($$3.b(dee.a), far.a(4.0F)).a($$3.b(dee.e), far.a(4.0F)).a($$3.b(dee.b), far.a(4.0F))))
         )
         .a(
            ewt.a()
               .a(far.a(1.0F))
               .a(fad.a(0.5F))
               .a(exc.a($$1).a(eyl.a(ku.U, $$2)).a(new eyq.a().a($$3.b(dee.a), far.a(4.0F)).a($$3.b(dee.e), far.a(4.0F)).a($$3.b(dee.b), far.a(4.0F))))
         );
   }
}
