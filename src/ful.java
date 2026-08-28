import java.util.List;
import java.util.Optional;
import java.util.SequencedSet;
import javax.annotation.Nullable;

public class ful extends fuo<crl> {
   private static final fmm h = new fmm(
      alh.b("recipe_book/furnace_filter_enabled"),
      alh.b("recipe_book/furnace_filter_disabled"),
      alh.b("recipe_book/furnace_filter_enabled_highlighted"),
      alh.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xh i;
   @Nullable
   private List<cvx> j;

   public ful(crl $$0, xh $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(ctg $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fum $$0, dal<?> $$1) {
      gbx $$2 = this.g.s;
      cvx $$3 = $$1.b().a($$2.H_());
      ctg $$4 = this.f.l();
      $$0.a($$3, $$4);
      List<Optional<dai.a>> $$5 = $$1.b().a().a();
      if (!$$5.isEmpty()) {
         $$5.getFirst().ifPresent($$1x -> {
            ctg $$2x = this.f.k.get(0);
            $$0.a($$1x.a(), $$2x);
         });
      }

      ctg $$6 = this.f.k.get(1);
      if ($$6.g().f()) {
         if ($$5.size() > 1) {
            $$5.get(1).ifPresent($$2x -> $$0.a($$2x.a(), $$6));
         } else {
            if (this.j == null) {
               this.j = this.a($$2.L()).stream().map(cvx::new).toList();
            }

            $$0.a(this.j, $$6);
         }
      }
   }

   private SequencedSet<cvt> a(dtd $$0) {
      return $$0.a();
   }

   @Override
   protected xh b() {
      return this.i;
   }

   @Override
   protected void a(fus $$0, com $$1, awn $$2) {
      $$0.a($$1, 1, 1, $$2);
   }
}
