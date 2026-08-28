import java.util.List;

public class ot {
   private static final ki a = new ki()
      .a(me.aR, qj::a)
      .a(me.aO, qh::a)
      .a(me.aP, rh::a)
      .a(me.aY, rw::a)
      .a(me.aZ, qs::a)
      .a(me.bb, qr::a)
      .a(me.ba, qo::a)
      .a(me.bc, qn::a)
      .a(me.aM, qz::a)
      .a(me.bj, djh::a)
      .a(me.aW, qk::a)
      .a(me.aQ, ees::a)
      .a(me.aV, eeq::a)
      .a(me.bi, eow::a)
      .a(me.aU, eni::a)
      .a(me.aN, wr::a)
      .a(me.bh, dgi::a)
      .a(me.bg, dgg::a)
      .a(me.bk, dxq::a)
      .a(me.m, cjo::a)
      .a(me.X, cmk::a)
      .a(me.s, buk::a)
      .a(me.d, dvc::a)
      .a(me.aS, dem::a)
      .a(me.aT, dfv::a)
      .a(me.L, cyg::a)
      .a(me.I, cxt::a)
      .a(me.aX, ciz::a)
      .a(me.be, sl::a)
      .a(me.bf, sq::a);

   private static void a(ju.a $$0) {
      a($$0.e(me.aY), $$0.e(me.aM));
   }

   public static void a(jt<eok> $$0, ju<dis> $$1) {
      $$1.c().forEach($$1x -> {
         ald $$2 = $$1x.h().a();
         List<jw<eok>> $$3 = ((dis)$$1x.a()).d().c();
         $$3.stream().flatMap(jw::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               js.c<eok> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eok $$0) {
      return $$0.c().contains(eny.a());
   }

   public static ju.a a() {
      kg.b $$0 = kg.a(md.aG);
      ju.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
