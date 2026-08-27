import java.util.function.BiConsumer;

public class ls implements lh {
   public static final ejv.a a = ejt.a(ci.a.a().d(cuv.x));
   public static final ejv.a b = ejt.a(ci.a.a().d(cuv.y));
   public static final ejv.a c = ejt.a(ci.a.a().d(cuv.z));

   @Override
   public void generate(BiConsumer<ahg, ehe.a> $$0) {
      $$0.accept(
         egu.as,
         ehe.b()
            .a(
               ehd.a()
                  .a(eko.a(1.0F))
                  .a(ehs.a(egu.at).a(10).b(-2))
                  .a(ehs.a(egu.au).a(5).b(2).a(ejy.a(egw.b.a, bp.a.a().a(bu.a(true)))))
                  .a(ehs.a(egu.av).a(85).b(-1))
            )
      );
      $$0.accept(egu.av, a());
      $$0.accept(
         egu.at,
         ehe.b()
            .a(
               ehd.a()
                  .a(ehm.a(cws.fm).a(17))
                  .a(ehm.a(cnb.py).a(10).a(eiv.a(ekt.a(0.0F, 0.9F))))
                  .a(ehm.a(cnb.qA).a(10))
                  .a(ehm.a(cnb.rw).a(10))
                  .a(ehm.a(cnb.sh).a(10).a(eiz.a(coz.c)))
                  .a(ehm.a(cnb.pp).a(5))
                  .a(ehm.a(cnb.qS).a(2).a(eiv.a(ekt.a(0.0F, 0.9F))))
                  .a(ehm.a(cnb.pn).a(10))
                  .a(ehm.a(cnb.pm).a(5))
                  .a(ehm.a(cnb.rc).a(1).a(eiu.a(eko.a(10.0F))))
                  .a(ehm.a(cws.fH).a(10))
                  .a(ehm.a(cnb.sb).a(10))
                  .a(ehm.a(cws.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         egu.au,
         ehe.b()
            .a(
               ehd.a()
                  .a(ehm.a(cnb.uE))
                  .a(ehm.a(cnb.nK))
                  .a(ehm.a(cnb.or).a(eiv.a(ekt.a(0.0F, 0.25F))).a(eic.a(eko.a(30.0F)).e()))
                  .a(ehm.a(cnb.qS).a(eiv.a(ekt.a(0.0F, 0.25F))).a(eic.a(eko.a(30.0F)).e()))
                  .a(ehm.a(cnb.qM).a(eic.a(eko.a(30.0F)).e()))
                  .a(ehm.a(cnb.vK))
            )
      );
   }

   public static ehe.a a() {
      return ehe.b().a(ehd.a().a(ehm.a(cnb.qW).a(60)).a(ehm.a(cnb.qX).a(25)).a(ehm.a(cnb.qY).a(2)).a(ehm.a(cnb.qZ).a(13)));
   }
}
