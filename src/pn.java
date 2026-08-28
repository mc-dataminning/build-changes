import java.util.List;

public class pn {
   private static final kg a = new kg()
      .a(mb.aN, rd::a)
      .a(mb.aK, rb::a)
      .a(mb.aL, sb::a)
      .a(mb.aT, sq::a)
      .a(mb.aU, rm::a)
      .a(mb.aW, rl::a)
      .a(mb.aV, ri::a)
      .a(mb.aX, rh::a)
      .a(mb.aI, rt::a)
      .a(mb.bc, diq::a)
      .a(mb.aS, re::a)
      .a(mb.aM, edq::a)
      .a(mb.aR, edo::a)
      .a(mb.bb, ent::a)
      .a(mb.aQ, emf::a)
      .a(mb.aJ, xg::a)
      .a(mb.ba, dfr::a)
      .a(mb.aZ, dfp::a)
      .a(mb.bd, dws::a)
      .a(mb.m, cit::a)
      .a(mb.X, clp::a)
      .a(mb.s, btu::a)
      .a(mb.d, dui::a)
      .a(mb.aO, ddv::a)
      .a(mb.aP, dfe::a)
      .a(mb.L, cxo::a)
      .a(mb.I, cxb::a);

   private static void a(js.a $$0) {
      a($$0.d(mb.aT), $$0.d(mb.aI));
   }

   public static void a(jr<enh> $$0, js<dib> $$1) {
      $$1.c().forEach($$1x -> {
         alp $$2 = $$1x.h().a();
         List<ju<enh>> $$3 = ((dib)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<enh> $$3xx = $$0.b($$2xx);
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

   private static boolean a(enh $$0) {
      return $$0.c().contains(emv.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(ma.aC);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
