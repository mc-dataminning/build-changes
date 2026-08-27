import java.util.List;

public class ow {
   private static final jn a = new jn()
      .a(lf.aE, qr::a)
      .a(lf.aB, qp::a)
      .a(lf.aC, rt::a)
      .a(lf.aI, si::a)
      .a(lf.aJ, ra::a)
      .a(lf.aL, qz::a)
      .a(lf.aK, qw::a)
      .a(lf.aM, qv::a)
      .a(lf.az, rl::a)
      .a(lf.aR, dcl::a)
      .a(lf.aH, qs::a)
      .a(lf.aD, dxa::a)
      .a(lf.aG, dwy::a)
      .a(lf.aQ, egz::a)
      .a(lf.aF, efl::a)
      .a(lf.aA, wt::a)
      .a(lf.aP, cvw::a)
      .a(lf.aO, cvu::a)
      .a(lf.m, cfj::a)
      .a(lf.s, bqq::a)
      .a(lf.d, dny::a);

   private static void a(iz.a $$0) {
      a($$0.b(lf.aI), $$0.b(lf.az));
   }

   public static void a(iy<egn> $$0, iz<dbw> $$1) {
      $$1.b().forEach($$1x -> {
         akm $$2 = $$1x.h().a();
         List<jb<egn>> $$3 = ((dbw)$$1x.a()).d().b();
         $$3.stream().flatMap(jb::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ix.c<egn> $$3xx = $$0.b($$2xx);
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

   private static boolean a(egn $$0) {
      return $$0.c().contains(egb.a());
   }

   public static iz.a a() {
      jl.b $$0 = jl.a(le.aw);
      iz.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
