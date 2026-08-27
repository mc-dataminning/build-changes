public class nu {
   public static final aex<dmx<?>> a = a("cave");
   public static final aex<dmx<?>> b = a("cave_extra_underground");
   public static final aex<dmx<?>> c = a("canyon");
   public static final aex<dmx<?>> d = a("nether_cave");

   private static aex<dmx<?>> a(String $$0) {
      return aex.a(je.ar, new aey($$0));
   }

   public static void a(nt<dmx<?>> $$0) {
      hh<csx> $$1 = $$0.a(je.e);
      $$0.a(
         a,
         dmz.a
            .a(
               new dmv(
                  0.15F,
                  dtu.a(dlo.b(8), dlo.a(180)),
                  bgk.b(0.1F, 0.9F),
                  dlo.b(8),
                  dmt.a(false, csy.oS.n()),
                  $$1.b(apu.bh),
                  bgk.b(0.7F, 1.4F),
                  bgk.b(0.8F, 1.3F),
                  bgk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dmz.a
            .a(
               new dmv(
                  0.07F,
                  dtu.a(dlo.b(8), dlo.a(47)),
                  bgk.b(0.1F, 0.9F),
                  dlo.b(8),
                  dmt.a(false, csy.gv.n()),
                  $$1.b(apu.bh),
                  bgk.b(0.7F, 1.4F),
                  bgk.b(0.8F, 1.3F),
                  bgk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dmz.c
            .a(
               new dmq(
                  0.01F,
                  dtu.a(dlo.a(10), dlo.a(67)),
                  bgb.a(3.0F),
                  dlo.b(8),
                  dmt.a(false, csy.oT.n()),
                  $$1.b(apu.bh),
                  bgk.b(-0.125F, 0.125F),
                  new dmq.a(bgk.b(0.75F, 1.0F), bgj.a(0.0F, 6.0F, 2.0F), 3, bgk.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dmz.b.a(new dmv(0.2F, dtu.a(dlo.a(0), dlo.c(1)), bgb.a(0.5F), dlo.b(10), $$1.b(apu.bi), bgb.a(1.0F), bgb.a(1.0F), bgb.a(-0.7F))));
   }
}
