import java.util.List;

public class oj {
   private static final jd a = new jd()
      .a(ku.aB, qc::a)
      .a(ku.ay, qa::a)
      .a(ku.az, re::a)
      .a(ku.aF, rt::a)
      .a(ku.aG, ql::a)
      .a(ku.aI, qk::a)
      .a(ku.aH, qh::a)
      .a(ku.aJ, qg::a)
      .a(ku.aw, qw::a)
      .a(ku.aO, dau::a)
      .a(ku.aE, qd::a)
      .a(ku.aA, dvh::a)
      .a(ku.aD, dvf::a)
      .a(ku.aN, efg::a)
      .a(ku.aC, eds::a)
      .a(ku.ax, we::a)
      .a(ku.aM, ctx::a)
      .a(ku.aL, ctv::a)
      .a(ku.m, cdn::a)
      .a(ku.s, bpb::a)
      .a(ku.d, dmg::a);

   private static void a(ip.a $$0) {
      a($$0.b(ku.aF), $$0.b(ku.aw));
   }

   public static void a(io<eeu> $$0, ip<daf> $$1) {
      $$1.b().forEach($$1x -> {
         ajv $$2 = $$1x.h().a();
         List<ir<eeu>> $$3 = ((daf)$$1x.a()).d().b();
         $$3.stream().flatMap(ir::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               in.c<eeu> $$3xx = $$0.b($$2xx);
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

   private static boolean a(eeu $$0) {
      return $$0.c().contains(eei.a());
   }

   public static ip.a a() {
      jb.b $$0 = jb.a(kt.at);
      ip.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
