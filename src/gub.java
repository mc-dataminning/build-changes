public class gub extends gtj<chs, hab, gdo> {
   private static final akv a = akv.b("textures/entity/fish/salmon.png");
   private final gdo b;
   private final gdo k;
   private final gdo l;

   public gub(gsd.a $$0) {
      super($$0, new gdo($$0.a(gfb.cw)), 0.4F);
      this.b = new gdo($$0.a(gfb.cy));
      this.k = new gdo($$0.a(gfb.cw));
      this.l = new gdo($$0.a(gfb.cx));
   }

   public void a(chs $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }

   public akv a(hab $$0) {
      return a;
   }

   public hab b() {
      return new hab();
   }

   protected void a(hab $$0, fft $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * ayz.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hab $$0, fft $$1, glx $$2, int $$3) {
      if ($$0.a == chs.a.a) {
         this.h = this.b;
      } else if ($$0.a == chs.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
