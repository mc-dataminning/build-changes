import java.util.function.BiConsumer;

public record ng(jo.a a) implements mx {
   @Override
   public void generate(BiConsumer<akq<erw>, erw.a> $$0) {
      jo.b<ddw> $$1 = this.a.b(lu.aF);
      $$0.accept(
         ern.aC,
         erw.b()
            .a(
               erv.a()
                  .a(evv.a(1.0F))
                  .a(esk.a(ern.aD).a(10).b(-2))
                  .a(esk.a(ern.aE).a(5).b(2).a(evf.a(err.b.a, bv.a.a().a(cb.a(true)))))
                  .a(esk.a(ern.aF).a(85).b(-1))
            )
      );
      $$0.accept(ern.aF, a());
      $$0.accept(
         ern.aD,
         erw.b()
            .a(
               erv.a()
                  .a(ese.a(dga.fm).a(17))
                  .a(ese.a(cut.pB).a(10).a(etx.a(ewc.a(0.0F, 0.9F))))
                  .a(ese.a(cut.qD).a(10))
                  .a(ese.a(cut.rz).a(10))
                  .a(ese.a(cut.sk).a(10).a(euc.a(cwv.a)))
                  .a(ese.a(cut.ps).a(5))
                  .a(ese.a(cut.qV).a(2).a(etx.a(ewc.a(0.0F, 0.9F))))
                  .a(ese.a(cut.ot).a(10))
                  .a(ese.a(cut.pq).a(5))
                  .a(ese.a(cut.rf).a(1).a(etw.a(evv.a(10.0F))))
                  .a(ese.a(dga.fH).a(10))
                  .a(ese.a(cut.se).a(10))
                  .a(ese.a(dga.mZ).a(eva.a(df.a.a().a(jq.a($$1.b(ded.x), $$1.b(ded.y), $$1.b(ded.z))))).a(10))
            )
      );
      $$0.accept(
         ern.aE,
         erw.b()
            .a(
               erv.a()
                  .a(ese.a(cut.uL))
                  .a(ese.a(cut.nL))
                  .a(ese.a(cut.ov).a(etx.a(ewc.a(0.0F, 0.25F))).a(esv.a(this.a, evv.a(30.0F))))
                  .a(ese.a(cut.qV).a(etx.a(ewc.a(0.0F, 0.25F))).a(esv.a(this.a, evv.a(30.0F))))
                  .a(ese.a(cut.qP).a(esv.a(this.a, evv.a(30.0F))))
                  .a(ese.a(cut.vU))
            )
      );
   }

   public static erw.a a() {
      return erw.b().a(erv.a().a(ese.a(cut.qZ).a(60)).a(ese.a(cut.ra).a(25)).a(ese.a(cut.rb).a(2)).a(ese.a(cut.rc).a(13)));
   }

   public jo.a b() {
      return this.a;
   }
}
