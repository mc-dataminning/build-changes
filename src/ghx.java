public class ghx<T extends chr> extends ggx<T, fsw<T>> {
   private static final ajv a = new ajv("textures/entity/spider/spider.png");

   public ghx(gfr.a $$0) {
      this($$0, ftu.bx);
   }

   public ghx(gfr.a $$0, ftt $$1) {
      super($$0, new fsw<>($$0.a($$1)), 0.8F);
      this.a(new gkj<>(this));
   }

   protected float b(T $$0) {
      return 180.0F;
   }

   public ajv a(T $$0) {
      return a;
   }
}
