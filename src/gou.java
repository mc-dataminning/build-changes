public class gou extends goz<cjr, gva> {
   private static final all a = all.b("textures/entity/end_crystal/end_crystal.png");
   private static final gjh b = gjh.f(a);
   private final fyx h;

   public gou(gpa.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new fyx($$0.a(gcb.aw));
   }

   public void a(gva $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, gyk.d);
      $$1.b();
      ezr $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gov.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azn.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gva a() {
      return new gva();
   }

   public void a(cjr $$0, gva $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.b + $$2;
      $$1.a = $$0.o();
      jh $$3 = $$0.m();
      if ($$3 != null) {
         $$1.b = ezr.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cjr $$0, gmo $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.m() != null;
   }
}
