import java.util.List;

public class fuk extends fuo<crk> {
   private static final fmm h = new fmm(
      alh.b("recipe_book/filter_enabled"),
      alh.b("recipe_book/filter_disabled"),
      alh.b("recipe_book/filter_enabled_highlighted"),
      alh.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xh i = xh.c("gui.recipebook.toggleRecipes.craftable");

   public fuk(crk $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ctg $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(fum $$0, dal<?> $$1) {
      cvx $$2 = $$1.b().a(this.g.s.H_());
      ctg $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<ctg> $$4 = this.f.n();
      aks.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            ctg $$4xx = $$4.get($$3x);
            $$0.a($$3xx.a(), $$4xx);
         }));
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xh b() {
      return i;
   }

   @Override
   protected void a(fus $$0, com $$1, awn $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
