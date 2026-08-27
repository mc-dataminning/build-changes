import java.util.List;

public class nl {
   private static final iu a = new iu()
      .a(kc.ax, pd::a)
      .a(kc.au, pb::a)
      .a(kc.av, qf::a)
      .a(kc.aB, qu::a)
      .a(kc.aC, pm::a)
      .a(kc.aE, pl::a)
      .a(kc.aD, pi::a)
      .a(kc.aF, ph::a)
      .a(kc.as, px::a)
      .a(kc.aK, cum::a)
      .a(kc.aA, pe::a)
      .a(kc.aw, dof::a)
      .a(kc.az, dod::a)
      .a(kc.aJ, dye::a)
      .a(kc.ay, dwq::a)
      .a(kc.at, ux::a)
      .a(kc.aI, coo::a)
      .a(kc.aH, col::a)
      .a(kc.r, bkg::a);

   private static void a(ih.b $$0) {
      a($$0.b(kc.aB), $$0.b(kc.as));
   }

   public static void a(ig<dxs> $$0, ih<ctx> $$1) {
      $$1.b().forEach($$1x -> {
         agt $$2 = $$1x.g().a();
         List<ij<dxs>> $$3 = ((ctx)$$1x.a()).d().b();
         $$3.stream().flatMap(ij::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ie.c<dxs> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dxs $$0) {
      return $$0.c().contains(dxg.a());
   }

   public static ih.b a() {
      is.b $$0 = is.a(kb.ar);
      ih.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
