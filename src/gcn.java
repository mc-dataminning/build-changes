import java.util.List;
import java.util.Objects;

public class gcn extends gcr<cvg> {
   private static final fun h = new fun(
      alg.b("recipe_book/filter_enabled"),
      alg.b("recipe_book/filter_disabled"),
      alg.b("recipe_book/filter_enabled_highlighted"),
      alg.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wy i = wy.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gcr.a> j = List.of(
      new gcr.a(gcx.a), new gcr.a(czr.pS, czr.pK, deg.c), new gcr.a(czr.eS, deg.a), new gcr.a(czr.rq, czr.pi, deg.d), new gcr.a(czr.ml, deg.b)
   );

   public gcn(cvg $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cxc $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dfk $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dfo $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dfp $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gcp $$0, dfk $$1, baz $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dfo $$3:
            List<cxc> $$4 = this.f.n();
            akr.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cxc $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dfp $$5:
            label15: {
               List<cxc> $$6 = this.f.n();
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
   protected wy b() {
      return i;
   }

   @Override
   protected void a(gcv $$0, crs $$1) {
      $$0.a($$1, this::b);
   }
}
