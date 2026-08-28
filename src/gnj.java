import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gnj extends gns<cfa, fux<cfa>> {
   private static final Map<bsb.a, akk> a = ImmutableMap.of(
      bsb.a.b,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsb.a.c,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsb.a.d,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gnj(glc<cfa, fux<cfa>> $$0) {
      super($$0);
   }

   public void a(fag $$0, gdx $$1, int $$2, cfa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bsb.a $$10 = $$3.u();
         if ($$10 != bsb.a.a) {
            akk $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
