import java.util.function.BiConsumer;

public class lo implements ld {
   public static final ejd.a a = ejb.a(ci.a.a().d(cue.x));
   public static final ejd.a b = ejb.a(ci.a.a().d(cue.y));
   public static final ejd.a c = ejb.a(ci.a.a().d(cue.z));

   @Override
   public void generate(BiConsumer<agt, egm.a> $$0) {
      $$0.accept(
         egc.as,
         egm.b()
            .a(
               egl.a()
                  .a(ejw.a(1.0F))
                  .a(eha.a(egc.at).a(10).b(-2))
                  .a(eha.a(egc.au).a(5).b(2).a(ejg.a(ege.b.a, bp.a.a().a(bu.a(true)))))
                  .a(eha.a(egc.av).a(85).b(-1))
            )
      );
      $$0.accept(egc.av, a());
      $$0.accept(
         egc.at,
         egm.b()
            .a(
               egl.a()
                  .a(egu.a(cwb.fm).a(17))
                  .a(egu.a(cmk.py).a(10).a(eid.a(ekb.a(0.0F, 0.9F))))
                  .a(egu.a(cmk.qA).a(10))
                  .a(egu.a(cmk.rw).a(10))
                  .a(egu.a(cmk.sh).a(10).a(eih.a(coh.c)))
                  .a(egu.a(cmk.pp).a(5))
                  .a(egu.a(cmk.qS).a(2).a(eid.a(ekb.a(0.0F, 0.9F))))
                  .a(egu.a(cmk.pn).a(10))
                  .a(egu.a(cmk.pm).a(5))
                  .a(egu.a(cmk.rc).a(1).a(eic.a(ejw.a(10.0F))))
                  .a(egu.a(cwb.fH).a(10))
                  .a(egu.a(cmk.sb).a(10))
                  .a(egu.a(cwb.mZ).a(a.or(b).or(c)).a(10))
            )
      );
      $$0.accept(
         egc.au,
         egm.b()
            .a(
               egl.a()
                  .a(egu.a(cmk.uE))
                  .a(egu.a(cmk.nK))
                  .a(egu.a(cmk.or).a(eid.a(ekb.a(0.0F, 0.25F))).a(ehk.a(ejw.a(30.0F)).e()))
                  .a(egu.a(cmk.qS).a(eid.a(ekb.a(0.0F, 0.25F))).a(ehk.a(ejw.a(30.0F)).e()))
                  .a(egu.a(cmk.qM).a(ehk.a(ejw.a(30.0F)).e()))
                  .a(egu.a(cmk.vK))
            )
      );
   }

   public static egm.a a() {
      return egm.b().a(egl.a().a(egu.a(cmk.qW).a(60)).a(egu.a(cmk.qX).a(25)).a(egu.a(cmk.qY).a(2)).a(egu.a(cmk.qZ).a(13)));
   }
}
