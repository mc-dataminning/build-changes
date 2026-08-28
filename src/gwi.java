import com.google.common.collect.Maps;
import java.util.Map;

public class gwi extends gwu<gzb, gcn> {
   private static final Map<cjh, akv> a = af.a(Maps.newEnumMap(cjh.class), $$0 -> {
      $$0.put(cjh.a, null);
      $$0.put(cjh.b, akv.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjh.c, akv.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjh.d, akv.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjh.e, akv.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gwi(guc<gzb, gcn> $$0) {
      super($$0);
   }

   public void a(ffv $$0, glz $$1, int $$2, gzb $$3, float $$4, float $$5) {
      akv $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.z) {
         ffz $$7 = $$1.getBuffer(gmj.j($$6));
         this.d().a($$0, $$7, $$2, gtg.a($$3, 0.0F));
      }
   }
}
