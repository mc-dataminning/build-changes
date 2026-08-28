import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gnp extends gny<cfd, fvd<cfd>> {
   private static final Map<bse.a, akk> a = ImmutableMap.of(
      bse.a.b,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bse.a.c,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bse.a.d,
      new akk("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gnp(gli<cfd, fvd<cfd>> $$0) {
      super($$0);
   }

   public void a(fam $$0, ged $$1, int $$2, cfd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         bse.a $$10 = $$3.u();
         if ($$10 != bse.a.a) {
            akk $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
