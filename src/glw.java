import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glw extends gmf<ceq, ftl<ceq>> {
   private static final Map<brs.a, akm> a = ImmutableMap.of(
      brs.a.b,
      new akm("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      brs.a.c,
      new akm("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      brs.a.d,
      new akm("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public glw(gjp<ceq, ftl<ceq>> $$0) {
      super($$0);
   }

   public void a(eys $$0, gck $$1, int $$2, ceq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         brs.a $$10 = $$3.u();
         if ($$10 != brs.a.a) {
            akm $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
