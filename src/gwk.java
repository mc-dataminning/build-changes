import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gwk extends gwu<gzf, gcr> {
   private static final Map<buj.a, akv> a = ImmutableMap.of(
      buj.a.b,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buj.a.c,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buj.a.d,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gwk(guc<gzf, gcr> $$0) {
      super($$0);
   }

   public void a(ffv $$0, glz $$1, int $$2, gzf $$3, float $$4, float $$5) {
      if (!$$3.z) {
         buj.a $$6 = $$3.c;
         if ($$6 != buj.a.a) {
            akv $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
