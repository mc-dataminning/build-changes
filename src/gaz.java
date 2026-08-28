public class gaz extends gch {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final geo d;
   private final geo e;

   public gaz(geo $$0) {
      super($$0, glv::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("bottom", get.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), geq.a);
      $$1.a("lid", get.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), geq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", get.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), geq.a(0.0F, 9.0F, 1.0F));
      return geu.a($$0, 64, 64);
   }

   public static geu b() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("bottom", get.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), geq.a);
      $$1.a("lid", get.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), geq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", get.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), geq.a(0.0F, 9.0F, 1.0F));
      return geu.a($$0, 64, 64);
   }

   public static geu c() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("bottom", get.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), geq.a);
      $$1.a("lid", get.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), geq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", get.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), geq.a(0.0F, 9.0F, 1.0F));
      return geu.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
