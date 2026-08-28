public class ggx extends gij {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gkr d;
   private final gkr e;

   public ggx(gkr $$0) {
      super($$0, gry::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("bottom", gkw.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gkt.a);
      $$1.a("lid", gkw.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gkt.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gkw.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gkt.a(0.0F, 9.0F, 1.0F));
      return gkx.a($$0, 64, 64);
   }

   public static gkx b() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("bottom", gkw.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gkt.a);
      $$1.a("lid", gkw.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gkt.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gkw.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gkt.a(0.0F, 9.0F, 1.0F));
      return gkx.a($$0, 64, 64);
   }

   public static gkx c() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("bottom", gkw.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gkt.a);
      $$1.a("lid", gkw.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gkt.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gkw.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gkt.a(0.0F, 9.0F, 1.0F));
      return gkx.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
