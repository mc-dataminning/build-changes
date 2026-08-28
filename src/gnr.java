import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gnr extends goa<cfe, fvf<cfe>> {
   private static final Map<bsf.a, akk> a = ImmutableMap.of(
      bsf.a.b,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsf.a.c,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsf.a.d,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gnr(glk<cfe, fvf<cfe>> $$0) {
      super($$0);
   }

   public void a(fao $$0, gef $$1, int $$2, cfe $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cj()) {
         bsf.a $$10 = $$3.t();
         if ($$10 != bsf.a.a) {
            akk $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
