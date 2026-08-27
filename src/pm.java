public class pm {
   public static final ajg<dup<?>> a = a("cave");
   public static final ajg<dup<?>> b = a("cave_extra_underground");
   public static final ajg<dup<?>> c = a("canyon");
   public static final ajg<dup<?>> d = a("nether_cave");

   private static ajg<dup<?>> a(String $$0) {
      return ajg.a(kj.aw, new ajh($$0));
   }

   public static void a(pl<dup<?>> $$0) {
      im<daa> $$1 = $$0.a(kj.f);
      $$0.a(
         a,
         dur.a
            .a(
               new dun(
                  0.15F,
                  ebm.a(dtg.b(8), dtg.a(180)),
                  bmm.b(0.1F, 0.9F),
                  dtg.b(8),
                  dul.a(false, dac.oS.o()),
                  $$1.b(aun.bi),
                  bmm.b(0.7F, 1.4F),
                  bmm.b(0.8F, 1.3F),
                  bmm.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dur.a
            .a(
               new dun(
                  0.07F,
                  ebm.a(dtg.b(8), dtg.a(47)),
                  bmm.b(0.1F, 0.9F),
                  dtg.b(8),
                  dul.a(false, dac.gv.o()),
                  $$1.b(aun.bi),
                  bmm.b(0.7F, 1.4F),
                  bmm.b(0.8F, 1.3F),
                  bmm.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dur.c
            .a(
               new dui(
                  0.01F,
                  ebm.a(dtg.a(10), dtg.a(67)),
                  bmd.a(3.0F),
                  dtg.b(8),
                  dul.a(false, dac.oT.o()),
                  $$1.b(aun.bi),
                  bmm.b(-0.125F, 0.125F),
                  new dui.a(bmm.b(0.75F, 1.0F), bml.a(0.0F, 6.0F, 2.0F), 3, bmm.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dur.b.a(new dun(0.2F, ebm.a(dtg.a(0), dtg.c(1)), bmd.a(0.5F), dtg.b(10), $$1.b(aun.bj), bmd.a(1.0F), bmd.a(1.0F), bmd.a(-0.7F))));
   }
}
