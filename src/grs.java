import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class grs extends gsb<guj, fyd> {
   private static final Map<bto.a, ale> a = ImmutableMap.of(
      bto.a.b,
      ale.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bto.a.c,
      ale.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bto.a.d,
      ale.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public grs(gpk<guj, fyd> $$0) {
      super($$0);
   }

   public void a(fdi $$0, ghl $$1, int $$2, guj $$3, float $$4, float $$5) {
      if (!$$3.u) {
         bto.a $$6 = $$3.c;
         if ($$6 != bto.a.a) {
            ale $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
