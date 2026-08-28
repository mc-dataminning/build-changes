public class gou implements goh<dvj> {
   private final gou.a a;

   public gou(goi.a $$0) {
      this($$0.f());
   }

   public gou(gew $$0) {
      this.a = new gou.a($$0.a(gez.cF));
   }

   public void a(dvj $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      jn $$6 = $$0.m().a(dqo.b, jn.b);
      cvk $$7 = $$0.s();
      hgt $$8;
      if ($$7 == null) {
         $$8 = gmq.i;
      } else {
         $$8 = gmq.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(ffs $$0, glv $$1, int $$2, int $$3, jn $$4, float $$5, hgt $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      ffw $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gct {
      private final gfa a;

      public a(gfa $$0) {
         super($$0, gmf::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
