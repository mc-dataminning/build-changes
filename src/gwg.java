import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gwg extends gwq<gzb, gcn> {
   private static final Map<bug.a, aku> a = ImmutableMap.of(
      bug.a.b,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bug.a.c,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bug.a.d,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gwg(gty<gzb, gcn> $$0) {
      super($$0);
   }

   public void a(ffs $$0, glv $$1, int $$2, gzb $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bug.a $$6 = $$3.c;
         if ($$6 != bug.a.a) {
            aku $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
