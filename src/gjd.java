public class gjd extends gjy<cjt, fui<cjt>> {
   private static final alb a = new alb("textures/entity/zombie/zombie.png");
   private final float i;

   public gjd(gis.a $$0, float $$1) {
      super($$0, new fua($$0.a(fwu.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gmx<>(this, $$0.d()));
      this.a(new gmu<>(this, new fua($$0.a(fwu.ai)), new fua($$0.a(fwu.aj)), $$0.g()));
   }

   protected void a(cjt $$0, ezt $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public alb a(cjt $$0) {
      return a;
   }
}
