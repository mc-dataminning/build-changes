public class guh extends gsv<ciw, gzz, gbl<gzz>> {
   private final gbl<gzz> a = this.c();
   private final gbl<gzz> b;
   private static final alz k = alz.b("textures/entity/fish/tropical_a.png");
   private static final alz l = alz.b("textures/entity/fish/tropical_b.png");

   public guh(grp.a $$0) {
      super($$0, new gds($$0.a(gem.dj)), 0.15F);
      this.b = new gdt($$0.a(gem.dh));
      this.a(new gwn(this, $$0.f()));
   }

   public alz a(gzz $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gzz b() {
      return new gzz();
   }

   public void a(ciw $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gw().d();
      $$1.c = $$0.gx().d();
   }

   public void a(gzz $$0, fgr $$1, glk $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gzz $$0) {
      return $$0.b;
   }

   protected void a(gzz $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
