import com.google.common.collect.Maps;
import java.util.Map;

public class gnh extends gns<cgu, fut<cgu>> {
   private static final Map<cgw, akk> a = ac.a(Maps.newEnumMap(cgw.class), $$0 -> {
      $$0.put(cgw.a, null);
      $$0.put(cgw.b, new akk("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cgw.c, new akk("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cgw.d, new akk("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cgw.e, new akk("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gnh(glc<cgu, fut<cgu>> $$0) {
      super($$0);
   }

   public void a(fag $$0, gdx $$1, int $$2, cgu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akk $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         fak $$11 = $$1.getBuffer(gef.i($$10));
         this.c().a($$0, $$11, $$2, gkh.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
