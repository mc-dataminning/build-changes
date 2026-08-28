import com.google.common.collect.Maps;
import java.util.Map;

public class gvs extends gwe<gyj, gbw> {
   private static final Map<cke, alz> a = ae.a(Maps.newEnumMap(cke.class), $$0 -> {
      $$0.put(cke.a, null);
      $$0.put(cke.b, alz.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cke.c, alz.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cke.d, alz.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cke.e, alz.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gvs(gtm<gyj, gbw> $$0) {
      super($$0);
   }

   public void a(fgr $$0, glk $$1, int $$2, gyj $$3, float $$4, float $$5) {
      alz $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fgv $$7 = $$1.getBuffer(glu.j($$6));
         this.d().a($$0, $$7, $$2, gsq.a($$3, 0.0F));
      }
   }
}
