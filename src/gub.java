public class gub extends gsw<cnk, gzu, gdq> {
   private static final alz a = alz.b("textures/entity/strider/strider.png");
   private static final alz b = alz.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gub(grq.a $$0) {
      super($$0, new gdq($$0.a(gen.da)), 0.5F);
      this.a(new gwg<>(this, new gdq($$0.a(gen.db)), alz.b("textures/entity/strider/strider_saddle.png")));
   }

   public alz a(gzu $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gzu $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gzu b() {
      return new gzu();
   }

   public void a(cnk $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected void a(gzu $$0, fgs $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gzu $$0) {
      return super.a($$0) || $$0.b;
   }
}
