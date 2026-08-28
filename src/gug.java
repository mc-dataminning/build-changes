public class gug extends gsu<ciw, gzy, gbk<gzy>> {
   private final gbk<gzy> a = this.c();
   private final gbk<gzy> b;
   private static final alz k = alz.b("textures/entity/fish/tropical_a.png");
   private static final alz l = alz.b("textures/entity/fish/tropical_b.png");

   public gug(gro.a $$0) {
      super($$0, new gdr($$0.a(gel.dj)), 0.15F);
      this.b = new gds($$0.a(gel.dh));
      this.a(new gwm(this, $$0.f()));
   }

   public alz a(gzy $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gzy b() {
      return new gzy();
   }

   public void a(ciw $$0, gzy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
      $$1.b = $$0.gu().d();
      $$1.c = $$0.gv().d();
   }

   public void a(gzy $$0, fgq $$1, glj $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gzy $$0) {
      return $$0.b;
   }

   protected void a(gzy $$0, fgq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
