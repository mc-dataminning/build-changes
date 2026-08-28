public class gra<T extends coa> extends gsu<T, gxl, gbb> {
   private static final alz a = alz.b("textures/entity/creaking/creaking.png");
   private static final alz b = alz.b("textures/entity/creaking/creaking_eyes.png");

   public gra(gro.a $$0) {
      super($$0, new gbb($$0.a(gel.ae)), 0.7F);
      this.a(new gvw<>(this, b, ($$0x, $$1) -> 1.0F, gbb::b, glt::p));
   }

   public alz a(gxl $$0) {
      return a;
   }

   public gxl a() {
      return new gxl();
   }

   public void a(T $$0, gxl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bZ);
      $$1.a.a($$0.ca);
      $$1.c = $$0.x();
      $$1.d = $$0.p();
   }
}
