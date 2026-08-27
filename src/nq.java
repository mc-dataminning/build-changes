public class nq {
   public static final aet<dmq<?>> a = a("cave");
   public static final aet<dmq<?>> b = a("cave_extra_underground");
   public static final aet<dmq<?>> c = a("canyon");
   public static final aet<dmq<?>> d = a("nether_cave");

   private static aet<dmq<?>> a(String $$0) {
      return aet.a(je.ar, new aeu($$0));
   }

   public static void a(np<dmq<?>> $$0) {
      hh<csq> $$1 = $$0.a(je.e);
      $$0.a(
         a,
         dms.a
            .a(
               new dmo(
                  0.15F,
                  dtn.a(dlh.b(8), dlh.a(180)),
                  bgd.b(0.1F, 0.9F),
                  dlh.b(8),
                  dmm.a(false, csr.oS.n()),
                  $$1.b(apo.bh),
                  bgd.b(0.7F, 1.4F),
                  bgd.b(0.8F, 1.3F),
                  bgd.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dms.a
            .a(
               new dmo(
                  0.07F,
                  dtn.a(dlh.b(8), dlh.a(47)),
                  bgd.b(0.1F, 0.9F),
                  dlh.b(8),
                  dmm.a(false, csr.gv.n()),
                  $$1.b(apo.bh),
                  bgd.b(0.7F, 1.4F),
                  bgd.b(0.8F, 1.3F),
                  bgd.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dms.c
            .a(
               new dmj(
                  0.01F,
                  dtn.a(dlh.a(10), dlh.a(67)),
                  bfu.a(3.0F),
                  dlh.b(8),
                  dmm.a(false, csr.oT.n()),
                  $$1.b(apo.bh),
                  bgd.b(-0.125F, 0.125F),
                  new dmj.a(bgd.b(0.75F, 1.0F), bgc.a(0.0F, 6.0F, 2.0F), 3, bgd.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dms.b.a(new dmo(0.2F, dtn.a(dlh.a(0), dlh.c(1)), bfu.a(0.5F), dlh.b(10), $$1.b(apo.bi), bfu.a(1.0F), bfu.a(1.0F), bfu.a(-0.7F))));
   }
}
