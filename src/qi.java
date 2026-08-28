public class qi {
   public static final alf<eiw<?>> a = a("cave");
   public static final alf<eiw<?>> b = a("cave_extra_underground");
   public static final alf<eiw<?>> c = a("canyon");
   public static final alf<eiw<?>> d = a("nether_cave");

   private static alf<eiw<?>> a(String $$0) {
      return alf.a(mh.aK, alg.b($$0));
   }

   public static void a(qh<eiw<?>> $$0) {
      jg<dmr> $$1 = $$0.a(mh.i);
      $$0.a(
         a,
         eiy.a
            .a(
               new eiu(
                  0.15F,
                  epx.a(ehm.b(8), ehm.a(180)),
                  btq.b(0.1F, 0.9F),
                  ehm.b(8),
                  eis.a(false, dmt.py.m()),
                  $$1.b(axc.bl),
                  btq.b(0.7F, 1.4F),
                  btq.b(0.8F, 1.3F),
                  btq.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eiy.a
            .a(
               new eiu(
                  0.07F,
                  epx.a(ehm.b(8), ehm.a(47)),
                  btq.b(0.1F, 0.9F),
                  ehm.b(8),
                  eis.a(false, dmt.gV.m()),
                  $$1.b(axc.bl),
                  btq.b(0.7F, 1.4F),
                  btq.b(0.8F, 1.3F),
                  btq.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eiy.c
            .a(
               new eip(
                  0.01F,
                  epx.a(ehm.a(10), ehm.a(67)),
                  bth.a(3.0F),
                  ehm.b(8),
                  eis.a(false, dmt.pz.m()),
                  $$1.b(axc.bl),
                  btq.b(-0.125F, 0.125F),
                  new eip.a(btq.b(0.75F, 1.0F), btp.a(0.0F, 6.0F, 2.0F), 3, btq.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eiy.b.a(new eiu(0.2F, epx.a(ehm.a(0), ehm.c(1)), bth.a(0.5F), ehm.b(10), $$1.b(axc.bm), bth.a(1.0F), bth.a(1.0F), bth.a(-0.7F))));
   }
}
