import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glw extends gmf<ces, ftl<ces>> {
   private static final Map<bru.a, akn> a = ImmutableMap.of(
      bru.a.b,
      new akn("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bru.a.c,
      new akn("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bru.a.d,
      new akn("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public glw(gjp<ces, ftl<ces>> $$0) {
      super($$0);
   }

   public void a(eyu $$0, gck $$1, int $$2, ces $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bru.a $$10 = $$3.u();
         if ($$10 != bru.a.a) {
            akn $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
