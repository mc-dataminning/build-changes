public class gcj extends gde<cfb, fnr<cfb>> {
   private static final ajc a = new ajc("textures/entity/zombie/zombie.png");
   private final float i;

   public gcj(gby.a $$0, float $$1) {
      super($$0, new fnj($$0.a(fqe.ad)), 0.5F * $$1);
      this.i = $$1;
      this.a(new ggc<>(this, $$0.d()));
      this.a(new gfz<>(this, new fnj($$0.a(fqe.ae)), new fnj($$0.a(fqe.af)), $$0.g()));
   }

   protected void a(cfb $$0, etd $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ajc a(cfb $$0) {
      return a;
   }
}
