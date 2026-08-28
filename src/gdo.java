public class gdo extends gdj {
   private static final xa a = xa.c("controls.title");

   private static frg<?>[] a(frh $$0) {
      return new frg[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gdo(gad $$0, frh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            ful.a(xa.c("options.mouse_settings"), $$0 -> this.m.a(new gdg(this, this.c))).a(),
            ful.a(xa.c("controls.keybinds"), $$0 -> this.m.a(new gdq(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
