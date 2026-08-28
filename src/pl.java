import java.util.List;

public class pl {
   private static final kg a = new kg()
      .a(lz.aL, rb::a)
      .a(lz.aI, qz::a)
      .a(lz.aJ, rz::a)
      .a(lz.aR, so::a)
      .a(lz.aS, rk::a)
      .a(lz.aU, rj::a)
      .a(lz.aT, rg::a)
      .a(lz.aV, rf::a)
      .a(lz.aG, rr::a)
      .a(lz.ba, dgr::a)
      .a(lz.aQ, rc::a)
      .a(lz.aK, ebm::a)
      .a(lz.aP, ebk::a)
      .a(lz.aZ, eln::a)
      .a(lz.aO, ejz::a)
      .a(lz.aH, xe::a)
      .a(lz.aY, ddt::a)
      .a(lz.aX, ddr::a)
      .a(lz.aF, dun::a)
      .a(lz.m, chw::a)
      .a(lz.X, cks::a)
      .a(lz.s, bsx::a)
      .a(lz.d, dse::a)
      .a(lz.aM, dbx::a)
      .a(lz.aN, ddg::a)
      .a(lz.L, cwj::a)
      .a(lz.I, cvw::a);

   private static void a(js.a $$0) {
      a($$0.d(lz.aR), $$0.d(lz.aG));
   }

   public static void a(jr<elb> $$0, js<dgc> $$1) {
      $$1.c().forEach($$1x -> {
         ali $$2 = $$1x.h().a();
         List<ju<elb>> $$3 = ((dgc)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<elb> $$3xx = $$0.b($$2xx);
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

   private static boolean a(elb $$0) {
      return $$0.c().contains(ekp.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(ly.az);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
