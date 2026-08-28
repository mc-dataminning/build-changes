public class qy {
   public static final alg<edd<?>> a = a("cave");
   public static final alg<edd<?>> b = a("cave_extra_underground");
   public static final alg<edd<?>> c = a("canyon");
   public static final alg<edd<?>> d = a("nether_cave");

   private static alg<edd<?>> a(String $$0) {
      return alg.a(ly.aI, alh.b($$0));
   }

   public static void a(qx<edd<?>> $$0) {
      jq<dhy> $$1 = $$0.a(ly.f);
      $$0.a(
         a,
         edf.a
            .a(
               new edb(
                  0.15F,
                  ekb.a(ebt.b(8), ebt.a(180)),
                  bri.b(0.1F, 0.9F),
                  ebt.b(8),
                  ecz.a(false, dia.oS.m()),
                  $$1.b(awz.bj),
                  bri.b(0.7F, 1.4F),
                  bri.b(0.8F, 1.3F),
                  bri.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         edf.a
            .a(
               new edb(
                  0.07F,
                  ekb.a(ebt.b(8), ebt.a(47)),
                  bri.b(0.1F, 0.9F),
                  ebt.b(8),
                  ecz.a(false, dia.gv.m()),
                  $$1.b(awz.bj),
                  bri.b(0.7F, 1.4F),
                  bri.b(0.8F, 1.3F),
                  bri.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         edf.c
            .a(
               new ecw(
                  0.01F,
                  ekb.a(ebt.a(10), ebt.a(67)),
                  bqz.a(3.0F),
                  ebt.b(8),
                  ecz.a(false, dia.oT.m()),
                  $$1.b(awz.bj),
                  bri.b(-0.125F, 0.125F),
                  new ecw.a(bri.b(0.75F, 1.0F), brh.a(0.0F, 6.0F, 2.0F), 3, bri.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, edf.b.a(new edb(0.2F, ekb.a(ebt.a(0), ebt.c(1)), bqz.a(0.5F), ebt.b(10), $$1.b(awz.bk), bqz.a(1.0F), bqz.a(1.0F), bqz.a(-0.7F))));
   }
}
