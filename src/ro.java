import java.util.List;

public class ro {
   public static final akt<emo> a = ru.a("seagrass_warm");
   public static final akt<emo> b = ru.a("seagrass_normal");
   public static final akt<emo> c = ru.a("seagrass_cold");
   public static final akt<emo> d = ru.a("seagrass_river");
   public static final akt<emo> e = ru.a("seagrass_swamp");
   public static final akt<emo> f = ru.a("seagrass_deep_warm");
   public static final akt<emo> g = ru.a("seagrass_deep");
   public static final akt<emo> h = ru.a("seagrass_deep_cold");
   public static final akt<emo> i = ru.a("sea_pickle");
   public static final akt<emo> j = ru.a("kelp_cold");
   public static final akt<emo> k = ru.a("kelp_warm");
   public static final akt<emo> l = ru.a("warm_ocean_vegetation");

   private static List<emr> a(int $$0) {
      return List.of(eml.a(), ru.c, emg.a($$0), emc.a());
   }

   public static void a(qe<emo> $$0) {
      js<efi<?, ?>> $$1 = $$0.a(mc.aL);
      jr.c<efi<?, ?>> $$2 = $$1.b(rc.a);
      jr.c<efi<?, ?>> $$3 = $$1.b(rc.b);
      jr.c<efi<?, ?>> $$4 = $$1.b(rc.c);
      jr.c<efi<?, ?>> $$5 = $$1.b(rc.d);
      jr.c<efi<?, ?>> $$6 = $$1.b(rc.e);
      jr.c<efi<?, ?>> $$7 = $$1.b(rc.f);
      jr.c<efi<?, ?>> $$8 = $$1.b(rc.g);
      ru.a($$0, a, $$2, a(80));
      ru.a($$0, b, $$2, a(48));
      ru.a($$0, c, $$2, a(32));
      ru.a($$0, d, $$3, a(48));
      ru.a($$0, e, $$4, a(64));
      ru.a($$0, f, $$5, a(80));
      ru.a($$0, g, $$5, a(48));
      ru.a($$0, h, $$5, a(40));
      ru.a($$0, i, $$6, emu.a(16), eml.a(), ru.c, emc.a());
      ru.a($$0, j, $$7, emm.a(120, 80.0, 0.0), eml.a(), ru.c, emc.a());
      ru.a($$0, k, $$7, emm.a(80, 80.0, 0.0), eml.a(), ru.c, emc.a());
      ru.a($$0, l, $$8, emm.a(20, 400.0, 0.0), eml.a(), ru.c, emc.a());
   }
}
