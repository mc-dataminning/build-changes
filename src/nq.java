import java.util.function.BiConsumer;

public record nq(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<aku<evx>, evx.a> $$0) {
      jt.b<dhl> $$1 = this.a.d(mc.aI);
      $$0.accept(
         evo.am,
         evx.b()
            .a(
               evw.a()
                  .a(ezu.a(1.0F))
                  .a(ewl.a(evo.an).a(10).b(-2))
                  .a(ewl.a(evo.ao).a(5).b(2).a(eze.a(evs.b.a, bx.a.a().a(cd.a(true)))))
                  .a(ewl.a(evo.ap).a(85).b(-1))
            )
      );
      $$0.accept(evo.ap, a());
      $$0.accept(
         evo.an,
         evx.b()
            .a(
               evw.a()
                  .a(ewf.a(djp.fB).a(17))
                  .a(ewf.a(cwu.qg).a(10).a(exy.a(fab.a(0.0F, 0.9F))))
                  .a(ewf.a(cwu.rk).a(10))
                  .a(ewf.a(cwu.sw).a(10))
                  .a(ewf.a(cwu.ti).a(10).a(eyd.a(cyq.a)))
                  .a(ewf.a(cwu.pX).a(5))
                  .a(ewf.a(cwu.rS).a(2).a(exy.a(fab.a(0.0F, 0.9F))))
                  .a(ewf.a(cwu.oY).a(10))
                  .a(ewf.a(cwu.pV).a(5))
                  .a(ewf.a(cwu.sc).a(1).a(exx.a(ezu.a(10.0F))))
                  .a(ewf.a(djp.gc).a(10))
                  .a(ewf.a(cwu.tb).a(10))
                  .a(ewf.a(djp.nB).a(eyz.a(di.a.a().a(jv.a($$1.b(dhs.y), $$1.b(dhs.z), $$1.b(dhs.A))))).a(10))
            )
      );
      $$0.accept(
         evo.ao,
         evx.b()
            .a(
               evw.a()
                  .a(ewf.a(cwu.vL))
                  .a(ewf.a(cwu.on))
                  .a(ewf.a(cwu.pa).a(exy.a(fab.a(0.0F, 0.25F))).a(eww.a(this.a, ezu.a(30.0F))))
                  .a(ewf.a(cwu.rS).a(exy.a(fab.a(0.0F, 0.25F))).a(eww.a(this.a, ezu.a(30.0F))))
                  .a(ewf.a(cwu.rw).a(eww.a(this.a, ezu.a(30.0F))))
                  .a(ewf.a(cwu.wT))
            )
      );
   }

   public static evx.a a() {
      return evx.b().a(evw.a().a(ewf.a(cwu.rW).a(60)).a(ewf.a(cwu.rX).a(25)).a(ewf.a(cwu.rY).a(2)).a(ewf.a(cwu.rZ).a(13)));
   }

   public jt.a b() {
      return this.a;
   }
}
