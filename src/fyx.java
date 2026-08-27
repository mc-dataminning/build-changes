public class fyx extends fzs<ccj, fkj<ccj>> {
   private static final ahg a = new ahg("textures/entity/zombie/zombie.png");
   private final float i;

   public fyx(fym.a $$0, float $$1) {
      super($$0, new fkb($$0.a(fmv.ae)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gcq<>(this, $$0.d()));
      this.a(new gcn<>(this, new fkb($$0.a(fmv.af)), new fkb($$0.a(fmv.ag)), $$0.g()));
   }

   protected void a(ccj $$0, eqa $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ahg a(ccj $$0) {
      return a;
   }
}
