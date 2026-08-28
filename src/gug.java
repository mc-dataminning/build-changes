public class gug extends gsc<cnh, gyf> {
   private static final alz a = alz.b("textures/entity/illager/vindicator.png");

   public gug(grj.a $$0) {
      super($$0, new gbt<>($$0.a(geg.dp)), 0.5F);
      this.a(new gvq<gyf, gbt<gyf>>(this, $$0.b()) {
         public void a(fgl $$0, gle $$1, int $$2, gyf $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gyf $$0) {
      return a;
   }

   public gyf b() {
      return new gyf();
   }
}
