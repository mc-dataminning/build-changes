public class rl {
   public static final aly<efu<?>> a = a("cave");
   public static final aly<efu<?>> b = a("cave_extra_underground");
   public static final aly<efu<?>> c = a("canyon");
   public static final aly<efu<?>> d = a("nether_cave");

   private static aly<efu<?>> a(String $$0) {
      return aly.a(mb.aK, alz.b($$0));
   }

   public static void a(rk<efu<?>> $$0) {
      jr<dkm> $$1 = $$0.a(mb.f);
      $$0.a(
         a,
         efw.a
            .a(
               new efs(
                  0.15F,
                  emu.a(eek.b(8), eek.a(180)),
                  bst.b(0.1F, 0.9F),
                  eek.b(8),
                  efq.a(false, dko.pn.m()),
                  $$1.b(axu.bk),
                  bst.b(0.7F, 1.4F),
                  bst.b(0.8F, 1.3F),
                  bst.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         efw.a
            .a(
               new efs(
                  0.07F,
                  emu.a(eek.b(8), eek.a(47)),
                  bst.b(0.1F, 0.9F),
                  eek.b(8),
                  efq.a(false, dko.gK.m()),
                  $$1.b(axu.bk),
                  bst.b(0.7F, 1.4F),
                  bst.b(0.8F, 1.3F),
                  bst.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         efw.c
            .a(
               new efn(
                  0.01F,
                  emu.a(eek.a(10), eek.a(67)),
                  bsk.a(3.0F),
                  eek.b(8),
                  efq.a(false, dko.po.m()),
                  $$1.b(axu.bk),
                  bst.b(-0.125F, 0.125F),
                  new efn.a(bst.b(0.75F, 1.0F), bss.a(0.0F, 6.0F, 2.0F), 3, bst.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, efw.b.a(new efs(0.2F, emu.a(eek.a(0), eek.c(1)), bsk.a(0.5F), eek.b(10), $$1.b(axu.bl), bsk.a(1.0F), bsk.a(1.0F), bsk.a(-0.7F))));
   }
}
