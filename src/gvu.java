import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gvu extends gwe<gyn, gca> {
   private static final Map<bvg.a, alz> a = ImmutableMap.of(
      bvg.a.b,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvg.a.c,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvg.a.d,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gvu(gtm<gyn, gca> $$0) {
      super($$0);
   }

   public void a(fgr $$0, glk $$1, int $$2, gyn $$3, float $$4, float $$5) {
      if (!$$3.u) {
         bvg.a $$6 = $$3.c;
         if ($$6 != bvg.a.a) {
            alz $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
