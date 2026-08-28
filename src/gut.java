public class gut extends gro<crd, hah> {
   private static final alz a = alz.b("textures/entity/wither/wither_invulnerable.png");
   private static final alz b = alz.b("textures/entity/wither/wither.png");
   private final gdh h;

   public gut(grp.a $$0) {
      super($$0);
      this.h = new gdh($$0.a(gem.dA));
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("head", ges.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gep.a);
      return get.a($$0, 64, 64);
   }

   protected int a(crd $$0, jh $$1) {
      return 15;
   }

   public void a(hah $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fgv $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hbb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alz a(hah $$0) {
      return $$0.a ? a : b;
   }

   public hah b() {
      return new hah();
   }

   public void a(crd $$0, hah $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
