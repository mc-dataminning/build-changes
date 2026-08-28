import java.util.function.BiConsumer;

public record nq(jt.a a) implements ng {
   @Override
   public void generate(BiConsumer<akt<evw>, evw.a> $$0) {
      jt.b<dhk> $$1 = this.a.d(mc.aI);
      $$0.accept(
         evn.am,
         evw.b()
            .a(
               evv.a()
                  .a(ezt.a(1.0F))
                  .a(ewk.a(evn.an).a(10).b(-2))
                  .a(ewk.a(evn.ao).a(5).b(2).a(ezd.a(evr.b.a, bx.a.a().a(cd.a(true)))))
                  .a(ewk.a(evn.ap).a(85).b(-1))
            )
      );
      $$0.accept(evn.ap, a());
      $$0.accept(
         evn.an,
         evw.b()
            .a(
               evv.a()
                  .a(ewe.a(djo.fB).a(17))
                  .a(ewe.a(cwt.qg).a(10).a(exx.a(faa.a(0.0F, 0.9F))))
                  .a(ewe.a(cwt.rk).a(10))
                  .a(ewe.a(cwt.sw).a(10))
                  .a(ewe.a(cwt.ti).a(10).a(eyc.a(cyp.a)))
                  .a(ewe.a(cwt.pX).a(5))
                  .a(ewe.a(cwt.rS).a(2).a(exx.a(faa.a(0.0F, 0.9F))))
                  .a(ewe.a(cwt.oY).a(10))
                  .a(ewe.a(cwt.pV).a(5))
                  .a(ewe.a(cwt.sc).a(1).a(exw.a(ezt.a(10.0F))))
                  .a(ewe.a(djo.gc).a(10))
                  .a(ewe.a(cwt.tb).a(10))
                  .a(ewe.a(djo.nB).a(eyy.a(di.a.a().a(jv.a($$1.b(dhr.y), $$1.b(dhr.z), $$1.b(dhr.A))))).a(10))
            )
      );
      $$0.accept(
         evn.ao,
         evw.b()
            .a(
               evv.a()
                  .a(ewe.a(cwt.vL))
                  .a(ewe.a(cwt.on))
                  .a(ewe.a(cwt.pa).a(exx.a(faa.a(0.0F, 0.25F))).a(ewv.a(this.a, ezt.a(30.0F))))
                  .a(ewe.a(cwt.rS).a(exx.a(faa.a(0.0F, 0.25F))).a(ewv.a(this.a, ezt.a(30.0F))))
                  .a(ewe.a(cwt.rw).a(ewv.a(this.a, ezt.a(30.0F))))
                  .a(ewe.a(cwt.wT))
            )
      );
   }

   public static evw.a a() {
      return evw.b().a(evv.a().a(ewe.a(cwt.rW).a(60)).a(ewe.a(cwt.rX).a(25)).a(ewe.a(cwt.rY).a(2)).a(ewe.a(cwt.rZ).a(13)));
   }

   public jt.a b() {
      return this.a;
   }
}
