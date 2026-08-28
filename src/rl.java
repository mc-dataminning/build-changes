public class rl {
   public static final aly<efm<?>> a = a("cave");
   public static final aly<efm<?>> b = a("cave_extra_underground");
   public static final aly<efm<?>> c = a("canyon");
   public static final aly<efm<?>> d = a("nether_cave");

   private static aly<efm<?>> a(String $$0) {
      return aly.a(mb.aJ, alz.b($$0));
   }

   public static void a(rk<efm<?>> $$0) {
      jr<dke> $$1 = $$0.a(mb.f);
      $$0.a(
         a,
         efo.a
            .a(
               new efk(
                  0.15F,
                  emm.a(eec.b(8), eec.a(180)),
                  bso.b(0.1F, 0.9F),
                  eec.b(8),
                  efi.a(false, dkg.pn.m()),
                  $$1.b(axu.bk),
                  bso.b(0.7F, 1.4F),
                  bso.b(0.8F, 1.3F),
                  bso.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         efo.a
            .a(
               new efk(
                  0.07F,
                  emm.a(eec.b(8), eec.a(47)),
                  bso.b(0.1F, 0.9F),
                  eec.b(8),
                  efi.a(false, dkg.gK.m()),
                  $$1.b(axu.bk),
                  bso.b(0.7F, 1.4F),
                  bso.b(0.8F, 1.3F),
                  bso.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         efo.c
            .a(
               new eff(
                  0.01F,
                  emm.a(eec.a(10), eec.a(67)),
                  bsf.a(3.0F),
                  eec.b(8),
                  efi.a(false, dkg.po.m()),
                  $$1.b(axu.bk),
                  bso.b(-0.125F, 0.125F),
                  new eff.a(bso.b(0.75F, 1.0F), bsn.a(0.0F, 6.0F, 2.0F), 3, bso.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, efo.b.a(new efk(0.2F, emm.a(eec.a(0), eec.c(1)), bsf.a(0.5F), eec.b(10), $$1.b(axu.bl), bsf.a(1.0F), bsf.a(1.0F), bsf.a(-0.7F))));
   }
}
