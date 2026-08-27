public class fyy extends fzt<cck, fkk<cck>> {
   private static final ahg a = new ahg("textures/entity/zombie/zombie.png");
   private final float i;

   public fyy(fyn.a $$0, float $$1) {
      super($$0, new fkc($$0.a(fmw.ae)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gcr<>(this, $$0.d()));
      this.a(new gco<>(this, new fkc($$0.a(fmw.af)), new fkc($$0.a(fmw.ag)), $$0.g()));
   }

   protected void a(cck $$0, eqb $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ahg a(cck $$0) {
      return a;
   }
}
