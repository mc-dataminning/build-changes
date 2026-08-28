public class gbl extends gct {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gfa d;
   private final gfa e;

   public gbl(gfa $$0) {
      super($$0, gmf::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("bottom", gff.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gfc.a);
      $$1.a("lid", gff.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gfc.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gff.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gfc.a(0.0F, 9.0F, 1.0F));
      return gfg.a($$0, 64, 64);
   }

   public static gfg b() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("bottom", gff.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gfc.a);
      $$1.a("lid", gff.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gfc.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gff.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gfc.a(0.0F, 9.0F, 1.0F));
      return gfg.a($$0, 64, 64);
   }

   public static gfg c() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("bottom", gff.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gfc.a);
      $$1.a("lid", gff.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gfc.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gff.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gfc.a(0.0F, 9.0F, 1.0F));
      return gfg.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
