import java.util.function.BiConsumer;

public class kn implements kf {
   public static final efr.a a = efp.a(cj.a.a().d(crc.x));
   public static final efr.a b = efp.a(cj.a.a().d(crc.y));
   public static final efr.a c = efp.a(cj.a.a().d(crc.z));

   @Override
   public void generate(BiConsumer<aey, eda.a> $$0) {
      $$0.accept(
         ecq.ai,
         eda.b()
            .a(
               ecz.a()
                  .a(egk.a(1.0F))
                  .a(edo.a(ecq.aj).a(10).b(-2))
                  .a(edo.a(ecq.ak).a(5).b(2).a(efu.a(ecs.b.a, bq.a.a().a(bv.a(true)))))
                  .a(edo.a(ecq.al).a(85).b(-1))
            )
      );
      $$0.accept(ecq.al, a());
      $$0.accept(
         ecq.aj,
         eda.b()
            .a(
               ecz.a()
                  .a(edi.a(csy.fm).a(17))
                  .a(edi.a(cjk.oN).a(10).a(eer.a(egp.a(0.0F, 0.9F))))
                  .a(edi.a(cjk.pP).a(10))
                  .a(edi.a(cjk.qL).a(10))
                  .a(edi.a(cjk.rv).a(10).a(eev.a(clh.c)))
                  .a(edi.a(cjk.oE).a(5))
                  .a(edi.a(cjk.qh).a(2).a(eer.a(egp.a(0.0F, 0.9F))))
                  .a(edi.a(cjk.oC).a(10))
                  .a(edi.a(cjk.oB).a(5))
                  .a(edi.a(cjk.qr).a(1).a(eeq.a(egk.a(10.0F))))
                  .a(edi.a(csy.fH).a(10))
                  .a(edi.a(cjk.rp).a(10))
                  .a(edi.a(csy.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         ecq.ak,
         eda.b()
            .a(
               ecz.a()
                  .a(edi.a(cjk.tR))
                  .a(edi.a(cjk.mZ))
                  .a(edi.a(cjk.nG).a(eer.a(egp.a(0.0F, 0.25F))).a(edy.a(egk.a(30.0F)).e()))
                  .a(edi.a(cjk.qh).a(eer.a(egp.a(0.0F, 0.25F))).a(edy.a(egk.a(30.0F)).e()))
                  .a(edi.a(cjk.qb).a(edy.a(egk.a(30.0F)).e()))
                  .a(edi.a(cjk.uX))
            )
      );
   }

   public static eda.a a() {
      return eda.b().a(ecz.a().a(edi.a(cjk.ql).a(60)).a(edi.a(cjk.qm).a(25)).a(edi.a(cjk.qn).a(2)).a(edi.a(cjk.qo).a(13)));
   }
}
