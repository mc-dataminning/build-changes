public class rd {
   public static final ala<dzs<?>> a = a("cave");
   public static final ala<dzs<?>> b = a("cave_extra_underground");
   public static final ala<dzs<?>> c = a("canyon");
   public static final ala<dzs<?>> d = a("nether_cave");

   private static ala<dzs<?>> a(String $$0) {
      return ala.a(lq.aB, new alb($$0));
   }

   public static void a(rc<dzs<?>> $$0) {
      jj<deu> $$1 = $$0.a(lq.f);
      $$0.a(
         a,
         dzu.a
            .a(
               new dzq(
                  0.15F,
                  egp.a(dyj.b(8), dyj.a(180)),
                  bpz.b(0.1F, 0.9F),
                  dyj.b(8),
                  dzo.a(false, dew.oS.n()),
                  $$1.b(awl.bi),
                  bpz.b(0.7F, 1.4F),
                  bpz.b(0.8F, 1.3F),
                  bpz.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dzu.a
            .a(
               new dzq(
                  0.07F,
                  egp.a(dyj.b(8), dyj.a(47)),
                  bpz.b(0.1F, 0.9F),
                  dyj.b(8),
                  dzo.a(false, dew.gv.n()),
                  $$1.b(awl.bi),
                  bpz.b(0.7F, 1.4F),
                  bpz.b(0.8F, 1.3F),
                  bpz.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dzu.c
            .a(
               new dzl(
                  0.01F,
                  egp.a(dyj.a(10), dyj.a(67)),
                  bpq.a(3.0F),
                  dyj.b(8),
                  dzo.a(false, dew.oT.n()),
                  $$1.b(awl.bi),
                  bpz.b(-0.125F, 0.125F),
                  new dzl.a(bpz.b(0.75F, 1.0F), bpy.a(0.0F, 6.0F, 2.0F), 3, bpz.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dzu.b.a(new dzq(0.2F, egp.a(dyj.a(0), dyj.c(1)), bpq.a(0.5F), dyj.b(10), $$1.b(awl.bj), bpq.a(1.0F), bpq.a(1.0F), bpq.a(-0.7F))));
   }
}
