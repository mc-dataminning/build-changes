public class xp extends Exception {
   private final wp a;

   public xp(wp $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xp(wp $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public wp a() {
      return this.a;
   }
}
