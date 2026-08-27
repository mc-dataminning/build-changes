public class nn {
   public static final acp<djn<?>> a = a("cave");
   public static final acp<djn<?>> b = a("cave_extra_underground");
   public static final acp<djn<?>> c = a("canyon");
   public static final acp<djn<?>> d = a("nether_cave");

   private static acp<djn<?>> a(String $$0) {
      return acp.a(jc.ar, new acq($$0));
   }

   public static void a(nm<djn<?>> $$0) {
      hf<cpn> $$1 = $$0.a(jc.e);
      $$0.a(
         a,
         djp.a
            .a(
               new djl(
                  0.15F,
                  dqk.a(die.b(8), die.a(180)),
                  bdh.b(0.1F, 0.9F),
                  die.b(8),
                  djj.a(false, cpo.oS.n()),
                  $$1.b(amw.bg),
                  bdh.b(0.7F, 1.4F),
                  bdh.b(0.8F, 1.3F),
                  bdh.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         djp.a
            .a(
               new djl(
                  0.07F,
                  dqk.a(die.b(8), die.a(47)),
                  bdh.b(0.1F, 0.9F),
                  die.b(8),
                  djj.a(false, cpo.gv.n()),
                  $$1.b(amw.bg),
                  bdh.b(0.7F, 1.4F),
                  bdh.b(0.8F, 1.3F),
                  bdh.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         djp.c
            .a(
               new djg(
                  0.01F,
                  dqk.a(die.a(10), die.a(67)),
                  bcy.a(3.0F),
                  die.b(8),
                  djj.a(false, cpo.oT.n()),
                  $$1.b(amw.bg),
                  bdh.b(-0.125F, 0.125F),
                  new djg.a(bdh.b(0.75F, 1.0F), bdg.a(0.0F, 6.0F, 2.0F), 3, bdh.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, djp.b.a(new djl(0.2F, dqk.a(die.a(0), die.c(1)), bcy.a(0.5F), die.b(10), $$1.b(amw.bh), bcy.a(1.0F), bcy.a(1.0F), bcy.a(-0.7F))));
   }
}
