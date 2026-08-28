import java.util.Arrays;

public class gbc extends gba {
   private static final wy a = wy.c("options.sounds.title");

   private static fov<?>[] a(fow $$0) {
      return new fov[]{$$0.Z(), $$0.aa()};
   }

   public gbc(fxu $$0, fow $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awo.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fov<?>[] H() {
      return Arrays.stream(awo.values()).filter($$0 -> $$0 != awo.a).map($$0 -> this.c.b($$0)).toArray(fov[]::new);
   }
}
