public class gup extends grk<cqv, had> {
   private static final alp a = alp.b("textures/entity/wither/wither_invulnerable.png");
   private static final alp b = alp.b("textures/entity/wither/wither.png");
   private final gdd h;

   public gup(grl.a $$0) {
      super($$0);
      this.h = new gdd($$0.a(gei.dG));
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("head", geo.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gel.a);
      return gep.a($$0, 64, 64);
   }

   protected int a(cqv $$0, jh $$1) {
      return 15;
   }

   public void a(had $$0, fgl $$1, glg $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fgp $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hax.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alp a(had $$0) {
      return $$0.a ? a : b;
   }

   public had b() {
      return new had();
   }

   public void a(cqv $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
