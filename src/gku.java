public class gku extends glp<cjy, fvx<cjy>> {
   private static final akr a = akr.b("textures/entity/zombie/zombie.png");
   private final float i;

   public gku(gkj.a $$0, float $$1) {
      super($$0, new fvp($$0.a(fyj.ai)), 0.5F * $$1);
      this.i = $$1;
      this.a(new goo<>(this, $$0.d()));
      this.a(new gol<>(this, new fvp($$0.a(fyj.aj)), new fvp($$0.a(fyj.ak)), $$0.g()));
   }

   protected void a(cjy $$0, fbi $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akr a(cjy $$0) {
      return a;
   }
}
