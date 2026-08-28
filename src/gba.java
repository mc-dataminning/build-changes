public class gba extends gbd {
   private final fux a;
   private final gdx b = gdx.i(gir.a);

   gba(fxw $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fui(ffg.Q().aR().a(fxa.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbh b() {
      return gbh.e;
   }

   @Override
   public void a(fad $$0, fer $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayz.a($$3 * (float) Math.PI);
      ezz $$5 = new ezz();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdp.a $$6 = ffg.Q().aQ().c();
      fad $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gor.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbg<lm> {
      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gba($$1, $$2, $$3, $$4);
      }
   }
}
