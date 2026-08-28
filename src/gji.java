public class gji extends gkd<cjy, fun<cjy>> {
   private static final alf a = new alf("textures/entity/zombie/zombie.png");
   private final float i;

   public gji(gix.a $$0, float $$1) {
      super($$0, new fuf($$0.a(fwz.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gnc<>(this, $$0.d()));
      this.a(new gmz<>(this, new fuf($$0.a(fwz.ai)), new fuf($$0.a(fwz.aj)), $$0.g()));
   }

   protected void a(cjy $$0, ezy $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public alf a(cjy $$0) {
      return a;
   }
}
