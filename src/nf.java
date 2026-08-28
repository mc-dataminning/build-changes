import java.util.function.BiConsumer;

public record nf(jo.a a) implements mw {
   @Override
   public void generate(BiConsumer<akp<erq>, erq.a> $$0) {
      jo.b<ddu> $$1 = this.a.b(lu.aF);
      $$0.accept(
         erh.aC,
         erq.b()
            .a(
               erp.a()
                  .a(evp.a(1.0F))
                  .a(ese.a(erh.aD).a(10).b(-2))
                  .a(ese.a(erh.aE).a(5).b(2).a(euz.a(erl.b.a, bv.a.a().a(cb.a(true)))))
                  .a(ese.a(erh.aF).a(85).b(-1))
            )
      );
      $$0.accept(erh.aF, a());
      $$0.accept(
         erh.aD,
         erq.b()
            .a(
               erp.a()
                  .a(ery.a(dfy.fm).a(17))
                  .a(ery.a(cur.pB).a(10).a(etr.a(evw.a(0.0F, 0.9F))))
                  .a(ery.a(cur.qD).a(10))
                  .a(ery.a(cur.rz).a(10))
                  .a(ery.a(cur.sk).a(10).a(etw.a(cwt.a)))
                  .a(ery.a(cur.ps).a(5))
                  .a(ery.a(cur.qV).a(2).a(etr.a(evw.a(0.0F, 0.9F))))
                  .a(ery.a(cur.ot).a(10))
                  .a(ery.a(cur.pq).a(5))
                  .a(ery.a(cur.rf).a(1).a(etq.a(evp.a(10.0F))))
                  .a(ery.a(dfy.fH).a(10))
                  .a(ery.a(cur.se).a(10))
                  .a(ery.a(dfy.mZ).a(euu.a(df.a.a().a(jq.a($$1.b(deb.x), $$1.b(deb.y), $$1.b(deb.z))))).a(10))
            )
      );
      $$0.accept(
         erh.aE,
         erq.b()
            .a(
               erp.a()
                  .a(ery.a(cur.uL))
                  .a(ery.a(cur.nL))
                  .a(ery.a(cur.ov).a(etr.a(evw.a(0.0F, 0.25F))).a(esp.a(this.a, evp.a(30.0F))))
                  .a(ery.a(cur.qV).a(etr.a(evw.a(0.0F, 0.25F))).a(esp.a(this.a, evp.a(30.0F))))
                  .a(ery.a(cur.qP).a(esp.a(this.a, evp.a(30.0F))))
                  .a(ery.a(cur.vU))
            )
      );
   }

   public static erq.a a() {
      return erq.b().a(erp.a().a(ery.a(cur.qZ).a(60)).a(ery.a(cur.ra).a(25)).a(ery.a(cur.rb).a(2)).a(ery.a(cur.rc).a(13)));
   }

   public jo.a b() {
      return this.a;
   }
}
