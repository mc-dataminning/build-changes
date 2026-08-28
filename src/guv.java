public class guv extends gtj<chx, haq, gca<haq>> {
   private final gca<haq> a = this.c();
   private final gca<haq> b;
   private static final akv k = akv.b("textures/entity/fish/tropical_a.png");
   private static final akv l = akv.b("textures/entity/fish/tropical_b.png");

   public guv(gsd.a $$0) {
      super($$0, new geh($$0.a(gfb.do)), 0.15F);
      this.b = new gei($$0.a(gfb.dm));
      this.a(new gxb(this, $$0.f()));
   }

   public akv a(haq $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public haq b() {
      return new haq();
   }

   public void a(chx $$0, haq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = $$0.gA().d();
      $$1.c = $$0.gB().d();
   }

   public void a(haq $$0, fft $$1, glx $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(haq $$0) {
      return $$0.b;
   }

   protected void a(haq $$0, fft $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
