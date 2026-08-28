public class gdc extends gcl<gzt> {
   public gdc(gfa $$0) {
      super($$0);
   }

   public static gfg a() {
      gfi $$0 = gcl.a(gfe.a, 0.0F);
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("head");
      $$2.a("hat");
      $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      gff $$3 = gff.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new gfe(1.0F));
      $$2.a("left_ear", $$3, gfc.a(-6.0F, -6.0F, 0.0F));
      $$2.a("right_ear", $$3, gfc.a(6.0F, -6.0F, 0.0F));
      return gfg.a($$0, 64, 64);
   }
}
