import java.util.List;

public class fus extends fuw<crp> {
   private static final fmu h = new fmu(
      ali.b("recipe_book/filter_enabled"),
      ali.b("recipe_book/filter_disabled"),
      ali.b("recipe_book/filter_enabled_highlighted"),
      ali.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xi i = xi.c("gui.recipebook.toggleRecipes.craftable");

   public fus(crp $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ctl $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(fuu $$0, dar<?> $$1) {
      cwb $$2 = $$1.b().a(this.g.s.H_());
      ctl $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<ctl> $$4 = this.f.n();
      akt.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            ctl $$4xx = $$4.get($$3x);
            $$0.a($$3xx.a(), $$4xx);
         }));
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xi b() {
      return i;
   }

   @Override
   protected void a(fva $$0, cos $$1, awo $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
