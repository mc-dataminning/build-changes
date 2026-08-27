public class no {
   public static final aeo<dmk<?>> a = a("cave");
   public static final aeo<dmk<?>> b = a("cave_extra_underground");
   public static final aeo<dmk<?>> c = a("canyon");
   public static final aeo<dmk<?>> d = a("nether_cave");

   private static aeo<dmk<?>> a(String $$0) {
      return aeo.a(jd.ar, new aep($$0));
   }

   public static void a(nn<dmk<?>> $$0) {
      hg<csk> $$1 = $$0.a(jd.e);
      $$0.a(
         a,
         dmm.a
            .a(
               new dmi(
                  0.15F,
                  dth.a(dlb.b(8), dlb.a(180)),
                  bfy.b(0.1F, 0.9F),
                  dlb.b(8),
                  dmg.a(false, csl.oS.n()),
                  $$1.b(apj.bh),
                  bfy.b(0.7F, 1.4F),
                  bfy.b(0.8F, 1.3F),
                  bfy.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dmm.a
            .a(
               new dmi(
                  0.07F,
                  dth.a(dlb.b(8), dlb.a(47)),
                  bfy.b(0.1F, 0.9F),
                  dlb.b(8),
                  dmg.a(false, csl.gv.n()),
                  $$1.b(apj.bh),
                  bfy.b(0.7F, 1.4F),
                  bfy.b(0.8F, 1.3F),
                  bfy.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dmm.c
            .a(
               new dmd(
                  0.01F,
                  dth.a(dlb.a(10), dlb.a(67)),
                  bfp.a(3.0F),
                  dlb.b(8),
                  dmg.a(false, csl.oT.n()),
                  $$1.b(apj.bh),
                  bfy.b(-0.125F, 0.125F),
                  new dmd.a(bfy.b(0.75F, 1.0F), bfx.a(0.0F, 6.0F, 2.0F), 3, bfy.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dmm.b.a(new dmi(0.2F, dth.a(dlb.a(0), dlb.c(1)), bfp.a(0.5F), dlb.b(10), $$1.b(apj.bi), bfp.a(1.0F), bfp.a(1.0F), bfp.a(-0.7F))));
   }
}
