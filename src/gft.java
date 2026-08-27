public class gft extends gfx {
   private final ui a;
   private euc b = euc.a;
   private final ezd c;
   private int y;

   public gft(ezd $$0, ui $$1, ui $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aM_() {
      this.f.ac().a();
      this.b = euc.a(this.i, this.a, this.g - 50);
      this.y = this.b.a() * 9;
      this.d(etj.a(uh.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public ui h() {
      return ui.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void aC_() {
      ero.O().a(this.c);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.y / 2);
   }
}
