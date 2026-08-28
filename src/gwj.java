import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gwj extends gwt<gze, gcq> {
   private static final Map<bui.a, akv> a = ImmutableMap.of(
      bui.a.b,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bui.a.c,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bui.a.d,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gwj(gub<gze, gcq> $$0) {
      super($$0);
   }

   public void a(ffu $$0, gly $$1, int $$2, gze $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bui.a $$6 = $$3.c;
         if ($$6 != bui.a.a) {
            akv $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
