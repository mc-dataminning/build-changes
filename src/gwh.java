import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gwh extends gwr<gzc, gcp> {
   private static final Map<buh.a, aku> a = ImmutableMap.of(
      buh.a.b,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buh.a.c,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buh.a.d,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gwh(gtz<gzc, gcp> $$0) {
      super($$0);
   }

   public void a(ffu $$0, glx $$1, int $$2, gzc $$3, float $$4, float $$5) {
      if (!$$3.z) {
         buh.a $$6 = $$3.c;
         if ($$6 != buh.a.a) {
            aku $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
