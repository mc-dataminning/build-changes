import java.util.List;

public class gdm extends gdp<cwd> {
   private static final fvl h = new fvl(
      alr.b("recipe_book/furnace_filter_enabled"),
      alr.b("recipe_book/furnace_filter_disabled"),
      alr.b("recipe_book/furnace_filter_enabled_highlighted"),
      alr.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xg i;

   public gdm(cwd $$0, xg $$1, List<gdp.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cxz $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gdn $$0, dgh $$1, bbm $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dgg $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cxz $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected xg b() {
      return this.i;
   }

   @Override
   protected void a(gdt $$0, cso $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dgg);
   }
}
