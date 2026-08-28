public class grj extends goj<cpw, gun> {
   private static final ali a = ali.b("textures/entity/projectiles/wind_charge.png");
   private final gay b;

   public grj(gok.a $$0) {
      super($$0);
      this.b = new gay($$0.a(gbl.cX));
   }

   @Override
   public void a(gun $$0, feb $$1, gih $$2, int $$3) {
      fef $$4 = $$2.getBuffer(gir.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gxu.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gun b() {
      return new gun();
   }
}
