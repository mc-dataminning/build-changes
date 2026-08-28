public class qi {
   public static final alf<eic<?>> a = a("cave");
   public static final alf<eic<?>> b = a("cave_extra_underground");
   public static final alf<eic<?>> c = a("canyon");
   public static final alf<eic<?>> d = a("nether_cave");

   private static alf<eic<?>> a(String $$0) {
      return alf.a(mg.aJ, alg.b($$0));
   }

   public static void a(qh<eic<?>> $$0) {
      jf<dma> $$1 = $$0.a(mg.i);
      $$0.a(
         a,
         eie.a
            .a(
               new eia(
                  0.15F,
                  epd.a(egs.b(8), egs.a(180)),
                  btl.b(0.1F, 0.9F),
                  egs.b(8),
                  ehy.a(false, dmc.pv.m()),
                  $$1.b(axc.bk),
                  btl.b(0.7F, 1.4F),
                  btl.b(0.8F, 1.3F),
                  btl.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eie.a
            .a(
               new eia(
                  0.07F,
                  epd.a(egs.b(8), egs.a(47)),
                  btl.b(0.1F, 0.9F),
                  egs.b(8),
                  ehy.a(false, dmc.gS.m()),
                  $$1.b(axc.bk),
                  btl.b(0.7F, 1.4F),
                  btl.b(0.8F, 1.3F),
                  btl.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eie.c
            .a(
               new ehv(
                  0.01F,
                  epd.a(egs.a(10), egs.a(67)),
                  btc.a(3.0F),
                  egs.b(8),
                  ehy.a(false, dmc.pw.m()),
                  $$1.b(axc.bk),
                  btl.b(-0.125F, 0.125F),
                  new ehv.a(btl.b(0.75F, 1.0F), btk.a(0.0F, 6.0F, 2.0F), 3, btl.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eie.b.a(new eia(0.2F, epd.a(egs.a(0), egs.c(1)), btc.a(0.5F), egs.b(10), $$1.b(axc.bl), btc.a(1.0F), btc.a(1.0F), btc.a(-0.7F))));
   }
}
