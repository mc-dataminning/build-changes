public class gcy<T extends cey> extends gby<T, foc<T>> {
   private static final aiy a = new aiy("textures/entity/spider/spider.png");

   public gcy(gas.a $$0) {
      this($$0, fpb.bt);
   }

   public gcy(gas.a $$0, fpa $$1) {
      super($$0, new foc<>($$0.a($$1)), 0.8F);
      this.a(new gfj<>(this));
   }

   protected float b(T $$0) {
      return 180.0F;
   }

   public aiy a(T $$0) {
      return a;
   }
}
