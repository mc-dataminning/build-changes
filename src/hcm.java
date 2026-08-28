import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hcm extends hcw<hfj, giq> {
   private static final Map<bwp.a, ali> a = ImmutableMap.of(
      bwp.a.b,
      ali.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwp.a.c,
      ali.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwp.a.d,
      ali.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hcm(haf<hfj, giq> $$0) {
      super($$0);
   }

   public void a(flo $$0, gsa $$1, int $$2, hfj $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bwp.a $$6 = $$3.c;
         if ($$6 != bwp.a.a) {
            ali $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
