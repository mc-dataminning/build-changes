public class qu {
   public static final ala<eca<?>> a = a("cave");
   public static final ala<eca<?>> b = a("cave_extra_underground");
   public static final ala<eca<?>> c = a("canyon");
   public static final ala<eca<?>> d = a("nether_cave");

   private static ala<eca<?>> a(String $$0) {
      return ala.a(lv.aH, alb.b($$0));
   }

   public static void a(qt<eca<?>> $$0) {
      jo<dgv> $$1 = $$0.a(lv.f);
      $$0.a(
         a,
         ecc.a
            .a(
               new eby(
                  0.15F,
                  eiy.a(eaq.b(8), eaq.a(180)),
                  bqu.b(0.1F, 0.9F),
                  eaq.b(8),
                  ebw.a(false, dgx.oS.o()),
                  $$1.b(aws.bj),
                  bqu.b(0.7F, 1.4F),
                  bqu.b(0.8F, 1.3F),
                  bqu.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ecc.a
            .a(
               new eby(
                  0.07F,
                  eiy.a(eaq.b(8), eaq.a(47)),
                  bqu.b(0.1F, 0.9F),
                  eaq.b(8),
                  ebw.a(false, dgx.gv.o()),
                  $$1.b(aws.bj),
                  bqu.b(0.7F, 1.4F),
                  bqu.b(0.8F, 1.3F),
                  bqu.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ecc.c
            .a(
               new ebt(
                  0.01F,
                  eiy.a(eaq.a(10), eaq.a(67)),
                  bql.a(3.0F),
                  eaq.b(8),
                  ebw.a(false, dgx.oT.o()),
                  $$1.b(aws.bj),
                  bqu.b(-0.125F, 0.125F),
                  new ebt.a(bqu.b(0.75F, 1.0F), bqt.a(0.0F, 6.0F, 2.0F), 3, bqu.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ecc.b.a(new eby(0.2F, eiy.a(eaq.a(0), eaq.c(1)), bql.a(0.5F), eaq.b(10), $$1.b(aws.bk), bql.a(1.0F), bql.a(1.0F), bql.a(-0.7F))));
   }
}
