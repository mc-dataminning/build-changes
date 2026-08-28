import com.google.common.collect.Maps;
import java.util.Map;

public class gvo extends gwa<gyf, gbs> {
   private static final Map<cjw, alp> a = ae.a(Maps.newEnumMap(cjw.class), $$0 -> {
      $$0.put(cjw.a, null);
      $$0.put(cjw.b, alp.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjw.c, alp.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjw.d, alp.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjw.e, alp.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gvo(gti<gyf, gbs> $$0) {
      super($$0);
   }

   public void a(fgl $$0, glg $$1, int $$2, gyf $$3, float $$4, float $$5) {
      alp $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fgp $$7 = $$1.getBuffer(glq.j($$6));
         this.d().a($$0, $$7, $$2, gsm.a($$3, 0.0F));
      }
   }
}
