public class qp {
   public static final akl<dyw<?>> a = a("cave");
   public static final akl<dyw<?>> b = a("cave_extra_underground");
   public static final akl<dyw<?>> c = a("canyon");
   public static final akl<dyw<?>> d = a("nether_cave");

   private static akl<dyw<?>> a(String $$0) {
      return akl.a(lf.aB, new akm($$0));
   }

   public static void a(qo<dyw<?>> $$0) {
      iy<ddy> $$1 = $$0.a(lf.f);
      $$0.a(
         a,
         dyy.a
            .a(
               new dyu(
                  0.15F,
                  eft.a(dxn.b(8), dxn.a(180)),
                  bpe.b(0.1F, 0.9F),
                  dxn.b(8),
                  dys.a(false, dea.oS.n()),
                  $$1.b(avw.bi),
                  bpe.b(0.7F, 1.4F),
                  bpe.b(0.8F, 1.3F),
                  bpe.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dyy.a
            .a(
               new dyu(
                  0.07F,
                  eft.a(dxn.b(8), dxn.a(47)),
                  bpe.b(0.1F, 0.9F),
                  dxn.b(8),
                  dys.a(false, dea.gv.n()),
                  $$1.b(avw.bi),
                  bpe.b(0.7F, 1.4F),
                  bpe.b(0.8F, 1.3F),
                  bpe.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dyy.c
            .a(
               new dyp(
                  0.01F,
                  eft.a(dxn.a(10), dxn.a(67)),
                  bov.a(3.0F),
                  dxn.b(8),
                  dys.a(false, dea.oT.n()),
                  $$1.b(avw.bi),
                  bpe.b(-0.125F, 0.125F),
                  new dyp.a(bpe.b(0.75F, 1.0F), bpd.a(0.0F, 6.0F, 2.0F), 3, bpe.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dyy.b.a(new dyu(0.2F, eft.a(dxn.a(0), dxn.c(1)), bov.a(0.5F), dxn.b(10), $$1.b(avw.bj), bov.a(1.0F), bov.a(1.0F), bov.a(-0.7F))));
   }
}
