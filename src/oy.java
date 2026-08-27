import java.util.List;

public class oy {
   private static final jq a = new jq()
      .a(li.aE, qw::a)
      .a(li.aB, qr::a)
      .a(li.aC, sa::a)
      .a(li.aI, sp::a)
      .a(li.aJ, rg::a)
      .a(li.aL, rf::a)
      .a(li.aK, rc::a)
      .a(li.aM, ra::a)
      .a(li.az, rr::a)
      .a(li.aR, ddo::a)
      .a(li.aH, qx::a)
      .a(li.aD, dzb::a)
      .a(li.aG, dyz::a)
      .a(li.aQ, ejj::a)
      .a(li.aF, ehu::a)
      .a(li.aA, xa::a)
      .a(li.aP, cwy::a)
      .a(li.aO, cww::a)
      .a(li.m, cfj::a)
      .a(li.s, bqw::a)
      .a(li.d, dpt::a);

   private static void a(jc.a $$0) {
      a($$0.b(li.aI), $$0.b(li.az));
   }

   public static void a(jb<eix> $$0, jc<dcz> $$1) {
      $$1.b().forEach($$1x -> {
         akt $$2 = $$1x.h().a();
         List<je<eix>> $$3 = ((dcz)$$1x.a()).d().b();
         $$3.stream().flatMap(je::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ja.c<eix> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ad.a("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ad.a("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(eix $$0) {
      return $$0.c().contains(eik.a());
   }

   public static jc.a a() {
      jo.b $$0 = jo.a(lh.aw);
      jc.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
