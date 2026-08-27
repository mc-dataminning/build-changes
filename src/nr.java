import java.util.List;

public class nr {
   private static final iy a = new iy()
      .a(kg.ay, pk::a)
      .a(kg.av, pi::a)
      .a(kg.aw, qm::a)
      .a(kg.aC, rb::a)
      .a(kg.aD, pt::a)
      .a(kg.aF, ps::a)
      .a(kg.aE, pp::a)
      .a(kg.aG, po::a)
      .a(kg.at, qe::a)
      .a(kg.aL, cxb::a)
      .a(kg.aB, pl::a)
      .a(kg.ax, dqv::a)
      .a(kg.aA, dqt::a)
      .a(kg.aK, eau::a)
      .a(kg.az, dzg::a)
      .a(kg.au, vm::a)
      .a(kg.aJ, cre::a)
      .a(kg.aI, crc::a)
      .a(kg.r, bmq::a);

   private static void a(il.b $$0) {
      a($$0.b(kg.aC), $$0.b(kg.at));
   }

   public static void a(ik<eai> $$0, il<cwm> $$1) {
      $$1.b().forEach($$1x -> {
         aiy $$2 = $$1x.h().a();
         List<in<eai>> $$3 = ((cwm)$$1x.a()).d().b();
         $$3.stream().flatMap(in::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ij.c<eai> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eai $$0) {
      return $$0.c().contains(dzw.a());
   }

   public static il.b a() {
      iw.b $$0 = iw.a(kf.as);
      il.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
