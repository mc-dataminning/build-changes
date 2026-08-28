import java.util.List;
import java.util.Objects;

public class fyb extends fyf<csb> {
   private static final fqd h = new fqd(
      aku.b("recipe_book/filter_enabled"),
      aku.b("recipe_book/filter_disabled"),
      aku.b("recipe_book/filter_enabled_highlighted"),
      aku.b("recipe_book/filter_disabled_highlighted")
   );
   private static final wo i = wo.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<fyf.a> j = List.of(
      new fyf.a(fyl.a), new fyf.a(cwr.pJ, cwr.pB, dbe.c), new fyf.a(cwr.eM, dbe.a), new fyf.a(cwr.rh, cwr.oZ, dbe.d), new fyf.a(cwr.me, dbe.b)
   );

   public fyb(csb $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(ctx $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dch $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dcl $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dcm $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(fyd $$0, dch $$1, baj $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dcl $$3:
            List<ctx> $$4 = this.f.n();
            akf.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               ctx $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dcm $$5:
            label15: {
               List<ctx> $$6 = this.f.n();
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
   protected wo b() {
      return i;
   }

   @Override
   protected void a(fyj $$0, cpa $$1) {
      $$0.a($$1, this::b);
   }
}
