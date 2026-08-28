import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gna extends gnj<cfr, fup<cfr>> {
   private static final Map<bss.a, alf> a = ImmutableMap.of(
      bss.a.b,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bss.a.c,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bss.a.d,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gna(gkt<cfr, fup<cfr>> $$0) {
      super($$0);
   }

   public void a(ezy $$0, gdo $$1, int $$2, cfr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bss.a $$10 = $$3.u();
         if ($$10 != bss.a.a) {
            alf $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
