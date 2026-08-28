import java.util.List;

public class fyg extends fyj<csf> {
   private static final fqh h = new fqh(
      akv.b("recipe_book/furnace_filter_enabled"),
      akv.b("recipe_book/furnace_filter_disabled"),
      akv.b("recipe_book/furnace_filter_enabled_highlighted"),
      akv.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wp i;

   public fyg(csf $$0, wp $$1, List<fyj.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cua $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fyh $$0, dck $$1, bak $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dcj $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cua $$4 = this.f.k.get(1);
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
   protected void a(fyn $$0, cpd $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dcj);
   }
}
