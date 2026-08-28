import java.util.List;
import java.util.Objects;

public class gbp extends gbt<cur> {
   private static final ftp h = new ftp(
      alg.b("recipe_book/filter_enabled"),
      alg.b("recipe_book/filter_disabled"),
      alg.b("recipe_book/filter_enabled_highlighted"),
      alg.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wy i = wy.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gbt.a> j = List.of(
      new gbt.a(gbz.a), new gbt.a(czc.pP, czc.pH, ddr.c), new gbt.a(czc.eQ, ddr.a), new gbt.a(czc.rn, czc.pf, ddr.d), new gbt.a(czc.mi, ddr.b)
   );

   public gbp(cur $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cwn $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dev $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dez $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dfa $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gbr $$0, dev $$1, baz $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dez $$3:
            List<cwn> $$4 = this.f.n();
            akr.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cwn $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dfa $$5:
            label15: {
               List<cwn> $$6 = this.f.n();
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
   protected void a(gbx $$0, crd $$1) {
      $$0.a($$1, this::b);
   }
}
