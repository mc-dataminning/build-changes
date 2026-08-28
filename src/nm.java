import java.util.function.BiConsumer;

public record nm(js.a a) implements nd {
   @Override
   public void generate(BiConsumer<alh<euh>, euh.a> $$0) {
      js.b<dds> $$1 = this.a.d(lz.aY);
      js.b<ddq> $$2 = this.a.d(lz.aX);
      js.b<dbs> $$3 = this.a.d(lz.aM);
      ddp $$4 = new ddp($$2.b(ddr.e), $$1.b(ddt.q));
      ddp $$5 = new ddp($$2.b(ddr.e), $$1.b(ddt.r));
      $$0.accept(
         ety.ai,
         euh.b()
            .a(
               eug.a()
                  .a(eyg.a(1.0F))
                  .a(euv.a(a(cwf.pD, cwf.pE, $$5, $$3).b()).a(4))
                  .a(euv.a(a(cwf.pH, cwf.pI, $$4, $$3).b()).a(2))
                  .a(euv.a(a(cwf.pL, cwf.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ety.ak,
         euh.b()
            .a(eug.a().a(eyg.a(1.0F)).a(euv.a(ety.ai)))
            .a(
               eug.a()
                  .a(eyg.a(1.0F))
                  .a(eup.a(cwf.pc).a(4))
                  .a(eup.a(cwf.pc).a(new ewd.a().a($$3.b(dbx.n), eyg.a(1.0F))))
                  .a(eup.a(cwf.pc).a(new ewd.a().a($$3.b(dbx.q), eyg.a(1.0F))))
                  .a(eup.a(cwf.ph))
            )
      );
      $$0.accept(
         ety.aj,
         euh.b()
            .a(eug.a().a(eyg.a(1.0F)).a(euv.a(ety.ai)))
            .a(
               eug.a()
                  .a(eyg.a(1.0F))
                  .a(eup.a(cwf.ow).a(2))
                  .a(eup.a(cwf.ow).a(new ewd.a().a($$3.b(dbx.y), eyg.a(1.0F))))
                  .a(eup.a(cwf.ow).a(new ewd.a().a($$3.b(dbx.z), eyg.a(1.0F))))
            )
      );
   }

   public static euh.a a(cvx $$0, cvx $$1, ddp $$2, js.b<dbs> $$3) {
      return euh.b()
         .a(
            eug.a()
               .a(eyg.a(1.0F))
               .a(exs.a(0.5F))
               .a(eup.a($$0).a(evy.a(ku.U, $$2)).a(new ewd.a().a($$3.b(dbx.a), eyg.a(4.0F)).a($$3.b(dbx.e), eyg.a(4.0F)).a($$3.b(dbx.b), eyg.a(4.0F))))
         )
         .a(
            eug.a()
               .a(eyg.a(1.0F))
               .a(exs.a(0.5F))
               .a(eup.a($$1).a(evy.a(ku.U, $$2)).a(new ewd.a().a($$3.b(dbx.a), eyg.a(4.0F)).a($$3.b(dbx.e), eyg.a(4.0F)).a($$3.b(dbx.b), eyg.a(4.0F))))
         );
   }
}
