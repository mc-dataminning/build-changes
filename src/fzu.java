import com.google.common.collect.Maps;
import java.util.Map;

public class fzu extends gaf<bys, fia<bys>> {
   private static final Map<byu, agi> a = ac.a(Maps.newEnumMap(byu.class), $$0 -> {
      $$0.put(byu.a, null);
      $$0.put(byu.b, new agi("textures/entity/horse/horse_markings_white.png"));
      $$0.put(byu.c, new agi("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(byu.d, new agi("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(byu.e, new agi("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fzu(fxs<bys, fia<bys>> $$0) {
      super($$0);
   }

   public void a(enw $$0, fqu $$1, int $$2, bys $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      agi $$10 = a.get($$3.gf());
      if ($$10 != null && !$$3.ce()) {
         eoa $$11 = $$1.getBuffer(frc.i($$10));
         this.c().a($$0, $$11, $$2, fwy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
