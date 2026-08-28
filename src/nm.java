import java.util.function.BiConsumer;

public record nm(jr.a a) implements nc {
   @Override
   public void generate(BiConsumer<alg<eub>, eub.a> $$0) {
      jr.b<dfw> $$1 = this.a.d(ly.aG);
      $$0.accept(
         ets.am,
         eub.b()
            .a(
               eua.a()
                  .a(eya.a(1.0F))
                  .a(eup.a(ets.an).a(10).b(-2))
                  .a(eup.a(ets.ao).a(5).b(2).a(exk.a(etw.b.a, bv.a.a().a(cb.a(true)))))
                  .a(eup.a(ets.ap).a(85).b(-1))
            )
      );
      $$0.accept(ets.ap, a());
      $$0.accept(
         ets.an,
         eub.b()
            .a(
               eua.a()
                  .a(euj.a(dia.fm).a(17))
                  .a(euj.a(cwb.pC).a(10).a(ewc.a(eyh.a(0.0F, 0.9F))))
                  .a(euj.a(cwb.qE).a(10))
                  .a(euj.a(cwb.rA).a(10))
                  .a(euj.a(cwb.sm).a(10).a(ewh.a(cxx.a)))
                  .a(euj.a(cwb.pt).a(5))
                  .a(euj.a(cwb.qW).a(2).a(ewc.a(eyh.a(0.0F, 0.9F))))
                  .a(euj.a(cwb.ou).a(10))
                  .a(euj.a(cwb.pr).a(5))
                  .a(euj.a(cwb.rg).a(1).a(ewb.a(eya.a(10.0F))))
                  .a(euj.a(dia.fH).a(10))
                  .a(euj.a(cwb.sf).a(10))
                  .a(euj.a(dia.mZ).a(exf.a(dg.a.a().a(jt.a($$1.b(dgd.x), $$1.b(dgd.y), $$1.b(dgd.z))))).a(10))
            )
      );
      $$0.accept(
         ets.ao,
         eub.b()
            .a(
               eua.a()
                  .a(euj.a(cwb.uN))
                  .a(euj.a(cwb.nL))
                  .a(euj.a(cwb.ow).a(ewc.a(eyh.a(0.0F, 0.25F))).a(eva.a(this.a, eya.a(30.0F))))
                  .a(euj.a(cwb.qW).a(ewc.a(eyh.a(0.0F, 0.25F))).a(eva.a(this.a, eya.a(30.0F))))
                  .a(euj.a(cwb.qQ).a(eva.a(this.a, eya.a(30.0F))))
                  .a(euj.a(cwb.vV))
            )
      );
   }

   public static eub.a a() {
      return eub.b().a(eua.a().a(euj.a(cwb.ra).a(60)).a(euj.a(cwb.rb).a(25)).a(euj.a(cwb.rc).a(2)).a(euj.a(cwb.rd).a(13)));
   }

   public jr.a b() {
      return this.a;
   }
}
