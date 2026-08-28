public class qf {
   public static final aku<eev<?>> a = a("cave");
   public static final aku<eev<?>> b = a("cave_extra_underground");
   public static final aku<eev<?>> c = a("canyon");
   public static final aku<eev<?>> d = a("nether_cave");

   private static aku<eev<?>> a(String $$0) {
      return aku.a(mc.aK, akv.b($$0));
   }

   public static void a(qe<eev<?>> $$0) {
      js<djl> $$1 = $$0.a(mc.f);
      $$0.a(
         a,
         eex.a
            .a(
               new eet(
                  0.15F,
                  elv.a(edl.b(8), edl.a(180)),
                  brt.b(0.1F, 0.9F),
                  edl.b(8),
                  eer.a(false, djn.pu.m()),
                  $$1.b(awp.bk),
                  brt.b(0.7F, 1.4F),
                  brt.b(0.8F, 1.3F),
                  brt.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eex.a
            .a(
               new eet(
                  0.07F,
                  elv.a(edl.b(8), edl.a(47)),
                  brt.b(0.1F, 0.9F),
                  edl.b(8),
                  eer.a(false, djn.gR.m()),
                  $$1.b(awp.bk),
                  brt.b(0.7F, 1.4F),
                  brt.b(0.8F, 1.3F),
                  brt.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eex.c
            .a(
               new eeo(
                  0.01F,
                  elv.a(edl.a(10), edl.a(67)),
                  brk.a(3.0F),
                  edl.b(8),
                  eer.a(false, djn.pv.m()),
                  $$1.b(awp.bk),
                  brt.b(-0.125F, 0.125F),
                  new eeo.a(brt.b(0.75F, 1.0F), brs.a(0.0F, 6.0F, 2.0F), 3, brt.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eex.b.a(new eet(0.2F, elv.a(edl.a(0), edl.c(1)), brk.a(0.5F), edl.b(10), $$1.b(awp.bl), brk.a(1.0F), brk.a(1.0F), brk.a(-0.7F))));
   }
}
