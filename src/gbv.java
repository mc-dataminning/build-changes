import java.util.Arrays;

public class gbv extends gbt {
   private static final wy a = wy.c("options.sounds.title");

   private static fpr<?>[] a(fps $$0) {
      return new fpr[]{$$0.Z(), $$0.aa()};
   }

   public gbv(fyn $$0, fps $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awo.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fpr<?>[] H() {
      return Arrays.stream(awo.values()).filter($$0 -> $$0 != awo.a).map($$0 -> this.c.b($$0)).toArray(fpr[]::new);
   }
}
