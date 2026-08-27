import java.util.function.BiConsumer;

public class lo implements le {
   public static final eib.a a = ehz.a(cj.a.a().d(ctk.x));
   public static final eib.a b = ehz.a(cj.a.a().d(ctk.y));
   public static final eib.a c = ehz.a(cj.a.a().d(ctk.z));

   @Override
   public void generate(BiConsumer<agm, efk.a> $$0) {
      $$0.accept(
         efa.ai,
         efk.b()
            .a(
               efj.a()
                  .a(eiu.a(1.0F))
                  .a(efy.a(efa.aj).a(10).b(-2))
                  .a(efy.a(efa.ak).a(5).b(2).a(eie.a(efc.b.a, bq.a.a().a(bv.a(true)))))
                  .a(efy.a(efa.al).a(85).b(-1))
            )
      );
      $$0.accept(efa.al, a());
      $$0.accept(
         efa.aj,
         efk.b()
            .a(
               efj.a()
                  .a(efs.a(cvh.fm).a(17))
                  .a(efs.a(clr.py).a(10).a(ehb.a(eiz.a(0.0F, 0.9F))))
                  .a(efs.a(clr.qA).a(10))
                  .a(efs.a(clr.rw).a(10))
                  .a(efs.a(clr.sh).a(10).a(ehf.a(cno.c)))
                  .a(efs.a(clr.pp).a(5))
                  .a(efs.a(clr.qS).a(2).a(ehb.a(eiz.a(0.0F, 0.9F))))
                  .a(efs.a(clr.pn).a(10))
                  .a(efs.a(clr.pm).a(5))
                  .a(efs.a(clr.rc).a(1).a(eha.a(eiu.a(10.0F))))
                  .a(efs.a(cvh.fH).a(10))
                  .a(efs.a(clr.sb).a(10))
                  .a(efs.a(cvh.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         efa.ak,
         efk.b()
            .a(
               efj.a()
                  .a(efs.a(clr.uD))
                  .a(efs.a(clr.nK))
                  .a(efs.a(clr.or).a(ehb.a(eiz.a(0.0F, 0.25F))).a(egi.a(eiu.a(30.0F)).e()))
                  .a(efs.a(clr.qS).a(ehb.a(eiz.a(0.0F, 0.25F))).a(egi.a(eiu.a(30.0F)).e()))
                  .a(efs.a(clr.qM).a(egi.a(eiu.a(30.0F)).e()))
                  .a(efs.a(clr.vJ))
            )
      );
   }

   public static efk.a a() {
      return efk.b().a(efj.a().a(efs.a(clr.qW).a(60)).a(efs.a(clr.qX).a(25)).a(efs.a(clr.qY).a(2)).a(efs.a(clr.qZ).a(13)));
   }
}
