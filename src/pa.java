public class pa {
   public static final agl<doz<?>> a = a("cave");
   public static final agl<doz<?>> b = a("cave_extra_underground");
   public static final agl<doz<?>> c = a("canyon");
   public static final agl<doz<?>> d = a("nether_cave");

   private static agl<doz<?>> a(String $$0) {
      return agl.a(kd.at, new agm($$0));
   }

   public static void a(oz<doz<?>> $$0) {
      ih<cvf> $$1 = $$0.a(kd.e);
      $$0.a(
         a,
         dpb.a
            .a(
               new dox(
                  0.15F,
                  dvw.a(dnq.b(8), dnq.a(180)),
                  bil.b(0.1F, 0.9F),
                  dnq.b(8),
                  dov.a(false, cvh.oS.o()),
                  $$1.b(ark.bh),
                  bil.b(0.7F, 1.4F),
                  bil.b(0.8F, 1.3F),
                  bil.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dpb.a
            .a(
               new dox(
                  0.07F,
                  dvw.a(dnq.b(8), dnq.a(47)),
                  bil.b(0.1F, 0.9F),
                  dnq.b(8),
                  dov.a(false, cvh.gv.o()),
                  $$1.b(ark.bh),
                  bil.b(0.7F, 1.4F),
                  bil.b(0.8F, 1.3F),
                  bil.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dpb.c
            .a(
               new dos(
                  0.01F,
                  dvw.a(dnq.a(10), dnq.a(67)),
                  bic.a(3.0F),
                  dnq.b(8),
                  dov.a(false, cvh.oT.o()),
                  $$1.b(ark.bh),
                  bil.b(-0.125F, 0.125F),
                  new dos.a(bil.b(0.75F, 1.0F), bik.a(0.0F, 6.0F, 2.0F), 3, bil.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dpb.b.a(new dox(0.2F, dvw.a(dnq.a(0), dnq.c(1)), bic.a(0.5F), dnq.b(10), $$1.b(ark.bi), bic.a(1.0F), bic.a(1.0F), bic.a(-0.7F))));
   }
}
