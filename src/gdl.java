import java.util.List;
import java.util.Objects;

public class gdl extends gdp<cwc> {
   private static final fvl h = new fvl(
      alr.b("recipe_book/filter_enabled"),
      alr.b("recipe_book/filter_disabled"),
      alr.b("recipe_book/filter_enabled_highlighted"),
      alr.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xg i = xg.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gdp.a> j = List.of(
      new gdp.a(gdv.a), new gdp.a(dao.pS, dao.pK, dfd.c), new gdp.a(dao.eS, dfd.a), new gdp.a(dao.rq, dao.pi, dfd.d), new gdp.a(dao.ml, dfd.b)
   );

   public gdl(cwc $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cxz $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dgh $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dgl $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dgm $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gdn $$0, dgh $$1, bbm $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dgl $$3:
            List<cxz> $$4 = this.f.n();
            alc.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cxz $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dgm $$5:
            label15: {
               List<cxz> $$6 = this.f.n();
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
   protected xg b() {
      return i;
   }

   @Override
   protected void a(gdt $$0, cso $$1) {
      $$0.a($$1, this::b);
   }
}
