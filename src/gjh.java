public class gjh extends ght<cjy, fuc<cjy>> {
   private static final akf a = new akf("textures/entity/villager/villager.png");

   public gjh(ggn.a $$0) {
      super($$0, new fuc<>($$0.a(fuq.bP)), 0.5F);
      this.a(new gkd<>(this, $$0.f(), $$0.d()));
      this.a(new glj<>(this, $$0.e(), "villager"));
      this.a(new gkc<>(this, $$0.d()));
   }

   public akf a(cjy $$0) {
      return a;
   }

   protected void a(cjy $$0, exn $$1, float $$2) {
      float $$3 = 0.9375F * $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cjy $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
