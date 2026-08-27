public class py {
   public static final ajs<dwu<?>> a = a("cave");
   public static final ajs<dwu<?>> b = a("cave_extra_underground");
   public static final ajs<dwu<?>> c = a("canyon");
   public static final ajs<dwu<?>> d = a("nether_cave");

   private static ajs<dwu<?>> a(String $$0) {
      return ajs.a(ks.ax, new ajt($$0));
   }

   public static void a(px<dwu<?>> $$0) {
      im<dby> $$1 = $$0.a(ks.f);
      $$0.a(
         a,
         dww.a
            .a(
               new dws(
                  0.15F,
                  edr.a(dvl.b(8), dvl.a(180)),
                  bnk.b(0.1F, 0.9F),
                  dvl.b(8),
                  dwq.a(false, dca.oS.n()),
                  $$1.b(avc.bi),
                  bnk.b(0.7F, 1.4F),
                  bnk.b(0.8F, 1.3F),
                  bnk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dww.a
            .a(
               new dws(
                  0.07F,
                  edr.a(dvl.b(8), dvl.a(47)),
                  bnk.b(0.1F, 0.9F),
                  dvl.b(8),
                  dwq.a(false, dca.gv.n()),
                  $$1.b(avc.bi),
                  bnk.b(0.7F, 1.4F),
                  bnk.b(0.8F, 1.3F),
                  bnk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dww.c
            .a(
               new dwn(
                  0.01F,
                  edr.a(dvl.a(10), dvl.a(67)),
                  bnb.a(3.0F),
                  dvl.b(8),
                  dwq.a(false, dca.oT.n()),
                  $$1.b(avc.bi),
                  bnk.b(-0.125F, 0.125F),
                  new dwn.a(bnk.b(0.75F, 1.0F), bnj.a(0.0F, 6.0F, 2.0F), 3, bnk.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dww.b.a(new dws(0.2F, edr.a(dvl.a(0), dvl.c(1)), bnb.a(0.5F), dvl.b(10), $$1.b(avc.bj), bnb.a(1.0F), bnb.a(1.0F), bnb.a(-0.7F))));
   }
}
