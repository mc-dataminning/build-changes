import com.google.common.collect.Maps;
import java.util.Map;

public class gwf extends gwr<gyy, gcl> {
   private static final Map<cjf, aku> a = af.a(Maps.newEnumMap(cjf.class), $$0 -> {
      $$0.put(cjf.a, null);
      $$0.put(cjf.b, aku.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjf.c, aku.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjf.d, aku.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjf.e, aku.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gwf(gtz<gyy, gcl> $$0) {
      super($$0);
   }

   public void a(ffu $$0, glx $$1, int $$2, gyy $$3, float $$4, float $$5) {
      aku $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.z) {
         ffy $$7 = $$1.getBuffer(gmh.j($$6));
         this.d().a($$0, $$7, $$2, gtd.a($$3, 0.0F));
      }
   }
}
