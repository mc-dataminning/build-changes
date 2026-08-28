public class qf {
   public static final akt<efs<?>> a = a("cave");
   public static final akt<efs<?>> b = a("cave_extra_underground");
   public static final akt<efs<?>> c = a("canyon");
   public static final akt<efs<?>> d = a("nether_cave");

   private static akt<efs<?>> a(String $$0) {
      return akt.a(mc.aL, aku.b($$0));
   }

   public static void a(qe<efs<?>> $$0) {
      js<dke> $$1 = $$0.a(mc.f);
      $$0.a(
         a,
         efu.a
            .a(
               new efq(
                  0.15F,
                  emt.a(eei.b(8), eei.a(180)),
                  bsi.b(0.1F, 0.9F),
                  eei.b(8),
                  efo.a(false, dkg.pu.m()),
                  $$1.b(awp.bk),
                  bsi.b(0.7F, 1.4F),
                  bsi.b(0.8F, 1.3F),
                  bsi.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         efu.a
            .a(
               new efq(
                  0.07F,
                  emt.a(eei.b(8), eei.a(47)),
                  bsi.b(0.1F, 0.9F),
                  eei.b(8),
                  efo.a(false, dkg.gR.m()),
                  $$1.b(awp.bk),
                  bsi.b(0.7F, 1.4F),
                  bsi.b(0.8F, 1.3F),
                  bsi.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         efu.c
            .a(
               new efl(
                  0.01F,
                  emt.a(eei.a(10), eei.a(67)),
                  brz.a(3.0F),
                  eei.b(8),
                  efo.a(false, dkg.pv.m()),
                  $$1.b(awp.bk),
                  bsi.b(-0.125F, 0.125F),
                  new efl.a(bsi.b(0.75F, 1.0F), bsh.a(0.0F, 6.0F, 2.0F), 3, bsi.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, efu.b.a(new efq(0.2F, emt.a(eei.a(0), eei.c(1)), brz.a(0.5F), eei.b(10), $$1.b(awp.bl), brz.a(1.0F), brz.a(1.0F), brz.a(-0.7F))));
   }
}
