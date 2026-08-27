import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gjk extends gjt<ccp, frb<ccp>> {
   private static final Map<bpt.a, ajt> a = ImmutableMap.of(
      bpt.a.b,
      new ajt("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bpt.a.c,
      new ajt("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bpt.a.d,
      new ajt("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gjk(ghd<ccp, frb<ccp>> $$0) {
      super($$0);
   }

   public void a(ewi $$0, fzz $$1, int $$2, ccp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bpt.a $$10 = $$3.u();
         if ($$10 != bpt.a.a) {
            ajt $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
