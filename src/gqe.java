public class gqe extends gop<cnh, gvu, fzv> {
   private static final alc b = alc.b("textures/entity/villager/villager.png");
   public static final grb.a a = new grb.a(-0.1171875F, -0.07421875F, 1.0F);

   public gqe(gnj.a $$0) {
      super($$0, new fzv($$0.a(gak.cT)), 0.5F);
      this.a(new grb<>(this, $$0.f(), a, $$0.b()));
      this.a(new gsg<>(this, $$0.e(), "villager"));
      this.a(new gra<>(this, $$0.b()));
   }

   protected void a(gvu $$0, fde $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alc a(gvu $$0) {
      return b;
   }

   protected float b(gvu $$0) {
      float $$1 = super.f($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gvu c() {
      return new gvu();
   }

   public void a(cnh $$0, gvu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gz();
   }
}
