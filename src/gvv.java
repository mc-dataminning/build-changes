import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gvv extends gwf<gyo, gcb> {
   private static final Map<bvh.a, alz> a = ImmutableMap.of(
      bvh.a.b,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvh.a.c,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvh.a.d,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gvv(gtn<gyo, gcb> $$0) {
      super($$0);
   }

   public void a(fgs $$0, gll $$1, int $$2, gyo $$3, float $$4, float $$5) {
      if (!$$3.u) {
         bvh.a $$6 = $$3.c;
         if ($$6 != bvh.a.a) {
            alz $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
