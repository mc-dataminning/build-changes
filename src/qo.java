import java.util.List;

public class qo {
   public static final ags<dxs> a = qu.a("seagrass_warm");
   public static final ags<dxs> b = qu.a("seagrass_normal");
   public static final ags<dxs> c = qu.a("seagrass_cold");
   public static final ags<dxs> d = qu.a("seagrass_river");
   public static final ags<dxs> e = qu.a("seagrass_swamp");
   public static final ags<dxs> f = qu.a("seagrass_deep_warm");
   public static final ags<dxs> g = qu.a("seagrass_deep");
   public static final ags<dxs> h = qu.a("seagrass_deep_cold");
   public static final ags<dxs> i = qu.a("seagrass_simple");
   public static final ags<dxs> j = qu.a("sea_pickle");
   public static final ags<dxs> k = qu.a("kelp_cold");
   public static final ags<dxs> l = qu.a("kelp_warm");
   public static final ags<dxs> m = qu.a("warm_ocean_vegetation");

   private static List<dxv> a(int $$0) {
      return List.of(dxp.a(), qu.b, dxl.a($$0), dxg.a());
   }

   public static void a(pa<dxs> $$0) {
      ig<dqp<?, ?>> $$1 = $$0.a(kc.av);
      ie.c<dqp<?, ?>> $$2 = $$1.b(qc.a);
      ie.c<dqp<?, ?>> $$3 = $$1.b(qc.b);
      ie.c<dqp<?, ?>> $$4 = $$1.b(qc.c);
      ie.c<dqp<?, ?>> $$5 = $$1.b(qc.d);
      ie.c<dqp<?, ?>> $$6 = $$1.b(qc.f);
      ie.c<dqp<?, ?>> $$7 = $$1.b(qc.e);
      ie.c<dqp<?, ?>> $$8 = $$1.b(qc.g);
      ie.c<dqp<?, ?>> $$9 = $$1.b(qc.h);
      qu.a($$0, a, $$2, a(80));
      qu.a($$0, b, $$2, a(48));
      qu.a($$0, c, $$2, a(32));
      qu.a($$0, d, $$3, a(48));
      qu.a($$0, e, $$4, a(64));
      qu.a($$0, f, $$5, a(80));
      qu.a($$0, g, $$5, a(48));
      qu.a($$0, h, $$5, a(40));
      qu.a($$0, i, $$6, dxi.a(dnu.a.b), dxy.a(10), dxh.a(dpf.a(dpf.a(ia.a.q(), cwb.b), dpf.a(hv.b, cwb.G), dpf.a(ia.b.q(), cwb.G))), dxg.a());
      qu.a($$0, j, $$7, dxy.a(16), dxp.a(), qu.b, dxg.a());
      qu.a($$0, k, $$8, dxq.a(120, 80.0, 0.0), dxp.a(), qu.b, dxg.a());
      qu.a($$0, l, $$8, dxq.a(80, 80.0, 0.0), dxp.a(), qu.b, dxg.a());
      qu.a($$0, m, $$9, dxq.a(20, 400.0, 0.0), dxp.a(), qu.b, dxg.a());
   }
}
