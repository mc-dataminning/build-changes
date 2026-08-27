public class gio<T extends cgz> extends ghe<T, ftm<T>> {
   private static final akf a = new akf("textures/entity/skeleton/skeleton.png");

   public gio(ggn.a $$0) {
      this($$0, fuq.bn, fuq.bp, fuq.bq);
   }

   public gio(ggn.a $$0, fup $$1, fup $$2, fup $$3) {
      this($$0, $$2, $$3, new ftm<>($$0.a($$1)));
   }

   public gio(ggn.a $$0, fup $$1, fup $$2, ftm<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gko<>(this, new ftm($$0.a($$1)), new ftm($$0.a($$2)), $$0.g()));
   }

   public akf a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gr();
   }
}
