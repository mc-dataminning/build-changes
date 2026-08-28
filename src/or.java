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
      .a(mc.bc, dhz::a)
      .a(mc.aS, qi::a)
      .a(mc.aM, ecz::a)
      .a(mc.aR, ecx::a)
      .a(mc.bb, enc::a)
      .a(mc.aQ, elo::a)
      .a(mc.aJ, wk::a)
      .a(mc.ba, dfa::a)
      .a(mc.aZ, dey::a)
      .a(mc.bd, dwb::a)
      .a(mc.m, cic::a)
      .a(mc.X, cky::a)
      .a(mc.s, btd::a)
      .a(mc.d, dtr::a)
      .a(mc.aO, dde::a)
      .a(mc.aP, den::a)
      .a(mc.L, cwx::a)
      .a(mc.I, cwk::a);

   private static void a(jt.a $$0) {
      a($$0.d(mc.aT), $$0.d(mc.aI));
   }

   public static void a(js<emq> $$0, jt<dhk> $$1) {
      $$1.c().forEach($$1x -> {
         aku $$2 = $$1x.h().a();
         List<jv<emq>> $$3 = ((dhk)$$1x.a()).d().c();
         $$3.stream().flatMap(jv::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jr.c<emq> $$3xx = $$0.b($$2xx);
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

   private static boolean a(emq $$0) {
      return $$0.c().contains(eme.a());
   }

   public static jt.a a() {
      kf.b $$0 = kf.a(mb.aC);
      jt.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
