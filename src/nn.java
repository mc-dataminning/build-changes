public class nn {
   public static final aeq<dml<?>> a = a("cave");
   public static final aeq<dml<?>> b = a("cave_extra_underground");
   public static final aeq<dml<?>> c = a("canyon");
   public static final aeq<dml<?>> d = a("nether_cave");

   private static aeq<dml<?>> a(String $$0) {
      return aeq.a(jc.ar, new aer($$0));
   }

   public static void a(nm<dml<?>> $$0) {
      hf<csl> $$1 = $$0.a(jc.e);
      $$0.a(
         a,
         dmn.a
            .a(
               new dmj(
                  0.15F,
                  dti.a(dlc.b(8), dlc.a(180)),
                  bga.b(0.1F, 0.9F),
                  dlc.b(8),
                  dmh.a(false, csm.oS.n()),
                  $$1.b(apl.bh),
                  bga.b(0.7F, 1.4F),
                  bga.b(0.8F, 1.3F),
                  bga.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dmn.a
            .a(
               new dmj(
                  0.07F,
                  dti.a(dlc.b(8), dlc.a(47)),
                  bga.b(0.1F, 0.9F),
                  dlc.b(8),
                  dmh.a(false, csm.gv.n()),
                  $$1.b(apl.bh),
                  bga.b(0.7F, 1.4F),
                  bga.b(0.8F, 1.3F),
                  bga.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dmn.c
            .a(
               new dme(
                  0.01F,
                  dti.a(dlc.a(10), dlc.a(67)),
                  bfr.a(3.0F),
                  dlc.b(8),
                  dmh.a(false, csm.oT.n()),
                  $$1.b(apl.bh),
                  bga.b(-0.125F, 0.125F),
                  new dme.a(bga.b(0.75F, 1.0F), bfz.a(0.0F, 6.0F, 2.0F), 3, bga.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dmn.b.a(new dmj(0.2F, dti.a(dlc.a(0), dlc.c(1)), bfr.a(0.5F), dlc.b(10), $$1.b(apl.bi), bfr.a(1.0F), bfr.a(1.0F), bfr.a(-0.7F))));
   }
}
