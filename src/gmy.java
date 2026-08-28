import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gmy extends gnh<cfp, fun<cfp>> {
   private static final Map<bsq.a, ale> a = ImmutableMap.of(
      bsq.a.b,
      new ale("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsq.a.c,
      new ale("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsq.a.d,
      new ale("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gmy(gkr<cfp, fun<cfp>> $$0) {
      super($$0);
   }

   public void a(ezw $$0, gdm $$1, int $$2, cfp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bsq.a $$10 = $$3.u();
         if ($$10 != bsq.a.a) {
            ale $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
