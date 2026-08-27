import java.util.List;

public class mh {
   private static final hw a = new hw()
      .a(je.au, ns::a)
      .a(je.ar, nq::a)
      .a(je.as, op::a)
      .a(je.ay, pe::a)
      .a(je.az, ob::a)
      .a(je.aB, oa::a)
      .a(je.aA, nx::a)
      .a(je.aC, nw::a)
      .a(je.ap, oh::a)
      .a(je.aG, crd::a)
      .a(je.ax, nt::a)
      .a(je.at, dku::a)
      .a(je.aw, dks::a)
      .a(je.aF, dut::a)
      .a(je.av, dtf::a)
      .a(je.aq, te::a)
      .a(je.aE, clg::a)
      .a(je.aD, cle::a)
      .a(je.p, bhm::a);

   private static void a(hi.b $$0) {
      a($$0.b(je.ay), $$0.b(je.ap));
   }

   public static void a(hh<duh> $$0, hi<cqo> $$1) {
      $$1.b().forEach($$1x -> {
         aeu $$2 = $$1x.g().a();
         List<hk<duh>> $$3 = ((cqo)$$1x.a()).d().b();
         $$3.stream().flatMap(hk::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               hg.c<duh> $$3xx = $$0.b($$2xx);
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

   private static boolean a(duh $$0) {
      return $$0.c().contains(dtv.a());
   }

   public static hi.b a() {
      hu.b $$0 = hu.a(jd.ap);
      hi.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
