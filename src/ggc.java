public class ggc extends ggx<chb, fri<chb>> {
   private static final ajv a = new ajv("textures/entity/zombie/zombie.png");
   private final float i;

   public ggc(gfr.a $$0, float $$1) {
      super($$0, new fra($$0.a(ftu.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gjv<>(this, $$0.d()));
      this.a(new gjs<>(this, new fra($$0.a(ftu.ai)), new fra($$0.a(ftu.aj)), $$0.g()));
   }

   protected void a(chb $$0, ewr $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ajv a(chb $$0) {
      return a;
   }
}
