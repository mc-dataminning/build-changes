public class gnm extends gki<cod> {
   private static final akr a = akr.b("textures/entity/wither/wither_invulnerable.png");
   private static final akr g = akr.b("textures/entity/wither/wither.png");
   private final fxg h;

   public gnm(gkj.a $$0) {
      super($$0);
      this.h = new fxg($$0.a(fyj.cc));
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("head", fyp.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fym.a);
      return fyq.a($$0, 64, 64);
   }

   protected int a(cod $$0, jd $$1) {
      return 15;
   }

   public void a(cod $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayo.j($$2, $$0.O, $$0.dE());
      float $$7 = ayo.i($$2, $$0.P, $$0.dG());
      fbm $$8 = $$4.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$6, $$7);
      this.h.a($$3, $$8, $$5, gqc.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cod $$0) {
      return $$0.y() ? a : g;
   }
}
