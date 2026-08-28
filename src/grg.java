public class grg extends gpd<cmg, gve> {
   private static final ali a = ali.b("textures/entity/illager/vindicator.png");

   public grg(gok.a $$0) {
      super($$0, new fyy<>($$0.a(gbl.cU)), 0.5F);
      this.a(new gsq<gve, fyy<gve>>(this, $$0.b()) {
         public void a(feb $$0, gih $$1, int $$2, gve $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ali a(gve $$0) {
      return a;
   }

   public gve c() {
      return new gve();
   }
}
