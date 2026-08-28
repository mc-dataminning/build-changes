public class qi {
   public static final ald<ehr<?>> a = a("cave");
   public static final ald<ehr<?>> b = a("cave_extra_underground");
   public static final ald<ehr<?>> c = a("canyon");
   public static final ald<ehr<?>> d = a("nether_cave");

   private static ald<ehr<?>> a(String $$0) {
      return ald.a(mg.aJ, ale.b($$0));
   }

   public static void a(qh<ehr<?>> $$0) {
      jf<dlu> $$1 = $$0.a(mg.i);
      $$0.a(
         a,
         eht.a
            .a(
               new ehp(
                  0.15F,
                  eos.a(egh.b(8), egh.a(180)),
                  bti.b(0.1F, 0.9F),
                  egh.b(8),
                  ehn.a(false, dlw.pu.m()),
                  $$1.b(axa.bk),
                  bti.b(0.7F, 1.4F),
                  bti.b(0.8F, 1.3F),
                  bti.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eht.a
            .a(
               new ehp(
                  0.07F,
                  eos.a(egh.b(8), egh.a(47)),
                  bti.b(0.1F, 0.9F),
                  egh.b(8),
                  ehn.a(false, dlw.gR.m()),
                  $$1.b(axa.bk),
                  bti.b(0.7F, 1.4F),
                  bti.b(0.8F, 1.3F),
                  bti.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eht.c
            .a(
               new ehk(
                  0.01F,
                  eos.a(egh.a(10), egh.a(67)),
                  bsz.a(3.0F),
                  egh.b(8),
                  ehn.a(false, dlw.pv.m()),
                  $$1.b(axa.bk),
                  bti.b(-0.125F, 0.125F),
                  new ehk.a(bti.b(0.75F, 1.0F), bth.a(0.0F, 6.0F, 2.0F), 3, bti.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eht.b.a(new ehp(0.2F, eos.a(egh.a(0), egh.c(1)), bsz.a(0.5F), egh.b(10), $$1.b(axa.bl), bsz.a(1.0F), bsz.a(1.0F), bsz.a(-0.7F))));
   }
}
