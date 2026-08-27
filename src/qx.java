import java.util.List;

public class qx {
   public static final ajb<ebk> a = rd.a("seagrass_warm");
   public static final ajb<ebk> b = rd.a("seagrass_normal");
   public static final ajb<ebk> c = rd.a("seagrass_cold");
   public static final ajb<ebk> d = rd.a("seagrass_river");
   public static final ajb<ebk> e = rd.a("seagrass_swamp");
   public static final ajb<ebk> f = rd.a("seagrass_deep_warm");
   public static final ajb<ebk> g = rd.a("seagrass_deep");
   public static final ajb<ebk> h = rd.a("seagrass_deep_cold");
   public static final ajb<ebk> i = rd.a("seagrass_simple");
   public static final ajb<ebk> j = rd.a("sea_pickle");
   public static final ajb<ebk> k = rd.a("kelp_cold");
   public static final ajb<ebk> l = rd.a("kelp_warm");
   public static final ajb<ebk> m = rd.a("warm_ocean_vegetation");

   private static List<ebn> a(int $$0) {
      return List.of(ebh.a(), rd.b, ebd.a($$0), eay.a());
   }

   public static void a(pj<ebk> $$0) {
      im<duh<?, ?>> $$1 = $$0.a(ki.ax);
      il.c<duh<?, ?>> $$2 = $$1.b(ql.a);
      il.c<duh<?, ?>> $$3 = $$1.b(ql.b);
      il.c<duh<?, ?>> $$4 = $$1.b(ql.c);
      il.c<duh<?, ?>> $$5 = $$1.b(ql.d);
      il.c<duh<?, ?>> $$6 = $$1.b(ql.f);
      il.c<duh<?, ?>> $$7 = $$1.b(ql.e);
      il.c<duh<?, ?>> $$8 = $$1.b(ql.g);
      il.c<duh<?, ?>> $$9 = $$1.b(ql.h);
      rd.a($$0, a, $$2, a(80));
      rd.a($$0, b, $$2, a(48));
      rd.a($$0, c, $$2, a(32));
      rd.a($$0, d, $$3, a(48));
      rd.a($$0, e, $$4, a(64));
      rd.a($$0, f, $$5, a(80));
      rd.a($$0, g, $$5, a(48));
      rd.a($$0, h, $$5, a(40));
      rd.a($$0, i, $$6, eba.a(drm.a.b), ebq.a(10), eaz.a(dsx.a(dsx.a(ih.a.q(), czh.b), dsx.a(ib.c, czh.G), dsx.a(ih.b.q(), czh.G))), eay.a());
      rd.a($$0, j, $$7, ebq.a(16), ebh.a(), rd.b, eay.a());
      rd.a($$0, k, $$8, ebi.a(120, 80.0, 0.0), ebh.a(), rd.b, eay.a());
      rd.a($$0, l, $$8, ebi.a(80, 80.0, 0.0), ebh.a(), rd.b, eay.a());
      rd.a($$0, m, $$9, ebi.a(20, 400.0, 0.0), ebh.a(), rd.b, eay.a());
   }
}
