import java.util.List;
import java.util.Objects;

public class gaa extends gae<cto> {
   private static final fsa h = new fsa(
      ald.b("recipe_book/filter_enabled"),
      ald.b("recipe_book/filter_disabled"),
      ald.b("recipe_book/filter_enabled_highlighted"),
      ald.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wv i = wv.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gae.a> j = List.of(
      new gae.a(gak.a), new gae.a(cyc.pN, cyc.pF, dcn.c), new gae.a(cyc.eO, dcn.a), new gae.a(cyc.rl, cyc.pd, dcn.d), new gae.a(cyc.mg, dcn.b)
   );

   public gaa(cto $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cvk $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(ddr $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case ddv $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case ddw $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gac $$0, ddr $$1, bav $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case ddv $$3:
            List<cvk> $$4 = this.f.n();
            ako.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cvk $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case ddw $$5:
            label15: {
               List<cvk> $$6 = this.f.n();
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
   protected wv b() {
      return i;
   }

   @Override
   protected void a(gai $$0, cqn $$1) {
      $$0.a($$1, this::b);
   }
}
