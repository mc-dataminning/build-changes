import java.util.List;

public class gco extends gcr<cvh> {
   private static final fun h = new fun(
      alg.b("recipe_book/furnace_filter_enabled"),
      alg.b("recipe_book/furnace_filter_disabled"),
      alg.b("recipe_book/furnace_filter_enabled_highlighted"),
      alg.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wy i;

   public gco(cvh $$0, wy $$1, List<gcr.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cxc $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gcp $$0, dfk $$1, baz $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dfj $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cxc $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected wy b() {
      return this.i;
   }

   @Override
   protected void a(gcv $$0, crs $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dfj);
   }
}
