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
      .a(mc.bc, dia::a)
      .a(mc.aS, qi::a)
      .a(mc.aM, eda::a)
      .a(mc.aR, ecy::a)
      .a(mc.bb, end::a)
      .a(mc.aQ, elp::a)
      .a(mc.aJ, wl::a)
      .a(mc.ba, dfb::a)
      .a(mc.aZ, dez::a)
      .a(mc.bd, dwc::a)
      .a(mc.m, cie::a)
      .a(mc.X, cla::a)
      .a(mc.s, btf::a)
      .a(mc.d, dts::a)
      .a(mc.aO, ddf::a)
      .a(mc.aP, deo::a)
      .a(mc.L, cwy::a)
      .a(mc.I, cwl::a);

   private static void a(jt.a $$0) {
      a($$0.d(mc.aT), $$0.d(mc.aI));
   }

   public static void a(js<emr> $$0, jt<dhl> $$1) {
      $$1.c().forEach($$1x -> {
         akv $$2 = $$1x.h().a();
         List<jv<emr>> $$3 = ((dhl)$$1x.a()).d().c();
         $$3.stream().flatMap(jv::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jr.c<emr> $$3xx = $$0.b($$2xx);
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

   private static boolean a(emr $$0) {
      return $$0.c().contains(emf.a());
   }

   public static jt.a a() {
      kf.b $$0 = kf.a(mb.aC);
      jt.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
