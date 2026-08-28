import java.util.Arrays;

public class gcy extends gcw {
   private static final xg a = xg.c("options.sounds.title");

   private static fqt<?>[] a(fqu $$0) {
      return new fqt[]{$$0.Z(), $$0.aa()};
   }

   public gcy(fzq $$0, fqu $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awz.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fqt<?>[] H() {
      return Arrays.stream(awz.values()).filter($$0 -> $$0 != awz.a).map($$0 -> this.c.b($$0)).toArray(fqt[]::new);
   }
}
