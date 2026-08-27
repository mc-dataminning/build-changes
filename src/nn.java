import java.util.List;

public class nn {
   private static final iv a = new iv()
      .a(kd.aw, pc::a)
      .a(kd.at, pa::a)
      .a(kd.au, pz::a)
      .a(kd.aA, qo::a)
      .a(kd.aB, pl::a)
      .a(kd.aD, pk::a)
      .a(kd.aC, ph::a)
      .a(kd.aE, pg::a)
      .a(kd.ar, pr::a)
      .a(kd.aI, cts::a)
      .a(kd.az, pd::a)
      .a(kd.av, dnd::a)
      .a(kd.ay, dnb::a)
      .a(kd.aH, dxc::a)
      .a(kd.ax, dvo::a)
      .a(kd.as, ur::a)
      .a(kd.aG, cnu::a)
      .a(kd.aF, cns::a)
      .a(kd.q, bjw::a);

   private static void a(ii.b $$0) {
      a($$0.b(kd.aA), $$0.b(kd.ar));
   }

   public static void a(ih<dwq> $$0, ii<ctd> $$1) {
      $$1.b().forEach($$1x -> {
         agm $$2 = $$1x.g().a();
         List<ik<dwq>> $$3 = ((ctd)$$1x.a()).d().b();
         $$3.stream().flatMap(ik::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ig.c<dwq> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dwq $$0) {
      return $$0.c().contains(dwe.a());
   }

   public static ii.b a() {
      it.b $$0 = it.a(kc.ar);
      ii.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
