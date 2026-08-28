import com.google.common.collect.Maps;
import java.util.Map;

public class gnp extends goa<cgy, fvb<cgy>> {
   private static final Map<cha, akk> a = ac.a(Maps.newEnumMap(cha.class), $$0 -> {
      $$0.put(cha.a, null);
      $$0.put(cha.b, new akk("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cha.c, new akk("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cha.d, new akk("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cha.e, new akk("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gnp(glk<cgy, fvb<cgy>> $$0) {
      super($$0);
   }

   public void a(fao $$0, gef $$1, int $$2, cgy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akk $$10 = a.get($$3.t());
      if ($$10 != null && !$$3.cj()) {
         fas $$11 = $$1.getBuffer(gen.i($$10));
         this.c().a($$0, $$11, $$2, gkp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
