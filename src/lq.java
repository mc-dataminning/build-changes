import java.util.function.BiConsumer;

public class lq implements lf {
   public static final ejo.a a = ejm.a(ci.a.a().d(cuo.x));
   public static final ejo.a b = ejm.a(ci.a.a().d(cuo.y));
   public static final ejo.a c = ejm.a(ci.a.a().d(cuo.z));

   @Override
   public void generate(BiConsumer<ahd, egx.a> $$0) {
      $$0.accept(
         egn.as,
         egx.b()
            .a(
               egw.a()
                  .a(ekh.a(1.0F))
                  .a(ehl.a(egn.at).a(10).b(-2))
                  .a(ehl.a(egn.au).a(5).b(2).a(ejr.a(egp.b.a, bp.a.a().a(bu.a(true)))))
                  .a(ehl.a(egn.av).a(85).b(-1))
            )
      );
      $$0.accept(egn.av, a());
      $$0.accept(
         egn.at,
         egx.b()
            .a(
               egw.a()
                  .a(ehf.a(cwl.fm).a(17))
                  .a(ehf.a(cmu.py).a(10).a(eio.a(ekm.a(0.0F, 0.9F))))
                  .a(ehf.a(cmu.qA).a(10))
                  .a(ehf.a(cmu.rw).a(10))
                  .a(ehf.a(cmu.sh).a(10).a(eis.a(cos.c)))
                  .a(ehf.a(cmu.pp).a(5))
                  .a(ehf.a(cmu.qS).a(2).a(eio.a(ekm.a(0.0F, 0.9F))))
                  .a(ehf.a(cmu.pn).a(10))
                  .a(ehf.a(cmu.pm).a(5))
                  .a(ehf.a(cmu.rc).a(1).a(ein.a(ekh.a(10.0F))))
                  .a(ehf.a(cwl.fH).a(10))
                  .a(ehf.a(cmu.sb).a(10))
                  .a(ehf.a(cwl.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         egn.au,
         egx.b()
            .a(
               egw.a()
                  .a(ehf.a(cmu.uE))
                  .a(ehf.a(cmu.nK))
                  .a(ehf.a(cmu.or).a(eio.a(ekm.a(0.0F, 0.25F))).a(ehv.a(ekh.a(30.0F)).e()))
                  .a(ehf.a(cmu.qS).a(eio.a(ekm.a(0.0F, 0.25F))).a(ehv.a(ekh.a(30.0F)).e()))
                  .a(ehf.a(cmu.qM).a(ehv.a(ekh.a(30.0F)).e()))
                  .a(ehf.a(cmu.vK))
            )
      );
   }

   public static egx.a a() {
      return egx.b().a(egw.a().a(ehf.a(cmu.qW).a(60)).a(ehf.a(cmu.qX).a(25)).a(ehf.a(cmu.qY).a(2)).a(ehf.a(cmu.qZ).a(13)));
   }
}
