public class qq {
   public static final akp<eaz<?>> a = a("cave");
   public static final akp<eaz<?>> b = a("cave_extra_underground");
   public static final akp<eaz<?>> c = a("canyon");
   public static final akp<eaz<?>> d = a("nether_cave");

   private static akp<eaz<?>> a(String $$0) {
      return akp.a(lu.aH, akq.b($$0));
   }

   public static void a(qp<eaz<?>> $$0) {
      jn<dfw> $$1 = $$0.a(lu.f);
      $$0.a(
         a,
         ebb.a
            .a(
               new eax(
                  0.15F,
                  ehw.a(dzp.b(8), dzp.a(180)),
                  bqa.b(0.1F, 0.9F),
                  dzp.b(8),
                  eav.a(false, dfy.oS.o()),
                  $$1.b(awd.bi),
                  bqa.b(0.7F, 1.4F),
                  bqa.b(0.8F, 1.3F),
                  bqa.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ebb.a
            .a(
               new eax(
                  0.07F,
                  ehw.a(dzp.b(8), dzp.a(47)),
                  bqa.b(0.1F, 0.9F),
                  dzp.b(8),
                  eav.a(false, dfy.gv.o()),
                  $$1.b(awd.bi),
                  bqa.b(0.7F, 1.4F),
                  bqa.b(0.8F, 1.3F),
                  bqa.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ebb.c
            .a(
               new eas(
                  0.01F,
                  ehw.a(dzp.a(10), dzp.a(67)),
                  bpr.a(3.0F),
                  dzp.b(8),
                  eav.a(false, dfy.oT.o()),
                  $$1.b(awd.bi),
                  bqa.b(-0.125F, 0.125F),
                  new eas.a(bqa.b(0.75F, 1.0F), bpz.a(0.0F, 6.0F, 2.0F), 3, bqa.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ebb.b.a(new eax(0.2F, ehw.a(dzp.a(0), dzp.c(1)), bpr.a(0.5F), dzp.b(10), $$1.b(awd.bj), bpr.a(1.0F), bpr.a(1.0F), bpr.a(-0.7F))));
   }
}
