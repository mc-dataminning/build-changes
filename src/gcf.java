import com.google.common.collect.Maps;
import java.util.Map;

public class gcf extends gcq<bzt, fka<bzt>> {
   private static final Map<bzv, ahd> a = ac.a(Maps.newEnumMap(bzv.class), $$0 -> {
      $$0.put(bzv.a, null);
      $$0.put(bzv.b, new ahd("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bzv.c, new ahd("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bzv.d, new ahd("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bzv.e, new ahd("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gcf(gaa<bzt, fka<bzt>> $$0) {
      super($$0);
   }

   public void a(ept $$0, fsz $$1, int $$2, bzt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ahd $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.ce()) {
         epx $$11 = $$1.getBuffer(fth.i($$10));
         this.c().a($$0, $$11, $$2, fzg.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
