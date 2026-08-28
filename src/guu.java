public class guu extends gti<chx, hap, gca<hap>> {
   private final gca<hap> a = this.c();
   private final gca<hap> b;
   private static final aku k = aku.b("textures/entity/fish/tropical_a.png");
   private static final aku l = aku.b("textures/entity/fish/tropical_b.png");

   public guu(gsc.a $$0) {
      super($$0, new geh($$0.a(gfb.do)), 0.15F);
      this.b = new gei($$0.a(gfb.dm));
      this.a(new gxa(this, $$0.f()));
   }

   public aku a(hap $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hap b() {
      return new hap();
   }

   public void a(chx $$0, hap $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = $$0.gx().d();
      $$1.c = $$0.gy().d();
   }

   public void a(hap $$0, ffu $$1, glx $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hap $$0) {
      return $$0.b;
   }

   protected void a(hap $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
