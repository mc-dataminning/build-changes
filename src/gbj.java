import java.util.Arrays;

public class gbj extends gbh {
   private static final wy a = wy.c("options.sounds.title");

   private static fpc<?>[] a(fpd $$0) {
      return new fpc[]{$$0.Z(), $$0.aa()};
   }

   public gbj(fyb $$0, fpd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awo.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fpc<?>[] H() {
      return Arrays.stream(awo.values()).filter($$0 -> $$0 != awo.a).map($$0 -> this.c.b($$0)).toArray(fpc[]::new);
   }
}
