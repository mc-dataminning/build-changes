public class gjx extends gks<cjl, fvb<cjl>> {
   private static final akk a = new akk("textures/entity/zombie/zombie.png");
   private final float i;

   public gjx(gjm.a $$0, float $$1) {
      super($$0, new fut($$0.a(fxn.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gnr<>(this, $$0.d()));
      this.a(new gno<>(this, new fut($$0.a(fxn.ai)), new fut($$0.a(fxn.aj)), $$0.g()));
   }

   protected void a(cjl $$0, fam $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akk a(cjl $$0) {
      return a;
   }
}
