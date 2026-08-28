import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gnc extends gnl<cft, fur<cft>> {
   private static final Map<bsu.a, alf> a = ImmutableMap.of(
      bsu.a.b,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsu.a.c,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsu.a.d,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gnc(gkv<cft, fur<cft>> $$0) {
      super($$0);
   }

   public void a(faa $$0, gdq $$1, int $$2, cft $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bsu.a $$10 = $$3.u();
         if ($$10 != bsu.a.a) {
            alf $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
