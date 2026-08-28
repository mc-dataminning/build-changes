public class gks extends gln<cjy, fvv<cjy>> {
   private static final akr a = akr.b("textures/entity/zombie/zombie.png");
   private final float i;

   public gks(gkh.a $$0, float $$1) {
      super($$0, new fvn($$0.a(fyh.ai)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gom<>(this, $$0.d()));
      this.a(new goj<>(this, new fvn($$0.a(fyh.aj)), new fvn($$0.a(fyh.ak)), $$0.g()));
   }

   protected void a(cjy $$0, fbg $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akr a(cjy $$0) {
      return a;
   }
}
