import com.google.common.collect.Maps;
import java.util.Map;

public class gwh extends gwt<gza, gcm> {
   private static final Map<cjg, akv> a = af.a(Maps.newEnumMap(cjg.class), $$0 -> {
      $$0.put(cjg.a, null);
      $$0.put(cjg.b, akv.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjg.c, akv.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjg.d, akv.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjg.e, akv.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gwh(gub<gza, gcm> $$0) {
      super($$0);
   }

   public void a(ffu $$0, gly $$1, int $$2, gza $$3, float $$4, float $$5) {
      akv $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.z) {
         ffy $$7 = $$1.getBuffer(gmi.j($$6));
         this.d().a($$0, $$7, $$2, gtf.a($$3, 0.0F));
      }
   }
}
