import java.util.List;

public class pn {
   private static final kg a = new kg()
      .a(ma.aL, re::a)
      .a(ma.aI, rc::a)
      .a(ma.aJ, sc::a)
      .a(ma.aR, sr::a)
      .a(ma.aS, rn::a)
      .a(ma.aU, rm::a)
      .a(ma.aT, rj::a)
      .a(ma.aV, ri::a)
      .a(ma.aG, ru::a)
      .a(ma.ba, dgw::a)
      .a(ma.aQ, rf::a)
      .a(ma.aK, ebq::a)
      .a(ma.aP, ebo::a)
      .a(ma.aZ, elr::a)
      .a(ma.aO, ekd::a)
      .a(ma.aH, xh::a)
      .a(ma.aY, ddx::a)
      .a(ma.aX, ddv::a)
      .a(ma.aF, dus::a)
      .a(ma.m, cia::a)
      .a(ma.X, ckw::a)
      .a(ma.s, btb::a)
      .a(ma.d, dsj::a)
      .a(ma.aM, dcb::a)
      .a(ma.aN, ddk::a)
      .a(ma.L, cwn::a)
      .a(ma.I, cwa::a);

   private static void a(js.a $$0) {
      a($$0.d(ma.aR), $$0.d(ma.aG));
   }

   public static void a(jr<elf> $$0, js<dgh> $$1) {
      $$1.c().forEach($$1x -> {
         all $$2 = $$1x.h().a();
         List<ju<elf>> $$3 = ((dgh)$$1x.a()).d().c();
         $$3.stream().flatMap(ju::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               jq.c<elf> $$3xx = $$0.b($$2xx);
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

   private static boolean a(elf $$0) {
      return $$0.c().contains(ekt.a());
   }

   public static js.a a() {
      ke.b $$0 = ke.a(lz.az);
      js.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
