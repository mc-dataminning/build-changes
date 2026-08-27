public class fwi extends fxd<cbd, fic<cbd>> {
   private static final agi a = new agi("textures/entity/zombie/zombie.png");
   private final float i;

   public fwi(fvx.a $$0, float $$1) {
      super($$0, new fhu($$0.a(fkn.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fzy<>(this, $$0.d()));
      this.a(new fzv<>(this, new fhu($$0.a(fkn.ac)), new fhu($$0.a(fkn.ad)), $$0.g()));
   }

   protected void a(cbd $$0, enw $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public agi a(cbd $$0) {
      return a;
   }
}
