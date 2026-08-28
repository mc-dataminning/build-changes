public class guf extends gsp<cpe, gzx, gdr> {
   private static final alz b = alz.b("textures/entity/villager/villager.png");
   public static final gvc.a a = new gvc.a(-0.1171875F, -0.07421875F, 1.0F);

   public guf(grj.a $$0) {
      super($$0, new gdr($$0.a(geg.do)), 0.5F);
      this.a(new gvc<>(this, $$0.f(), a, $$0.b()));
      this.a(new gwi<>(this, $$0.e(), "villager"));
      this.a(new gvb<>(this, $$0.b()));
   }

   protected void a(gzx $$0, fgl $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alz a(gzx $$0) {
      return b;
   }

   protected float b(gzx $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gzx b() {
      return new gzx();
   }

   public void a(cpe $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gw();
   }
}
