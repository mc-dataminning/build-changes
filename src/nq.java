import java.util.function.BiConsumer;

public record nq(js.a a) implements nh {
   @Override
   public void generate(BiConsumer<aly<ewm>, ewm.a> $$0) {
      js.b<dfr> $$1 = this.a.d(mb.aZ);
      js.b<dfp> $$2 = this.a.d(mb.aY);
      js.b<ddr> $$3 = this.a.d(mb.aN);
      dfo $$4 = new dfo($$2.b(dfq.e), $$1.b(dfs.q));
      dfo $$5 = new dfo($$2.b(dfq.e), $$1.b(dfs.r));
      $$0.accept(
         ewd.ai,
         ewm.b()
            .a(
               ewl.a()
                  .a(fal.a(1.0F))
                  .a(exa.a(a(cxo.pY, cxo.pZ, $$5, $$3).b()).a(4))
                  .a(exa.a(a(cxo.qc, cxo.qd, $$4, $$3).b()).a(2))
                  .a(exa.a(a(cxo.qg, cxo.qh, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ewd.ak,
         ewm.b()
            .a(ewl.a().a(fal.a(1.0F)).a(exa.a(ewd.ai)))
            .a(
               ewl.a()
                  .a(fal.a(1.0F))
                  .a(ewu.a(cxo.px).a(4))
                  .a(ewu.a(cxo.px).a(new eyi.a().a($$3.b(ddw.n), fal.a(1.0F))))
                  .a(ewu.a(cxo.px).a(new eyi.a().a($$3.b(ddw.q), fal.a(1.0F))))
                  .a(ewu.a(cxo.pC))
            )
      );
      $$0.accept(
         ewd.aj,
         ewm.b()
            .a(ewl.a().a(fal.a(1.0F)).a(exa.a(ewd.ai)))
            .a(
               ewl.a()
                  .a(fal.a(1.0F))
                  .a(ewu.a(cxo.oR).a(2))
                  .a(ewu.a(cxo.oR).a(new eyi.a().a($$3.b(ddw.y), fal.a(1.0F))))
                  .a(ewu.a(cxo.oR).a(new eyi.a().a($$3.b(ddw.z), fal.a(1.0F))))
            )
      );
   }

   public static ewm.a a(cxg $$0, cxg $$1, dfo $$2, js.b<ddr> $$3) {
      return ewm.b()
         .a(
            ewl.a()
               .a(fal.a(1.0F))
               .a(ezx.a(0.5F))
               .a(ewu.a($$0).a(eyd.a(ku.U, $$2)).a(new eyi.a().a($$3.b(ddw.a), fal.a(4.0F)).a($$3.b(ddw.e), fal.a(4.0F)).a($$3.b(ddw.b), fal.a(4.0F))))
         )
         .a(
            ewl.a()
               .a(fal.a(1.0F))
               .a(ezx.a(0.5F))
               .a(ewu.a($$1).a(eyd.a(ku.U, $$2)).a(new eyi.a().a($$3.b(ddw.a), fal.a(4.0F)).a($$3.b(ddw.e), fal.a(4.0F)).a($$3.b(ddw.b), fal.a(4.0F))))
         );
   }
}
