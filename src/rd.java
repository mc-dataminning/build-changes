public class rd {
   public static final ald<dzw<?>> a = a("cave");
   public static final ald<dzw<?>> b = a("cave_extra_underground");
   public static final ald<dzw<?>> c = a("canyon");
   public static final ald<dzw<?>> d = a("nether_cave");

   private static ald<dzw<?>> a(String $$0) {
      return ald.a(lq.aB, new ale($$0));
   }

   public static void a(rc<dzw<?>> $$0) {
      jj<dey> $$1 = $$0.a(lq.f);
      $$0.a(
         a,
         dzy.a
            .a(
               new dzu(
                  0.15F,
                  egt.a(dyn.b(8), dyn.a(180)),
                  bqd.b(0.1F, 0.9F),
                  dyn.b(8),
                  dzs.a(false, dfa.oS.o()),
                  $$1.b(awo.bi),
                  bqd.b(0.7F, 1.4F),
                  bqd.b(0.8F, 1.3F),
                  bqd.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dzy.a
            .a(
               new dzu(
                  0.07F,
                  egt.a(dyn.b(8), dyn.a(47)),
                  bqd.b(0.1F, 0.9F),
                  dyn.b(8),
                  dzs.a(false, dfa.gv.o()),
                  $$1.b(awo.bi),
                  bqd.b(0.7F, 1.4F),
                  bqd.b(0.8F, 1.3F),
                  bqd.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dzy.c
            .a(
               new dzp(
                  0.01F,
                  egt.a(dyn.a(10), dyn.a(67)),
                  bpu.a(3.0F),
                  dyn.b(8),
                  dzs.a(false, dfa.oT.o()),
                  $$1.b(awo.bi),
                  bqd.b(-0.125F, 0.125F),
                  new dzp.a(bqd.b(0.75F, 1.0F), bqc.a(0.0F, 6.0F, 2.0F), 3, bqd.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dzy.b.a(new dzu(0.2F, egt.a(dyn.a(0), dyn.c(1)), bpu.a(0.5F), dyn.b(10), $$1.b(awo.bj), bpu.a(1.0F), bpu.a(1.0F), bpu.a(-0.7F))));
   }
}
