public class qj {
   public static final alj<ejj<?>> a = a("cave");
   public static final alj<ejj<?>> b = a("cave_extra_underground");
   public static final alj<ejj<?>> c = a("canyon");
   public static final alj<ejj<?>> d = a("nether_cave");

   private static alj<ejj<?>> a(String $$0) {
      return alj.a(mi.aK, alk.b($$0));
   }

   public static void a(qi<ejj<?>> $$0) {
      jh<dne> $$1 = $$0.a(mi.i);
      $$0.a(
         a,
         ejl.a
            .a(
               new ejh(
                  0.15F,
                  eqn.a(ehz.b(8), ehz.a(180)),
                  bud.b(0.1F, 0.9F),
                  ehz.b(8),
                  ejf.a(false, dng.py.m()),
                  $$1.b(axg.bl),
                  bud.b(0.7F, 1.4F),
                  bud.b(0.8F, 1.3F),
                  bud.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ejl.a
            .a(
               new ejh(
                  0.07F,
                  eqn.a(ehz.b(8), ehz.a(47)),
                  bud.b(0.1F, 0.9F),
                  ehz.b(8),
                  ejf.a(false, dng.gV.m()),
                  $$1.b(axg.bl),
                  bud.b(0.7F, 1.4F),
                  bud.b(0.8F, 1.3F),
                  bud.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ejl.c
            .a(
               new ejc(
                  0.01F,
                  eqn.a(ehz.a(10), ehz.a(67)),
                  btu.a(3.0F),
                  ehz.b(8),
                  ejf.a(false, dng.pz.m()),
                  $$1.b(axg.bl),
                  bud.b(-0.125F, 0.125F),
                  new ejc.a(bud.b(0.75F, 1.0F), buc.a(0.0F, 6.0F, 2.0F), 3, bud.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ejl.b.a(new ejh(0.2F, eqn.a(ehz.a(0), ehz.c(1)), btu.a(0.5F), ehz.b(10), $$1.b(axg.bm), btu.a(1.0F), btu.a(1.0F), btu.a(-0.7F))));
   }
}
