public class qu {
   public static final alb<eco<?>> a = a("cave");
   public static final alb<eco<?>> b = a("cave_extra_underground");
   public static final alb<eco<?>> c = a("canyon");
   public static final alb<eco<?>> d = a("nether_cave");

   private static alb<eco<?>> a(String $$0) {
      return alb.a(lv.aI, alc.b($$0));
   }

   public static void a(qt<eco<?>> $$0) {
      jo<dhj> $$1 = $$0.a(lv.f);
      $$0.a(
         a,
         ecq.a
            .a(
               new ecm(
                  0.15F,
                  ejm.a(ebe.b(8), ebe.a(180)),
                  bqz.b(0.1F, 0.9F),
                  ebe.b(8),
                  eck.a(false, dhl.oS.o()),
                  $$1.b(awt.bj),
                  bqz.b(0.7F, 1.4F),
                  bqz.b(0.8F, 1.3F),
                  bqz.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ecq.a
            .a(
               new ecm(
                  0.07F,
                  ejm.a(ebe.b(8), ebe.a(47)),
                  bqz.b(0.1F, 0.9F),
                  ebe.b(8),
                  eck.a(false, dhl.gv.o()),
                  $$1.b(awt.bj),
                  bqz.b(0.7F, 1.4F),
                  bqz.b(0.8F, 1.3F),
                  bqz.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ecq.c
            .a(
               new ech(
                  0.01F,
                  ejm.a(ebe.a(10), ebe.a(67)),
                  bqq.a(3.0F),
                  ebe.b(8),
                  eck.a(false, dhl.oT.o()),
                  $$1.b(awt.bj),
                  bqz.b(-0.125F, 0.125F),
                  new ech.a(bqz.b(0.75F, 1.0F), bqy.a(0.0F, 6.0F, 2.0F), 3, bqz.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ecq.b.a(new ecm(0.2F, ejm.a(ebe.a(0), ebe.c(1)), bqq.a(0.5F), ebe.b(10), $$1.b(awt.bk), bqq.a(1.0F), bqq.a(1.0F), bqq.a(-0.7F))));
   }
}
