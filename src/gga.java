import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gga extends ggj<cay, fnt<cay>> {
   private static final Map<cay.a, ajc> a = ImmutableMap.of(
      cay.a.b,
      new ajc("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      cay.a.c,
      new ajc("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      cay.a.d,
      new ajc("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gga(gdt<cay, fnt<cay>> $$0) {
      super($$0);
   }

   public void a(etd $$0, fwq $$1, int $$2, cay $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb()) {
         cay.a $$10 = $$3.w();
         if ($$10 != cay.a.a) {
            ajc $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
