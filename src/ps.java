import java.util.List;

public class ps {
   private static final kg a = new kg()
      .a(mb.aN, rn::a)
      .a(mb.aK, rl::a)
      .a(mb.aL, sm::a)
      .a(mb.aT, tb::a)
      .a(mb.aU, rw::a)
      .a(mb.aW, rv::a)
      .a(mb.aV, rs::a)
      .a(mb.aX, rr::a)
      .a(mb.aI, se::a)
      .a(mb.bc, diz::a)
      .a(mb.aS, ro::a)
      .a(mb.aM, edx::a)
      .a(mb.aR, edv::a)
      .a(mb.bb, eoa::a)
      .a(mb.aQ, emm::a)
      .a(mb.aJ, xr::a)
      .a(mb.ba, dga::a)
      .a(mb.aZ, dfy::a)
      .a(mb.bd, dwz::a)
      .a(mb.m, cjc::a)
      .a(mb.X, cly::a)
      .a(mb.s, bud::a)
      .a(mb.d, dup::a)
      .a(mb.aO, dee::a)
      .a(mb.aP, dfn::a)
      .a(mb.L, cxx::a)
      .a(mb.I, cxk::a);

   private static void a(js.a $$0) {
      a($$0.d(mb.aT), $$0.d(mb.aI));
   }

   public static void a(jr<eno> $$0, js<dik> $$1) {
      $$1.c().forEach($$1x -> {
         alz $$2 = $$1x.h().a();
         List<ju<eno>> $$3 = ((dik)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<eno> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eno $$0) {
      return $$0.c().contains(enc.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(ma.aC);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
