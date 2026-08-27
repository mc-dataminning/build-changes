import java.util.List;

public class me {
   private static final hu a = new hu()
      .a(jc.au, np::a)
      .a(jc.ar, nn::a)
      .a(jc.as, om::a)
      .a(jc.ay, pb::a)
      .a(jc.az, ny::a)
      .a(jc.aB, nx::a)
      .a(jc.aA, nu::a)
      .a(jc.aC, nt::a)
      .a(jc.ap, oe::a)
      .a(jc.aG, cqy::a)
      .a(jc.ax, nq::a)
      .a(jc.at, dkp::a)
      .a(jc.aw, dkn::a)
      .a(jc.aF, duo::a)
      .a(jc.av, dta::a)
      .a(jc.aq, tb::a)
      .a(jc.aE, cld::a)
      .a(jc.aD, clb::a)
      .a(jc.p, bhj::a);

   private static void a(hg.b $$0) {
      a($$0.b(jc.ay), $$0.b(jc.ap));
   }

   public static void a(hf<duc> $$0, hg<cqj> $$1) {
      $$1.b().forEach($$1x -> {
         aer $$2 = $$1x.g().a();
         List<hi<duc>> $$3 = ((cqj)$$1x.a()).d().b();
         $$3.stream().flatMap(hi::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               he.c<duc> $$3xx = $$0.b($$2xx);
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

   private static boolean a(duc $$0) {
      return $$0.c().contains(dtq.a());
   }

   public static hg.b a() {
      hs.b $$0 = hs.a(jb.ap);
      hg.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
