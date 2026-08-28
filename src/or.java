import java.util.List;

public class or {
   private static final kh a = new kh()
      .a(mc.aN, qh::a)
      .a(mc.aK, qf::a)
      .a(mc.aL, rf::a)
      .a(mc.aT, ru::a)
      .a(mc.aU, qq::a)
      .a(mc.aW, qp::a)
      .a(mc.aV, qm::a)
      .a(mc.aX, ql::a)
      .a(mc.aI, qx::a)
      .a(mc.bc, dhy::a)
      .a(mc.aS, qi::a)
      .a(mc.aM, ecy::a)
      .a(mc.aR, ecw::a)
      .a(mc.bb, enb::a)
      .a(mc.aQ, eln::a)
      .a(mc.aJ, wl::a)
      .a(mc.ba, dez::a)
      .a(mc.aZ, dex::a)
      .a(mc.bd, dwa::a)
      .a(mc.m, cic::a)
      .a(mc.X, cky::a)
      .a(mc.s, btd::a)
      .a(mc.d, dtq::a)
      .a(mc.aO, ddd::a)
      .a(mc.aP, dem::a)
      .a(mc.L, cww::a)
      .a(mc.I, cwj::a);

   private static void a(jt.a $$0) {
      a($$0.d(mc.aT), $$0.d(mc.aI));
   }

   public static void a(js<emp> $$0, jt<dhj> $$1) {
      $$1.c().forEach($$1x -> {
         akv $$2 = $$1x.h().a();
         List<jv<emp>> $$3 = ((dhj)$$1x.a()).d().c();
         $$3.stream().flatMap(jv::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jr.c<emp> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  af.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  af.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(emp $$0) {
      return $$0.c().contains(emd.a());
   }

   public static jt.a a() {
      kf.b $$0 = kf.a(mb.aC);
      jt.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
