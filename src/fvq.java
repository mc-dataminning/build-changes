import java.util.List;
import java.util.Optional;
import java.util.SequencedSet;
import javax.annotation.Nullable;

public class fvq extends fvt<csb> {
   private static final fnq h = new fnq(
      alj.b("recipe_book/furnace_filter_enabled"),
      alj.b("recipe_book/furnace_filter_disabled"),
      alj.b("recipe_book/furnace_filter_enabled_highlighted"),
      alj.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xj i;
   @Nullable
   private List<cwm> j;

   public fvq(csb $$0, xj $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(ctw $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fvr $$0, dbc<?> $$1) {
      gdh $$2 = this.g.s;
      cwm $$3 = $$1.b().a($$2.J_());
      ctw $$4 = this.f.l();
      $$0.a($$3, $$4);
      List<Optional<daz.a>> $$5 = $$1.b().a().a();
      if (!$$5.isEmpty()) {
         $$5.getFirst().ifPresent($$1x -> {
            ctw $$2x = this.f.k.get(0);
            $$0.a($$1x.a(), $$2x);
         });
      }

      ctw $$6 = this.f.k.get(1);
      if ($$6.g().f()) {
         if ($$5.size() > 1) {
            $$5.get(1).ifPresent($$2x -> $$0.a($$2x.a(), $$6));
         } else {
            if (this.j == null) {
               this.j = this.a($$2.L()).stream().map(cwm::new).toList();
            }

            $$0.a(this.j, $$6);
         }
      }
   }

   private SequencedSet<cwi> a(dtv $$0) {
      return $$0.a();
   }

   @Override
   protected xj b() {
      return this.i;
   }

   @Override
   protected void a(fvx $$0, coz $$1, awq $$2) {
      $$0.a($$1, 1, 1, $$2);
   }
}
