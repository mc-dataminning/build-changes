public class ns {
   public static final aey<dmp<?>> a = a("cave");
   public static final aey<dmp<?>> b = a("cave_extra_underground");
   public static final aey<dmp<?>> c = a("canyon");
   public static final aey<dmp<?>> d = a("nether_cave");

   private static aey<dmp<?>> a(String $$0) {
      return aey.a(jc.as, new aez($$0));
   }

   public static void a(nr<dmp<?>> $$0) {
      hf<ctc> $$1 = $$0.a(jc.e);
      $$0.a(
         a,
         dmr.a
            .a(
               new dmn(
                  0.15F,
                  dtm.a(dlg.b(8), dlg.a(180)),
                  bgo.b(0.1F, 0.9F),
                  dlg.b(8),
                  dml.a(false, cte.oS.o()),
                  $$1.b(apv.bh),
                  bgo.b(0.7F, 1.4F),
                  bgo.b(0.8F, 1.3F),
                  bgo.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dmr.a
            .a(
               new dmn(
                  0.07F,
                  dtm.a(dlg.b(8), dlg.a(47)),
                  bgo.b(0.1F, 0.9F),
                  dlg.b(8),
                  dml.a(false, cte.gv.o()),
                  $$1.b(apv.bh),
                  bgo.b(0.7F, 1.4F),
                  bgo.b(0.8F, 1.3F),
                  bgo.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dmr.c
            .a(
               new dmi(
                  0.01F,
                  dtm.a(dlg.a(10), dlg.a(67)),
                  bgf.a(3.0F),
                  dlg.b(8),
                  dml.a(false, cte.oT.o()),
                  $$1.b(apv.bh),
                  bgo.b(-0.125F, 0.125F),
                  new dmi.a(bgo.b(0.75F, 1.0F), bgn.a(0.0F, 6.0F, 2.0F), 3, bgo.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dmr.b.a(new dmn(0.2F, dtm.a(dlg.a(0), dlg.c(1)), bgf.a(0.5F), dlg.b(10), $$1.b(apv.bi), bgf.a(1.0F), bgf.a(1.0F), bgf.a(-0.7F))));
   }
}
