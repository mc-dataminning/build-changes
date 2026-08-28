import java.util.List;

public class fxl extends fxo<csv> {
   private static final fpm h = new fpm(
      alp.b("recipe_book/furnace_filter_enabled"),
      alp.b("recipe_book/furnace_filter_disabled"),
      alp.b("recipe_book/furnace_filter_enabled_highlighted"),
      alp.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xk i;

   public fxl(csv $$0, xk $$1, List<fxo.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cuq $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fxm $$0, dda $$1, bbf $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dcz $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cuq $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected xk b() {
      return this.i;
   }

   @Override
   protected void a(fxs $$0, cpt $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dcz);
   }
}
