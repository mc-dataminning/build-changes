public class fxc extends fyj {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gaq d;
   private final gaq e;

   public fxc(gaq $$0) {
      super($$0, ghv::c);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("bottom", gav.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gas.a);
      $$1.a("lid", gav.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gas.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gav.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gas.a(0.0F, 9.0F, 1.0F));
      return gaw.a($$0, 64, 64);
   }

   public static gaw b() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("bottom", gav.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gas.a);
      $$1.a("lid", gav.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gas.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gav.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gas.a(0.0F, 9.0F, 1.0F));
      return gaw.a($$0, 64, 64);
   }

   public static gaw c() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("bottom", gav.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gas.a);
      $$1.a("lid", gav.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gas.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gav.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gas.a(0.0F, 9.0F, 1.0F));
      return gaw.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
