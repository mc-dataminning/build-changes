public class guo extends grn<crf, gxt> {
   private static final alz a = alz.b("textures/entity/projectiles/wind_charge.png");
   private final gdy b;

   public guo(gro.a $$0) {
      super($$0);
      this.b = new gdy($$0.a(gel.ds));
   }

   @Override
   public void a(gxt $$0, fgq $$1, glj $$2, int $$3) {
      fgu $$4 = $$2.getBuffer(glt.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hba.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gxt d() {
      return new gxt();
   }
}
