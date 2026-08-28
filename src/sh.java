import java.util.List;

public class sh {
   public static final alg<ekv> a = sn.a("seagrass_warm");
   public static final alg<ekv> b = sn.a("seagrass_normal");
   public static final alg<ekv> c = sn.a("seagrass_cold");
   public static final alg<ekv> d = sn.a("seagrass_river");
   public static final alg<ekv> e = sn.a("seagrass_swamp");
   public static final alg<ekv> f = sn.a("seagrass_deep_warm");
   public static final alg<ekv> g = sn.a("seagrass_deep");
   public static final alg<ekv> h = sn.a("seagrass_deep_cold");
   public static final alg<ekv> i = sn.a("sea_pickle");
   public static final alg<ekv> j = sn.a("kelp_cold");
   public static final alg<ekv> k = sn.a("kelp_warm");
   public static final alg<ekv> l = sn.a("warm_ocean_vegetation");

   private static List<eky> a(int $$0) {
      return List.of(eks.a(), sn.b, ekn.a($$0), ekj.a());
   }

   public static void a(qx<ekv> $$0) {
      jq<edr<?, ?>> $$1 = $$0.a(ly.aJ);
      jp.c<edr<?, ?>> $$2 = $$1.b(rv.a);
      jp.c<edr<?, ?>> $$3 = $$1.b(rv.b);
      jp.c<edr<?, ?>> $$4 = $$1.b(rv.c);
      jp.c<edr<?, ?>> $$5 = $$1.b(rv.d);
      jp.c<edr<?, ?>> $$6 = $$1.b(rv.e);
      jp.c<edr<?, ?>> $$7 = $$1.b(rv.f);
      jp.c<edr<?, ?>> $$8 = $$1.b(rv.g);
      sn.a($$0, a, $$2, a(80));
      sn.a($$0, b, $$2, a(48));
      sn.a($$0, c, $$2, a(32));
      sn.a($$0, d, $$3, a(48));
      sn.a($$0, e, $$4, a(64));
      sn.a($$0, f, $$5, a(80));
      sn.a($$0, g, $$5, a(48));
      sn.a($$0, h, $$5, a(40));
      sn.a($$0, i, $$6, elb.a(16), eks.a(), sn.b, ekj.a());
      sn.a($$0, j, $$7, ekt.a(120, 80.0, 0.0), eks.a(), sn.b, ekj.a());
      sn.a($$0, k, $$7, ekt.a(80, 80.0, 0.0), eks.a(), sn.b, ekj.a());
      sn.a($$0, l, $$8, ekt.a(20, 400.0, 0.0), eks.a(), sn.b, ekj.a());
   }
}
