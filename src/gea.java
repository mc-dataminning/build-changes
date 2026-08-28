import java.util.List;
import java.util.Objects;

public class gea extends gee<cvt> {
   private static final fwa h = new fwa(
      alk.b("recipe_book/filter_enabled"),
      alk.b("recipe_book/filter_disabled"),
      alk.b("recipe_book/filter_enabled_highlighted"),
      alk.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xc i = xc.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gee.a> j = List.of(
      new gee.a(gek.a), new gee.a(dae.pS, dae.pK, det.c), new gee.a(dae.eS, det.a), new gee.a(dae.rq, dae.pi, det.d), new gee.a(dae.ml, det.b)
   );

   public gea(cvt $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(cxp $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dfx $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case dgb $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dgc $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gec $$0, dfx $$1, bbd $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      Objects.requireNonNull($$1);
      switch ($$1) {
         case dgb $$3:
            List<cxp> $$4 = this.f.n();
            akv.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               cxp $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dgc $$5:
            label15: {
               List<cxp> $$6 = this.f.n();
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
   protected xc b() {
      return i;
   }

   @Override
   protected void a(gei $$0, csf $$1) {
      $$0.a($$1, this::b);
   }
}
