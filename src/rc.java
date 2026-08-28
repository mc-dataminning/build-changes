public class rc {
   public static final alk<edn<?>> a = a("cave");
   public static final alk<edn<?>> b = a("cave_extra_underground");
   public static final alk<edn<?>> c = a("canyon");
   public static final alk<edn<?>> d = a("nether_cave");

   private static alk<edn<?>> a(String $$0) {
      return alk.a(ma.aI, all.b($$0));
   }

   public static void a(rb<edn<?>> $$0) {
      jr<dij> $$1 = $$0.a(ma.f);
      $$0.a(
         a,
         edp.a
            .a(
               new edl(
                  0.15F,
                  ekl.a(ecd.b(8), ecd.a(180)),
                  brr.b(0.1F, 0.9F),
                  ecd.b(8),
                  edj.a(false, dil.oS.m()),
                  $$1.b(axd.bj),
                  brr.b(0.7F, 1.4F),
                  brr.b(0.8F, 1.3F),
                  brr.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         edp.a
            .a(
               new edl(
                  0.07F,
                  ekl.a(ecd.b(8), ecd.a(47)),
                  brr.b(0.1F, 0.9F),
                  ecd.b(8),
                  edj.a(false, dil.gv.m()),
                  $$1.b(axd.bj),
                  brr.b(0.7F, 1.4F),
                  brr.b(0.8F, 1.3F),
                  brr.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         edp.c
            .a(
               new edg(
                  0.01F,
                  ekl.a(ecd.a(10), ecd.a(67)),
                  bri.a(3.0F),
                  ecd.b(8),
                  edj.a(false, dil.oT.m()),
                  $$1.b(axd.bj),
                  brr.b(-0.125F, 0.125F),
                  new edg.a(brr.b(0.75F, 1.0F), brq.a(0.0F, 6.0F, 2.0F), 3, brr.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, edp.b.a(new edl(0.2F, ekl.a(ecd.a(0), ecd.c(1)), bri.a(0.5F), ecd.b(10), $$1.b(axd.bk), bri.a(1.0F), bri.a(1.0F), bri.a(-0.7F))));
   }
}
