import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwn extends fww<buw, ffd<buw>> {
   private static final Map<buw.a, aer> a = ImmutableMap.of(
      buw.a.b,
      new aer("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buw.a.c,
      new aer("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buw.a.d,
      new aer("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fwn(fuj<buw, ffd<buw>> $$0) {
      super($$0);
   }

   public void a(elg $$0, fnl $$1, int $$2, buw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         buw.a $$10 = $$3.q();
         if ($$10 != buw.a.a) {
            aer $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
