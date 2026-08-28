import java.util.function.BiConsumer;

public record nt(jg.a a) implements nk {
   @Override
   public void generate(BiConsumer<ald<eys>, eys.a> $$0) {
      jg.b<dhh> $$1 = this.a.e(mg.bj);
      jg.b<dhf> $$2 = this.a.e(mg.bi);
      jg.b<dff> $$3 = this.a.e(mg.aP);
      dhd $$4 = new dhd($$2.b(dhg.e), $$1.b(dhi.q));
      dhd $$5 = new dhd($$2.b(dhg.e), $$1.b(dhi.r));
      $$0.accept(
         eyj.ai,
         eys.b()
            .a(
               eyr.a()
                  .a(fcp.a(1.0F))
                  .a(ezg.a(a(cyw.ql, cyw.qm, $$5, $$3).b()).a(4))
                  .a(ezg.a(a(cyw.qp, cyw.qq, $$4, $$3).b()).a(2))
                  .a(ezg.a(a(cyw.qt, cyw.qu, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         eyj.ak,
         eys.b()
            .a(eyr.a().a(fcp.a(1.0F)).a(ezg.a(eyj.ai)))
            .a(
               eyr.a()
                  .a(fcp.a(1.0F))
                  .a(eza.a(cyw.pK).a(4))
                  .a(eza.a(cyw.pK).a(new fao.a().a($$3.b(dfk.n), fcp.a(1.0F))))
                  .a(eza.a(cyw.pK).a(new fao.a().a($$3.b(dfk.q), fcp.a(1.0F))))
                  .a(eza.a(cyw.pP))
            )
      );
      $$0.accept(
         eyj.aj,
         eys.b()
            .a(eyr.a().a(fcp.a(1.0F)).a(ezg.a(eyj.ai)))
            .a(
               eyr.a()
                  .a(fcp.a(1.0F))
                  .a(eza.a(cyw.pe).a(2))
                  .a(eza.a(cyw.pe).a(new fao.a().a($$3.b(dfk.y), fcp.a(1.0F))))
                  .a(eza.a(cyw.pe).a(new fao.a().a($$3.b(dfk.z), fcp.a(1.0F))))
            )
      );
   }

   public static eys.a a(cyo $$0, cyo $$1, dhd $$2, jg.b<dff> $$3) {
      return eys.b()
         .a(
            eyr.a()
               .a(fcp.a(1.0F))
               .a(fcb.a(0.5F))
               .a(eza.a($$0).a(faj.a(kj.W, $$2)).a(new fao.a().a($$3.b(dfk.a), fcp.a(4.0F)).a($$3.b(dfk.e), fcp.a(4.0F)).a($$3.b(dfk.b), fcp.a(4.0F))))
         )
         .a(
            eyr.a()
               .a(fcp.a(1.0F))
               .a(fcb.a(0.5F))
               .a(eza.a($$1).a(faj.a(kj.W, $$2)).a(new fao.a().a($$3.b(dfk.a), fcp.a(4.0F)).a($$3.b(dfk.e), fcp.a(4.0F)).a($$3.b(dfk.b), fcp.a(4.0F))))
         );
   }
}
