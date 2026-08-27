public class op {
   public static final afv<dnn<?>> a = a("cave");
   public static final afv<dnn<?>> b = a("cave_extra_underground");
   public static final afv<dnn<?>> c = a("canyon");
   public static final afv<dnn<?>> d = a("nether_cave");

   private static afv<dnn<?>> a(String $$0) {
      return afv.a(jz.as, new afw($$0));
   }

   public static void a(oo<dnn<?>> $$0) {
      ic<cua> $$1 = $$0.a(jz.e);
      $$0.a(
         a,
         dnp.a
            .a(
               new dnl(
                  0.15F,
                  duk.a(dme.b(8), dme.a(180)),
                  bhl.b(0.1F, 0.9F),
                  dme.b(8),
                  dnj.a(false, cuc.oS.o()),
                  $$1.b(aqs.bh),
                  bhl.b(0.7F, 1.4F),
                  bhl.b(0.8F, 1.3F),
                  bhl.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dnp.a
            .a(
               new dnl(
                  0.07F,
                  duk.a(dme.b(8), dme.a(47)),
                  bhl.b(0.1F, 0.9F),
                  dme.b(8),
                  dnj.a(false, cuc.gv.o()),
                  $$1.b(aqs.bh),
                  bhl.b(0.7F, 1.4F),
                  bhl.b(0.8F, 1.3F),
                  bhl.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dnp.c
            .a(
               new dng(
                  0.01F,
                  duk.a(dme.a(10), dme.a(67)),
                  bhc.a(3.0F),
                  dme.b(8),
                  dnj.a(false, cuc.oT.o()),
                  $$1.b(aqs.bh),
                  bhl.b(-0.125F, 0.125F),
                  new dng.a(bhl.b(0.75F, 1.0F), bhk.a(0.0F, 6.0F, 2.0F), 3, bhl.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dnp.b.a(new dnl(0.2F, duk.a(dme.a(0), dme.c(1)), bhc.a(0.5F), dme.b(10), $$1.b(aqs.bi), bhc.a(1.0F), bhc.a(1.0F), bhc.a(-0.7F))));
   }
}
