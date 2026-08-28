import java.util.List;

public class ro {
   public static final akt<enn> a = ru.a("seagrass_warm");
   public static final akt<enn> b = ru.a("seagrass_normal");
   public static final akt<enn> c = ru.a("seagrass_cold");
   public static final akt<enn> d = ru.a("seagrass_river");
   public static final akt<enn> e = ru.a("seagrass_swamp");
   public static final akt<enn> f = ru.a("seagrass_deep_warm");
   public static final akt<enn> g = ru.a("seagrass_deep");
   public static final akt<enn> h = ru.a("seagrass_deep_cold");
   public static final akt<enn> i = ru.a("sea_pickle");
   public static final akt<enn> j = ru.a("kelp_cold");
   public static final akt<enn> k = ru.a("kelp_warm");
   public static final akt<enn> l = ru.a("warm_ocean_vegetation");

   private static List<enq> a(int $$0) {
      return List.of(enk.a(), ru.c, enf.a($$0), enb.a());
   }

   public static void a(qe<enn> $$0) {
      js<egg<?, ?>> $$1 = $$0.a(mc.aM);
      jr.c<egg<?, ?>> $$2 = $$1.b(rc.a);
      jr.c<egg<?, ?>> $$3 = $$1.b(rc.b);
      jr.c<egg<?, ?>> $$4 = $$1.b(rc.c);
      jr.c<egg<?, ?>> $$5 = $$1.b(rc.d);
      jr.c<egg<?, ?>> $$6 = $$1.b(rc.e);
      jr.c<egg<?, ?>> $$7 = $$1.b(rc.f);
      jr.c<egg<?, ?>> $$8 = $$1.b(rc.g);
      ru.a($$0, a, $$2, a(80));
      ru.a($$0, b, $$2, a(48));
      ru.a($$0, c, $$2, a(32));
      ru.a($$0, d, $$3, a(48));
      ru.a($$0, e, $$4, a(64));
      ru.a($$0, f, $$5, a(80));
      ru.a($$0, g, $$5, a(48));
      ru.a($$0, h, $$5, a(40));
      ru.a($$0, i, $$6, ent.a(16), enk.a(), ru.c, enb.a());
      ru.a($$0, j, $$7, enl.a(120, 80.0, 0.0), enk.a(), ru.c, enb.a());
      ru.a($$0, k, $$7, enl.a(80, 80.0, 0.0), enk.a(), ru.c, enb.a());
      ru.a($$0, l, $$8, enl.a(20, 400.0, 0.0), enk.a(), ru.c, enb.a());
   }
}
