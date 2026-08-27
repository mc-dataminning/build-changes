import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fzj extends fzs<bwv, fhr<bwv>> {
   private static final Map<bwv.a, agg> a = ImmutableMap.of(
      bwv.a.b,
      new agg("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwv.a.c,
      new agg("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwv.a.d,
      new agg("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fzj(fxf<bwv, fhr<bwv>> $$0) {
      super($$0);
   }

   public void a(enk $$0, fqh $$1, int $$2, bwv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         bwv.a $$10 = $$3.t();
         if ($$10 != bwv.a.a) {
            agg $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
