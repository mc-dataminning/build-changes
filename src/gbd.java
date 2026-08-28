import java.util.List;
import java.util.Objects;

public class gbd extends gbh<cul> {
   private static final ftd h = new ftd(
      ale.b("recipe_book/filter_enabled"),
      ale.b("recipe_book/filter_disabled"),
      ale.b("recipe_book/filter_enabled_highlighted"),
      ale.b("recipe_book/filter_disabled_highlighted")
   );
   private static final ww i = ww.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gbh.a> j = List.of(
      new gbh.a(gbn.a), new gbh.a(cyw.pN, cyw.pF, ddl.c), new gbh.a(cyw.eO, ddl.a), new gbh.a(cyw.rl, cyw.pd, ddl.d), new gbh.a(cyw.mg, ddl.b)
   );

   public gbd(cul $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cwh $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dep $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case det $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case deu $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gbf $$0, dep $$1, bax $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case det $$3:
            List<cwh> $$4 = this.f.n();
            akp.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cwh $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case deu $$5:
            label15: {
               List<cwh> $$6 = this.f.n();
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
   protected ww b() {
      return i;
   }

   @Override
   protected void a(gbl $$0, cqx $$1) {
      $$0.a($$1, this::b);
   }
}
