public class gli<T extends civ> extends gjx<T, fwd<T>> {
   private static final akk a = new akk("textures/entity/skeleton/skeleton.png");

   public gli(gjg.a $$0) {
      this($$0, fxh.bn, fxh.bp, fxh.bq);
   }

   public gli(gjg.a $$0, fxg $$1, fxg $$2, fxg $$3) {
      this($$0, $$2, $$3, new fwd<>($$0.a($$1)));
   }

   public gli(gjg.a $$0, fxg $$1, fxg $$2, fwd<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gni<>(this, new fwd($$0.a($$1)), new fwd($$0.a($$2)), $$0.g()));
   }

   public akk a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gp();
   }
}
