import java.util.List;
import java.util.Objects;

public class fxr extends fxv<ctd> {
   private static final fpt h = new fpt(
      alz.b("recipe_book/filter_enabled"),
      alz.b("recipe_book/filter_disabled"),
      alz.b("recipe_book/filter_enabled_highlighted"),
      alz.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xv i = xv.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<fxv.a> j = List.of(
      new fxv.a(fyb.a), new fxv.a(cxt.pA, cxt.ps, dcg.c), new fxv.a(cxt.eK, dcg.a), new fxv.a(cxt.qY, cxt.oQ, dcg.d), new fxv.a(cxt.lV, dcg.b)
   );

   public fxr(ctd $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cuz $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(ddj $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case ddn $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case ddo $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(fxt $$0, ddj $$1, bbp $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case ddn $$3:
            List<cuz> $$4 = this.f.n();
            alk.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cuz $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case ddo $$5:
            label15: {
               List<cuz> $$6 = this.f.n();
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
   protected xv b() {
      return i;
   }

   @Override
   protected void a(fxz $$0, cqc $$1) {
      $$0.a($$1, this::b);
   }
}
