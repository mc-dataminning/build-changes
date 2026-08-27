import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkz extends gli<ceb, fsq<ceb>> {
   private static final Map<brf.a, akh> a = ImmutableMap.of(
      brf.a.b,
      new akh("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      brf.a.c,
      new akh("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      brf.a.d,
      new akh("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gkz(gis<ceb, fsq<ceb>> $$0) {
      super($$0);
   }

   public void a(exx $$0, gbo $$1, int $$2, ceb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf()) {
         brf.a $$10 = $$3.u();
         if ($$10 != brf.a.a) {
            akh $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
