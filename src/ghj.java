public class ghj<T extends cgh> extends gfz<T, fsh<T>> {
   private static final ajt a = new ajt("textures/entity/skeleton/skeleton.png");

   public ghj(gfi.a $$0) {
      this($$0, ftl.bn, ftl.bp, ftl.bq);
   }

   public ghj(gfi.a $$0, ftk $$1, ftk $$2, ftk $$3) {
      this($$0, $$2, $$3, new fsh<>($$0.a($$1)));
   }

   public ghj(gfi.a $$0, ftk $$1, ftk $$2, fsh<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gjj<>(this, new fsh($$0.a($$1)), new fsh($$0.a($$2)), $$0.g()));
   }

   public ajt a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gp();
   }
}
