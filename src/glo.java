public class glo<T extends ciy> extends gkd<T, fwj<T>> {
   private static final akk a = new akk("textures/entity/skeleton/skeleton.png");

   public glo(gjm.a $$0) {
      this($$0, fxn.bn, fxn.bp, fxn.bq);
   }

   public glo(gjm.a $$0, fxm $$1, fxm $$2, fxm $$3) {
      this($$0, $$2, $$3, new fwj<>($$0.a($$1)));
   }

   public glo(gjm.a $$0, fxm $$1, fxm $$2, fwj<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gno<>(this, new fwj($$0.a($$1)), new fwj($$0.a($$2)), $$0.g()));
   }

   public akk a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gq();
   }
}
