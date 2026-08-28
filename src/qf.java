public class qf {
   public static final akt<eeu<?>> a = a("cave");
   public static final akt<eeu<?>> b = a("cave_extra_underground");
   public static final akt<eeu<?>> c = a("canyon");
   public static final akt<eeu<?>> d = a("nether_cave");

   private static akt<eeu<?>> a(String $$0) {
      return akt.a(mc.aK, aku.b($$0));
   }

   public static void a(qe<eeu<?>> $$0) {
      js<djk> $$1 = $$0.a(mc.f);
      $$0.a(
         a,
         eew.a
            .a(
               new ees(
                  0.15F,
                  elu.a(edk.b(8), edk.a(180)),
                  brs.b(0.1F, 0.9F),
                  edk.b(8),
                  eeq.a(false, djm.pu.m()),
                  $$1.b(awo.bk),
                  brs.b(0.7F, 1.4F),
                  brs.b(0.8F, 1.3F),
                  brs.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eew.a
            .a(
               new ees(
                  0.07F,
                  elu.a(edk.b(8), edk.a(47)),
                  brs.b(0.1F, 0.9F),
                  edk.b(8),
                  eeq.a(false, djm.gR.m()),
                  $$1.b(awo.bk),
                  brs.b(0.7F, 1.4F),
                  brs.b(0.8F, 1.3F),
                  brs.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eew.c
            .a(
               new een(
                  0.01F,
                  elu.a(edk.a(10), edk.a(67)),
                  brj.a(3.0F),
                  edk.b(8),
                  eeq.a(false, djm.pv.m()),
                  $$1.b(awo.bk),
                  brs.b(-0.125F, 0.125F),
                  new een.a(brs.b(0.75F, 1.0F), brr.a(0.0F, 6.0F, 2.0F), 3, brs.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eew.b.a(new ees(0.2F, elu.a(edk.a(0), edk.c(1)), brj.a(0.5F), edk.b(10), $$1.b(awo.bl), brj.a(1.0F), brj.a(1.0F), brj.a(-0.7F))));
   }
}
