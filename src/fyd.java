import java.util.List;
import java.util.Objects;

public class fyd extends fyh<csc> {
   private static final fqf h = new fqf(
      akv.b("recipe_book/filter_enabled"),
      akv.b("recipe_book/filter_disabled"),
      akv.b("recipe_book/filter_enabled_highlighted"),
      akv.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wp i = wp.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<fyh.a> j = List.of(
      new fyh.a(fyn.a), new fyh.a(cws.pJ, cws.pB, dbf.c), new fyh.a(cws.eM, dbf.a), new fyh.a(cws.rh, cws.oZ, dbf.d), new fyh.a(cws.me, dbf.b)
   );

   public fyd(csc $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cty $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dci $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dcm $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dcn $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(fyf $$0, dci $$1, bak $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dcm $$3:
            List<cty> $$4 = this.f.n();
            akg.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cty $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dcn $$5:
            label15: {
               List<cty> $$6 = this.f.n();
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
   protected void a(fyl $$0, cpb $$1) {
      $$0.a($$1, this::b);
   }
}
