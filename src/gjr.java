import com.google.common.collect.Maps;
import java.util.Map;

public class gjr extends gkc<ceo, frg<ceo>> {
   private static final Map<ceq, ajv> a = ac.a(Maps.newEnumMap(ceq.class), $$0 -> {
      $$0.put(ceq.a, null);
      $$0.put(ceq.b, new ajv("textures/entity/horse/horse_markings_white.png"));
      $$0.put(ceq.c, new ajv("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(ceq.d, new ajv("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(ceq.e, new ajv("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gjr(ghm<ceo, frg<ceo>> $$0) {
      super($$0);
   }

   public void a(ewr $$0, gai $$1, int $$2, ceo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ajv $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ce()) {
         ewv $$11 = $$1.getBuffer(gaq.i($$10));
         this.c().a($$0, $$11, $$2, ggs.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
