public class guj extends gri<crb, gxo> {
   private static final alz a = alz.b("textures/entity/projectiles/wind_charge.png");
   private final gdt b;

   public guj(grj.a $$0) {
      super($$0);
      this.b = new gdt($$0.a(geg.ds));
   }

   @Override
   public void a(gxo $$0, fgl $$1, gle $$2, int $$3) {
      fgp $$4 = $$2.getBuffer(glo.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hav.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gxo d() {
      return new gxo();
   }
}
