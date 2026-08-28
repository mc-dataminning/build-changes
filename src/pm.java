import java.util.List;

public class pm {
   private static final kg a = new kg()
      .a(ma.aL, rc::a)
      .a(ma.aI, ra::a)
      .a(ma.aJ, sa::a)
      .a(ma.aR, sp::a)
      .a(ma.aS, rl::a)
      .a(ma.aU, rk::a)
      .a(ma.aT, rh::a)
      .a(ma.aV, rg::a)
      .a(ma.aG, rs::a)
      .a(ma.ba, dhd::a)
      .a(ma.aQ, rd::a)
      .a(ma.aK, ebx::a)
      .a(ma.aP, ebv::a)
      .a(ma.aZ, ely::a)
      .a(ma.aO, ekk::a)
      .a(ma.aH, xf::a)
      .a(ma.aY, dee::a)
      .a(ma.aX, dec::a)
      .a(ma.aF, duz::a)
      .a(ma.m, cid::a)
      .a(ma.X, ckz::a)
      .a(ma.s, bte::a)
      .a(ma.d, dsq::a)
      .a(ma.aM, dci::a)
      .a(ma.aN, ddr::a)
      .a(ma.L, cwu::a)
      .a(ma.I, cwh::a);

   private static void a(js.a $$0) {
      a($$0.d(ma.aR), $$0.d(ma.aG));
   }

   public static void a(jr<elm> $$0, js<dgo> $$1) {
      $$1.c().forEach($$1x -> {
         alj $$2 = $$1x.h().a();
         List<ju<elm>> $$3 = ((dgo)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<elm> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ae.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ae.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(elm $$0) {
      return $$0.c().contains(ela.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(lz.az);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
