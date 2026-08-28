import java.util.List;
import java.util.Objects;

public class fxk extends fxo<csu> {
   private static final fpm h = new fpm(
      alp.b("recipe_book/filter_enabled"),
      alp.b("recipe_book/filter_disabled"),
      alp.b("recipe_book/filter_enabled_highlighted"),
      alp.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xk i = xk.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<fxo.a> j = List.of(
      new fxo.a(fxu.a), new fxo.a(cxk.pJ, cxk.pB, dbx.c), new fxo.a(cxk.eM, dbx.a), new fxo.a(cxk.rh, cxk.oZ, dbx.d), new fxo.a(cxk.me, dbx.b)
   );

   public fxk(csu $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cuq $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dda $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dde $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case ddf $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(fxm $$0, dda $$1, bbf $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dde $$3:
            List<cuq> $$4 = this.f.n();
            ala.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cuq $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case ddf $$5:
            label15: {
               List<cuq> $$6 = this.f.n();
               int $$7 = Math.min($$5.b().size(), $$6.size());

               for (int $$8 = 0; $$8 < $$7; $$8++) {
                  $$0.a($$6.get($$8), $$2, $$5.b().get($$8));
               }
               break label15;
            }
      }
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xk b() {
      return i;
   }

   @Override
   protected void a(fxs $$0, cpt $$1) {
      $$0.a($$1, this::b);
   }
}
