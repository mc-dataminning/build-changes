import java.util.List;
import java.util.Objects;

public class gdy extends gec<cvr> {
   private static final fvy h = new fvy(
      ali.b("recipe_book/filter_enabled"),
      ali.b("recipe_book/filter_disabled"),
      ali.b("recipe_book/filter_enabled_highlighted"),
      ali.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xa i = xa.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gec.a> j = List.of(
      new gec.a(gei.a), new gec.a(dac.pS, dac.pK, der.c), new gec.a(dac.eS, der.a), new gec.a(dac.rq, dac.pi, der.d), new gec.a(dac.ml, der.b)
   );

   public gdy(cvr $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cxn $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dfv $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dfz $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dga $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gea $$0, dfv $$1, bbb $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dfz $$3:
            List<cxn> $$4 = this.f.n();
            akt.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cxn $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dga $$5:
            label15: {
               List<cxn> $$6 = this.f.n();
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
   protected xa b() {
      return i;
   }

   @Override
   protected void a(geg $$0, csd $$1) {
      $$0.a($$1, this::b);
   }
}
