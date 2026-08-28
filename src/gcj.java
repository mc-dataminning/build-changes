import java.util.List;

public class gcj extends gcm<cve> {
   private static final fui h = new fui(
      alg.b("recipe_book/furnace_filter_enabled"),
      alg.b("recipe_book/furnace_filter_disabled"),
      alg.b("recipe_book/furnace_filter_enabled_highlighted"),
      alg.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wy i;

   public gcj(cve $$0, wy $$1, List<gcm.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cwz $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gck $$0, dfh $$1, baz $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dfg $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cwz $$4 = this.f.k.get(1);
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
   protected void a(gcq $$0, crp $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dfg);
   }
}
