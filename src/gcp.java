import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gcp extends gcy<byk, fkm<byk>> {
   private static final Map<byk.a, ahg> a = ImmutableMap.of(
      byk.a.b,
      new ahg("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      byk.a.c,
      new ahg("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      byk.a.d,
      new ahg("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gcp(gai<byk, fkm<byk>> $$0) {
      super($$0);
   }

   public void a(eqb $$0, fth $$1, int $$2, byk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         byk.a $$10 = $$3.w();
         if ($$10 != byk.a.a) {
            ahg $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
