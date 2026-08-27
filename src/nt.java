public class nt {
   public static final aew<dmv<?>> a = a("cave");
   public static final aew<dmv<?>> b = a("cave_extra_underground");
   public static final aew<dmv<?>> c = a("canyon");
   public static final aew<dmv<?>> d = a("nether_cave");

   private static aew<dmv<?>> a(String $$0) {
      return aew.a(je.ar, new aex($$0));
   }

   public static void a(ns<dmv<?>> $$0) {
      hh<csv> $$1 = $$0.a(je.e);
      $$0.a(
         a,
         dmx.a
            .a(
               new dmt(
                  0.15F,
                  dts.a(dlm.b(8), dlm.a(180)),
                  bgi.b(0.1F, 0.9F),
                  dlm.b(8),
                  dmr.a(false, csw.oS.n()),
                  $$1.b(apt.bh),
                  bgi.b(0.7F, 1.4F),
                  bgi.b(0.8F, 1.3F),
                  bgi.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dmx.a
            .a(
               new dmt(
                  0.07F,
                  dts.a(dlm.b(8), dlm.a(47)),
                  bgi.b(0.1F, 0.9F),
                  dlm.b(8),
                  dmr.a(false, csw.gv.n()),
                  $$1.b(apt.bh),
                  bgi.b(0.7F, 1.4F),
                  bgi.b(0.8F, 1.3F),
                  bgi.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dmx.c
            .a(
               new dmo(
                  0.01F,
                  dts.a(dlm.a(10), dlm.a(67)),
                  bfz.a(3.0F),
                  dlm.b(8),
                  dmr.a(false, csw.oT.n()),
                  $$1.b(apt.bh),
                  bgi.b(-0.125F, 0.125F),
                  new dmo.a(bgi.b(0.75F, 1.0F), bgh.a(0.0F, 6.0F, 2.0F), 3, bgi.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dmx.b.a(new dmt(0.2F, dts.a(dlm.a(0), dlm.c(1)), bfz.a(0.5F), dlm.b(10), $$1.b(apt.bi), bfz.a(1.0F), bfz.a(1.0F), bfz.a(-0.7F))));
   }
}
