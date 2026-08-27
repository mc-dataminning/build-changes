import java.util.function.BiConsumer;

public class ls implements lh {
   public static final eju.a a = ejs.a(ci.a.a().d(cuu.x));
   public static final eju.a b = ejs.a(ci.a.a().d(cuu.y));
   public static final eju.a c = ejs.a(ci.a.a().d(cuu.z));

   @Override
   public void generate(BiConsumer<ahg, ehd.a> $$0) {
      $$0.accept(
         egt.as,
         ehd.b()
            .a(
               ehc.a()
                  .a(ekn.a(1.0F))
                  .a(ehr.a(egt.at).a(10).b(-2))
                  .a(ehr.a(egt.au).a(5).b(2).a(ejx.a(egv.b.a, bp.a.a().a(bu.a(true)))))
                  .a(ehr.a(egt.av).a(85).b(-1))
            )
      );
      $$0.accept(egt.av, a());
      $$0.accept(
         egt.at,
         ehd.b()
            .a(
               ehc.a()
                  .a(ehl.a(cwr.fm).a(17))
                  .a(ehl.a(cna.py).a(10).a(eiu.a(eks.a(0.0F, 0.9F))))
                  .a(ehl.a(cna.qA).a(10))
                  .a(ehl.a(cna.rw).a(10))
                  .a(ehl.a(cna.sh).a(10).a(eiy.a(coy.c)))
                  .a(ehl.a(cna.pp).a(5))
                  .a(ehl.a(cna.qS).a(2).a(eiu.a(eks.a(0.0F, 0.9F))))
                  .a(ehl.a(cna.pn).a(10))
                  .a(ehl.a(cna.pm).a(5))
                  .a(ehl.a(cna.rc).a(1).a(eit.a(ekn.a(10.0F))))
                  .a(ehl.a(cwr.fH).a(10))
                  .a(ehl.a(cna.sb).a(10))
                  .a(ehl.a(cwr.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         egt.au,
         ehd.b()
            .a(
               ehc.a()
                  .a(ehl.a(cna.uE))
                  .a(ehl.a(cna.nK))
                  .a(ehl.a(cna.or).a(eiu.a(eks.a(0.0F, 0.25F))).a(eib.a(ekn.a(30.0F)).e()))
                  .a(ehl.a(cna.qS).a(eiu.a(eks.a(0.0F, 0.25F))).a(eib.a(ekn.a(30.0F)).e()))
                  .a(ehl.a(cna.qM).a(eib.a(ekn.a(30.0F)).e()))
                  .a(ehl.a(cna.vK))
            )
      );
   }

   public static ehd.a a() {
      return ehd.b().a(ehc.a().a(ehl.a(cna.qW).a(60)).a(ehl.a(cna.qX).a(25)).a(ehl.a(cna.qY).a(2)).a(ehl.a(cna.qZ).a(13)));
   }
}
