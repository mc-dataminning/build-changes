import com.google.common.collect.Maps;
import java.util.Map;

public class gsb extends gsm<gur, fyk> {
   private static final Map<ciu, alh> a = ad.a(Maps.newEnumMap(ciu.class), $$0 -> {
      $$0.put(ciu.a, null);
      $$0.put(ciu.b, alh.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(ciu.c, alh.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(ciu.d, alh.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(ciu.e, alh.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gsb(gpv<gur, fyk> $$0) {
      super($$0);
   }

   public void a(fdt $$0, ghw $$1, int $$2, gur $$3, float $$4, float $$5) {
      alh $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fdx $$7 = $$1.getBuffer(gig.i($$6));
         this.d().a($$0, $$7, $$2, gpa.a($$3, 0.0F));
      }
   }
}
