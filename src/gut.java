public class gut extends gth<chw, hao, gby<hao>> {
   private final gby<hao> a = this.c();
   private final gby<hao> b;
   private static final aku k = aku.b("textures/entity/fish/tropical_a.png");
   private static final aku l = aku.b("textures/entity/fish/tropical_b.png");

   public gut(gsb.a $$0) {
      super($$0, new gef($$0.a(gez.do)), 0.15F);
      this.b = new geg($$0.a(gez.dm));
      this.a(new gwz(this, $$0.f()));
   }

   public aku a(hao $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hao b() {
      return new hao();
   }

   public void a(chw $$0, hao $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = $$0.gx().d();
      $$1.c = $$0.gy().d();
   }

   public void a(hao $$0, ffs $$1, glv $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hao $$0) {
      return $$0.b;
   }

   protected void a(hao $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayy.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
