import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fzw extends gaf<bxd, fie<bxd>> {
   private static final Map<bxd.a, agi> a = ImmutableMap.of(
      bxd.a.b,
      new agi("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bxd.a.c,
      new agi("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bxd.a.d,
      new agi("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fzw(fxs<bxd, fie<bxd>> $$0) {
      super($$0);
   }

   public void a(enw $$0, fqu $$1, int $$2, bxd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bxd.a $$10 = $$3.w();
         if ($$10 != bxd.a.a) {
            agi $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
