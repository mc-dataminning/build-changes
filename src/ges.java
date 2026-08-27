public class ges extends gew {
   private final ti a;
   private ete b = ete.a;
   private final eyf c;
   private int y;

   public ges(eyf $$0, ti $$1, ti $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aD_() {
      this.f.ac().a();
      this.b = ete.a(this.i, this.a, this.g - 50);
      this.y = this.b.a() * 9;
      this.d(esl.a(th.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public ti g() {
      return ti.h().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void au_() {
      eqq.O().a(this.c);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.y / 2);
   }
}
