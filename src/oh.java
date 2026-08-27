import java.util.List;

public class oh {
   private static final jb a = new jb()
      .a(ks.aA, qa::a)
      .a(ks.ax, py::a)
      .a(ks.ay, rc::a)
      .a(ks.aE, rr::a)
      .a(ks.aF, qj::a)
      .a(ks.aH, qi::a)
      .a(ks.aG, qf::a)
      .a(ks.aI, qe::a)
      .a(ks.av, qu::a)
      .a(ks.aN, dal::a)
      .a(ks.aD, qb::a)
      .a(ks.az, duy::a)
      .a(ks.aC, duw::a)
      .a(ks.aM, eex::a)
      .a(ks.aB, edj::a)
      .a(ks.aw, wc::a)
      .a(ks.aL, cto::a)
      .a(ks.aK, ctm::a)
      .a(ks.r, bow::a);

   private static void a(in.a $$0) {
      a($$0.b(ks.aE), $$0.b(ks.av));
   }

   public static void a(im<eel> $$0, in<czw> $$1) {
      $$1.b().forEach($$1x -> {
         ajt $$2 = $$1x.h().a();
         List<ip<eel>> $$3 = ((czw)$$1x.a()).d().b();
         $$3.stream().flatMap(ip::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               il.c<eel> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eel $$0) {
      return $$0.c().contains(edz.a());
   }

   public static in.a a() {
      iz.b $$0 = iz.a(kr.au);
      in.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
