public class gyc extends gwq<cjr, hdv, gfd<hdv>> {
   private final gfd<hdv> a = this.c();
   private final gfd<hdv> j;
   private static final ale k = ale.b("textures/entity/fish/tropical_a.png");
   private static final ale l = ale.b("textures/entity/fish/tropical_b.png");

   public gyc(gvk.a $$0) {
      super($$0, new ghl($$0.a(gif.dA)), 0.15F);
      this.j = new ghm($$0.a(gif.dy));
      this.a(new hah(this, $$0.f()));
   }

   public ale a(hdv $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hdv b() {
      return new hdv();
   }

   public void a(cjr $$0, hdv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gw().d();
      $$1.c = $$0.gx().d();
   }

   public void a(hdv $$0, fiq $$1, gpd $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hdv $$0) {
      return $$0.b;
   }

   protected void a(hdv $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azk.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
