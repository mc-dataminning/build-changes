public class gjk extends gkf<cka, fup<cka>> {
   private static final alf a = new alf("textures/entity/zombie/zombie.png");
   private final float i;

   public gjk(giz.a $$0, float $$1) {
      super($$0, new fuh($$0.a(fxb.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gne<>(this, $$0.d()));
      this.a(new gnb<>(this, new fuh($$0.a(fxb.ai)), new fuh($$0.a(fxb.aj)), $$0.g()));
   }

   protected void a(cka $$0, faa $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public alf a(cka $$0) {
      return a;
   }
}
