public class gay extends gcg {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gen d;
   private final gen e;

   public gay(gen $$0) {
      super($$0, glu::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("bottom", ges.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gep.a);
      $$1.a("lid", ges.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gep.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ges.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gep.a(0.0F, 9.0F, 1.0F));
      return get.a($$0, 64, 64);
   }

   public static get b() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("bottom", ges.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gep.a);
      $$1.a("lid", ges.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gep.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ges.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gep.a(0.0F, 9.0F, 1.0F));
      return get.a($$0, 64, 64);
   }

   public static get c() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("bottom", ges.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gep.a);
      $$1.a("lid", ges.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gep.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ges.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gep.a(0.0F, 9.0F, 1.0F));
      return get.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
