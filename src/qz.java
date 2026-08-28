public class qz {
   public static final alh<edj<?>> a = a("cave");
   public static final alh<edj<?>> b = a("cave_extra_underground");
   public static final alh<edj<?>> c = a("canyon");
   public static final alh<edj<?>> d = a("nether_cave");

   private static alh<edj<?>> a(String $$0) {
      return alh.a(lz.aI, ali.b($$0));
   }

   public static void a(qy<edj<?>> $$0) {
      jr<die> $$1 = $$0.a(lz.f);
      $$0.a(
         a,
         edl.a
            .a(
               new edh(
                  0.15F,
                  ekh.a(ebz.b(8), ebz.a(180)),
                  brn.b(0.1F, 0.9F),
                  ebz.b(8),
                  edf.a(false, dig.oS.m()),
                  $$1.b(axa.bj),
                  brn.b(0.7F, 1.4F),
                  brn.b(0.8F, 1.3F),
                  brn.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         edl.a
            .a(
               new edh(
                  0.07F,
                  ekh.a(ebz.b(8), ebz.a(47)),
                  brn.b(0.1F, 0.9F),
                  ebz.b(8),
                  edf.a(false, dig.gv.m()),
                  $$1.b(axa.bj),
                  brn.b(0.7F, 1.4F),
                  brn.b(0.8F, 1.3F),
                  brn.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         edl.c
            .a(
               new edc(
                  0.01F,
                  ekh.a(ebz.a(10), ebz.a(67)),
                  bre.a(3.0F),
                  ebz.b(8),
                  edf.a(false, dig.oT.m()),
                  $$1.b(axa.bj),
                  brn.b(-0.125F, 0.125F),
                  new edc.a(brn.b(0.75F, 1.0F), brm.a(0.0F, 6.0F, 2.0F), 3, brn.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, edl.b.a(new edh(0.2F, ekh.a(ebz.a(0), ebz.c(1)), bre.a(0.5F), ebz.b(10), $$1.b(axa.bk), bre.a(1.0F), bre.a(1.0F), bre.a(-0.7F))));
   }
}
