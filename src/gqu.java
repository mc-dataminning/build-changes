import com.google.common.collect.Maps;
import java.util.Map;

public class gqu extends grf<gtj, fxl> {
   private static final Map<cid, alb> a = ad.a(Maps.newEnumMap(cid.class), $$0 -> {
      $$0.put(cid.a, null);
      $$0.put(cid.b, alb.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cid.c, alb.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cid.d, alb.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cid.e, alb.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gqu(goo<gtj, fxl> $$0) {
      super($$0);
   }

   public void a(fcu $$0, ggv $$1, int $$2, gtj $$3, float $$4, float $$5) {
      alb $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fcy $$7 = $$1.getBuffer(ghe.j($$6));
         this.d().a($$0, $$7, $$2, gnt.a($$3, 0.0F));
      }
   }
}
