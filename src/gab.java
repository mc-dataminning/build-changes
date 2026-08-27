import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gab extends gak<bxi, fij<bxi>> {
   private static final Map<bxi.a, agm> a = ImmutableMap.of(
      bxi.a.b,
      new agm("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bxi.a.c,
      new agm("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bxi.a.d,
      new agm("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gab(fxx<bxi, fij<bxi>> $$0) {
      super($$0);
   }

   public void a(eob $$0, fqz $$1, int $$2, bxi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bxi.a $$10 = $$3.w();
         if ($$10 != bxi.a.a) {
            agm $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
