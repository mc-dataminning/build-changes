import java.util.List;

public class rq {
   public static final alc<eok> a = rw.a("seagrass_warm");
   public static final alc<eok> b = rw.a("seagrass_normal");
   public static final alc<eok> c = rw.a("seagrass_cold");
   public static final alc<eok> d = rw.a("seagrass_river");
   public static final alc<eok> e = rw.a("seagrass_swamp");
   public static final alc<eok> f = rw.a("seagrass_deep_warm");
   public static final alc<eok> g = rw.a("seagrass_deep");
   public static final alc<eok> h = rw.a("seagrass_deep_cold");
   public static final alc<eok> i = rw.a("sea_pickle");
   public static final alc<eok> j = rw.a("kelp_cold");
   public static final alc<eok> k = rw.a("kelp_warm");
   public static final alc<eok> l = rw.a("warm_ocean_vegetation");

   private static List<eon> a(int $$0) {
      return List.of(eoh.a(), rw.c, eoc.a($$0), eny.a());
   }

   public static void a(qg<eok> $$0) {
      jt<ehd<?, ?>> $$1 = $$0.a(me.aP);
      js.c<ehd<?, ?>> $$2 = $$1.b(re.a);
      js.c<ehd<?, ?>> $$3 = $$1.b(re.b);
      js.c<ehd<?, ?>> $$4 = $$1.b(re.c);
      js.c<ehd<?, ?>> $$5 = $$1.b(re.d);
      js.c<ehd<?, ?>> $$6 = $$1.b(re.e);
      js.c<ehd<?, ?>> $$7 = $$1.b(re.f);
      js.c<ehd<?, ?>> $$8 = $$1.b(re.g);
      rw.a($$0, a, $$2, a(80));
      rw.a($$0, b, $$2, a(48));
      rw.a($$0, c, $$2, a(32));
      rw.a($$0, d, $$3, a(48));
      rw.a($$0, e, $$4, a(64));
      rw.a($$0, f, $$5, a(80));
      rw.a($$0, g, $$5, a(48));
      rw.a($$0, h, $$5, a(40));
      rw.a($$0, i, $$6, eoq.a(16), eoh.a(), rw.c, eny.a());
      rw.a($$0, j, $$7, eoi.a(120, 80.0, 0.0), eoh.a(), rw.c, eny.a());
      rw.a($$0, k, $$7, eoi.a(80, 80.0, 0.0), eoh.a(), rw.c, eny.a());
      rw.a($$0, l, $$8, eoi.a(20, 400.0, 0.0), eoh.a(), rw.c, eny.a());
   }
}
