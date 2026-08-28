public class qj {
   public static final alq<ejt<?>> a = a("cave");
   public static final alq<ejt<?>> b = a("cave_extra_underground");
   public static final alq<ejt<?>> c = a("canyon");
   public static final alq<ejt<?>> d = a("nether_cave");

   private static alq<ejt<?>> a(String $$0) {
      return alq.a(mi.aK, alr.b($$0));
   }

   public static void a(qi<ejt<?>> $$0) {
      jh<dno> $$1 = $$0.a(mi.i);
      $$0.a(
         a,
         ejv.a
            .a(
               new ejr(
                  0.15F,
                  eqx.a(eij.b(8), eij.a(180)),
                  bum.b(0.1F, 0.9F),
                  eij.b(8),
                  ejp.a(false, dnq.py.m()),
                  $$1.b(axn.bl),
                  bum.b(0.7F, 1.4F),
                  bum.b(0.8F, 1.3F),
                  bum.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         ejv.a
            .a(
               new ejr(
                  0.07F,
                  eqx.a(eij.b(8), eij.a(47)),
                  bum.b(0.1F, 0.9F),
                  eij.b(8),
                  ejp.a(false, dnq.gV.m()),
                  $$1.b(axn.bl),
                  bum.b(0.7F, 1.4F),
                  bum.b(0.8F, 1.3F),
                  bum.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         ejv.c
            .a(
               new ejm(
                  0.01F,
                  eqx.a(eij.a(10), eij.a(67)),
                  bud.a(3.0F),
                  eij.b(8),
                  ejp.a(false, dnq.pz.m()),
                  $$1.b(axn.bl),
                  bum.b(-0.125F, 0.125F),
                  new ejm.a(bum.b(0.75F, 1.0F), bul.a(0.0F, 6.0F, 2.0F), 3, bum.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, ejv.b.a(new ejr(0.2F, eqx.a(eij.a(0), eij.c(1)), bud.a(0.5F), eij.b(10), $$1.b(axn.bm), bud.a(1.0F), bud.a(1.0F), bud.a(-0.7F))));
   }
}
