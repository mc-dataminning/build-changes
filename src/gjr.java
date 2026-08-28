public class gjr extends gkm<cji, fuv<cji>> {
   private static final akk a = new akk("textures/entity/zombie/zombie.png");
   private final float i;

   public gjr(gjg.a $$0, float $$1) {
      super($$0, new fun($$0.a(fxh.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gnl<>(this, $$0.d()));
      this.a(new gni<>(this, new fun($$0.a(fxh.ai)), new fun($$0.a(fxh.aj)), $$0.g()));
   }

   protected void a(cji $$0, fag $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akk a(cji $$0) {
      return a;
   }
}
