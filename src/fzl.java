public class fzl extends gag<ccr, fkw<ccr>> {
   private static final ahh a = new ahh("textures/entity/zombie/zombie.png");
   private final float i;

   public fzl(fza.a $$0, float $$1) {
      super($$0, new fko($$0.a(fni.ad)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gde<>(this, $$0.d()));
      this.a(new gdb<>(this, new fko($$0.a(fni.ae)), new fko($$0.a(fni.af)), $$0.g()));
   }

   protected void a(ccr $$0, eqk $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ahh a(ccr $$0) {
      return a;
   }
}
