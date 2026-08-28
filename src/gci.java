import java.util.List;
import java.util.Objects;

public class gci extends gcm<cvd> {
   private static final fui h = new fui(
      alg.b("recipe_book/filter_enabled"),
      alg.b("recipe_book/filter_disabled"),
      alg.b("recipe_book/filter_enabled_highlighted"),
      alg.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wy i = wy.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gcm.a> j = List.of(
      new gcm.a(gcs.a), new gcm.a(czo.pS, czo.pK, ded.c), new gcm.a(czo.eS, ded.a), new gcm.a(czo.rq, czo.pi, ded.d), new gcm.a(czo.ml, ded.b)
   );

   public gci(cvd $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cwz $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dfh $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dfl $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dfm $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gck $$0, dfh $$1, baz $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dfl $$3:
            List<cwz> $$4 = this.f.n();
            akr.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cwz $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dfm $$5:
            label15: {
               List<cwz> $$6 = this.f.n();
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
   protected void a(gcq $$0, crp $$1) {
      $$0.a($$1, this::b);
   }
}
