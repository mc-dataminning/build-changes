import java.util.List;

public class nn {
   private static final iw a = new iw()
      .a(ke.ay, pf::a)
      .a(ke.av, pd::a)
      .a(ke.aw, qh::a)
      .a(ke.aC, qw::a)
      .a(ke.aD, po::a)
      .a(ke.aF, pn::a)
      .a(ke.aE, pk::a)
      .a(ke.aG, pj::a)
      .a(ke.at, pz::a)
      .a(ke.aL, cuw::a)
      .a(ke.aB, pg::a)
      .a(ke.ax, doq::a)
      .a(ke.aA, doo::a)
      .a(ke.aK, dyp::a)
      .a(ke.az, dxb::a)
      .a(ke.au, uz::a)
      .a(ke.aJ, coy::a)
      .a(ke.aI, cow::a)
      .a(ke.r, bkq::a);

   private static void a(ij.b $$0) {
      a($$0.b(ke.aC), $$0.b(ke.at));
   }

   public static void a(ii<dyd> $$0, ij<cuh> $$1) {
      $$1.b().forEach($$1x -> {
         ahd $$2 = $$1x.g().a();
         List<il<dyd>> $$3 = ((cuh)$$1x.a()).d().b();
         $$3.stream().flatMap(il::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ih.c<dyd> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dyd $$0) {
      return $$0.c().contains(dxr.a());
   }

   public static ij.b a() {
      iu.b $$0 = iu.a(kd.as);
      ij.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
