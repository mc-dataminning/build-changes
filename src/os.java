import java.util.List;

public class os {
   private static final jl a = new jl()
      .a(ld.aD, qm::a)
      .a(ld.aA, qk::a)
      .a(ld.aB, ro::a)
      .a(ld.aH, sd::a)
      .a(ld.aI, qv::a)
      .a(ld.aK, qu::a)
      .a(ld.aJ, qr::a)
      .a(ld.aL, qq::a)
      .a(ld.ay, rg::a)
      .a(ld.aQ, dbi::a)
      .a(ld.aG, qn::a)
      .a(ld.aC, dvx::a)
      .a(ld.aF, dvv::a)
      .a(ld.aP, efw::a)
      .a(ld.aE, eei::a)
      .a(ld.az, wo::a)
      .a(ld.aO, cuj::a)
      .a(ld.aN, cuh::a)
      .a(ld.m, cdy::a)
      .a(ld.s, bpm::a)
      .a(ld.d, dmv::a);

   private static void a(ix.a $$0) {
      a($$0.b(ld.aH), $$0.b(ld.ay));
   }

   public static void a(iw<efk> $$0, ix<dat> $$1) {
      $$1.b().forEach($$1x -> {
         akf $$2 = $$1x.h().a();
         List<iz<efk>> $$3 = ((dat)$$1x.a()).d().b();
         $$3.stream().flatMap(iz::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               iv.c<efk> $$3xx = $$0.b($$2xx);
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

   private static boolean a(efk $$0) {
      return $$0.c().contains(eey.a());
   }

   public static ix.a a() {
      jj.b $$0 = jj.a(lc.av);
      ix.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
