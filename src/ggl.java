public class ggl extends ggo {
   private final gae a;
   private final gjq b = gjq.i(gpd.a);

   ggl(gdh $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fzr(fke.Q().aS().a(gck.aA));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public ggs b() {
      return ggs.d;
   }

   @Override
   public void a(fev $$0, fjn $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azm.a($$3 * (float) Math.PI);
      int $$5 = axx.a($$4, 1.0F, 1.0F, 1.0F);
      fer $$6 = new fer();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      gjg.a $$8 = fke.Q().aR().c();
      fev $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, gyv.d, $$5);
      $$8.b();
   }

   public static class a implements ggr<lw> {
      public ggo a(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggl($$1, $$2, $$3, $$4);
      }
   }
}
