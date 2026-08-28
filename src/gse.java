public class gse extends gsp<cie, gyh, gbu> {
   private static final alz a = alz.b("textures/entity/iron_golem/iron_golem.png");

   public gse(grj.a $$0) {
      super($$0, new gbu($$0.a(geg.bl)), 0.7F);
      this.a(new gvo(this));
      this.a(new gvp(this, $$0.d()));
   }

   public alz a(gyh $$0) {
      return a;
   }

   public gyh b() {
      return new gyh();
   }

   public void a(cie $$0, gyh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      $$1.b = $$0.x();
      $$1.c = $$0.p();
   }

   protected void a(gyh $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
