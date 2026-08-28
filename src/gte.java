import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gte extends gtn<gvw, fzp> {
   private static final Map<buf.a, all> a = ImmutableMap.of(
      buf.a.b,
      all.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buf.a.c,
      all.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buf.a.d,
      all.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gte(gqw<gvw, fzp> $$0) {
      super($$0);
   }

   public void a(fek $$0, gix $$1, int $$2, gvw $$3, float $$4, float $$5) {
      if (!$$3.u) {
         buf.a $$6 = $$3.c;
         if ($$6 != buf.a.a) {
            all $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
