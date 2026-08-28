import java.util.Arrays;

public class fyo extends fym {
   private static final wp a = wp.c("options.sounds.title");

   private static fmj<?>[] a(fmk $$0) {
      return new fmj[]{$$0.Z(), $$0.aa()};
   }

   public fyo(fvi $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awb.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fmj<?>[] H() {
      return Arrays.stream(awb.values()).filter($$0 -> $$0 != awb.a).map($$0 -> this.c.b($$0)).toArray(fmj[]::new);
   }
}
