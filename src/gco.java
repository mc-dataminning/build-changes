import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gco extends gcx<byj, fkl<byj>> {
   private static final Map<byj.a, ahg> a = ImmutableMap.of(
      byj.a.b,
      new ahg("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      byj.a.c,
      new ahg("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      byj.a.d,
      new ahg("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gco(gah<byj, fkl<byj>> $$0) {
      super($$0);
   }

   public void a(eqa $$0, ftg $$1, int $$2, byj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         byj.a $$10 = $$3.w();
         if ($$10 != byj.a.a) {
            ahg $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
