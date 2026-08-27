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
      .a(je.aG, cri::a)
      .a(je.ax, nx::a)
      .a(je.at, dkz::a)
      .a(je.aw, dkx::a)
      .a(je.aF, duy::a)
      .a(je.av, dtk::a)
      .a(je.aq, ti::a)
      .a(je.aE, cll::a)
      .a(je.aD, clj::a)
      .a(je.p, bhr::a);

   private static void a(hi.b $$0) {
      a($$0.b(je.ay), $$0.b(je.ap));
   }

   public static void a(hh<dum> $$0, hi<cqt> $$1) {
      $$1.b().forEach($$1x -> {
         aex $$2 = $$1x.g().a();
         List<hk<dum>> $$3 = ((cqt)$$1x.a()).d().b();
         $$3.stream().flatMap(hk::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               hg.c<dum> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dum $$0) {
      return $$0.c().contains(dua.a());
   }

   public static hi.b a() {
      hu.b $$0 = hu.a(jd.ap);
      hi.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
