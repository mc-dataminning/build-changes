import java.util.List;

public class sv {
   public static final aly<eno> a = tb.a("seagrass_warm");
   public static final aly<eno> b = tb.a("seagrass_normal");
   public static final aly<eno> c = tb.a("seagrass_cold");
   public static final aly<eno> d = tb.a("seagrass_river");
   public static final aly<eno> e = tb.a("seagrass_swamp");
   public static final aly<eno> f = tb.a("seagrass_deep_warm");
   public static final aly<eno> g = tb.a("seagrass_deep");
   public static final aly<eno> h = tb.a("seagrass_deep_cold");
   public static final aly<eno> i = tb.a("sea_pickle");
   public static final aly<eno> j = tb.a("kelp_cold");
   public static final aly<eno> k = tb.a("kelp_warm");
   public static final aly<eno> l = tb.a("warm_ocean_vegetation");

   private static List<enr> a(int $$0) {
      return List.of(enl.a(), tb.b, eng.a($$0), enc.a());
   }

   public static void a(rk<eno> $$0) {
      jr<egi<?, ?>> $$1 = $$0.a(mb.aL);
      jq.c<egi<?, ?>> $$2 = $$1.b(sj.a);
      jq.c<egi<?, ?>> $$3 = $$1.b(sj.b);
      jq.c<egi<?, ?>> $$4 = $$1.b(sj.c);
      jq.c<egi<?, ?>> $$5 = $$1.b(sj.d);
      jq.c<egi<?, ?>> $$6 = $$1.b(sj.e);
      jq.c<egi<?, ?>> $$7 = $$1.b(sj.f);
      jq.c<egi<?, ?>> $$8 = $$1.b(sj.g);
      tb.a($$0, a, $$2, a(80));
      tb.a($$0, b, $$2, a(48));
      tb.a($$0, c, $$2, a(32));
      tb.a($$0, d, $$3, a(48));
      tb.a($$0, e, $$4, a(64));
      tb.a($$0, f, $$5, a(80));
      tb.a($$0, g, $$5, a(48));
      tb.a($$0, h, $$5, a(40));
      tb.a($$0, i, $$6, enu.a(16), enl.a(), tb.b, enc.a());
      tb.a($$0, j, $$7, enm.a(120, 80.0, 0.0), enl.a(), tb.b, enc.a());
      tb.a($$0, k, $$7, enm.a(80, 80.0, 0.0), enl.a(), tb.b, enc.a());
      tb.a($$0, l, $$8, enm.a(20, 400.0, 0.0), enl.a(), tb.b, enc.a());
   }
}
