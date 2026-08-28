public class gpn<T extends cmi> extends gqd<T, gvr> {
   private static final alj a = alj.b("textures/entity/illager/evoker.png");

   public gpn(gpk.a $$0) {
      super($$0, new fzx<>($$0.a(gck.aH)), 0.5F);
      this.a(new gtr<gvr, fzx<gvr>>(this, $$0.b()) {
         public void a(fer $$0, gjg $$1, int $$2, gvr $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alj a(gvr $$0) {
      return a;
   }

   public gvr b() {
      return new gvr();
   }

   public void a(T $$0, gvr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }
}
