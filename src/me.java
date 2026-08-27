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
      .a(jc.aG, cnz::a)
      .a(jc.ax, nq::a)
      .a(jc.at, dhr::a)
      .a(jc.aw, dhp::a)
      .a(jc.aF, drq::a)
      .a(jc.av, dqc::a)
      .a(jc.aq, ss::a)
      .a(jc.aE, cif::a)
      .a(jc.aD, cid::a)
      .a(jc.p, beq::a);

   private static void a(hg.b $$0) {
      a($$0.b(jc.ay), $$0.b(jc.ap));
   }

   public static void a(hf<dre> $$0, hg<cnk> $$1) {
      $$1.b().forEach($$1x -> {
         acq $$2 = $$1x.g().a();
         List<hi<dre>> $$3 = ((cnk)$$1x.a()).d().b();
         $$3.stream().flatMap(hi::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               he.c<dre> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dre $$0) {
      return $$0.c().contains(dqs.a());
   }

   public static hg.b a() {
      hs.b $$0 = hs.a(jb.ap);
      hg.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
