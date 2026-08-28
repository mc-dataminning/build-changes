import java.util.List;
import java.util.Optional;
import java.util.SequencedSet;
import javax.annotation.Nullable;

public class fvi extends fvl<cru> {
   private static final fnj h = new fnj(
      all.b("recipe_book/furnace_filter_enabled"),
      all.b("recipe_book/furnace_filter_disabled"),
      all.b("recipe_book/furnace_filter_enabled_highlighted"),
      all.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xl i;
   @Nullable
   private List<cwf> j;

   public fvi(cru $$0, xl $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(ctp $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fvj $$0, dav<?> $$1) {
      gcy $$2 = this.g.s;
      cwf $$3 = $$1.b().a($$2.H_());
      ctp $$4 = this.f.l();
      $$0.a($$3, $$4);
      List<Optional<das.a>> $$5 = $$1.b().a().a();
      if (!$$5.isEmpty()) {
         $$5.getFirst().ifPresent($$1x -> {
            ctp $$2x = this.f.k.get(0);
            $$0.a($$1x.a(), $$2x);
         });
      }

      ctp $$6 = this.f.k.get(1);
      if ($$6.g().f()) {
         if ($$5.size() > 1) {
            $$5.get(1).ifPresent($$2x -> $$0.a($$2x.a(), $$6));
         } else {
            if (this.j == null) {
               this.j = this.a($$2.L()).stream().map(cwf::new).toList();
            }

            $$0.a(this.j, $$6);
         }
      }
   }

   private SequencedSet<cwb> a(dto $$0) {
      return $$0.a();
   }

   @Override
   protected xl b() {
      return this.i;
   }

   @Override
   protected void a(fvp $$0, cow $$1, awr $$2) {
      $$0.a($$1, 1, 1, $$2);
   }
}
