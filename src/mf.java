import java.util.List;

public class mf {
   private static final hv a = new hv()
      .a(jd.au, nq::a)
      .a(jd.ar, no::a)
      .a(jd.as, on::a)
      .a(jd.ay, pc::a)
      .a(jd.az, nz::a)
      .a(jd.aB, ny::a)
      .a(jd.aA, nv::a)
      .a(jd.aC, nu::a)
      .a(jd.ap, of::a)
      .a(jd.aG, cqx::a)
      .a(jd.ax, nr::a)
      .a(jd.at, dko::a)
      .a(jd.aw, dkm::a)
      .a(jd.aF, dun::a)
      .a(jd.av, dsz::a)
      .a(jd.aq, ta::a)
      .a(jd.aE, clc::a)
      .a(jd.aD, cla::a)
      .a(jd.p, bhh::a);

   private static void a(hh.b $$0) {
      a($$0.b(jd.ay), $$0.b(jd.ap));
   }

   public static void a(hg<dub> $$0, hh<cqi> $$1) {
      $$1.b().forEach($$1x -> {
         aep $$2 = $$1x.g().a();
         List<hj<dub>> $$3 = ((cqi)$$1x.a()).d().b();
         $$3.stream().flatMap(hj::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               hf.c<dub> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dub $$0) {
      return $$0.c().contains(dtp.a());
   }

   public static hh.b a() {
      ht.b $$0 = ht.a(jc.ap);
      hh.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
