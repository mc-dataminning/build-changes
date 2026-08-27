import java.util.List;

public class mh {
   private static final ht a = new ht()
      .a(jc.au, nu::a)
      .a(jc.ar, ns::a)
      .a(jc.as, or::a)
      .a(jc.ay, pg::a)
      .a(jc.az, od::a)
      .a(jc.aB, oc::a)
      .a(jc.aA, nz::a)
      .a(jc.aC, ny::a)
      .a(jc.ap, oj::a)
      .a(jc.aG, cri::a)
      .a(jc.ax, nv::a)
      .a(jc.at, dkz::a)
      .a(jc.aw, dkx::a)
      .a(jc.aF, duy::a)
      .a(jc.av, dtk::a)
      .a(jc.aq, th::a)
      .a(jc.aE, cll::a)
      .a(jc.aD, clj::a)
      .a(jc.p, bhr::a);

   private static void a(hg.b $$0) {
      a($$0.b(jc.ay), $$0.b(jc.ap));
   }

   public static void a(hf<dum> $$0, hg<cqt> $$1) {
      $$1.b().forEach($$1x -> {
         aew $$2 = $$1x.g().a();
         List<hi<dum>> $$3 = ((cqt)$$1x.a()).d().b();
         $$3.stream().flatMap(hi::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               he.c<dum> $$3xx = $$0.b($$2xx);
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

   public static hg.b a() {
      hr.b $$0 = hr.a(jb.ap);
      hg.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
