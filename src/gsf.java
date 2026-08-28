public class gsf extends gsc<cph, gyl> {
   private static final akv a = akv.b("textures/entity/illager/evoker_fangs.png");
   private final gcb b;

   public gsf(gsd.a $$0) {
      super($$0);
      this.b = new gcb($$0.a(gfb.aM));
   }

   public void a(gyl $$0, fft $$1, glx $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         ffx $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, heh.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gyl a() {
      return new gyl();
   }

   public void a(cph $$0, gyl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
