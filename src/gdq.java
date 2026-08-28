public class gdq extends gdl {
   private static final xc a = xc.c("controls.title");

   private static fri<?>[] a(frj $$0) {
      return new fri[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gdq(gaf $$0, frj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fun.a(xc.c("options.mouse_settings"), $$0 -> this.m.a(new gdi(this, this.c))).a(),
            fun.a(xc.c("controls.keybinds"), $$0 -> this.m.a(new gds(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
