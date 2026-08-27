import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwi extends fwr<buu, fez<buu>> {
   private static final Map<buu.a, aep> a = ImmutableMap.of(
      buu.a.b,
      new aep("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buu.a.c,
      new aep("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buu.a.d,
      new aep("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fwi(fue<buu, fez<buu>> $$0) {
      super($$0);
   }

   public void a(elh $$0, fng $$1, int $$2, buu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         buu.a $$10 = $$3.q();
         if ($$10 != buu.a.a) {
            aep $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
