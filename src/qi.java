public class qi {
   public static final alf<eik<?>> a = a("cave");
   public static final alf<eik<?>> b = a("cave_extra_underground");
   public static final alf<eik<?>> c = a("canyon");
   public static final alf<eik<?>> d = a("nether_cave");

   private static alf<eik<?>> a(String $$0) {
      return alf.a(mg.aK, alg.b($$0));
   }

   public static void a(qh<eik<?>> $$0) {
      jf<dmf> $$1 = $$0.a(mg.i);
      $$0.a(
         a,
         eim.a
            .a(
               new eii(
                  0.15F,
                  epl.a(eha.b(8), eha.a(180)),
                  btn.b(0.1F, 0.9F),
                  eha.b(8),
                  eig.a(false, dmh.py.m()),
                  $$1.b(axc.bl),
                  btn.b(0.7F, 1.4F),
                  btn.b(0.8F, 1.3F),
                  btn.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eim.a
            .a(
               new eii(
                  0.07F,
                  epl.a(eha.b(8), eha.a(47)),
                  btn.b(0.1F, 0.9F),
                  eha.b(8),
                  eig.a(false, dmh.gV.m()),
                  $$1.b(axc.bl),
                  btn.b(0.7F, 1.4F),
                  btn.b(0.8F, 1.3F),
                  btn.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eim.c
            .a(
               new eid(
                  0.01F,
                  epl.a(eha.a(10), eha.a(67)),
                  bte.a(3.0F),
                  eha.b(8),
                  eig.a(false, dmh.pz.m()),
                  $$1.b(axc.bl),
                  btn.b(-0.125F, 0.125F),
                  new eid.a(btn.b(0.75F, 1.0F), btm.a(0.0F, 6.0F, 2.0F), 3, btn.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eim.b.a(new eii(0.2F, epl.a(eha.a(0), eha.c(1)), bte.a(0.5F), eha.b(10), $$1.b(axc.bm), bte.a(1.0F), bte.a(1.0F), bte.a(-0.7F))));
   }
}
