public class rd {
   public static final ale<dzz<?>> a = a("cave");
   public static final ale<dzz<?>> b = a("cave_extra_underground");
   public static final ale<dzz<?>> c = a("canyon");
   public static final ale<dzz<?>> d = a("nether_cave");

   private static ale<dzz<?>> a(String $$0) {
      return ale.a(lq.aB, new alf($$0));
   }

   public static void a(rc<dzz<?>> $$0) {
      jj<dfb> $$1 = $$0.a(lq.f);
      $$0.a(
         a,
         eab.a
            .a(
               new dzx(
                  0.15F,
                  egw.a(dyq.b(8), dyq.a(180)),
                  bqg.b(0.1F, 0.9F),
                  dyq.b(8),
                  dzv.a(false, dfd.oS.o()),
                  $$1.b(awp.bi),
                  bqg.b(0.7F, 1.4F),
                  bqg.b(0.8F, 1.3F),
                  bqg.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eab.a
            .a(
               new dzx(
                  0.07F,
                  egw.a(dyq.b(8), dyq.a(47)),
                  bqg.b(0.1F, 0.9F),
                  dyq.b(8),
                  dzv.a(false, dfd.gv.o()),
                  $$1.b(awp.bi),
                  bqg.b(0.7F, 1.4F),
                  bqg.b(0.8F, 1.3F),
                  bqg.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eab.c
            .a(
               new dzs(
                  0.01F,
                  egw.a(dyq.a(10), dyq.a(67)),
                  bpx.a(3.0F),
                  dyq.b(8),
                  dzv.a(false, dfd.oT.o()),
                  $$1.b(awp.bi),
                  bqg.b(-0.125F, 0.125F),
                  new dzs.a(bqg.b(0.75F, 1.0F), bqf.a(0.0F, 6.0F, 2.0F), 3, bqg.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eab.b.a(new dzx(0.2F, egw.a(dyq.a(0), dyq.c(1)), bpx.a(0.5F), dyq.b(10), $$1.b(awp.bj), bpx.a(1.0F), bpx.a(1.0F), bpx.a(-0.7F))));
   }
}
