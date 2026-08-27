import java.util.List;

public class rx {
   public static final ake<efk> a = sd.a("seagrass_warm");
   public static final ake<efk> b = sd.a("seagrass_normal");
   public static final ake<efk> c = sd.a("seagrass_cold");
   public static final ake<efk> d = sd.a("seagrass_river");
   public static final ake<efk> e = sd.a("seagrass_swamp");
   public static final ake<efk> f = sd.a("seagrass_deep_warm");
   public static final ake<efk> g = sd.a("seagrass_deep");
   public static final ake<efk> h = sd.a("seagrass_deep_cold");
   public static final ake<efk> i = sd.a("seagrass_simple");
   public static final ake<efk> j = sd.a("sea_pickle");
   public static final ake<efk> k = sd.a("kelp_cold");
   public static final ake<efk> l = sd.a("kelp_warm");
   public static final ake<efk> m = sd.a("warm_ocean_vegetation");

   private static List<efn> a(int $$0) {
      return List.of(efh.a(), sd.b, efd.a($$0), eey.a());
   }

   public static void a(qj<efk> $$0) {
      iw<dyh<?, ?>> $$1 = $$0.a(ld.aB);
      iv.c<dyh<?, ?>> $$2 = $$1.b(rl.a);
      iv.c<dyh<?, ?>> $$3 = $$1.b(rl.b);
      iv.c<dyh<?, ?>> $$4 = $$1.b(rl.c);
      iv.c<dyh<?, ?>> $$5 = $$1.b(rl.d);
      iv.c<dyh<?, ?>> $$6 = $$1.b(rl.f);
      iv.c<dyh<?, ?>> $$7 = $$1.b(rl.e);
      iv.c<dyh<?, ?>> $$8 = $$1.b(rl.g);
      iv.c<dyh<?, ?>> $$9 = $$1.b(rl.h);
      sd.a($$0, a, $$2, a(80));
      sd.a($$0, b, $$2, a(48));
      sd.a($$0, c, $$2, a(32));
      sd.a($$0, d, $$3, a(48));
      sd.a($$0, e, $$4, a(64));
      sd.a($$0, f, $$5, a(80));
      sd.a($$0, g, $$5, a(48));
      sd.a($$0, h, $$5, a(40));
      sd.a($$0, i, $$6, efa.a(dvm.a.b), efq.a(10), eez.a(dwx.a(dwx.a(ir.a.q(), dcx.b), dwx.a(im.c, dcx.G), dwx.a(ir.b.q(), dcx.G))), eey.a());
      sd.a($$0, j, $$7, efq.a(16), efh.a(), sd.b, eey.a());
      sd.a($$0, k, $$8, efi.a(120, 80.0, 0.0), efh.a(), sd.b, eey.a());
      sd.a($$0, l, $$8, efi.a(80, 80.0, 0.0), efh.a(), sd.b, eey.a());
      sd.a($$0, m, $$9, efi.a(20, 400.0, 0.0), efh.a(), sd.b, eey.a());
   }
}
