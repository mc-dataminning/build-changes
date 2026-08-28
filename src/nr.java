import java.util.function.BiConsumer;

public record nr(ju.a a) implements ni {
   @Override
   public void generate(BiConsumer<alc<exq>, exq.a> $$0) {
      ju.b<dgh> $$1 = this.a.e(me.bh);
      ju.b<dgf> $$2 = this.a.e(me.bg);
      ju.b<deh> $$3 = this.a.e(me.aS);
      dge $$4 = new dge($$2.b(dgg.e), $$1.b(dgi.q));
      dge $$5 = new dge($$2.b(dgg.e), $$1.b(dgi.r));
      $$0.accept(
         exh.ai,
         exq.b()
            .a(
               exp.a()
                  .a(fbn.a(1.0F))
                  .a(eye.a(a(cyc.ql, cyc.qm, $$5, $$3).b()).a(4))
                  .a(eye.a(a(cyc.qp, cyc.qq, $$4, $$3).b()).a(2))
                  .a(eye.a(a(cyc.qt, cyc.qu, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         exh.ak,
         exq.b()
            .a(exp.a().a(fbn.a(1.0F)).a(eye.a(exh.ai)))
            .a(
               exp.a()
                  .a(fbn.a(1.0F))
                  .a(exy.a(cyc.pK).a(4))
                  .a(exy.a(cyc.pK).a(new ezm.a().a($$3.b(dem.n), fbn.a(1.0F))))
                  .a(exy.a(cyc.pK).a(new ezm.a().a($$3.b(dem.q), fbn.a(1.0F))))
                  .a(exy.a(cyc.pP))
            )
      );
      $$0.accept(
         exh.aj,
         exq.b()
            .a(exp.a().a(fbn.a(1.0F)).a(eye.a(exh.ai)))
            .a(
               exp.a()
                  .a(fbn.a(1.0F))
                  .a(exy.a(cyc.pe).a(2))
                  .a(exy.a(cyc.pe).a(new ezm.a().a($$3.b(dem.y), fbn.a(1.0F))))
                  .a(exy.a(cyc.pe).a(new ezm.a().a($$3.b(dem.z), fbn.a(1.0F))))
            )
      );
   }

   public static exq.a a(cxu $$0, cxu $$1, dge $$2, ju.b<deh> $$3) {
      return exq.b()
         .a(
            exp.a()
               .a(fbn.a(1.0F))
               .a(faz.a(0.5F))
               .a(exy.a($$0).a(ezh.a(kx.W, $$2)).a(new ezm.a().a($$3.b(dem.a), fbn.a(4.0F)).a($$3.b(dem.e), fbn.a(4.0F)).a($$3.b(dem.b), fbn.a(4.0F))))
         )
         .a(
            exp.a()
               .a(fbn.a(1.0F))
               .a(faz.a(0.5F))
               .a(exy.a($$1).a(ezh.a(kx.W, $$2)).a(new ezm.a().a($$3.b(dem.a), fbn.a(4.0F)).a($$3.b(dem.e), fbn.a(4.0F)).a($$3.b(dem.b), fbn.a(4.0F))))
         );
   }
}
