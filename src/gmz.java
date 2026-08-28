import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gmz extends gni<cfq, fuo<cfq>> {
   private static final Map<bsr.a, ale> a = ImmutableMap.of(
      bsr.a.b,
      new ale("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsr.a.c,
      new ale("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsr.a.d,
      new ale("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gmz(gks<cfq, fuo<cfq>> $$0) {
      super($$0);
   }

   public void a(ezx $$0, gdn $$1, int $$2, cfq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bsr.a $$10 = $$3.u();
         if ($$10 != bsr.a.a) {
            ale $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
