import java.util.List;

public class fvp extends fvt<csa> {
   private static final fnq h = new fnq(
      alj.b("recipe_book/filter_enabled"),
      alj.b("recipe_book/filter_disabled"),
      alj.b("recipe_book/filter_enabled_highlighted"),
      alj.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xj i = xj.c("gui.recipebook.toggleRecipes.craftable");

   public fvp(csa $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ctw $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(fvr $$0, dbc<?> $$1) {
      cwm $$2 = $$1.b().a(this.g.s.J_());
      ctw $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<ctw> $$4 = this.f.n();
      aku.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            ctw $$4xx = $$4.get($$3x);
            $$0.a($$3xx.a(), $$4xx);
         }));
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xj b() {
      return i;
   }

   @Override
   protected void a(fvx $$0, coz $$1, awq $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
