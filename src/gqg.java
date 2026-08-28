public class gqg extends gop<cnn, gvu, fzv> {
   private static final alc a = alc.b("textures/entity/wandering_trader.png");

   public gqg(gnj.a $$0) {
      super($$0, new fzv($$0.a(gak.cW)), 0.5F);
      this.a(new grb<>(this, $$0.f(), $$0.b()));
      this.a(new gra<>(this, $$0.b()));
   }

   public alc a(gvu $$0) {
      return a;
   }

   protected void a(gvu $$0, fde $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gvu c() {
      return new gvu();
   }

   public void a(cnn $$0, gvu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
   }
}
