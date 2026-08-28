public class qf {
   public static final akt<eew<?>> a = a("cave");
   public static final akt<eew<?>> b = a("cave_extra_underground");
   public static final akt<eew<?>> c = a("canyon");
   public static final akt<eew<?>> d = a("nether_cave");

   private static akt<eew<?>> a(String $$0) {
      return akt.a(mc.aK, aku.b($$0));
   }

   public static void a(qe<eew<?>> $$0) {
      js<djm> $$1 = $$0.a(mc.f);
      $$0.a(
         a,
         eey.a
            .a(
               new eeu(
                  0.15F,
                  elw.a(edm.b(8), edm.a(180)),
                  brt.b(0.1F, 0.9F),
                  edm.b(8),
                  ees.a(false, djo.pu.m()),
                  $$1.b(awp.bk),
                  brt.b(0.7F, 1.4F),
                  brt.b(0.8F, 1.3F),
                  brt.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eey.a
            .a(
               new eeu(
                  0.07F,
                  elw.a(edm.b(8), edm.a(47)),
                  brt.b(0.1F, 0.9F),
                  edm.b(8),
                  ees.a(false, djo.gR.m()),
                  $$1.b(awp.bk),
                  brt.b(0.7F, 1.4F),
                  brt.b(0.8F, 1.3F),
                  brt.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eey.c
            .a(
               new eep(
                  0.01F,
                  elw.a(edm.a(10), edm.a(67)),
                  brk.a(3.0F),
                  edm.b(8),
                  ees.a(false, djo.pv.m()),
                  $$1.b(awp.bk),
                  brt.b(-0.125F, 0.125F),
                  new eep.a(brt.b(0.75F, 1.0F), brs.a(0.0F, 6.0F, 2.0F), 3, brt.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eey.b.a(new eeu(0.2F, elw.a(edm.a(0), edm.c(1)), brk.a(0.5F), edm.b(10), $$1.b(awp.bl), brk.a(1.0F), brk.a(1.0F), brk.a(-0.7F))));
   }
}
