import java.util.List;

public class fxl extends fxo<csz> {
   private static final fpm h = new fpm(
      alz.b("recipe_book/furnace_filter_enabled"),
      alz.b("recipe_book/furnace_filter_disabled"),
      alz.b("recipe_book/furnace_filter_enabled_highlighted"),
      alz.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xv i;

   public fxl(csz $$0, xv $$1, List<fxo.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cuu $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fxm $$0, ddc $$1, ddi.f $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof ddb $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cuu $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected xv b() {
      return this.i;
   }

   @Override
   protected void a(fxs $$0, cpx $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof ddb);
   }
}
