public class giy<T extends chv> extends gho<T, ftw<T>> {
   private static final akh a = new akh("textures/entity/skeleton/skeleton.png");

   public giy(ggx.a $$0) {
      this($$0, fva.bn, fva.bp, fva.bq);
   }

   public giy(ggx.a $$0, fuz $$1, fuz $$2, fuz $$3) {
      this($$0, $$2, $$3, new ftw<>($$0.a($$1)));
   }

   public giy(ggx.a $$0, fuz $$1, fuz $$2, ftw<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gky<>(this, new ftw($$0.a($$1)), new ftw($$0.a($$2)), $$0.g()));
   }

   public akh a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gr();
   }
}
