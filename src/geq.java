public class geq extends gee<cbw, foc<cbw>> {
   private static final ajh a = new ajh("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final foc<cbw> j;
   private final foc<cbw> k;
   private final foc<cbw> l = this.a();

   public geq(gcy.a $$0) {
      super($$0, new fpk<>($$0.a(frc.aX)), 0.2F);
      this.k = new fpl<>($$0.a(frc.aY));
      this.j = new fpm<>($$0.a(frc.aZ));
   }

   public ajh a(cbw $$0) {
      return a;
   }

   public void a(cbw $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      int $$6 = $$0.gp();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cbw $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, aww.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
