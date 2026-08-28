public class gmi extends gml {
   private final gfz a;
   private final gpn b = gpn.j(gvd.a);

   gmi(gjd $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gfm(fof.Q().aS().a(gif.aK));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gmp b() {
      return gmp.d;
   }

   @Override
   public void a(fiq $$0, gpd $$1, fnn $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azk.a($$4 * (float) Math.PI);
      int $$6 = axu.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      fiu $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hhp.d, $$6);
      $$0.b();
   }

   @Override
   public void a(fiu $$0, fnn $$1, float $$2) {
   }

   public static class a implements gmo<mb> {
      public gml a(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmi($$1, $$2, $$3, $$4);
      }
   }
}
