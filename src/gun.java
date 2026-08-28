public class gun extends gsj<cnm, gym> {
   private static final alz a = alz.b("textures/entity/illager/vindicator.png");

   public gun(grq.a $$0) {
      super($$0, new gca<>($$0.a(gen.dp)), 0.5F);
      this.a(new gvx<gym, gca<gym>>(this, $$0.b()) {
         public void a(fgs $$0, gll $$1, int $$2, gym $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gym $$0) {
      return a;
   }

   public gym b() {
      return new gym();
   }
}
