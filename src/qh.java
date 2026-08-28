public class qh {
   public static final alc<egp<?>> a = a("cave");
   public static final alc<egp<?>> b = a("cave_extra_underground");
   public static final alc<egp<?>> c = a("canyon");
   public static final alc<egp<?>> d = a("nether_cave");

   private static alc<egp<?>> a(String $$0) {
      return alc.a(me.aO, ald.b($$0));
   }

   public static void a(qg<egp<?>> $$0) {
      jt<dku> $$1 = $$0.a(me.f);
      $$0.a(
         a,
         egr.a
            .a(
               new egn(
                  0.15F,
                  enq.a(eff.b(8), eff.a(180)),
                  bta.b(0.1F, 0.9F),
                  eff.b(8),
                  egl.a(false, dkw.pu.m()),
                  $$1.b(awz.bk),
                  bta.b(0.7F, 1.4F),
                  bta.b(0.8F, 1.3F),
                  bta.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         egr.a
            .a(
               new egn(
                  0.07F,
                  enq.a(eff.b(8), eff.a(47)),
                  bta.b(0.1F, 0.9F),
                  eff.b(8),
                  egl.a(false, dkw.gR.m()),
                  $$1.b(awz.bk),
                  bta.b(0.7F, 1.4F),
                  bta.b(0.8F, 1.3F),
                  bta.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         egr.c
            .a(
               new egi(
                  0.01F,
                  enq.a(eff.a(10), eff.a(67)),
                  bsr.a(3.0F),
                  eff.b(8),
                  egl.a(false, dkw.pv.m()),
                  $$1.b(awz.bk),
                  bta.b(-0.125F, 0.125F),
                  new egi.a(bta.b(0.75F, 1.0F), bsz.a(0.0F, 6.0F, 2.0F), 3, bta.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, egr.b.a(new egn(0.2F, enq.a(eff.a(0), eff.c(1)), bsr.a(0.5F), eff.b(10), $$1.b(awz.bl), bsr.a(1.0F), bsr.a(1.0F), bsr.a(-0.7F))));
   }
}
