import java.util.List;
import java.util.Objects;

public class fye extends fyi<csd> {
   private static final fqg h = new fqg(
      akv.b("recipe_book/filter_enabled"),
      akv.b("recipe_book/filter_disabled"),
      akv.b("recipe_book/filter_enabled_highlighted"),
      akv.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wp i = wp.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<fyi.a> j = List.of(
      new fyi.a(fyo.a), new fyi.a(cwt.pJ, cwt.pB, dbg.c), new fyi.a(cwt.eM, dbg.a), new fyi.a(cwt.rh, cwt.oZ, dbg.d), new fyi.a(cwt.me, dbg.b)
   );

   public fye(csd $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(ctz $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dcj $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dcn $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dco $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(fyg $$0, dcj $$1, bak $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dcn $$3:
            List<ctz> $$4 = this.f.n();
            akg.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               ctz $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dco $$5:
            label15: {
               List<ctz> $$6 = this.f.n();
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
   protected void a(fym $$0, cpc $$1) {
      $$0.a($$1, this::b);
   }
}
