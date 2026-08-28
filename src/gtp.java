import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gtp extends gty<gwh, fzy> {
   private static final Map<bui.a, alj> a = ImmutableMap.of(
      bui.a.b,
      alj.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bui.a.c,
      alj.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bui.a.d,
      alj.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gtp(grh<gwh, fzy> $$0) {
      super($$0);
   }

   public void a(fer $$0, gjg $$1, int $$2, gwh $$3, float $$4, float $$5) {
      if (!$$3.u) {
         bui.a $$6 = $$3.c;
         if ($$6 != bui.a.a) {
            alj $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
