import com.google.common.collect.Maps;
import java.util.Map;

public class gtn extends gty<gwd, fzu> {
   private static final Map<cjg, alj> a = ae.a(Maps.newEnumMap(cjg.class), $$0 -> {
      $$0.put(cjg.a, null);
      $$0.put(cjg.b, alj.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjg.c, alj.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjg.d, alj.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjg.e, alj.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gtn(grh<gwd, fzu> $$0) {
      super($$0);
   }

   public void a(fer $$0, gjg $$1, int $$2, gwd $$3, float $$4, float $$5) {
      alj $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fev $$7 = $$1.getBuffer(gjq.i($$6));
         this.d().a($$0, $$7, $$2, gql.a($$3, 0.0F));
      }
   }
}
