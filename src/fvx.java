public class fvx extends fun<bvr, fev<bvr>> {
   private final fev<bvr> a = this.a();
   private final fev<bvr> i;
   private static final aex j = new aex("textures/entity/fish/tropical_a.png");
   private static final aex k = new aex("textures/entity/fish/tropical_b.png");

   public fvx(fth.a $$0) {
      super($$0, new fhj<>($$0.a(fib.bF)), 0.15F);
      this.i = new fhk<>($$0.a(fib.bD));
      this.a(new fxz(this, $$0.f()));
   }

   public aex a(bvr $$0) {
      return switch ($$0.go().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bvr $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      fev<bvr> $$6 = switch ($$0.go().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gm().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bvr $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * arx.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
