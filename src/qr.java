public class qr {
   public static final akq<ebc<?>> a = a("cave");
   public static final akq<ebc<?>> b = a("cave_extra_underground");
   public static final akq<ebc<?>> c = a("canyon");
   public static final akq<ebc<?>> d = a("nether_cave");

   private static akq<ebc<?>> a(String $$0) {
      return akq.a(lu.aH, akr.b($$0));
   }

   public static void a(qq<ebc<?>> $$0) {
      jn<dfy> $$1 = $$0.a(lu.f);
      $$0.a(
         a,
         ebe.a
            .a(
               new eba(
                  0.15F,
                  eia.a(dzs.b(8), dzs.a(180)),
                  bqb.b(0.1F, 0.9F),
                  dzs.b(8),
                  eay.a(false, dga.oS.o()),
                  $$1.b(awe.bj),
                  bqb.b(0.7F, 1.4F),
                  bqb.b(0.8F, 1.3F),
                  bqb.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ebe.a
            .a(
               new eba(
                  0.07F,
                  eia.a(dzs.b(8), dzs.a(47)),
                  bqb.b(0.1F, 0.9F),
                  dzs.b(8),
                  eay.a(false, dga.gv.o()),
                  $$1.b(awe.bj),
                  bqb.b(0.7F, 1.4F),
                  bqb.b(0.8F, 1.3F),
                  bqb.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ebe.c
            .a(
               new eav(
                  0.01F,
                  eia.a(dzs.a(10), dzs.a(67)),
                  bps.a(3.0F),
                  dzs.b(8),
                  eay.a(false, dga.oT.o()),
                  $$1.b(awe.bj),
                  bqb.b(-0.125F, 0.125F),
                  new eav.a(bqb.b(0.75F, 1.0F), bqa.a(0.0F, 6.0F, 2.0F), 3, bqb.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ebe.b.a(new eba(0.2F, eia.a(dzs.a(0), dzs.c(1)), bps.a(0.5F), dzs.b(10), $$1.b(awe.bk), bps.a(1.0F), bps.a(1.0F), bps.a(-0.7F))));
   }
}
