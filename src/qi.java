public class qi {
   public static final alf<eir<?>> a = a("cave");
   public static final alf<eir<?>> b = a("cave_extra_underground");
   public static final alf<eir<?>> c = a("canyon");
   public static final alf<eir<?>> d = a("nether_cave");

   private static alf<eir<?>> a(String $$0) {
      return alf.a(mh.aK, alg.b($$0));
   }

   public static void a(qh<eir<?>> $$0) {
      jg<dmm> $$1 = $$0.a(mh.i);
      $$0.a(
         a,
         eit.a
            .a(
               new eip(
                  0.15F,
                  eps.a(ehh.b(8), ehh.a(180)),
                  btq.b(0.1F, 0.9F),
                  ehh.b(8),
                  ein.a(false, dmo.py.m()),
                  $$1.b(axc.bl),
                  btq.b(0.7F, 1.4F),
                  btq.b(0.8F, 1.3F),
                  btq.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eit.a
            .a(
               new eip(
                  0.07F,
                  eps.a(ehh.b(8), ehh.a(47)),
                  btq.b(0.1F, 0.9F),
                  ehh.b(8),
                  ein.a(false, dmo.gV.m()),
                  $$1.b(axc.bl),
                  btq.b(0.7F, 1.4F),
                  btq.b(0.8F, 1.3F),
                  btq.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eit.c
            .a(
               new eik(
                  0.01F,
                  eps.a(ehh.a(10), ehh.a(67)),
                  bth.a(3.0F),
                  ehh.b(8),
                  ein.a(false, dmo.pz.m()),
                  $$1.b(axc.bl),
                  btq.b(-0.125F, 0.125F),
                  new eik.a(btq.b(0.75F, 1.0F), btp.a(0.0F, 6.0F, 2.0F), 3, btq.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eit.b.a(new eip(0.2F, eps.a(ehh.a(0), ehh.c(1)), bth.a(0.5F), ehh.b(10), $$1.b(axc.bm), bth.a(1.0F), bth.a(1.0F), bth.a(-0.7F))));
   }
}
