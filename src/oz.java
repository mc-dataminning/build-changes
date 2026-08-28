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
      .a(lr.aY, ddv::a)
      .a(lr.aO, qq::a)
      .a(lr.aI, dyn::a)
      .a(lr.aN, dyl::a)
      .a(lr.aX, ein::a)
      .a(lr.aM, egz::a)
      .a(lr.aF, wq::a)
      .a(lr.aW, cwl::a)
      .a(lr.aV, cwj::a)
      .a(lr.m, cfx::a)
      .a(lr.W, cis::a)
      .a(lr.s, brd::a)
      .a(lr.d, dpi::a)
      .a(lr.aK, czr::a)
      .a(lr.aL, daz::a);

   private static void a(jl.a $$0) {
      a($$0.b(lr.aP), $$0.b(lr.aE));
   }

   public static void a(jk<eib> $$0, jl<ddg> $$1) {
      $$1.b().forEach($$1x -> {
         akk $$2 = $$1x.h().a();
         List<jn<eib>> $$3 = ((ddg)$$1x.a()).d().b();
         $$3.stream().flatMap(jn::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jj.c<eib> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eib $$0) {
      return $$0.c().contains(ehp.a());
   }

   public static jl.a a() {
      jx.b $$0 = jx.a(lq.aA);
      jl.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
