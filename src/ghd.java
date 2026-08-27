import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ghd extends ghm<cbq, fou<cbq>> {
   private static final Map<cbq.a, ajh> a = ImmutableMap.of(
      cbq.a.b,
      new ajh("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      cbq.a.c,
      new ajh("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      cbq.a.d,
      new ajh("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public ghd(gew<cbq, fou<cbq>> $$0) {
      super($$0);
   }

   public void a(eub $$0, fxs $$1, int $$2, cbq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cbq.a $$10 = $$3.s();
         if ($$10 != cbq.a.a) {
            ajh $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
