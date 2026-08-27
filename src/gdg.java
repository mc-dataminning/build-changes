public class gdg<T extends cfc> extends gcg<T, foj<T>> {
   private static final aiy a = new aiy("textures/entity/spider/spider.png");

   public gdg(gba.a $$0) {
      this($$0, fpi.bt);
   }

   public gdg(gba.a $$0, fph $$1) {
      super($$0, new foj<>($$0.a($$1)), 0.8F);
      this.a(new gfr<>(this));
   }

   protected float b(T $$0) {
      return 180.0F;
   }

   public aiy a(T $$0) {
      return a;
   }
}
