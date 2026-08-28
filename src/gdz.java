import java.util.List;

public class gdz extends gec<cvs> {
   private static final fvy h = new fvy(
      ali.b("recipe_book/furnace_filter_enabled"),
      ali.b("recipe_book/furnace_filter_disabled"),
      ali.b("recipe_book/furnace_filter_enabled_highlighted"),
      ali.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xa i;

   public gdz(cvs $$0, xa $$1, List<gec.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cxn $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gea $$0, dfv $$1, bbb $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dfu $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cxn $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected xa b() {
      return this.i;
   }

   @Override
   protected void a(geg $$0, csd $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dfu);
   }
}
