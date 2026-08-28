public class gbp extends gcx {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gfe d;
   private final gfe e;

   public gbp(gfe $$0) {
      super($$0, gmj::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("bottom", gfj.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gfg.a);
      $$1.a("lid", gfj.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gfg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfj.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gfg.a(0.0F, 9.0F, 1.0F));
      return gfk.a($$0, 64, 64);
   }

   public static gfk b() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("bottom", gfj.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gfg.a);
      $$1.a("lid", gfj.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gfg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfj.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gfg.a(0.0F, 9.0F, 1.0F));
      return gfk.a($$0, 64, 64);
   }

   public static gfk c() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("bottom", gfj.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gfg.a);
      $$1.a("lid", gfj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gfg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfj.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gfg.a(0.0F, 9.0F, 1.0F));
      return gfk.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
