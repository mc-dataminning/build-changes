import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gmv extends gne<cfm, fuk<cfm>> {
   private static final Map<bsn.a, alb> a = ImmutableMap.of(
      bsn.a.b,
      new alb("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsn.a.c,
      new alb("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsn.a.d,
      new alb("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gmv(gko<cfm, fuk<cfm>> $$0) {
      super($$0);
   }

   public void a(ezt $$0, gdj $$1, int $$2, cfm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bsn.a $$10 = $$3.u();
         if ($$10 != bsn.a.a) {
            alb $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
