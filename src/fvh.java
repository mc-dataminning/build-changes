import java.util.List;

public class fvh extends fvl<crt> {
   private static final fnj h = new fnj(
      all.b("recipe_book/filter_enabled"),
      all.b("recipe_book/filter_disabled"),
      all.b("recipe_book/filter_enabled_highlighted"),
      all.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xl i = xl.c("gui.recipebook.toggleRecipes.craftable");

   public fvh(crt $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ctp $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(fvj $$0, dav<?> $$1) {
      cwf $$2 = $$1.b().a(this.g.s.H_());
      ctp $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<ctp> $$4 = this.f.n();
      akw.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            ctp $$4xx = $$4.get($$3x);
            $$0.a($$3xx.a(), $$4xx);
         }));
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xl b() {
      return i;
   }

   @Override
   protected void a(fvp $$0, cow $$1, awr $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
