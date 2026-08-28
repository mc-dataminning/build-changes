public class gtu extends gsp<cnf, gzn, gdj> {
   private static final alz a = alz.b("textures/entity/strider/strider.png");
   private static final alz b = alz.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gtu(grj.a $$0) {
      super($$0, new gdj($$0.a(geg.da)), 0.5F);
      this.a(new gvz<>(this, new gdj($$0.a(geg.db)), alz.b("textures/entity/strider/strider_saddle.png")));
   }

   public alz a(gzn $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gzn $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gzn b() {
      return new gzn();
   }

   public void a(cnf $$0, gzn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected void a(gzn $$0, fgl $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gzn $$0) {
      return super.a($$0) || $$0.b;
   }
}
