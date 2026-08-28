import java.util.function.BiConsumer;

public record nq(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<aku<evv>, evv.a> $$0) {
      jt.b<dhj> $$1 = this.a.d(mc.aI);
      $$0.accept(
         evm.am,
         evv.b()
            .a(
               evu.a()
                  .a(ezs.a(1.0F))
                  .a(ewj.a(evm.an).a(10).b(-2))
                  .a(ewj.a(evm.ao).a(5).b(2).a(ezc.a(evq.b.a, bx.a.a().a(cd.a(true)))))
                  .a(ewj.a(evm.ap).a(85).b(-1))
            )
      );
      $$0.accept(evm.ap, a());
      $$0.accept(
         evm.an,
         evv.b()
            .a(
               evu.a()
                  .a(ewd.a(djn.fB).a(17))
                  .a(ewd.a(cws.qg).a(10).a(exw.a(ezz.a(0.0F, 0.9F))))
                  .a(ewd.a(cws.rk).a(10))
                  .a(ewd.a(cws.sw).a(10))
                  .a(ewd.a(cws.ti).a(10).a(eyb.a(cyo.a)))
                  .a(ewd.a(cws.pX).a(5))
                  .a(ewd.a(cws.rS).a(2).a(exw.a(ezz.a(0.0F, 0.9F))))
                  .a(ewd.a(cws.oY).a(10))
                  .a(ewd.a(cws.pV).a(5))
                  .a(ewd.a(cws.sc).a(1).a(exv.a(ezs.a(10.0F))))
                  .a(ewd.a(djn.gc).a(10))
                  .a(ewd.a(cws.tb).a(10))
                  .a(ewd.a(djn.nB).a(eyx.a(di.a.a().a(jv.a($$1.b(dhq.y), $$1.b(dhq.z), $$1.b(dhq.A))))).a(10))
            )
      );
      $$0.accept(
         evm.ao,
         evv.b()
            .a(
               evu.a()
                  .a(ewd.a(cws.vL))
                  .a(ewd.a(cws.on))
                  .a(ewd.a(cws.pa).a(exw.a(ezz.a(0.0F, 0.25F))).a(ewu.a(this.a, ezs.a(30.0F))))
                  .a(ewd.a(cws.rS).a(exw.a(ezz.a(0.0F, 0.25F))).a(ewu.a(this.a, ezs.a(30.0F))))
                  .a(ewd.a(cws.rw).a(ewu.a(this.a, ezs.a(30.0F))))
                  .a(ewd.a(cws.wT))
            )
      );
   }

   public static evv.a a() {
      return evv.b().a(evu.a().a(ewd.a(cws.rW).a(60)).a(ewd.a(cws.rX).a(25)).a(ewd.a(cws.rY).a(2)).a(ewd.a(cws.rZ).a(13)));
   }

   public jt.a b() {
      return this.a;
   }
}
