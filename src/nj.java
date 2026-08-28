import java.util.function.BiConsumer;

public record nj(jq.a a) implements na {
   @Override
   public void generate(BiConsumer<ald<etq>, etq.a> $$0) {
      jq.b<cxx> $$1 = this.a.d(lw.aZ);
      jq.b<cxv> $$2 = this.a.d(lw.aY);
      jq.b<dbn> $$3 = this.a.d(lw.aN);
      cxu $$4 = new cxu($$2.b(cxw.e), $$1.b(cxy.q));
      cxu $$5 = new cxu($$2.b(cxw.e), $$1.b(cxy.r));
      $$0.accept(
         eth.ai,
         etq.b()
            .a(
               etp.a()
                  .a(exp.a(1.0F))
                  .a(eue.a(a(cvw.pD, cvw.pE, $$5, $$3).b()).a(4))
                  .a(eue.a(a(cvw.pH, cvw.pI, $$4, $$3).b()).a(2))
                  .a(eue.a(a(cvw.pL, cvw.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         eth.ak,
         etq.b()
            .a(etp.a().a(exp.a(1.0F)).a(eue.a(eth.ai)))
            .a(
               etp.a()
                  .a(exp.a(1.0F))
                  .a(ety.a(cvw.pc).a(4))
                  .a(ety.a(cvw.pc).a(new evm.a().a($$3.b(dbs.n), exp.a(1.0F))))
                  .a(ety.a(cvw.pc).a(new evm.a().a($$3.b(dbs.q), exp.a(1.0F))))
                  .a(ety.a(cvw.ph))
            )
      );
      $$0.accept(
         eth.aj,
         etq.b()
            .a(etp.a().a(exp.a(1.0F)).a(eue.a(eth.ai)))
            .a(
               etp.a()
                  .a(exp.a(1.0F))
                  .a(ety.a(cvw.ow).a(2))
                  .a(ety.a(cvw.ow).a(new evm.a().a($$3.b(dbs.y), exp.a(1.0F))))
                  .a(ety.a(cvw.ow).a(new evm.a().a($$3.b(dbs.z), exp.a(1.0F))))
            )
      );
   }

   public static etq.a a(cvn $$0, cvn $$1, cxu $$2, jq.b<dbn> $$3) {
      return etq.b()
         .a(
            etp.a()
               .a(exp.a(1.0F))
               .a(exb.a(0.5F))
               .a(ety.a($$0).a(evh.a(ks.P, $$2)).a(new evm.a().a($$3.b(dbs.a), exp.a(4.0F)).a($$3.b(dbs.e), exp.a(4.0F)).a($$3.b(dbs.b), exp.a(4.0F))))
         )
         .a(
            etp.a()
               .a(exp.a(1.0F))
               .a(exb.a(0.5F))
               .a(ety.a($$1).a(evh.a(ks.P, $$2)).a(new evm.a().a($$3.b(dbs.a), exp.a(4.0F)).a($$3.b(dbs.e), exp.a(4.0F)).a($$3.b(dbs.b), exp.a(4.0F))))
         );
   }
}
