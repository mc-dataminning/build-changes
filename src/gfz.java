public class gfz extends gda<ckc> {
   private static final ajh a = new ajh("textures/entity/projectiles/wind_charge.png");
   private final fqt f;

   public gfz(gdb.a $$0) {
      super($$0);
      this.f = new fqt($$0.a(fre.bT));
   }

   public void a(ckc $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      euf $$7 = $$4.getBuffer(fya.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ajh a(ckc $$0) {
      return a;
   }
}
