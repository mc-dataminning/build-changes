public class gum extends gsu<cpo, hac, gdw> {
   private static final alz a = alz.b("textures/entity/wandering_trader.png");

   public gum(gro.a $$0) {
      super($$0, new gdw($$0.a(gel.dq)), 0.5F);
      this.a(new gvh<>(this, $$0.f(), $$0.b()));
      this.a(new gvg<>(this, $$0.b()));
   }

   public alz a(hac $$0) {
      return a;
   }

   protected void a(hac $$0, fgq $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public hac b() {
      return new hac();
   }

   public void a(cpo $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
   }
}
