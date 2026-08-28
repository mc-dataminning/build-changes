public class gky<T extends cjk> extends gjn<T, fvu<T>> {
   private static final ale a = new ale("textures/entity/skeleton/skeleton.png");

   public gky(giw.a $$0) {
      this($$0, fwy.bn, fwy.bp, fwy.bq);
   }

   public gky(giw.a $$0, fwx $$1, fwx $$2, fwx $$3) {
      this($$0, $$2, $$3, new fvu<>($$0.a($$1)));
   }

   public gky(giw.a $$0, fwx $$1, fwx $$2, fvu<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gmy<>(this, new fvu($$0.a($$1)), new fvu($$0.a($$2)), $$0.g()));
   }

   public ale a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gs();
   }
}
