public class gqo extends gqg<clx, gwl, fzz> {
   private static final all a = all.b("textures/entity/phantom.png");

   public gqo(gpa.a $$0) {
      super($$0, new fzz($$0.a(gcb.bs)), 0.75F);
      this.a(new gtl(this));
   }

   public all a(gwl $$0) {
      return a;
   }

   public gwl c() {
      return new gwl();
   }

   public void a(clx $$0, gwl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() + $$1.p;
      $$1.b = $$0.q();
   }

   protected void a(gwl $$0, fek $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gwl $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
