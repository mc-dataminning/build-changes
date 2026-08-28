import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gnb extends gnk<cfs, fuq<cfs>> {
   private static final Map<bst.a, alf> a = ImmutableMap.of(
      bst.a.b,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bst.a.c,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bst.a.d,
      new alf("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gnb(gku<cfs, fuq<cfs>> $$0) {
      super($$0);
   }

   public void a(ezz $$0, gdp $$1, int $$2, cfs $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         bst.a $$10 = $$3.u();
         if ($$10 != bst.a.a) {
            alf $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
