public class pb {
   public static final ags<dqb<?>> a = a("cave");
   public static final ags<dqb<?>> b = a("cave_extra_underground");
   public static final ags<dqb<?>> c = a("canyon");
   public static final ags<dqb<?>> d = a("nether_cave");

   private static ags<dqb<?>> a(String $$0) {
      return ags.a(kc.au, new agt($$0));
   }

   public static void a(pa<dqb<?>> $$0) {
      ig<cvz> $$1 = $$0.a(kc.f);
      $$0.a(
         a,
         dqd.a
            .a(
               new dpz(
                  0.15F,
                  dwy.a(dos.b(8), dos.a(180)),
                  biv.b(0.1F, 0.9F),
                  dos.b(8),
                  dpx.a(false, cwb.oS.o()),
                  $$1.b(arr.bh),
                  biv.b(0.7F, 1.4F),
                  biv.b(0.8F, 1.3F),
                  biv.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dqd.a
            .a(
               new dpz(
                  0.07F,
                  dwy.a(dos.b(8), dos.a(47)),
                  biv.b(0.1F, 0.9F),
                  dos.b(8),
                  dpx.a(false, cwb.gv.o()),
                  $$1.b(arr.bh),
                  biv.b(0.7F, 1.4F),
                  biv.b(0.8F, 1.3F),
                  biv.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dqd.c
            .a(
               new dpu(
                  0.01F,
                  dwy.a(dos.a(10), dos.a(67)),
                  bim.a(3.0F),
                  dos.b(8),
                  dpx.a(false, cwb.oT.o()),
                  $$1.b(arr.bh),
                  biv.b(-0.125F, 0.125F),
                  new dpu.a(biv.b(0.75F, 1.0F), biu.a(0.0F, 6.0F, 2.0F), 3, biv.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dqd.b.a(new dpz(0.2F, dwy.a(dos.a(0), dos.c(1)), bim.a(0.5F), dos.b(10), $$1.b(arr.bi), bim.a(1.0F), bim.a(1.0F), bim.a(-0.7F))));
   }
}
