import java.util.function.BiConsumer;

public record ng(jo.a a) implements mx {
   @Override
   public void generate(BiConsumer<akq<eru>, eru.a> $$0) {
      jo.b<ddw> $$1 = this.a.b(lu.aF);
      $$0.accept(
         erl.aC,
         eru.b()
            .a(
               ert.a()
                  .a(evt.a(1.0F))
                  .a(esi.a(erl.aD).a(10).b(-2))
                  .a(esi.a(erl.aE).a(5).b(2).a(evd.a(erp.b.a, bv.a.a().a(cb.a(true)))))
                  .a(esi.a(erl.aF).a(85).b(-1))
            )
      );
      $$0.accept(erl.aF, a());
      $$0.accept(
         erl.aD,
         eru.b()
            .a(
               ert.a()
                  .a(esc.a(dga.fm).a(17))
                  .a(esc.a(cut.pB).a(10).a(etv.a(ewa.a(0.0F, 0.9F))))
                  .a(esc.a(cut.qD).a(10))
                  .a(esc.a(cut.rz).a(10))
                  .a(esc.a(cut.sk).a(10).a(eua.a(cwv.a)))
                  .a(esc.a(cut.ps).a(5))
                  .a(esc.a(cut.qV).a(2).a(etv.a(ewa.a(0.0F, 0.9F))))
                  .a(esc.a(cut.ot).a(10))
                  .a(esc.a(cut.pq).a(5))
                  .a(esc.a(cut.rf).a(1).a(etu.a(evt.a(10.0F))))
                  .a(esc.a(dga.fH).a(10))
                  .a(esc.a(cut.se).a(10))
                  .a(esc.a(dga.mZ).a(euy.a(df.a.a().a(jq.a($$1.b(ded.x), $$1.b(ded.y), $$1.b(ded.z))))).a(10))
            )
      );
      $$0.accept(
         erl.aE,
         eru.b()
            .a(
               ert.a()
                  .a(esc.a(cut.uL))
                  .a(esc.a(cut.nL))
                  .a(esc.a(cut.ov).a(etv.a(ewa.a(0.0F, 0.25F))).a(est.a(this.a, evt.a(30.0F))))
                  .a(esc.a(cut.qV).a(etv.a(ewa.a(0.0F, 0.25F))).a(est.a(this.a, evt.a(30.0F))))
                  .a(esc.a(cut.qP).a(est.a(this.a, evt.a(30.0F))))
                  .a(esc.a(cut.vU))
            )
      );
   }

   public static eru.a a() {
      return eru.b().a(ert.a().a(esc.a(cut.qZ).a(60)).a(esc.a(cut.ra).a(25)).a(esc.a(cut.rb).a(2)).a(esc.a(cut.rc).a(13)));
   }

   public jo.a b() {
      return this.a;
   }
}
