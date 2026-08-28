import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hco extends hcy<hfl, gis> {
   private static final Map<bwr.a, alk> a = ImmutableMap.of(
      bwr.a.b,
      alk.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwr.a.c,
      alk.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwr.a.d,
      alk.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hco(hah<hfl, gis> $$0) {
      super($$0);
   }

   public void a(flq $$0, gsc $$1, int $$2, hfl $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bwr.a $$6 = $$3.c;
         if ($$6 != bwr.a.a) {
            alk $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
