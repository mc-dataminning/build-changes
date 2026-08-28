import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gyj extends gyt<hbe, geq> {
   private static final Map<bvo.a, ald> a = ImmutableMap.of(
      bvo.a.b,
      ald.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvo.a.c,
      ald.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvo.a.d,
      ald.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gyj(gwc<hbe, geq> $$0) {
      super($$0);
   }

   public void a(fho $$0, gny $$1, int $$2, hbe $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bvo.a $$6 = $$3.c;
         if ($$6 != bvo.a.a) {
            ald $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
