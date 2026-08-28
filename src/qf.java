public class qf {
   public static final aku<eex<?>> a = a("cave");
   public static final aku<eex<?>> b = a("cave_extra_underground");
   public static final aku<eex<?>> c = a("canyon");
   public static final aku<eex<?>> d = a("nether_cave");

   private static aku<eex<?>> a(String $$0) {
      return aku.a(mc.aK, akv.b($$0));
   }

   public static void a(qe<eex<?>> $$0) {
      js<djn> $$1 = $$0.a(mc.f);
      $$0.a(
         a,
         eez.a
            .a(
               new eev(
                  0.15F,
                  elx.a(edn.b(8), edn.a(180)),
                  brv.b(0.1F, 0.9F),
                  edn.b(8),
                  eet.a(false, djp.pu.m()),
                  $$1.b(awp.bk),
                  brv.b(0.7F, 1.4F),
                  brv.b(0.8F, 1.3F),
                  brv.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eez.a
            .a(
               new eev(
                  0.07F,
                  elx.a(edn.b(8), edn.a(47)),
                  brv.b(0.1F, 0.9F),
                  edn.b(8),
                  eet.a(false, djp.gR.m()),
                  $$1.b(awp.bk),
                  brv.b(0.7F, 1.4F),
                  brv.b(0.8F, 1.3F),
                  brv.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eez.c
            .a(
               new eeq(
                  0.01F,
                  elx.a(edn.a(10), edn.a(67)),
                  brm.a(3.0F),
                  edn.b(8),
                  eet.a(false, djp.pv.m()),
                  $$1.b(awp.bk),
                  brv.b(-0.125F, 0.125F),
                  new eeq.a(brv.b(0.75F, 1.0F), bru.a(0.0F, 6.0F, 2.0F), 3, brv.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eez.b.a(new eev(0.2F, elx.a(edn.a(0), edn.c(1)), brm.a(0.5F), edn.b(10), $$1.b(awp.bl), brm.a(1.0F), brm.a(1.0F), brm.a(-0.7F))));
   }
}
