public class wg extends Exception {
   private final vg a;

   public wg(vg $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wg(vg $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vg b() {
      return this.a;
   }
}
