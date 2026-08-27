public class pd {
   public static final ahc<dqm<?>> a = a("cave");
   public static final ahc<dqm<?>> b = a("cave_extra_underground");
   public static final ahc<dqm<?>> c = a("canyon");
   public static final ahc<dqm<?>> d = a("nether_cave");

   private static ahc<dqm<?>> a(String $$0) {
      return ahc.a(ke.av, new ahd($$0));
   }

   public static void a(pc<dqm<?>> $$0) {
      ii<cwj> $$1 = $$0.a(ke.f);
      $$0.a(
         a,
         dqo.a
            .a(
               new dqk(
                  0.15F,
                  dxj.a(dpd.b(8), dpd.a(180)),
                  bjf.b(0.1F, 0.9F),
                  dpd.b(8),
                  dqi.a(false, cwl.oS.o()),
                  $$1.b(asb.bh),
                  bjf.b(0.7F, 1.4F),
                  bjf.b(0.8F, 1.3F),
                  bjf.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dqo.a
            .a(
               new dqk(
                  0.07F,
                  dxj.a(dpd.b(8), dpd.a(47)),
                  bjf.b(0.1F, 0.9F),
                  dpd.b(8),
                  dqi.a(false, cwl.gv.o()),
                  $$1.b(asb.bh),
                  bjf.b(0.7F, 1.4F),
                  bjf.b(0.8F, 1.3F),
                  bjf.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dqo.c
            .a(
               new dqf(
                  0.01F,
                  dxj.a(dpd.a(10), dpd.a(67)),
                  biw.a(3.0F),
                  dpd.b(8),
                  dqi.a(false, cwl.oT.o()),
                  $$1.b(asb.bh),
                  bjf.b(-0.125F, 0.125F),
                  new dqf.a(bjf.b(0.75F, 1.0F), bje.a(0.0F, 6.0F, 2.0F), 3, bjf.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dqo.b.a(new dqk(0.2F, dxj.a(dpd.a(0), dpd.c(1)), biw.a(0.5F), dpd.b(10), $$1.b(asb.bi), biw.a(1.0F), biw.a(1.0F), biw.a(-0.7F))));
   }
}
