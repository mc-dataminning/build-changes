public class gau extends gcc {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gej d;
   private final gej e;

   public gau(gej $$0) {
      super($$0, glq::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("bottom", geo.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gel.a);
      $$1.a("lid", geo.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gel.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", geo.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gel.a(0.0F, 9.0F, 1.0F));
      return gep.a($$0, 64, 64);
   }

   public static gep b() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("bottom", geo.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gel.a);
      $$1.a("lid", geo.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gel.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", geo.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gel.a(0.0F, 9.0F, 1.0F));
      return gep.a($$0, 64, 64);
   }

   public static gep c() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("bottom", geo.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gel.a);
      $$1.a("lid", geo.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gel.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", geo.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gel.a(0.0F, 9.0F, 1.0F));
      return gep.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
