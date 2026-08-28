public class gsh extends gqd<cmn, gwf> {
   private static final alj a = alj.b("textures/entity/illager/vindicator.png");

   public gsh(gpk.a $$0) {
      super($$0, new fzx<>($$0.a(gck.dm)), 0.5F);
      this.a(new gtr<gwf, fzx<gwf>>(this, $$0.b()) {
         public void a(fer $$0, gjg $$1, int $$2, gwf $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alj a(gwf $$0) {
      return a;
   }

   public gwf b() {
      return new gwf();
   }
}
