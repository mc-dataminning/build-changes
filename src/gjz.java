public class gjz extends gku<cjm, fvd<cjm>> {
   private static final akk a = new akk("textures/entity/zombie/zombie.png");
   private final float i;

   public gjz(gjo.a $$0, float $$1) {
      super($$0, new fuv($$0.a(fxp.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gnt<>(this, $$0.d()));
      this.a(new gnq<>(this, new fuv($$0.a(fxp.ai)), new fuv($$0.a(fxp.aj)), $$0.g()));
   }

   protected void a(cjm $$0, fao $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akk a(cjm $$0) {
      return a;
   }
}
