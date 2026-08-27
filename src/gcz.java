public class gcz<T extends cey> extends gbz<T, foc<T>> {
   private static final aiy a = new aiy("textures/entity/spider/spider.png");

   public gcz(gat.a $$0) {
      this($$0, fpb.bt);
   }

   public gcz(gat.a $$0, fpa $$1) {
      super($$0, new foc<>($$0.a($$1)), 0.8F);
      this.a(new gfk<>(this));
   }

   protected float b(T $$0) {
      return 180.0F;
   }

   public aiy a(T $$0) {
      return a;
   }
}
