import java.util.function.BiConsumer;

public record nu(jg.a a) implements nk {
   @Override
   public void generate(BiConsumer<ald<eys>, eys.a> $$0) {
      jg.b<djs> $$1 = this.a.e(mg.aG);
      $$0.accept(
         eyj.am,
         eys.b()
            .a(
               eyr.a()
                  .a(fcp.a(1.0F))
                  .a(ezg.a(eyj.an).a(10).b(-2))
                  .a(ezg.a(eyj.ao).a(5).b(2).a(fbz.a(eyn.b.a, bx.a.a().a(cd.a(true)))))
                  .a(ezg.a(eyj.ap).a(85).b(-1))
            )
      );
      $$0.accept(eyj.ap, a());
      $$0.accept(
         eyj.an,
         eys.b()
            .a(
               eyr.a()
                  .a(eza.a(dlw.fB).a(17))
                  .a(eza.a(cyw.qk).a(10).a(fat.a(fcw.a(0.0F, 0.9F))))
                  .a(eza.a(cyw.ro).a(10))
                  .a(eza.a(cyw.sA).a(10))
                  .a(eza.a(cyw.tm).a(10).a(fay.a(dap.a)))
                  .a(eza.a(cyw.qb).a(5))
                  .a(eza.a(cyw.rW).a(2).a(fat.a(fcw.a(0.0F, 0.9F))))
                  .a(eza.a(cyw.pc).a(10))
                  .a(eza.a(cyw.pZ).a(5))
                  .a(eza.a(cyw.sg).a(1).a(fas.a(fcp.a(10.0F))))
                  .a(eza.a(dlw.gc).a(10))
                  .a(eza.a(cyw.tf).a(10))
                  .a(eza.a(dlw.nB).a(fbu.a(ct.a.a().a(ji.a($$1.b(djz.y), $$1.b(djz.z), $$1.b(djz.A))))).a(10))
            )
      );
      $$0.accept(
         eyj.ao,
         eys.b()
            .a(
               eyr.a()
                  .a(eza.a(cyw.vP))
                  .a(eza.a(cyw.op))
                  .a(eza.a(cyw.pe).a(fat.a(fcw.a(0.0F, 0.25F))).a(ezr.a(this.a, fcp.a(30.0F))))
                  .a(eza.a(cyw.rW).a(fat.a(fcw.a(0.0F, 0.25F))).a(ezr.a(this.a, fcp.a(30.0F))))
                  .a(eza.a(cyw.rA).a(ezr.a(this.a, fcp.a(30.0F))))
                  .a(eza.a(cyw.wX))
            )
      );
   }

   public static eys.a a() {
      return eys.b().a(eyr.a().a(eza.a(cyw.sa).a(60)).a(eza.a(cyw.sb).a(25)).a(eza.a(cyw.sc).a(2)).a(eza.a(cyw.sd).a(13)));
   }

   public jg.a b() {
      return this.a;
   }
}
