import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fyc extends fyl<bwg, fgm<bwg>> {
   private static final Map<bwg.a, afw> a = ImmutableMap.of(
      bwg.a.b,
      new afw("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwg.a.c,
      new afw("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwg.a.d,
      new afw("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fyc(fvy<bwg, fgm<bwg>> $$0) {
      super($$0);
   }

   public void a(emh $$0, fpb $$1, int $$2, bwg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         bwg.a $$10 = $$3.t();
         if ($$10 != bwg.a.a) {
            afw $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
