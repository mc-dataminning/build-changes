public class pk {
   public static final ajb<dtt<?>> a = a("cave");
   public static final ajb<dtt<?>> b = a("cave_extra_underground");
   public static final ajb<dtt<?>> c = a("canyon");
   public static final ajb<dtt<?>> d = a("nether_cave");

   private static ajb<dtt<?>> a(String $$0) {
      return ajb.a(ki.aw, new ajc($$0));
   }

   public static void a(pj<dtt<?>> $$0) {
      im<czf> $$1 = $$0.a(ki.f);
      $$0.a(
         a,
         dtv.a
            .a(
               new dtr(
                  0.15F,
                  eaq.a(dsk.b(8), dsk.a(180)),
                  blv.b(0.1F, 0.9F),
                  dsk.b(8),
                  dtp.a(false, czh.oS.o()),
                  $$1.b(aue.bh),
                  blv.b(0.7F, 1.4F),
                  blv.b(0.8F, 1.3F),
                  blv.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dtv.a
            .a(
               new dtr(
                  0.07F,
                  eaq.a(dsk.b(8), dsk.a(47)),
                  blv.b(0.1F, 0.9F),
                  dsk.b(8),
                  dtp.a(false, czh.gv.o()),
                  $$1.b(aue.bh),
                  blv.b(0.7F, 1.4F),
                  blv.b(0.8F, 1.3F),
                  blv.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dtv.c
            .a(
               new dtm(
                  0.01F,
                  eaq.a(dsk.a(10), dsk.a(67)),
                  blm.a(3.0F),
                  dsk.b(8),
                  dtp.a(false, czh.oT.o()),
                  $$1.b(aue.bh),
                  blv.b(-0.125F, 0.125F),
                  new dtm.a(blv.b(0.75F, 1.0F), blu.a(0.0F, 6.0F, 2.0F), 3, blv.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dtv.b.a(new dtr(0.2F, eaq.a(dsk.a(0), dsk.c(1)), blm.a(0.5F), dsk.b(10), $$1.b(aue.bi), blm.a(1.0F), blm.a(1.0F), blm.a(-0.7F))));
   }
}
