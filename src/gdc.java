import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gdc extends gdl<byo, fky<byo>> {
   private static final Map<byo.a, ahh> a = ImmutableMap.of(
      byo.a.b,
      new ahh("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      byo.a.c,
      new ahh("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      byo.a.d,
      new ahh("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gdc(gav<byo, fky<byo>> $$0) {
      super($$0);
   }

   public void a(eqk $$0, ftt $$1, int $$2, byo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         byo.a $$10 = $$3.w();
         if ($$10 != byo.a.a) {
            ahh $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
