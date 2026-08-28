import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gwi extends gws<gzd, gcp> {
   private static final Map<buh.a, akv> a = ImmutableMap.of(
      buh.a.b,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buh.a.c,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buh.a.d,
      akv.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gwi(gua<gzd, gcp> $$0) {
      super($$0);
   }

   public void a(fft $$0, glx $$1, int $$2, gzd $$3, float $$4, float $$5) {
      if (!$$3.z) {
         buh.a $$6 = $$3.c;
         if ($$6 != buh.a.a) {
            akv $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
