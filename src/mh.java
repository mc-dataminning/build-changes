import java.util.List;

public class mh {
   private static final ht a = new ht()
      .a(jc.av, nu::a)
      .a(jc.as, ns::a)
      .a(jc.at, or::a)
      .a(jc.az, pg::a)
      .a(jc.aA, od::a)
      .a(jc.aC, oc::a)
      .a(jc.aB, nz::a)
      .a(jc.aD, ny::a)
      .a(jc.aq, oj::a)
      .a(jc.aH, cro::a)
      .a(jc.ay, nv::a)
      .a(jc.au, dkt::a)
      .a(jc.ax, dkr::a)
      .a(jc.aG, dus::a)
      .a(jc.aw, dte::a)
      .a(jc.ar, th::a)
      .a(jc.aF, clr::a)
      .a(jc.aE, clp::a)
      .a(jc.q, bhx::a);

   private static void a(hg.b $$0) {
      a($$0.b(jc.az), $$0.b(jc.aq));
   }

   public static void a(hf<dug> $$0, hg<cqz> $$1) {
      $$1.b().forEach($$1x -> {
         aez $$2 = $$1x.g().a();
         List<hi<dug>> $$3 = ((cqz)$$1x.a()).d().b();
         $$3.stream().flatMap(hi::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               he.c<dug> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dug $$0) {
      return $$0.c().contains(dtu.a());
   }

   public static hg.b a() {
      hr.b $$0 = hr.a(jb.aq);
      hg.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
