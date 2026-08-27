import java.util.List;

public class nt {
   private static final ja a = new ja()
      .a(ki.az, pm::a)
      .a(ki.aw, pk::a)
      .a(ki.ax, qo::a)
      .a(ki.aD, rd::a)
      .a(ki.aE, pv::a)
      .a(ki.aG, pu::a)
      .a(ki.aF, pr::a)
      .a(ki.aH, pq::a)
      .a(ki.au, qg::a)
      .a(ki.aM, cxs::a)
      .a(ki.aC, pn::a)
      .a(ki.ay, drx::a)
      .a(ki.aB, drv::a)
      .a(ki.aL, ebw::a)
      .a(ki.aA, eai::a)
      .a(ki.av, vo::a)
      .a(ki.aK, crv::a)
      .a(ki.aJ, crt::a)
      .a(ki.r, bnh::a);

   private static void a(in.a $$0) {
      a($$0.b(ki.aD), $$0.b(ki.au));
   }

   public static void a(im<ebk> $$0, in<cxd> $$1) {
      $$1.b().forEach($$1x -> {
         ajc $$2 = $$1x.h().a();
         List<ip<ebk>> $$3 = ((cxd)$$1x.a()).d().b();
         $$3.stream().flatMap(ip::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               il.c<ebk> $$3xx = $$0.b($$2xx);
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

   private static boolean a(ebk $$0) {
      return $$0.c().contains(eay.a());
   }

   public static in.a a() {
      iy.b $$0 = iy.a(kh.at);
      in.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
