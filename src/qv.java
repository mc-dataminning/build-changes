public class qv {
   public static final ald<ecs<?>> a = a("cave");
   public static final ald<ecs<?>> b = a("cave_extra_underground");
   public static final ald<ecs<?>> c = a("canyon");
   public static final ald<ecs<?>> d = a("nether_cave");

   private static ald<ecs<?>> a(String $$0) {
      return ald.a(lw.aJ, ale.b($$0));
   }

   public static void a(qu<ecs<?>> $$0) {
      jp<dhm> $$1 = $$0.a(lw.f);
      $$0.a(
         a,
         ecu.a
            .a(
               new ecq(
                  0.15F,
                  ejq.a(ebi.b(8), ebi.a(180)),
                  brc.b(0.1F, 0.9F),
                  ebi.b(8),
                  eco.a(false, dho.oS.n()),
                  $$1.b(awv.bj),
                  brc.b(0.7F, 1.4F),
                  brc.b(0.8F, 1.3F),
                  brc.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ecu.a
            .a(
               new ecq(
                  0.07F,
                  ejq.a(ebi.b(8), ebi.a(47)),
                  brc.b(0.1F, 0.9F),
                  ebi.b(8),
                  eco.a(false, dho.gv.n()),
                  $$1.b(awv.bj),
                  brc.b(0.7F, 1.4F),
                  brc.b(0.8F, 1.3F),
                  brc.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ecu.c
            .a(
               new ecl(
                  0.01F,
                  ejq.a(ebi.a(10), ebi.a(67)),
                  bqt.a(3.0F),
                  ebi.b(8),
                  eco.a(false, dho.oT.n()),
                  $$1.b(awv.bj),
                  brc.b(-0.125F, 0.125F),
                  new ecl.a(brc.b(0.75F, 1.0F), brb.a(0.0F, 6.0F, 2.0F), 3, brc.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ecu.b.a(new ecq(0.2F, ejq.a(ebi.a(0), ebi.c(1)), bqt.a(0.5F), ebi.b(10), $$1.b(awv.bk), bqt.a(1.0F), bqt.a(1.0F), bqt.a(-0.7F))));
   }
}
