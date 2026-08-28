import java.util.List;

public class fzc extends fzf<csy> {
   private static final frd h = new frd(
      aku.b("recipe_book/furnace_filter_enabled"),
      aku.b("recipe_book/furnace_filter_disabled"),
      aku.b("recipe_book/furnace_filter_enabled_highlighted"),
      aku.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final wp i;

   public fzc(csy $$0, wp $$1, List<fzf.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(cut $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fzd $$0, ddb $$1, bak $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dda $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         cut $$4 = this.f.k.get(1);
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
   protected void a(fzj $$0, cpw $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dda);
   }
}
