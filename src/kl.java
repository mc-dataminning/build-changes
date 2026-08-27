import java.util.function.BiConsumer;

public class kl implements kd {
   public static final efj.a a = efh.a(cj.a.a().d(crg.x));
   public static final efj.a b = efh.a(cj.a.a().d(crg.y));
   public static final efj.a c = efh.a(cj.a.a().d(crg.z));

   @Override
   public void generate(BiConsumer<aez, ecs.a> $$0) {
      $$0.accept(
         eci.ai,
         ecs.b()
            .a(
               ecr.a()
                  .a(egc.a(1.0F))
                  .a(edg.a(eci.aj).a(10).b(-2))
                  .a(edg.a(eci.ak).a(5).b(2).a(efm.a(eck.b.a, bq.a.a().a(bv.a(true)))))
                  .a(edg.a(eci.al).a(85).b(-1))
            )
      );
      $$0.accept(eci.al, a());
      $$0.accept(
         eci.aj,
         ecs.b()
            .a(
               ecr.a()
                  .a(eda.a(cte.fm).a(17))
                  .a(eda.a(cjo.oN).a(10).a(eej.a(egh.a(0.0F, 0.9F))))
                  .a(eda.a(cjo.pP).a(10))
                  .a(eda.a(cjo.qL).a(10))
                  .a(eda.a(cjo.rv).a(10).a(een.a(cll.c)))
                  .a(eda.a(cjo.oE).a(5))
                  .a(eda.a(cjo.qh).a(2).a(eej.a(egh.a(0.0F, 0.9F))))
                  .a(eda.a(cjo.oC).a(10))
                  .a(eda.a(cjo.oB).a(5))
                  .a(eda.a(cjo.qr).a(1).a(eei.a(egc.a(10.0F))))
                  .a(eda.a(cte.fH).a(10))
                  .a(eda.a(cjo.rp).a(10))
                  .a(eda.a(cte.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         eci.ak,
         ecs.b()
            .a(
               ecr.a()
                  .a(eda.a(cjo.tR))
                  .a(eda.a(cjo.mZ))
                  .a(eda.a(cjo.nG).a(eej.a(egh.a(0.0F, 0.25F))).a(edq.a(egc.a(30.0F)).e()))
                  .a(eda.a(cjo.qh).a(eej.a(egh.a(0.0F, 0.25F))).a(edq.a(egc.a(30.0F)).e()))
                  .a(eda.a(cjo.qb).a(edq.a(egc.a(30.0F)).e()))
                  .a(eda.a(cjo.uX))
            )
      );
   }

   public static ecs.a a() {
      return ecs.b().a(ecr.a().a(eda.a(cjo.ql).a(60)).a(eda.a(cjo.qm).a(25)).a(eda.a(cjo.qn).a(2)).a(eda.a(cjo.qo).a(13)));
   }
}
