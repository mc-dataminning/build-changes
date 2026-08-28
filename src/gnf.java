public class gnf extends gni {
   private final ggu a;
   private final gqk b = gqk.j(gwa.a);

   gnf(gjz $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new ggh(foz.Q().aS().a(gjb.aO));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gnm b() {
      return gnm.d;
   }

   @Override
   public void a(fjj $$0, gqa $$1, fog $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azm.a($$4 * (float) Math.PI);
      int $$6 = axw.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      fjn $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hin.d, $$6);
      $$0.b();
   }

   @Override
   public void a(fjn $$0, fog $$1, float $$2) {
   }

   public static class a implements gnl<mb> {
      public gni a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnf($$1, $$2, $$3, $$4);
      }
   }
}
