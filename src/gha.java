import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gha extends ghj<cbp, fos<cbp>> {
   private static final Map<cbp.a, ajh> a = ImmutableMap.of(
      cbp.a.b,
      new ajh("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      cbp.a.c,
      new ajh("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      cbp.a.d,
      new ajh("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gha(get<cbp, fos<cbp>> $$0) {
      super($$0);
   }

   public void a(etz $$0, fxq $$1, int $$2, cbp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cbp.a $$10 = $$3.s();
         if ($$10 != cbp.a.a) {
            ajh $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
