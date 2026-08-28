import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hbz extends hcj<hey, gid> {
   private static final Map<bxa.a, alr> a = ImmutableMap.of(
      bxa.a.b,
      alr.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bxa.a.c,
      alr.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bxa.a.d,
      alr.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hbz(gzs<hey, gid> $$0) {
      super($$0);
   }

   public void a(fld $$0, grn $$1, int $$2, hey $$3, float $$4, float $$5) {
      if (!$$3.A) {
         bxa.a $$6 = $$3.c;
         if ($$6 != bxa.a.a) {
            alr $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
