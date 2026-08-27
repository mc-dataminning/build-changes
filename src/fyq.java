public class fyq extends fzl<cce, fkc<cce>> {
   private static final ahd a = new ahd("textures/entity/zombie/zombie.png");
   private final float i;

   public fyq(fyf.a $$0, float $$1) {
      super($$0, new fju($$0.a(fmo.ae)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gcj<>(this, $$0.d()));
      this.a(new gcg<>(this, new fju($$0.a(fmo.af)), new fju($$0.a(fmo.ag)), $$0.g()));
   }

   protected void a(cce $$0, ept $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ahd a(cce $$0) {
      return a;
   }
}
