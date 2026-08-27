public class nn {
   public static final aeq<dmm<?>> a = a("cave");
   public static final aeq<dmm<?>> b = a("cave_extra_underground");
   public static final aeq<dmm<?>> c = a("canyon");
   public static final aeq<dmm<?>> d = a("nether_cave");

   private static aeq<dmm<?>> a(String $$0) {
      return aeq.a(jc.ar, new aer($$0));
   }

   public static void a(nm<dmm<?>> $$0) {
      hf<csm> $$1 = $$0.a(jc.e);
      $$0.a(
         a,
         dmo.a
            .a(
               new dmk(
                  0.15F,
                  dtj.a(dld.b(8), dld.a(180)),
                  bga.b(0.1F, 0.9F),
                  dld.b(8),
                  dmi.a(false, csn.oS.n()),
                  $$1.b(apl.bh),
                  bga.b(0.7F, 1.4F),
                  bga.b(0.8F, 1.3F),
                  bga.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dmo.a
            .a(
               new dmk(
                  0.07F,
                  dtj.a(dld.b(8), dld.a(47)),
                  bga.b(0.1F, 0.9F),
                  dld.b(8),
                  dmi.a(false, csn.gv.n()),
                  $$1.b(apl.bh),
                  bga.b(0.7F, 1.4F),
                  bga.b(0.8F, 1.3F),
                  bga.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dmo.c
            .a(
               new dmf(
                  0.01F,
                  dtj.a(dld.a(10), dld.a(67)),
                  bfr.a(3.0F),
                  dld.b(8),
                  dmi.a(false, csn.oT.n()),
                  $$1.b(apl.bh),
                  bga.b(-0.125F, 0.125F),
                  new dmf.a(bga.b(0.75F, 1.0F), bfz.a(0.0F, 6.0F, 2.0F), 3, bga.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dmo.b.a(new dmk(0.2F, dtj.a(dld.a(0), dld.c(1)), bfr.a(0.5F), dld.b(10), $$1.b(apl.bi), bfr.a(1.0F), bfr.a(1.0F), bfr.a(-0.7F))));
   }
}
