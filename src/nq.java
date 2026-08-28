import java.util.function.BiConsumer;

public record nq(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<akt<evu>, evu.a> $$0) {
      jt.b<dhi> $$1 = this.a.d(mc.aI);
      $$0.accept(
         evl.am,
         evu.b()
            .a(
               evt.a()
                  .a(ezr.a(1.0F))
                  .a(ewi.a(evl.an).a(10).b(-2))
                  .a(ewi.a(evl.ao).a(5).b(2).a(ezb.a(evp.b.a, bx.a.a().a(cd.a(true)))))
                  .a(ewi.a(evl.ap).a(85).b(-1))
            )
      );
      $$0.accept(evl.ap, a());
      $$0.accept(
         evl.an,
         evu.b()
            .a(
               evt.a()
                  .a(ewc.a(djm.fB).a(17))
                  .a(ewc.a(cwr.qg).a(10).a(exv.a(ezy.a(0.0F, 0.9F))))
                  .a(ewc.a(cwr.rk).a(10))
                  .a(ewc.a(cwr.sw).a(10))
                  .a(ewc.a(cwr.ti).a(10).a(eya.a(cyn.a)))
                  .a(ewc.a(cwr.pX).a(5))
                  .a(ewc.a(cwr.rS).a(2).a(exv.a(ezy.a(0.0F, 0.9F))))
                  .a(ewc.a(cwr.oY).a(10))
                  .a(ewc.a(cwr.pV).a(5))
                  .a(ewc.a(cwr.sc).a(1).a(exu.a(ezr.a(10.0F))))
                  .a(ewc.a(djm.gc).a(10))
                  .a(ewc.a(cwr.tb).a(10))
                  .a(ewc.a(djm.nB).a(eyw.a(di.a.a().a(jv.a($$1.b(dhp.y), $$1.b(dhp.z), $$1.b(dhp.A))))).a(10))
            )
      );
      $$0.accept(
         evl.ao,
         evu.b()
            .a(
               evt.a()
                  .a(ewc.a(cwr.vL))
                  .a(ewc.a(cwr.on))
                  .a(ewc.a(cwr.pa).a(exv.a(ezy.a(0.0F, 0.25F))).a(ewt.a(this.a, ezr.a(30.0F))))
                  .a(ewc.a(cwr.rS).a(exv.a(ezy.a(0.0F, 0.25F))).a(ewt.a(this.a, ezr.a(30.0F))))
                  .a(ewc.a(cwr.rw).a(ewt.a(this.a, ezr.a(30.0F))))
                  .a(ewc.a(cwr.wT))
            )
      );
   }

   public static evu.a a() {
      return evu.b().a(evt.a().a(ewc.a(cwr.rW).a(60)).a(ewc.a(cwr.rX).a(25)).a(ewc.a(cwr.rY).a(2)).a(ewc.a(cwr.rZ).a(13)));
   }

   public jt.a b() {
      return this.a;
   }
}
