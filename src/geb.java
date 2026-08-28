import java.util.List;

public class geb extends gee<cvu> {
   private static final fwa h = new fwa(
      alk.b("recipe_book/furnace_filter_enabled"),
      alk.b("recipe_book/furnace_filter_disabled"),
      alk.b("recipe_book/furnace_filter_enabled_highlighted"),
      alk.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xc i;

   public geb(cvu $$0, xc $$1, List<gee.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cxp $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gec $$0, dfx $$1, bbd $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dfw $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cxp $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected xc b() {
      return this.i;
   }

   @Override
   protected void a(gei $$0, csf $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dfw);
   }
}
