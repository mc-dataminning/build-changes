import java.util.List;
import java.util.Objects;

public class fyf extends fyj<cse> {
   private static final fqh h = new fqh(
      akv.b("recipe_book/filter_enabled"),
      akv.b("recipe_book/filter_disabled"),
      akv.b("recipe_book/filter_enabled_highlighted"),
      akv.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wp i = wp.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<fyj.a> j = List.of(
      new fyj.a(fyp.a), new fyj.a(cwu.pJ, cwu.pB, dbh.c), new fyj.a(cwu.eM, dbh.a), new fyj.a(cwu.rh, cwu.oZ, dbh.d), new fyj.a(cwu.me, dbh.b)
   );

   public fyf(cse $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cua $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dck $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dco $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dcp $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(fyh $$0, dck $$1, bak $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dco $$3:
            List<cua> $$4 = this.f.n();
            akg.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cua $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dcp $$5:
            label15: {
               List<cua> $$6 = this.f.n();
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
   protected wp b() {
      return i;
   }

   @Override
   protected void a(fyn $$0, cpd $$1) {
      $$0.a($$1, this::b);
   }
}
