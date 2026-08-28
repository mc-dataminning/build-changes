public class gmv<T extends clf> extends gnl<T, gsx> {
   private static final alb a = alb.b("textures/entity/illager/evoker.png");

   public gmv(gms.a $$0) {
      super($$0, new fxo<>($$0.a(gaa.ax)), 0.5F);
      this.a(new gqy<gsx, fxo<gsx>>(this, $$0.b()) {
         public void a(fcu $$0, ggv $$1, int $$2, gsx $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alb a(gsx $$0) {
      return a;
   }

   public gsx c() {
      return new gsx();
   }

   public void a(T $$0, gsx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
