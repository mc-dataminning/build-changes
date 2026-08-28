import java.util.List;

public class gbe extends gbh<cum> {
   private static final ftd h = new ftd(
      ale.b("recipe_book/furnace_filter_enabled"),
      ale.b("recipe_book/furnace_filter_disabled"),
      ale.b("recipe_book/furnace_filter_enabled_highlighted"),
      ale.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final ww i;

   public gbe(cum $$0, ww $$1, List<gbh.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cwh $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gbf $$0, dep $$1, bax $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof deo $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cwh $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected ww b() {
      return this.i;
   }

   @Override
   protected void a(gbl $$0, cqx $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof deo);
   }
}
