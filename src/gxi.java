import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gxi extends gxs<had, gdp> {
   private static final Map<buw.a, aku> a = ImmutableMap.of(
      buw.a.b,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buw.a.c,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buw.a.d,
      aku.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gxi(gva<had, gdp> $$0) {
      super($$0);
   }

   public void a(fgr $$0, gmx $$1, int $$2, had $$3, float $$4, float $$5) {
      if (!$$3.z) {
         buw.a $$6 = $$3.c;
         if ($$6 != buw.a.a) {
            aku $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
