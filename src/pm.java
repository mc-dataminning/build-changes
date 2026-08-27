public class pm {
   public static final ajg<dur<?>> a = a("cave");
   public static final ajg<dur<?>> b = a("cave_extra_underground");
   public static final ajg<dur<?>> c = a("canyon");
   public static final ajg<dur<?>> d = a("nether_cave");

   private static ajg<dur<?>> a(String $$0) {
      return ajg.a(kj.aw, new ajh($$0));
   }

   public static void a(pl<dur<?>> $$0) {
      im<dac> $$1 = $$0.a(kj.f);
      $$0.a(
         a,
         dut.a
            .a(
               new dup(
                  0.15F,
                  ebo.a(dti.b(8), dti.a(180)),
                  bmn.b(0.1F, 0.9F),
                  dti.b(8),
                  dun.a(false, dae.oS.o()),
                  $$1.b(aun.bi),
                  bmn.b(0.7F, 1.4F),
                  bmn.b(0.8F, 1.3F),
                  bmn.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dut.a
            .a(
               new dup(
                  0.07F,
                  ebo.a(dti.b(8), dti.a(47)),
                  bmn.b(0.1F, 0.9F),
                  dti.b(8),
                  dun.a(false, dae.gv.o()),
                  $$1.b(aun.bi),
                  bmn.b(0.7F, 1.4F),
                  bmn.b(0.8F, 1.3F),
                  bmn.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dut.c
            .a(
               new duk(
                  0.01F,
                  ebo.a(dti.a(10), dti.a(67)),
                  bme.a(3.0F),
                  dti.b(8),
                  dun.a(false, dae.oT.o()),
                  $$1.b(aun.bi),
                  bmn.b(-0.125F, 0.125F),
                  new duk.a(bmn.b(0.75F, 1.0F), bmm.a(0.0F, 6.0F, 2.0F), 3, bmn.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dut.b.a(new dup(0.2F, ebo.a(dti.a(0), dti.c(1)), bme.a(0.5F), dti.b(10), $$1.b(aun.bj), bme.a(1.0F), bme.a(1.0F), bme.a(-0.7F))));
   }
}
