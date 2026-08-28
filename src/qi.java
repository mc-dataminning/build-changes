public class qi {
   public static final alh<ejh<?>> a = a("cave");
   public static final alh<ejh<?>> b = a("cave_extra_underground");
   public static final alh<ejh<?>> c = a("canyon");
   public static final alh<ejh<?>> d = a("nether_cave");

   private static alh<ejh<?>> a(String $$0) {
      return alh.a(mh.aK, ali.b($$0));
   }

   public static void a(qh<ejh<?>> $$0) {
      jg<dnc> $$1 = $$0.a(mh.i);
      $$0.a(
         a,
         ejj.a
            .a(
               new ejf(
                  0.15F,
                  eql.a(ehx.b(8), ehx.a(180)),
                  bub.b(0.1F, 0.9F),
                  ehx.b(8),
                  ejd.a(false, dne.py.m()),
                  $$1.b(axe.bl),
                  bub.b(0.7F, 1.4F),
                  bub.b(0.8F, 1.3F),
                  bub.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ejj.a
            .a(
               new ejf(
                  0.07F,
                  eql.a(ehx.b(8), ehx.a(47)),
                  bub.b(0.1F, 0.9F),
                  ehx.b(8),
                  ejd.a(false, dne.gV.m()),
                  $$1.b(axe.bl),
                  bub.b(0.7F, 1.4F),
                  bub.b(0.8F, 1.3F),
                  bub.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ejj.c
            .a(
               new eja(
                  0.01F,
                  eql.a(ehx.a(10), ehx.a(67)),
                  bts.a(3.0F),
                  ehx.b(8),
                  ejd.a(false, dne.pz.m()),
                  $$1.b(axe.bl),
                  bub.b(-0.125F, 0.125F),
                  new eja.a(bub.b(0.75F, 1.0F), bua.a(0.0F, 6.0F, 2.0F), 3, bub.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ejj.b.a(new ejf(0.2F, eql.a(ehx.a(0), ehx.c(1)), bts.a(0.5F), ehx.b(10), $$1.b(axe.bm), bts.a(1.0F), bts.a(1.0F), bts.a(-0.7F))));
   }
}
