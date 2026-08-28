public class gas extends gca {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final geh d;
   private final geh e;

   public gas(geh $$0) {
      super($$0, glo::c);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("bottom", gem.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gej.a);
      $$1.a("lid", gem.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gej.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gem.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gej.a(0.0F, 9.0F, 1.0F));
      return gen.a($$0, 64, 64);
   }

   public static gen b() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("bottom", gem.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gej.a);
      $$1.a("lid", gem.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gej.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gem.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gej.a(0.0F, 9.0F, 1.0F));
      return gen.a($$0, 64, 64);
   }

   public static gen c() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("bottom", gem.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gej.a);
      $$1.a("lid", gem.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gej.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gem.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gej.a(0.0F, 9.0F, 1.0F));
      return gen.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
