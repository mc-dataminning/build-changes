import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfc extends gfl<caj, fmx<caj>> {
   private static final Map<caj.a, aiy> a = ImmutableMap.of(
      caj.a.b,
      new aiy("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      caj.a.c,
      new aiy("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      caj.a.d,
      new aiy("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gfc(gcv<caj, fmx<caj>> $$0) {
      super($$0);
   }

   public void a(esh $$0, fvt $$1, int $$2, caj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         caj.a $$10 = $$3.w();
         if ($$10 != caj.a.a) {
            aiy $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
