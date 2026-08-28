public class gou extends gox {
   private final gij a;
   private final gry b = gry.j(gxo.a);

   gou(glo $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new ghw(fqq.Q().aS().a(gkq.aO));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gpb b() {
      return gpb.d;
   }

   @Override
   public void a(fld $$0, grn $$1, fpy $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azz.a($$4 * (float) Math.PI);
      int $$6 = ayh.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      flg $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hkg.d, $$6);
      $$0.b();
   }

   @Override
   public void a(flg $$0, fpy $$1, float $$2) {
   }

   public static class a implements gpa<md> {
      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gou($$1, $$2, $$3, $$4);
      }
   }
}
