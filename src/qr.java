public class qr {
   public static final aks<eax<?>> a = a("cave");
   public static final aks<eax<?>> b = a("cave_extra_underground");
   public static final aks<eax<?>> c = a("canyon");
   public static final aks<eax<?>> d = a("nether_cave");

   private static aks<eax<?>> a(String $$0) {
      return aks.a(li.aB, new akt($$0));
   }

   public static void a(qq<eax<?>> $$0) {
      jb<dfc> $$1 = $$0.a(li.f);
      $$0.a(
         a,
         eaz.a
            .a(
               new eav(
                  0.15F,
                  eic.a(dzo.b(8), dzo.a(180)),
                  bpk.b(0.1F, 0.9F),
                  dzo.b(8),
                  eat.a(false, dfe.pZ.n()),
                  $$1.b(awe.bk),
                  bpk.b(0.7F, 1.4F),
                  bpk.b(0.8F, 1.3F),
                  bpk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         eaz.a
            .a(
               new eav(
                  0.07F,
                  eic.a(dzo.b(8), dzo.a(47)),
                  bpk.b(0.1F, 0.9F),
                  dzo.b(8),
                  eat.a(false, dfe.hp.n()),
                  $$1.b(awe.bk),
                  bpk.b(0.7F, 1.4F),
                  bpk.b(0.8F, 1.3F),
                  bpk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         eaz.c
            .a(
               new eaq(
                  0.01F,
                  eic.a(dzo.a(10), dzo.a(67)),
                  bpb.a(3.0F),
                  dzo.b(8),
                  eat.a(false, dfe.qa.n()),
                  $$1.b(awe.bk),
                  bpk.b(-0.125F, 0.125F),
                  new eaq.a(bpk.b(0.75F, 1.0F), bpj.a(0.0F, 6.0F, 2.0F), 3, bpk.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, eaz.b.a(new eav(0.2F, eic.a(dzo.a(0), dzo.c(1)), bpb.a(0.5F), dzo.b(10), $$1.b(awe.bl), bpb.a(1.0F), bpb.a(1.0F), bpb.a(-0.7F))));
   }
}
