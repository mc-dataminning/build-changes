import java.util.List;

public class fyc extends fyf<csc> {
   private static final fqd h = new fqd(
      aku.b("recipe_book/furnace_filter_enabled"),
      aku.b("recipe_book/furnace_filter_disabled"),
      aku.b("recipe_book/furnace_filter_enabled_highlighted"),
      aku.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wo i;

   public fyc(csc $$0, wo $$1, List<fyf.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(ctx $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fyd $$0, dch $$1, baj $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dcg $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         ctx $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected wo b() {
      return this.i;
   }

   @Override
   protected void a(fyj $$0, cpa $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dcg);
   }
}
