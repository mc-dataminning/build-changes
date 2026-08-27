import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gjt extends gkc<ccu, frk<ccu>> {
   private static final Map<bpy.a, ajv> a = ImmutableMap.of(
      bpy.a.b,
      new ajv("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bpy.a.c,
      new ajv("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bpy.a.d,
      new ajv("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gjt(ghm<ccu, frk<ccu>> $$0) {
      super($$0);
   }

   public void a(ewr $$0, gai $$1, int $$2, ccu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bpy.a $$10 = $$3.u();
         if ($$10 != bpy.a.a) {
            ajv $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
