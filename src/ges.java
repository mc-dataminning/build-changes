import com.google.common.collect.Maps;
import java.util.Map;

public class ges extends gfd<cbx, fmm<cbx>> {
   private static final Map<cbz, aiy> a = ac.a(Maps.newEnumMap(cbz.class), $$0 -> {
      $$0.put(cbz.a, null);
      $$0.put(cbz.b, new aiy("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cbz.c, new aiy("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cbz.d, new aiy("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cbz.e, new aiy("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public ges(gcn<cbx, fmm<cbx>> $$0) {
      super($$0);
   }

   public void a(esa $$0, fvl $$1, int $$2, cbx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aiy $$10 = a.get($$3.gg());
      if ($$10 != null && !$$3.ce()) {
         ese $$11 = $$1.getBuffer(fvt.i($$10));
         this.c().a($$0, $$11, $$2, gbt.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
