import java.util.List;

public class ro {
   public static final akt<emq> a = ru.a("seagrass_warm");
   public static final akt<emq> b = ru.a("seagrass_normal");
   public static final akt<emq> c = ru.a("seagrass_cold");
   public static final akt<emq> d = ru.a("seagrass_river");
   public static final akt<emq> e = ru.a("seagrass_swamp");
   public static final akt<emq> f = ru.a("seagrass_deep_warm");
   public static final akt<emq> g = ru.a("seagrass_deep");
   public static final akt<emq> h = ru.a("seagrass_deep_cold");
   public static final akt<emq> i = ru.a("sea_pickle");
   public static final akt<emq> j = ru.a("kelp_cold");
   public static final akt<emq> k = ru.a("kelp_warm");
   public static final akt<emq> l = ru.a("warm_ocean_vegetation");

   private static List<emt> a(int $$0) {
      return List.of(emn.a(), ru.c, emi.a($$0), eme.a());
   }

   public static void a(qe<emq> $$0) {
      js<efk<?, ?>> $$1 = $$0.a(mc.aL);
      jr.c<efk<?, ?>> $$2 = $$1.b(rc.a);
      jr.c<efk<?, ?>> $$3 = $$1.b(rc.b);
      jr.c<efk<?, ?>> $$4 = $$1.b(rc.c);
      jr.c<efk<?, ?>> $$5 = $$1.b(rc.d);
      jr.c<efk<?, ?>> $$6 = $$1.b(rc.e);
      jr.c<efk<?, ?>> $$7 = $$1.b(rc.f);
      jr.c<efk<?, ?>> $$8 = $$1.b(rc.g);
      ru.a($$0, a, $$2, a(80));
      ru.a($$0, b, $$2, a(48));
      ru.a($$0, c, $$2, a(32));
      ru.a($$0, d, $$3, a(48));
      ru.a($$0, e, $$4, a(64));
      ru.a($$0, f, $$5, a(80));
      ru.a($$0, g, $$5, a(48));
      ru.a($$0, h, $$5, a(40));
      ru.a($$0, i, $$6, emw.a(16), emn.a(), ru.c, eme.a());
      ru.a($$0, j, $$7, emo.a(120, 80.0, 0.0), emn.a(), ru.c, eme.a());
      ru.a($$0, k, $$7, emo.a(80, 80.0, 0.0), emn.a(), ru.c, eme.a());
      ru.a($$0, l, $$8, emo.a(20, 400.0, 0.0), emn.a(), ru.c, eme.a());
   }
}
