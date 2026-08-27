public class qk {
   public static final ake<dxt<?>> a = a("cave");
   public static final ake<dxt<?>> b = a("cave_extra_underground");
   public static final ake<dxt<?>> c = a("canyon");
   public static final ake<dxt<?>> d = a("nether_cave");

   private static ake<dxt<?>> a(String $$0) {
      return ake.a(ld.aA, new akf($$0));
   }

   public static void a(qj<dxt<?>> $$0) {
      iw<dcv> $$1 = $$0.a(ld.f);
      $$0.a(
         a,
         dxv.a
            .a(
               new dxr(
                  0.15F,
                  eeq.a(dwk.b(8), dwk.a(180)),
                  boa.b(0.1F, 0.9F),
                  dwk.b(8),
                  dxp.a(false, dcx.oS.n()),
                  $$1.b(avo.bi),
                  boa.b(0.7F, 1.4F),
                  boa.b(0.8F, 1.3F),
                  boa.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dxv.a
            .a(
               new dxr(
                  0.07F,
                  eeq.a(dwk.b(8), dwk.a(47)),
                  boa.b(0.1F, 0.9F),
                  dwk.b(8),
                  dxp.a(false, dcx.gv.n()),
                  $$1.b(avo.bi),
                  boa.b(0.7F, 1.4F),
                  boa.b(0.8F, 1.3F),
                  boa.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dxv.c
            .a(
               new dxm(
                  0.01F,
                  eeq.a(dwk.a(10), dwk.a(67)),
                  bnr.a(3.0F),
                  dwk.b(8),
                  dxp.a(false, dcx.oT.n()),
                  $$1.b(avo.bi),
                  boa.b(-0.125F, 0.125F),
                  new dxm.a(boa.b(0.75F, 1.0F), bnz.a(0.0F, 6.0F, 2.0F), 3, boa.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dxv.b.a(new dxr(0.2F, eeq.a(dwk.a(0), dwk.c(1)), bnr.a(0.5F), dwk.b(10), $$1.b(avo.bj), bnr.a(1.0F), bnr.a(1.0F), bnr.a(-0.7F))));
   }
}
