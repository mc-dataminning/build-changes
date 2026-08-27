import java.util.List;

public class np {
   private static final iw a = new iw()
      .a(ke.ay, pi::a)
      .a(ke.av, pg::a)
      .a(ke.aw, qk::a)
      .a(ke.aC, qz::a)
      .a(ke.aD, pr::a)
      .a(ke.aF, pq::a)
      .a(ke.aE, pn::a)
      .a(ke.aG, pm::a)
      .a(ke.at, qc::a)
      .a(ke.aL, cvl::a)
      .a(ke.aB, pj::a)
      .a(ke.ax, dpf::a)
      .a(ke.aA, dpd::a)
      .a(ke.aK, dze::a)
      .a(ke.az, dxq::a)
      .a(ke.au, vc::a)
      .a(ke.aJ, cpn::a)
      .a(ke.aI, cpl::a)
      .a(ke.r, bky::a);

   private static void a(ij.b $$0) {
      a($$0.b(ke.aC), $$0.b(ke.at));
   }

   public static void a(ii<dys> $$0, ij<cuw> $$1) {
      $$1.b().forEach($$1x -> {
         ahh $$2 = $$1x.h().a();
         List<il<dys>> $$3 = ((cuw)$$1x.a()).d().b();
         $$3.stream().flatMap(il::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ih.c<dys> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dys $$0) {
      return $$0.c().contains(dyg.a());
   }

   public static ij.b a() {
      iu.b $$0 = iu.a(kd.as);
      ij.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
