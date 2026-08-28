public class gbo extends gcw {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gfd d;
   private final gfd e;

   public gbo(gfd $$0) {
      super($$0, gmi::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("bottom", gfi.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gff.a);
      $$1.a("lid", gfi.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gff.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfi.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gff.a(0.0F, 9.0F, 1.0F));
      return gfj.a($$0, 64, 64);
   }

   public static gfj b() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("bottom", gfi.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gff.a);
      $$1.a("lid", gfi.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gff.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfi.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gff.a(0.0F, 9.0F, 1.0F));
      return gfj.a($$0, 64, 64);
   }

   public static gfj c() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("bottom", gfi.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gff.a);
      $$1.a("lid", gfi.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gff.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfi.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gff.a(0.0F, 9.0F, 1.0F));
      return gfj.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
