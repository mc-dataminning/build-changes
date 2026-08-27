public class fyw extends fzr<ccj, fki<ccj>> {
   private static final ahg a = new ahg("textures/entity/zombie/zombie.png");
   private final float i;

   public fyw(fyl.a $$0, float $$1) {
      super($$0, new fka($$0.a(fmu.ae)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gcp<>(this, $$0.d()));
      this.a(new gcm<>(this, new fka($$0.a(fmu.af)), new fka($$0.a(fmu.ag)), $$0.g()));
   }

   protected void a(ccj $$0, epz $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ahg a(ccj $$0) {
      return a;
   }
}
