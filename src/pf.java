public class pf {
   public static final ahf<dqt<?>> a = a("cave");
   public static final ahf<dqt<?>> b = a("cave_extra_underground");
   public static final ahf<dqt<?>> c = a("canyon");
   public static final ahf<dqt<?>> d = a("nether_cave");

   private static ahf<dqt<?>> a(String $$0) {
      return ahf.a(ke.av, new ahg($$0));
   }

   public static void a(pe<dqt<?>> $$0) {
      ii<cwq> $$1 = $$0.a(ke.f);
      $$0.a(
         a,
         dqv.a
            .a(
               new dqr(
                  0.15F,
                  dxq.a(dpk.b(8), dpk.a(180)),
                  bjl.b(0.1F, 0.9F),
                  dpk.b(8),
                  dqp.a(false, cws.oS.o()),
                  $$1.b(ash.bh),
                  bjl.b(0.7F, 1.4F),
                  bjl.b(0.8F, 1.3F),
                  bjl.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dqv.a
            .a(
               new dqr(
                  0.07F,
                  dxq.a(dpk.b(8), dpk.a(47)),
                  bjl.b(0.1F, 0.9F),
                  dpk.b(8),
                  dqp.a(false, cws.gv.o()),
                  $$1.b(ash.bh),
                  bjl.b(0.7F, 1.4F),
                  bjl.b(0.8F, 1.3F),
                  bjl.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dqv.c
            .a(
               new dqm(
                  0.01F,
                  dxq.a(dpk.a(10), dpk.a(67)),
                  bjc.a(3.0F),
                  dpk.b(8),
                  dqp.a(false, cws.oT.o()),
                  $$1.b(ash.bh),
                  bjl.b(-0.125F, 0.125F),
                  new dqm.a(bjl.b(0.75F, 1.0F), bjk.a(0.0F, 6.0F, 2.0F), 3, bjl.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dqv.b.a(new dqr(0.2F, dxq.a(dpk.a(0), dpk.c(1)), bjc.a(0.5F), dpk.b(10), $$1.b(ash.bi), bjc.a(1.0F), bjc.a(1.0F), bjc.a(-0.7F))));
   }
}
