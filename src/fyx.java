public class fyx extends gae {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gcl d;
   private final gcl e;

   public fyx(gcl $$0) {
      super($$0, gjq::c);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("bottom", gcq.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gcn.a);
      $$1.a("lid", gcq.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gcn.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gcq.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gcn.a(0.0F, 9.0F, 1.0F));
      return gcr.a($$0, 64, 64);
   }

   public static gcr b() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("bottom", gcq.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gcn.a);
      $$1.a("lid", gcq.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gcn.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gcq.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gcn.a(0.0F, 9.0F, 1.0F));
      return gcr.a($$0, 64, 64);
   }

   public static gcr c() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("bottom", gcq.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gcn.a);
      $$1.a("lid", gcq.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gcn.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gcq.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gcn.a(0.0F, 9.0F, 1.0F));
      return gcr.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
