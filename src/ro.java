import java.util.List;

public class ro {
   public static final aku<emr> a = ru.a("seagrass_warm");
   public static final aku<emr> b = ru.a("seagrass_normal");
   public static final aku<emr> c = ru.a("seagrass_cold");
   public static final aku<emr> d = ru.a("seagrass_river");
   public static final aku<emr> e = ru.a("seagrass_swamp");
   public static final aku<emr> f = ru.a("seagrass_deep_warm");
   public static final aku<emr> g = ru.a("seagrass_deep");
   public static final aku<emr> h = ru.a("seagrass_deep_cold");
   public static final aku<emr> i = ru.a("sea_pickle");
   public static final aku<emr> j = ru.a("kelp_cold");
   public static final aku<emr> k = ru.a("kelp_warm");
   public static final aku<emr> l = ru.a("warm_ocean_vegetation");

   private static List<emu> a(int $$0) {
      return List.of(emo.a(), ru.c, emj.a($$0), emf.a());
   }

   public static void a(qe<emr> $$0) {
      js<efl<?, ?>> $$1 = $$0.a(mc.aL);
      jr.c<efl<?, ?>> $$2 = $$1.b(rc.a);
      jr.c<efl<?, ?>> $$3 = $$1.b(rc.b);
      jr.c<efl<?, ?>> $$4 = $$1.b(rc.c);
      jr.c<efl<?, ?>> $$5 = $$1.b(rc.d);
      jr.c<efl<?, ?>> $$6 = $$1.b(rc.e);
      jr.c<efl<?, ?>> $$7 = $$1.b(rc.f);
      jr.c<efl<?, ?>> $$8 = $$1.b(rc.g);
      ru.a($$0, a, $$2, a(80));
      ru.a($$0, b, $$2, a(48));
      ru.a($$0, c, $$2, a(32));
      ru.a($$0, d, $$3, a(48));
      ru.a($$0, e, $$4, a(64));
      ru.a($$0, f, $$5, a(80));
      ru.a($$0, g, $$5, a(48));
      ru.a($$0, h, $$5, a(40));
      ru.a($$0, i, $$6, emx.a(16), emo.a(), ru.c, emf.a());
      ru.a($$0, j, $$7, emp.a(120, 80.0, 0.0), emo.a(), ru.c, emf.a());
      ru.a($$0, k, $$7, emp.a(80, 80.0, 0.0), emo.a(), ru.c, emf.a());
      ru.a($$0, l, $$8, emp.a(20, 400.0, 0.0), emo.a(), ru.c, emf.a());
   }
}
