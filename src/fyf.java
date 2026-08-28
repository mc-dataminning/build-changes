import java.util.List;

public class fyf extends fyi<cse> {
   private static final fqg h = new fqg(
      akv.b("recipe_book/furnace_filter_enabled"),
      akv.b("recipe_book/furnace_filter_disabled"),
      akv.b("recipe_book/furnace_filter_enabled_highlighted"),
      akv.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wp i;

   public fyf(cse $$0, wp $$1, List<fyi.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(ctz $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fyg $$0, dcj $$1, bak $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dci $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         ctz $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected wp b() {
      return this.i;
   }

   @Override
   protected void a(fym $$0, cpc $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dci);
   }
}
