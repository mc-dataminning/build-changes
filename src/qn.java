public class qn {
   public static final akj<eaj<?>> a = a("cave");
   public static final akj<eaj<?>> b = a("cave_extra_underground");
   public static final akj<eaj<?>> c = a("canyon");
   public static final akj<eaj<?>> d = a("nether_cave");

   private static akj<eaj<?>> a(String $$0) {
      return akj.a(lr.aG, new akk($$0));
   }

   public static void a(qm<eaj<?>> $$0) {
      jk<dfh> $$1 = $$0.a(lr.f);
      $$0.a(
         a,
         eal.a
            .a(
               new eah(
                  0.15F,
                  ehg.a(dyz.b(8), dyz.a(180)),
                  bpq.b(0.1F, 0.9F),
                  dyz.b(8),
                  eaf.a(false, dfj.oS.o()),
                  $$1.b(avw.bi),
                  bpq.b(0.7F, 1.4F),
                  bpq.b(0.8F, 1.3F),
                  bpq.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eal.a
            .a(
               new eah(
                  0.07F,
                  ehg.a(dyz.b(8), dyz.a(47)),
                  bpq.b(0.1F, 0.9F),
                  dyz.b(8),
                  eaf.a(false, dfj.gv.o()),
                  $$1.b(avw.bi),
                  bpq.b(0.7F, 1.4F),
                  bpq.b(0.8F, 1.3F),
                  bpq.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eal.c
            .a(
               new eac(
                  0.01F,
                  ehg.a(dyz.a(10), dyz.a(67)),
                  bph.a(3.0F),
                  dyz.b(8),
                  eaf.a(false, dfj.oT.o()),
                  $$1.b(avw.bi),
                  bpq.b(-0.125F, 0.125F),
                  new eac.a(bpq.b(0.75F, 1.0F), bpp.a(0.0F, 6.0F, 2.0F), 3, bpq.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eal.b.a(new eah(0.2F, ehg.a(dyz.a(0), dyz.c(1)), bph.a(0.5F), dyz.b(10), $$1.b(avw.bj), bph.a(1.0F), bph.a(1.0F), bph.a(-0.7F))));
   }
}
