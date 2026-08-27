import com.google.common.collect.Maps;
import java.util.Map;

public class ggy extends ghj<cdh, fon<cdh>> {
   private static final Map<cdj, ajh> a = ac.a(Maps.newEnumMap(cdj.class), $$0 -> {
      $$0.put(cdj.a, null);
      $$0.put(cdj.b, new ajh("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cdj.c, new ajh("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cdj.d, new ajh("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cdj.e, new ajh("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public ggy(get<cdh, fon<cdh>> $$0) {
      super($$0);
   }

   public void a(etz $$0, fxq $$1, int $$2, cdh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ajh $$10 = a.get($$3.s());
      if ($$10 != null && !$$3.ce()) {
         eud $$11 = $$1.getBuffer(fxy.i($$10));
         this.c().a($$0, $$11, $$2, gdz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
