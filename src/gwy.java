public class gwy extends gwq<cnv, hcy, ggd> {
   private static final ale a = ale.b("textures/entity/phantom.png");

   public gwy(gvk.a $$0) {
      super($$0, new ggd($$0.a(gif.bY)), 0.75F);
      this.a(new gzw(this));
   }

   public ale a(hcy $$0) {
      return a;
   }

   public hcy b() {
      return new hcy();
   }

   public void a(cnv $$0, hcy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hcy $$0, fiq $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hcy $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
