public class gqt extends gqg<cho, gwq, fza<gvd>> {
   private static final all a = all.b("textures/entity/fish/pufferfish.png");
   private final fza<gvd> b;
   private final fza<gvd> k;
   private final fza<gvd> l = this.e();

   public gqt(gpa.a $$0) {
      super($$0, new gah($$0.a(gcb.bU)), 0.2F);
      this.k = new gai($$0.a(gcb.bV));
      this.b = new gaj($$0.a(gcb.bW));
   }

   public all a(gwq $$0) {
      return a;
   }

   public gwq c() {
      return new gwq();
   }

   public void a(gwq $$0, fek $$1, gix $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cho $$0, gwq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   protected void a(gwq $$0, fek $$1, float $$2, float $$3) {
      $$1.a(0.0F, azn.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
