public class pg {
   public static final ahg<drb<?>> a = a("cave");
   public static final ahg<drb<?>> b = a("cave_extra_underground");
   public static final ahg<drb<?>> c = a("canyon");
   public static final ahg<drb<?>> d = a("nether_cave");

   private static ahg<drb<?>> a(String $$0) {
      return ahg.a(ke.av, new ahh($$0));
   }

   public static void a(pf<drb<?>> $$0) {
      ii<cwy> $$1 = $$0.a(ke.f);
      $$0.a(
         a,
         drd.a
            .a(
               new dqz(
                  0.15F,
                  dxy.a(dps.b(8), dps.a(180)),
                  bjm.b(0.1F, 0.9F),
                  dps.b(8),
                  dqx.a(false, cxa.oS.o()),
                  $$1.b(asi.bh),
                  bjm.b(0.7F, 1.4F),
                  bjm.b(0.8F, 1.3F),
                  bjm.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         drd.a
            .a(
               new dqz(
                  0.07F,
                  dxy.a(dps.b(8), dps.a(47)),
                  bjm.b(0.1F, 0.9F),
                  dps.b(8),
                  dqx.a(false, cxa.gv.o()),
                  $$1.b(asi.bh),
                  bjm.b(0.7F, 1.4F),
                  bjm.b(0.8F, 1.3F),
                  bjm.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         drd.c
            .a(
               new dqu(
                  0.01F,
                  dxy.a(dps.a(10), dps.a(67)),
                  bjd.a(3.0F),
                  dps.b(8),
                  dqx.a(false, cxa.oT.o()),
                  $$1.b(asi.bh),
                  bjm.b(-0.125F, 0.125F),
                  new dqu.a(bjm.b(0.75F, 1.0F), bjl.a(0.0F, 6.0F, 2.0F), 3, bjm.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, drd.b.a(new dqz(0.2F, dxy.a(dps.a(0), dps.c(1)), bjd.a(0.5F), dps.b(10), $$1.b(asi.bi), bjd.a(1.0F), bjd.a(1.0F), bjd.a(-0.7F))));
   }
}
