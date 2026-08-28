import java.util.Arrays;

public class fzn extends fzl {
   private static final wv a = wv.c("options.sounds.title");

   private static fng<?>[] a(fnh $$0) {
      return new fng[]{$$0.Z(), $$0.aa()};
   }

   public fzn(fwf $$0, fnh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awl.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fng<?>[] H() {
      return Arrays.stream(awl.values()).filter($$0 -> $$0 != awl.a).map($$0 -> this.c.b($$0)).toArray(fng[]::new);
   }
}
