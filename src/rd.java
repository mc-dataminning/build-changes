public class rd {
   public static final ald<dzv<?>> a = a("cave");
   public static final ald<dzv<?>> b = a("cave_extra_underground");
   public static final ald<dzv<?>> c = a("canyon");
   public static final ald<dzv<?>> d = a("nether_cave");

   private static ald<dzv<?>> a(String $$0) {
      return ald.a(lq.aB, new ale($$0));
   }

   public static void a(rc<dzv<?>> $$0) {
      jj<dex> $$1 = $$0.a(lq.f);
      $$0.a(
         a,
         dzx.a
            .a(
               new dzt(
                  0.15F,
                  egs.a(dym.b(8), dym.a(180)),
                  bqc.b(0.1F, 0.9F),
                  dym.b(8),
                  dzr.a(false, dez.oS.o()),
                  $$1.b(awo.bi),
                  bqc.b(0.7F, 1.4F),
                  bqc.b(0.8F, 1.3F),
                  bqc.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dzx.a
            .a(
               new dzt(
                  0.07F,
                  egs.a(dym.b(8), dym.a(47)),
                  bqc.b(0.1F, 0.9F),
                  dym.b(8),
                  dzr.a(false, dez.gv.o()),
                  $$1.b(awo.bi),
                  bqc.b(0.7F, 1.4F),
                  bqc.b(0.8F, 1.3F),
                  bqc.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dzx.c
            .a(
               new dzo(
                  0.01F,
                  egs.a(dym.a(10), dym.a(67)),
                  bpt.a(3.0F),
                  dym.b(8),
                  dzr.a(false, dez.oT.o()),
                  $$1.b(awo.bi),
                  bqc.b(-0.125F, 0.125F),
                  new dzo.a(bqc.b(0.75F, 1.0F), bqb.a(0.0F, 6.0F, 2.0F), 3, bqc.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dzx.b.a(new dzt(0.2F, egs.a(dym.a(0), dym.c(1)), bpt.a(0.5F), dym.b(10), $$1.b(awo.bj), bpt.a(1.0F), bpt.a(1.0F), bpt.a(-0.7F))));
   }
}
