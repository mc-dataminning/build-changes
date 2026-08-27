public class ow {
   public static final agh<dou<?>> a = a("cave");
   public static final agh<dou<?>> b = a("cave_extra_underground");
   public static final agh<dou<?>> c = a("canyon");
   public static final agh<dou<?>> d = a("nether_cave");

   private static agh<dou<?>> a(String $$0) {
      return agh.a(jz.at, new agi($$0));
   }

   public static void a(ov<dou<?>> $$0) {
      ic<cva> $$1 = $$0.a(jz.e);
      $$0.a(
         a,
         dow.a
            .a(
               new dos(
                  0.15F,
                  dvr.a(dnl.b(8), dnl.a(180)),
                  bih.b(0.1F, 0.9F),
                  dnl.b(8),
                  doq.a(false, cvc.oS.o()),
                  $$1.b(arg.bh),
                  bih.b(0.7F, 1.4F),
                  bih.b(0.8F, 1.3F),
                  bih.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dow.a
            .a(
               new dos(
                  0.07F,
                  dvr.a(dnl.b(8), dnl.a(47)),
                  bih.b(0.1F, 0.9F),
                  dnl.b(8),
                  doq.a(false, cvc.gv.o()),
                  $$1.b(arg.bh),
                  bih.b(0.7F, 1.4F),
                  bih.b(0.8F, 1.3F),
                  bih.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dow.c
            .a(
               new don(
                  0.01F,
                  dvr.a(dnl.a(10), dnl.a(67)),
                  bhy.a(3.0F),
                  dnl.b(8),
                  doq.a(false, cvc.oT.o()),
                  $$1.b(arg.bh),
                  bih.b(-0.125F, 0.125F),
                  new don.a(bih.b(0.75F, 1.0F), big.a(0.0F, 6.0F, 2.0F), 3, bih.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dow.b.a(new dos(0.2F, dvr.a(dnl.a(0), dnl.c(1)), bhy.a(0.5F), dnl.b(10), $$1.b(arg.bi), bhy.a(1.0F), bhy.a(1.0F), bhy.a(-0.7F))));
   }
}
