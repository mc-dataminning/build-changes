import java.util.function.BiConsumer;

public record nn(js.a a) implements nd {
   @Override
   public void generate(BiConsumer<alh<euh>, euh.a> $$0) {
      js.b<dgc> $$1 = this.a.d(lz.aG);
      $$0.accept(
         ety.am,
         euh.b()
            .a(
               eug.a()
                  .a(eyg.a(1.0F))
                  .a(euv.a(ety.an).a(10).b(-2))
                  .a(euv.a(ety.ao).a(5).b(2).a(exq.a(euc.b.a, bw.a.a().a(cc.a(true)))))
                  .a(euv.a(ety.ap).a(85).b(-1))
            )
      );
      $$0.accept(ety.ap, a());
      $$0.accept(
         ety.an,
         euh.b()
            .a(
               eug.a()
                  .a(eup.a(dig.fm).a(17))
                  .a(eup.a(cwf.pC).a(10).a(ewi.a(eyn.a(0.0F, 0.9F))))
                  .a(eup.a(cwf.qE).a(10))
                  .a(eup.a(cwf.rA).a(10))
                  .a(eup.a(cwf.sm).a(10).a(ewn.a(cyb.a)))
                  .a(eup.a(cwf.pt).a(5))
                  .a(eup.a(cwf.qW).a(2).a(ewi.a(eyn.a(0.0F, 0.9F))))
                  .a(eup.a(cwf.ou).a(10))
                  .a(eup.a(cwf.pr).a(5))
                  .a(eup.a(cwf.rg).a(1).a(ewh.a(eyg.a(10.0F))))
                  .a(eup.a(dig.fH).a(10))
                  .a(eup.a(cwf.sf).a(10))
                  .a(eup.a(dig.mZ).a(exl.a(dh.a.a().a(ju.a($$1.b(dgj.x), $$1.b(dgj.y), $$1.b(dgj.z))))).a(10))
            )
      );
      $$0.accept(
         ety.ao,
         euh.b()
            .a(
               eug.a()
                  .a(eup.a(cwf.uN))
                  .a(eup.a(cwf.nL))
                  .a(eup.a(cwf.ow).a(ewi.a(eyn.a(0.0F, 0.25F))).a(evg.a(this.a, eyg.a(30.0F))))
                  .a(eup.a(cwf.qW).a(ewi.a(eyn.a(0.0F, 0.25F))).a(evg.a(this.a, eyg.a(30.0F))))
                  .a(eup.a(cwf.qQ).a(evg.a(this.a, eyg.a(30.0F))))
                  .a(eup.a(cwf.vV))
            )
      );
   }

   public static euh.a a() {
      return euh.b().a(eug.a().a(eup.a(cwf.ra).a(60)).a(eup.a(cwf.rb).a(25)).a(eup.a(cwf.rc).a(2)).a(eup.a(cwf.rd).a(13)));
   }

   public js.a b() {
      return this.a;
   }
}
