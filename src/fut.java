import java.util.List;
import java.util.Optional;
import java.util.SequencedSet;
import javax.annotation.Nullable;

public class fut extends fuw<crq> {
   private static final fmu h = new fmu(
      ali.b("recipe_book/furnace_filter_enabled"),
      ali.b("recipe_book/furnace_filter_disabled"),
      ali.b("recipe_book/furnace_filter_enabled_highlighted"),
      ali.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xi i;
   @Nullable
   private List<cwb> j;

   public fut(crq $$0, xi $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(ctl $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fuu $$0, dar<?> $$1) {
      gci $$2 = this.g.s;
      cwb $$3 = $$1.b().a($$2.H_());
      ctl $$4 = this.f.l();
      $$0.a($$3, $$4);
      List<Optional<dao.a>> $$5 = $$1.b().a().a();
      if (!$$5.isEmpty()) {
         $$5.getFirst().ifPresent($$1x -> {
            ctl $$2x = this.f.k.get(0);
            $$0.a($$1x.a(), $$2x);
         });
      }

      ctl $$6 = this.f.k.get(1);
      if ($$6.g().f()) {
         if ($$5.size() > 1) {
            $$5.get(1).ifPresent($$2x -> $$0.a($$2x.a(), $$6));
         } else {
            if (this.j == null) {
               this.j = this.a($$2.L()).stream().map(cwb::new).toList();
            }

            $$0.a(this.j, $$6);
         }
      }
   }

   private SequencedSet<cvx> a(dtj $$0) {
      return $$0.a();
   }

   @Override
   protected xi b() {
      return this.i;
   }

   @Override
   protected void a(fva $$0, cos $$1, awo $$2) {
      $$0.a($$1, 1, 1, $$2);
   }
}
