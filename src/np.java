import java.util.List;

public class np {
   private static final iw a = new iw()
      .a(ke.ay, ph::a)
      .a(ke.av, pf::a)
      .a(ke.aw, qj::a)
      .a(ke.aC, qy::a)
      .a(ke.aD, pq::a)
      .a(ke.aF, pp::a)
      .a(ke.aE, pm::a)
      .a(ke.aG, pl::a)
      .a(ke.at, qb::a)
      .a(ke.aL, cvc::a)
      .a(ke.aB, pi::a)
      .a(ke.ax, dow::a)
      .a(ke.aA, dou::a)
      .a(ke.aK, dyv::a)
      .a(ke.az, dxh::a)
      .a(ke.au, vb::a)
      .a(ke.aJ, cpe::a)
      .a(ke.aI, cpc::a)
      .a(ke.r, bkv::a);

   private static void a(ij.b $$0) {
      a($$0.b(ke.aC), $$0.b(ke.at));
   }

   public static void a(ii<dyj> $$0, ij<cun> $$1) {
      $$1.b().forEach($$1x -> {
         ahg $$2 = $$1x.g().a();
         List<il<dyj>> $$3 = ((cun)$$1x.a()).d().b();
         $$3.stream().flatMap(il::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ih.c<dyj> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dyj $$0) {
      return $$0.c().contains(dxx.a());
   }

   public static ij.b a() {
      iu.b $$0 = iu.a(kd.as);
      ij.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
