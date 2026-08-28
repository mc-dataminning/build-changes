import com.google.common.collect.Maps;
import java.util.Map;

public class gvr extends gwd<gyi, gbv> {
   private static final Map<cke, alz> a = ae.a(Maps.newEnumMap(cke.class), $$0 -> {
      $$0.put(cke.a, null);
      $$0.put(cke.b, alz.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cke.c, alz.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cke.d, alz.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cke.e, alz.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gvr(gtl<gyi, gbv> $$0) {
      super($$0);
   }

   public void a(fgq $$0, glj $$1, int $$2, gyi $$3, float $$4, float $$5) {
      alz $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fgu $$7 = $$1.getBuffer(glt.i($$6));
         this.d().a($$0, $$7, $$2, gsp.a($$3, 0.0F));
      }
   }
}
