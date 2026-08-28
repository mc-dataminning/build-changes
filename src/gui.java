public class gui extends gse<cnd, gyh> {
   private static final alp a = alp.b("textures/entity/illager/vindicator.png");

   public gui(grl.a $$0) {
      super($$0, new gbv<>($$0.a(gei.dv)), 0.5F);
      this.a(new gvs<gyh, gbv<gyh>>(this, $$0.b()) {
         public void a(fgl $$0, glg $$1, int $$2, gyh $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alp a(gyh $$0) {
      return a;
   }

   public gyh b() {
      return new gyh();
   }
}
