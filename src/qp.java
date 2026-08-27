public class qp {
   public static final akm<dyy<?>> a = a("cave");
   public static final akm<dyy<?>> b = a("cave_extra_underground");
   public static final akm<dyy<?>> c = a("canyon");
   public static final akm<dyy<?>> d = a("nether_cave");

   private static akm<dyy<?>> a(String $$0) {
      return akm.a(lf.aB, new akn($$0));
   }

   public static void a(qo<dyy<?>> $$0) {
      iy<dea> $$1 = $$0.a(lf.f);
      $$0.a(
         a,
         dza.a
            .a(
               new dyw(
                  0.15F,
                  efv.a(dxp.b(8), dxp.a(180)),
                  bpg.b(0.1F, 0.9F),
                  dxp.b(8),
                  dyu.a(false, dec.oS.n()),
                  $$1.b(avx.bi),
                  bpg.b(0.7F, 1.4F),
                  bpg.b(0.8F, 1.3F),
                  bpg.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dza.a
            .a(
               new dyw(
                  0.07F,
                  efv.a(dxp.b(8), dxp.a(47)),
                  bpg.b(0.1F, 0.9F),
                  dxp.b(8),
                  dyu.a(false, dec.gv.n()),
                  $$1.b(avx.bi),
                  bpg.b(0.7F, 1.4F),
                  bpg.b(0.8F, 1.3F),
                  bpg.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dza.c
            .a(
               new dyr(
                  0.01F,
                  efv.a(dxp.a(10), dxp.a(67)),
                  box.a(3.0F),
                  dxp.b(8),
                  dyu.a(false, dec.oT.n()),
                  $$1.b(avx.bi),
                  bpg.b(-0.125F, 0.125F),
                  new dyr.a(bpg.b(0.75F, 1.0F), bpf.a(0.0F, 6.0F, 2.0F), 3, bpg.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dza.b.a(new dyw(0.2F, efv.a(dxp.a(0), dxp.c(1)), box.a(0.5F), dxp.b(10), $$1.b(avx.bj), box.a(1.0F), box.a(1.0F), box.a(-0.7F))));
   }
}
