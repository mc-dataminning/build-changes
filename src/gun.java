public class gun extends gri<cqz, hab> {
   private static final alz a = alz.b("textures/entity/wither/wither_invulnerable.png");
   private static final alz b = alz.b("textures/entity/wither/wither.png");
   private final gdb h;

   public gun(grj.a $$0) {
      super($$0);
      this.h = new gdb($$0.a(geg.dA));
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("head", gem.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gej.a);
      return gen.a($$0, 64, 64);
   }

   protected int a(cqz $$0, jh $$1) {
      return 15;
   }

   public void a(hab $$0, fgl $$1, gle $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fgp $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hav.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alz a(hab $$0) {
      return $$0.a ? a : b;
   }

   public hab b() {
      return new hab();
   }

   public void a(cqz $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
