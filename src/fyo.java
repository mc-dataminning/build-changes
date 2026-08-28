public class fyo extends fzv {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gcc d;
   private final gcc e;

   public fyo(gcc $$0) {
      super($$0, gjh::c);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("bottom", gch.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gce.a);
      $$1.a("lid", gch.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gce.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gch.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gce.a(0.0F, 9.0F, 1.0F));
      return gci.a($$0, 64, 64);
   }

   public static gci b() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("bottom", gch.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gce.a);
      $$1.a("lid", gch.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gce.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gch.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gce.a(0.0F, 9.0F, 1.0F));
      return gci.a($$0, 64, 64);
   }

   public static gci c() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("bottom", gch.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gce.a);
      $$1.a("lid", gch.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gce.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gch.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gce.a(0.0F, 9.0F, 1.0F));
      return gci.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
