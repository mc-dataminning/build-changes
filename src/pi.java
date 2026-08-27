public class pi {
   public static final aix<dsr<?>> a = a("cave");
   public static final aix<dsr<?>> b = a("cave_extra_underground");
   public static final aix<dsr<?>> c = a("canyon");
   public static final aix<dsr<?>> d = a("nether_cave");

   private static aix<dsr<?>> a(String $$0) {
      return aix.a(kg.av, new aiy($$0));
   }

   public static void a(ph<dsr<?>> $$0) {
      ik<cyo> $$1 = $$0.a(kg.f);
      $$0.a(
         a,
         dst.a
            .a(
               new dsp(
                  0.15F,
                  dzo.a(dri.b(8), dri.a(180)),
                  ble.b(0.1F, 0.9F),
                  dri.b(8),
                  dsn.a(false, cyq.oS.o()),
                  $$1.b(atz.bh),
                  ble.b(0.7F, 1.4F),
                  ble.b(0.8F, 1.3F),
                  ble.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dst.a
            .a(
               new dsp(
                  0.07F,
                  dzo.a(dri.b(8), dri.a(47)),
                  ble.b(0.1F, 0.9F),
                  dri.b(8),
                  dsn.a(false, cyq.gv.o()),
                  $$1.b(atz.bh),
                  ble.b(0.7F, 1.4F),
                  ble.b(0.8F, 1.3F),
                  ble.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dst.c
            .a(
               new dsk(
                  0.01F,
                  dzo.a(dri.a(10), dri.a(67)),
                  bkv.a(3.0F),
                  dri.b(8),
                  dsn.a(false, cyq.oT.o()),
                  $$1.b(atz.bh),
                  ble.b(-0.125F, 0.125F),
                  new dsk.a(ble.b(0.75F, 1.0F), bld.a(0.0F, 6.0F, 2.0F), 3, ble.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dst.b.a(new dsp(0.2F, dzo.a(dri.a(0), dri.c(1)), bkv.a(0.5F), dri.b(10), $$1.b(atz.bi), bkv.a(1.0F), bkv.a(1.0F), bkv.a(-0.7F))));
   }
}
