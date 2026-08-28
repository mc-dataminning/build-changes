import java.util.List;

public class oz {
   private static final jz a = new jz()
      .a(lr.aJ, qp::a)
      .a(lr.aG, qn::a)
      .a(lr.aH, rn::a)
      .a(lr.aP, sc::a)
      .a(lr.aQ, qy::a)
      .a(lr.aS, qx::a)
      .a(lr.aR, qu::a)
      .a(lr.aT, qt::a)
      .a(lr.aE, rf::a)
      .a(lr.aY, ddu::a)
      .a(lr.aO, qq::a)
      .a(lr.aI, dym::a)
      .a(lr.aN, dyk::a)
      .a(lr.aX, eim::a)
      .a(lr.aM, egy::a)
      .a(lr.aF, wq::a)
      .a(lr.aW, cwk::a)
      .a(lr.aV, cwi::a)
      .a(lr.m, cfw::a)
      .a(lr.W, cir::a)
      .a(lr.s, brc::a)
      .a(lr.d, dph::a)
      .a(lr.aK, czq::a)
      .a(lr.aL, day::a);

   private static void a(jl.a $$0) {
      a($$0.b(lr.aP), $$0.b(lr.aE));
   }

   public static void a(jk<eia> $$0, jl<ddf> $$1) {
      $$1.b().forEach($$1x -> {
         akk $$2 = $$1x.h().a();
         List<jn<eia>> $$3 = ((ddf)$$1x.a()).d().b();
         $$3.stream().flatMap(jn::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jj.c<eia> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ac.a("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ac.a("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(eia $$0) {
      return $$0.c().contains(eho.a());
   }

   public static jl.a a() {
      jx.b $$0 = jx.a(lq.aA);
      jl.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
