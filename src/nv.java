import java.util.List;

public class nv {
   private static final jb a = new jb()
      .a(kj.az, po::a)
      .a(kj.aw, pm::a)
      .a(kj.ax, qq::a)
      .a(kj.aD, rf::a)
      .a(kj.aE, px::a)
      .a(kj.aG, pw::a)
      .a(kj.aF, pt::a)
      .a(kj.aH, ps::a)
      .a(kj.au, qi::a)
      .a(kj.aM, cyp::a)
      .a(kj.aC, pp::a)
      .a(kj.ay, dsv::a)
      .a(kj.aB, dst::a)
      .a(kj.aL, ecu::a)
      .a(kj.aA, ebg::a)
      .a(kj.av, vq::a)
      .a(kj.aK, css::a)
      .a(kj.aJ, csq::a)
      .a(kj.r, bnz::a);

   private static void a(in.a $$0) {
      a($$0.b(kj.aD), $$0.b(kj.au));
   }

   public static void a(im<eci> $$0, in<cya> $$1) {
      $$1.b().forEach($$1x -> {
         ajh $$2 = $$1x.h().a();
         List<ip<eci>> $$3 = ((cya)$$1x.a()).d().b();
         $$3.stream().flatMap(ip::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               il.c<eci> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eci $$0) {
      return $$0.c().contains(ebw.a());
   }

   public static in.a a() {
      iz.b $$0 = iz.a(ki.at);
      in.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
