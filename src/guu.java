public class guu extends grp<cre, hai> {
   private static final alz a = alz.b("textures/entity/wither/wither_invulnerable.png");
   private static final alz b = alz.b("textures/entity/wither/wither.png");
   private final gdi h;

   public guu(grq.a $$0) {
      super($$0);
      this.h = new gdi($$0.a(gen.dA));
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("head", get.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), geq.a);
      return geu.a($$0, 64, 64);
   }

   protected int a(cre $$0, jh $$1) {
      return 15;
   }

   public void a(hai $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fgw $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hbc.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alz a(hai $$0) {
      return $$0.a ? a : b;
   }

   public hai b() {
      return new hai();
   }

   public void a(cre $$0, hai $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
