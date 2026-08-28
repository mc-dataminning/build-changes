import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gso extends gsx<gvg, fyz> {
   private static final Map<bub.a, ali> a = ImmutableMap.of(
      bub.a.b,
      ali.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bub.a.c,
      ali.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bub.a.d,
      ali.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gso(gqg<gvg, fyz> $$0) {
      super($$0);
   }

   public void a(feb $$0, gih $$1, int $$2, gvg $$3, float $$4, float $$5) {
      if (!$$3.u) {
         bub.a $$6 = $$3.c;
         if ($$6 != bub.a.a) {
            ali $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
