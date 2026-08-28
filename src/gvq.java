import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gvq extends gwa<gyj, gbw> {
   private static final Map<buy.a, alp> a = ImmutableMap.of(
      buy.a.b,
      alp.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buy.a.c,
      alp.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buy.a.d,
      alp.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gvq(gti<gyj, gbw> $$0) {
      super($$0);
   }

   public void a(fgl $$0, glg $$1, int $$2, gyj $$3, float $$4, float $$5) {
      if (!$$3.u) {
         buy.a $$6 = $$3.c;
         if ($$6 != buy.a.a) {
            alp $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
