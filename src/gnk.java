public class gnk extends gkg<cod> {
   private static final akr a = akr.b("textures/entity/wither/wither_invulnerable.png");
   private static final akr g = akr.b("textures/entity/wither/wither.png");
   private final fxe h;

   public gnk(gkh.a $$0) {
      super($$0);
      this.h = new fxe($$0.a(fyh.cc));
   }

   public static fyo a() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("head", fyn.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyk.a);
      return fyo.a($$0, 64, 64);
   }

   protected int a(cod $$0, jd $$1) {
      return 15;
   }

   public void a(cod $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayo.j($$2, $$0.O, $$0.dF());
      float $$7 = ayo.i($$2, $$0.P, $$0.dH());
      fbk $$8 = $$4.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$6, $$7);
      this.h.a($$3, $$8, $$5, gqa.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cod $$0) {
      return $$0.y() ? a : g;
   }
}
