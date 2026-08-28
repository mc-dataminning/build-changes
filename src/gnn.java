import com.google.common.collect.Maps;
import java.util.Map;

public class gnn extends gny<cgx, fuz<cgx>> {
   private static final Map<cgz, akk> a = ac.a(Maps.newEnumMap(cgz.class), $$0 -> {
      $$0.put(cgz.a, null);
      $$0.put(cgz.b, new akk("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cgz.c, new akk("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cgz.d, new akk("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cgz.e, new akk("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gnn(gli<cgx, fuz<cgx>> $$0) {
      super($$0);
   }

   public void a(fam $$0, ged $$1, int $$2, cgx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akk $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ci()) {
         faq $$11 = $$1.getBuffer(gel.i($$10));
         this.c().a($$0, $$11, $$2, gkn.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
