import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gzo extends gzy<hcj, gft> {
   private static final Map<bvw.a, ale> a = ImmutableMap.of(
      bvw.a.b,
      ale.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvw.a.c,
      ale.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvw.a.d,
      ale.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gzo(gxh<hcj, gft> $$0) {
      super($$0);
   }

   public void a(fiq $$0, gpd $$1, int $$2, hcj $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bvw.a $$6 = $$3.c;
         if ($$6 != bvw.a.a) {
            ale $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
