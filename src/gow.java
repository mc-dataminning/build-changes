public class gow extends gqg<cll, gvc, fyy<gvc>> {
   private static final all a = all.b("textures/entity/enderman/enderman.png");
   private final azv b = azv.a();

   public gow(gpa.a $$0) {
      super($$0, new fyy<>($$0.a(gcb.at)), 0.5F);
      this.a(new gsw(this));
      this.a(new gso(this, $$0.d()));
   }

   public ezr a(gvc $$0) {
      ezr $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public all b(gvc $$0) {
      return a;
   }

   public gvc a() {
      return new gvc();
   }

   public void a(cll $$0, gvc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gpr.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
      $$1.b = $$0.gv();
   }
}
