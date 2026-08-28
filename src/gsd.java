import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gsd extends gsm<guv, fyo> {
   private static final Map<btw.a, alh> a = ImmutableMap.of(
      btw.a.b,
      alh.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      btw.a.c,
      alh.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      btw.a.d,
      alh.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gsd(gpv<guv, fyo> $$0) {
      super($$0);
   }

   public void a(fdt $$0, ghw $$1, int $$2, guv $$3, float $$4, float $$5) {
      if (!$$3.u) {
         btw.a $$6 = $$3.c;
         if ($$6 != btw.a.a) {
            alh $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
