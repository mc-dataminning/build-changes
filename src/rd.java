public class rd {
   public static final ale<dzy<?>> a = a("cave");
   public static final ale<dzy<?>> b = a("cave_extra_underground");
   public static final ale<dzy<?>> c = a("canyon");
   public static final ale<dzy<?>> d = a("nether_cave");

   private static ale<dzy<?>> a(String $$0) {
      return ale.a(lq.aB, new alf($$0));
   }

   public static void a(rc<dzy<?>> $$0) {
      jj<dfa> $$1 = $$0.a(lq.f);
      $$0.a(
         a,
         eaa.a
            .a(
               new dzw(
                  0.15F,
                  egv.a(dyp.b(8), dyp.a(180)),
                  bqf.b(0.1F, 0.9F),
                  dyp.b(8),
                  dzu.a(false, dfc.oS.o()),
                  $$1.b(awp.bi),
                  bqf.b(0.7F, 1.4F),
                  bqf.b(0.8F, 1.3F),
                  bqf.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eaa.a
            .a(
               new dzw(
                  0.07F,
                  egv.a(dyp.b(8), dyp.a(47)),
                  bqf.b(0.1F, 0.9F),
                  dyp.b(8),
                  dzu.a(false, dfc.gv.o()),
                  $$1.b(awp.bi),
                  bqf.b(0.7F, 1.4F),
                  bqf.b(0.8F, 1.3F),
                  bqf.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eaa.c
            .a(
               new dzr(
                  0.01F,
                  egv.a(dyp.a(10), dyp.a(67)),
                  bpw.a(3.0F),
                  dyp.b(8),
                  dzu.a(false, dfc.oT.o()),
                  $$1.b(awp.bi),
                  bqf.b(-0.125F, 0.125F),
                  new dzr.a(bqf.b(0.75F, 1.0F), bqe.a(0.0F, 6.0F, 2.0F), 3, bqf.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eaa.b.a(new dzw(0.2F, egv.a(dyp.a(0), dyp.c(1)), bpw.a(0.5F), dyp.b(10), $$1.b(awp.bj), bpw.a(1.0F), bpw.a(1.0F), bpw.a(-0.7F))));
   }
}
