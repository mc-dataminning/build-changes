public class gdb extends gcw {
   private static final xg a = xg.c("controls.title");

   private static fqt<?>[] a(fqu $$0) {
      return new fqt[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gdb(fzq $$0, fqu $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fty.a(xg.c("options.mouse_settings"), $$0 -> this.m.a(new gct(this, this.c))).a(),
            fty.a(xg.c("controls.keybinds"), $$0 -> this.m.a(new gdd(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
