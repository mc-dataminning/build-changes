import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gch extends gcq<bye, fke<bye>> {
   private static final Map<bye.a, ahd> a = ImmutableMap.of(
      bye.a.b,
      new ahd("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bye.a.c,
      new ahd("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bye.a.d,
      new ahd("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gch(gaa<bye, fke<bye>> $$0) {
      super($$0);
   }

   public void a(ept $$0, fsz $$1, int $$2, bye $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bye.a $$10 = $$3.w();
         if ($$10 != bye.a.a) {
            ahd $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
