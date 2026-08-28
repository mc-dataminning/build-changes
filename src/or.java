import java.util.List;

public class or {
   private static final kh a = new kh()
      .a(mc.aO, qh::a)
      .a(mc.aL, qf::a)
      .a(mc.aM, rf::a)
      .a(mc.aV, ru::a)
      .a(mc.aW, qq::a)
      .a(mc.aY, qp::a)
      .a(mc.aX, qm::a)
      .a(mc.aZ, ql::a)
      .a(mc.aJ, qx::a)
      .a(mc.be, dir::a)
      .a(mc.aT, qi::a)
      .a(mc.aN, edv::a)
      .a(mc.aS, edt::a)
      .a(mc.bd, enz::a)
      .a(mc.aR, eml::a)
      .a(mc.aK, wl::a)
      .a(mc.bc, dfs::a)
      .a(mc.bb, dfq::a)
      .a(mc.bf, dwu::a)
      .a(mc.m, cix::a)
      .a(mc.X, clt::a)
      .a(mc.s, bts::a)
      .a(mc.d, duk::a)
      .a(mc.aP, ddw::a)
      .a(mc.aQ, dff::a)
      .a(mc.L, cxp::a)
      .a(mc.I, cxc::a)
      .a(mc.aU, cii::a);

   private static void a(jt.a $$0) {
      a($$0.d(mc.aV), $$0.d(mc.aJ));
   }

   public static void a(js<enn> $$0, jt<dic> $$1) {
      $$1.c().forEach($$1x -> {
         aku $$2 = $$1x.h().a();
         List<jv<enn>> $$3 = ((dic)$$1x.a()).d().c();
         $$3.stream().flatMap(jv::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jr.c<enn> $$3xx = $$0.b($$2xx);
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

   private static boolean a(enn $$0) {
      return $$0.c().contains(enb.a());
   }

   public static jt.a a() {
      kf.b $$0 = kf.a(mb.aD);
      jt.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
