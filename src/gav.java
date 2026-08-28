public class gav extends gba {
   private static fov<?>[] a(fow $$0) {
      return new fov[]{$$0.S(), $$0.T()};
   }

   public gav(fxu $$0, fow $$1) {
      super($$0, $$1, wy.c("options.font.title"));
   }

   @Override
   protected void m() {
      this.d.a(a(this.c));
   }
}
