public class gdr extends gas<cin> {
   private static final aiy a = new aiy("textures/entity/projectiles/wind_charge.png");
   private final fop f;

   public gdr(gat.a $$0) {
      super($$0);
      this.f = new fop($$0.a(fpb.bP));
   }

   public void a(cin $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      float $$6 = (float)$$0.ag + $$2;
      ese $$7 = $$4.getBuffer(fvu.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public aiy a(cin $$0) {
      return a;
   }
}
