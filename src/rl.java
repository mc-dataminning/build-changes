public class rl {
   public static final aly<eft<?>> a = a("cave");
   public static final aly<eft<?>> b = a("cave_extra_underground");
   public static final aly<eft<?>> c = a("canyon");
   public static final aly<eft<?>> d = a("nether_cave");

   private static aly<eft<?>> a(String $$0) {
      return aly.a(mb.aK, alz.b($$0));
   }

   public static void a(rk<eft<?>> $$0) {
      jr<dkl> $$1 = $$0.a(mb.f);
      $$0.a(
         a,
         efv.a
            .a(
               new efr(
                  0.15F,
                  emt.a(eej.b(8), eej.a(180)),
                  bss.b(0.1F, 0.9F),
                  eej.b(8),
                  efp.a(false, dkn.pn.m()),
                  $$1.b(axu.bk),
                  bss.b(0.7F, 1.4F),
                  bss.b(0.8F, 1.3F),
                  bss.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         efv.a
            .a(
               new efr(
                  0.07F,
                  emt.a(eej.b(8), eej.a(47)),
                  bss.b(0.1F, 0.9F),
                  eej.b(8),
                  efp.a(false, dkn.gK.m()),
                  $$1.b(axu.bk),
                  bss.b(0.7F, 1.4F),
                  bss.b(0.8F, 1.3F),
                  bss.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         efv.c
            .a(
               new efm(
                  0.01F,
                  emt.a(eej.a(10), eej.a(67)),
                  bsj.a(3.0F),
                  eej.b(8),
                  efp.a(false, dkn.po.m()),
                  $$1.b(axu.bk),
                  bss.b(-0.125F, 0.125F),
                  new efm.a(bss.b(0.75F, 1.0F), bsr.a(0.0F, 6.0F, 2.0F), 3, bss.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, efv.b.a(new efr(0.2F, emt.a(eej.a(0), eej.c(1)), bsj.a(0.5F), eej.b(10), $$1.b(axu.bl), bsj.a(1.0F), bsj.a(1.0F), bsj.a(-0.7F))));
   }
}
