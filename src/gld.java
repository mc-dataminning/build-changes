public class gld<T extends ckn> extends gkc<T, fwa<T>> {
   private static final ale a = new ale("textures/entity/spider/spider.png");

   public gld(giw.a $$0) {
      this($$0, fwy.bx);
   }

   public gld(giw.a $$0, fwx $$1) {
      super($$0, new fwa<>($$0.a($$1)), 0.8F);
      this.a(new gnp<>(this));
   }

   protected float b(T $$0) {
      return 180.0F;
   }

   public ale a(T $$0) {
      return a;
   }
}
