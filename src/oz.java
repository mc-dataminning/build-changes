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
      .a(lr.aY, dds::a)
      .a(lr.aO, qq::a)
      .a(lr.aI, dyg::a)
      .a(lr.aN, dye::a)
      .a(lr.aX, eig::a)
      .a(lr.aM, egs::a)
      .a(lr.aF, wq::a)
      .a(lr.aW, cwi::a)
      .a(lr.aV, cwg::a)
      .a(lr.m, cft::a)
      .a(lr.W, cio::a)
      .a(lr.s, bqz::a)
      .a(lr.d, dpf::a)
      .a(lr.aK, czo::a)
      .a(lr.aL, daw::a);

   private static void a(jl.a $$0) {
      a($$0.b(lr.aP), $$0.b(lr.aE));
   }

   public static void a(jk<ehu> $$0, jl<ddd> $$1) {
      $$1.b().forEach($$1x -> {
         akk $$2 = $$1x.h().a();
         List<jn<ehu>> $$3 = ((ddd)$$1x.a()).d().b();
         $$3.stream().flatMap(jn::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jj.c<ehu> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ehu $$0) {
      return $$0.c().contains(ehi.a());
   }

   public static jl.a a() {
      jx.b $$0 = jx.a(lq.aA);
      jl.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
