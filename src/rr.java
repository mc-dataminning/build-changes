import java.util.List;

public class rr {
   public static final ald<epm> a = rx.a("seagrass_warm");
   public static final ald<epm> b = rx.a("seagrass_normal");
   public static final ald<epm> c = rx.a("seagrass_cold");
   public static final ald<epm> d = rx.a("seagrass_river");
   public static final ald<epm> e = rx.a("seagrass_swamp");
   public static final ald<epm> f = rx.a("seagrass_deep_warm");
   public static final ald<epm> g = rx.a("seagrass_deep");
   public static final ald<epm> h = rx.a("seagrass_deep_cold");
   public static final ald<epm> i = rx.a("sea_pickle");
   public static final ald<epm> j = rx.a("kelp_cold");
   public static final ald<epm> k = rx.a("kelp_warm");
   public static final ald<epm> l = rx.a("warm_ocean_vegetation");

   private static List<epp> a(int $$0) {
      return List.of(epj.a(), rx.c, epe.a($$0), epa.a());
   }

   public static void a(qh<epm> $$0) {
      jf<eif<?, ?>> $$1 = $$0.a(mg.aK);
      je.c<eif<?, ?>> $$2 = $$1.b(rf.a);
      je.c<eif<?, ?>> $$3 = $$1.b(rf.b);
      je.c<eif<?, ?>> $$4 = $$1.b(rf.c);
      je.c<eif<?, ?>> $$5 = $$1.b(rf.d);
      je.c<eif<?, ?>> $$6 = $$1.b(rf.e);
      je.c<eif<?, ?>> $$7 = $$1.b(rf.f);
      je.c<eif<?, ?>> $$8 = $$1.b(rf.g);
      rx.a($$0, a, $$2, a(80));
      rx.a($$0, b, $$2, a(48));
      rx.a($$0, c, $$2, a(32));
      rx.a($$0, d, $$3, a(48));
      rx.a($$0, e, $$4, a(64));
      rx.a($$0, f, $$5, a(80));
      rx.a($$0, g, $$5, a(48));
      rx.a($$0, h, $$5, a(40));
      rx.a($$0, i, $$6, eps.a(16), epj.a(), rx.c, epa.a());
      rx.a($$0, j, $$7, epk.a(120, 80.0, 0.0), epj.a(), rx.c, epa.a());
      rx.a($$0, k, $$7, epk.a(80, 80.0, 0.0), epj.a(), rx.c, epa.a());
      rx.a($$0, l, $$8, epk.a(20, 400.0, 0.0), epj.a(), rx.c, epa.a());
   }
}
