import com.google.common.collect.Maps;
import java.util.Map;

public class glu extends gmf<cgm, fth<cgm>> {
   private static final Map<cgo, akn> a = ac.a(Maps.newEnumMap(cgo.class), $$0 -> {
      $$0.put(cgo.a, null);
      $$0.put(cgo.b, new akn("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cgo.c, new akn("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cgo.d, new akn("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cgo.e, new akn("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public glu(gjp<cgm, fth<cgm>> $$0) {
      super($$0);
   }

   public void a(eyu $$0, gck $$1, int $$2, cgm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akn $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         eyy $$11 = $$1.getBuffer(gcs.i($$10));
         this.c().a($$0, $$11, $$2, giu.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
