import java.util.Arrays;

public class fxo extends fxm {
   private static final wo a = wo.c("options.sounds.title");

   private static flk<?>[] a(fll $$0) {
      return new flk[]{$$0.Z(), $$0.aa()};
   }

   public fxo(fui $$0, fll $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awa.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private flk<?>[] H() {
      return Arrays.stream(awa.values()).filter($$0 -> $$0 != awa.a).map($$0 -> this.c.b($$0)).toArray(flk[]::new);
   }
}
