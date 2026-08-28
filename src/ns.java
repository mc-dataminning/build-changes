import java.util.function.BiConsumer;

public record ns(ju.a a) implements ni {
   @Override
   public void generate(BiConsumer<alc<exq>, exq.a> $$0) {
      ju.b<dis> $$1 = this.a.e(me.aM);
      $$0.accept(
         exh.am,
         exq.b()
            .a(
               exp.a()
                  .a(fbn.a(1.0F))
                  .a(eye.a(exh.an).a(10).b(-2))
                  .a(eye.a(exh.ao).a(5).b(2).a(fax.a(exl.b.a, bx.a.a().a(cd.a(true)))))
                  .a(eye.a(exh.ap).a(85).b(-1))
            )
      );
      $$0.accept(exh.ap, a());
      $$0.accept(
         exh.an,
         exq.b()
            .a(
               exp.a()
                  .a(exy.a(dkw.fB).a(17))
                  .a(exy.a(cyc.qk).a(10).a(ezr.a(fbu.a(0.0F, 0.9F))))
                  .a(exy.a(cyc.ro).a(10))
                  .a(exy.a(cyc.sA).a(10))
                  .a(exy.a(cyc.tm).a(10).a(ezw.a(czv.a)))
                  .a(exy.a(cyc.qb).a(5))
                  .a(exy.a(cyc.rW).a(2).a(ezr.a(fbu.a(0.0F, 0.9F))))
                  .a(exy.a(cyc.pc).a(10))
                  .a(exy.a(cyc.pZ).a(5))
                  .a(exy.a(cyc.sg).a(1).a(ezq.a(fbn.a(10.0F))))
                  .a(exy.a(dkw.gc).a(10))
                  .a(exy.a(cyc.tf).a(10))
                  .a(exy.a(dkw.nB).a(fas.a(di.a.a().a(jw.a($$1.b(diz.y), $$1.b(diz.z), $$1.b(diz.A))))).a(10))
            )
      );
      $$0.accept(
         exh.ao,
         exq.b()
            .a(
               exp.a()
                  .a(exy.a(cyc.vP))
                  .a(exy.a(cyc.op))
                  .a(exy.a(cyc.pe).a(ezr.a(fbu.a(0.0F, 0.25F))).a(eyp.a(this.a, fbn.a(30.0F))))
                  .a(exy.a(cyc.rW).a(ezr.a(fbu.a(0.0F, 0.25F))).a(eyp.a(this.a, fbn.a(30.0F))))
                  .a(exy.a(cyc.rA).a(eyp.a(this.a, fbn.a(30.0F))))
                  .a(exy.a(cyc.wX))
            )
      );
   }

   public static exq.a a() {
      return exq.b().a(exp.a().a(exy.a(cyc.sa).a(60)).a(exy.a(cyc.sb).a(25)).a(exy.a(cyc.sc).a(2)).a(exy.a(cyc.sd).a(13)));
   }

   public ju.a b() {
      return this.a;
   }
}
