import java.util.List;

public class mj {
   private static final hw a = new hw()
      .a(je.au, nw::a)
      .a(je.ar, nu::a)
      .a(je.as, ot::a)
      .a(je.ay, pi::a)
      .a(je.az, of::a)
      .a(je.aB, oe::a)
      .a(je.aA, ob::a)
      .a(je.aC, oa::a)
      .a(je.ap, ol::a)
      .a(je.aG, crk::a)
      .a(je.ax, nx::a)
      .a(je.at, dlb::a)
      .a(je.aw, dkz::a)
      .a(je.aF, dva::a)
      .a(je.av, dtm::a)
      .a(je.aq, tj::a)
      .a(je.aE, cln::a)
      .a(je.aD, cll::a)
      .a(je.p, bht::a);

   private static void a(hi.b $$0) {
      a($$0.b(je.ay), $$0.b(je.ap));
   }

   public static void a(hh<duo> $$0, hi<cqv> $$1) {
      $$1.b().forEach($$1x -> {
         aey $$2 = $$1x.g().a();
         List<hk<duo>> $$3 = ((cqv)$$1x.a()).d().b();
         $$3.stream().flatMap(hk::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               hg.c<duo> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ac.a("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ac.a("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(duo $$0) {
      return $$0.c().contains(duc.a());
   }

   public static hi.b a() {
      hu.b $$0 = hu.a(jd.ap);
      hi.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
