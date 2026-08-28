public class gko extends glj<cjw, fvr<cjw>> {
   private static final akq a = akq.b("textures/entity/zombie/zombie.png");
   private final float i;

   public gko(gkd.a $$0, float $$1) {
      super($$0, new fvj($$0.a(fyd.ai)), 0.5F * $$1);
      this.i = $$1;
      this.a(new goi<>(this, $$0.d()));
      this.a(new gof<>(this, new fvj($$0.a(fyd.aj)), new fvj($$0.a(fyd.ak)), $$0.g()));
   }

   protected void a(cjw $$0, fbc $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akq a(cjw $$0) {
      return a;
   }
}
