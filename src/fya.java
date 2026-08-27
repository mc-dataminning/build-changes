import com.google.common.collect.Maps;
import java.util.Map;

public class fya extends fyl<bxv, fgi<bxv>> {
   private static final Map<bxx, afw> a = ac.a(Maps.newEnumMap(bxx.class), $$0 -> {
      $$0.put(bxx.a, null);
      $$0.put(bxx.b, new afw("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bxx.c, new afw("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bxx.d, new afw("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bxx.e, new afw("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fya(fvy<bxv, fgi<bxv>> $$0) {
      super($$0);
   }

   public void a(emh $$0, fpb $$1, int $$2, bxv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      afw $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.cd()) {
         eml $$11 = $$1.getBuffer(fpj.i($$10));
         this.c().a($$0, $$11, $$2, fve.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
