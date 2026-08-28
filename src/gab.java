import java.util.List;

public class gab extends gae<ctp> {
   private static final fsa h = new fsa(
      ald.b("recipe_book/furnace_filter_enabled"),
      ald.b("recipe_book/furnace_filter_disabled"),
      ald.b("recipe_book/furnace_filter_enabled_highlighted"),
      ald.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wv i;

   public gab(ctp $$0, wv $$1, List<gae.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cvk $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gac $$0, ddr $$1, bav $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof ddq $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cvk $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected wv b() {
      return this.i;
   }

   @Override
   protected void a(gai $$0, cqn $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof ddq);
   }
}
