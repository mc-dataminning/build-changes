import com.google.common.collect.Maps;
import java.util.Map;

public class gvm extends gvy<gyd, gbq> {
   private static final Map<cka, alz> a = ae.a(Maps.newEnumMap(cka.class), $$0 -> {
      $$0.put(cka.a, null);
      $$0.put(cka.b, alz.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cka.c, alz.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cka.d, alz.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cka.e, alz.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gvm(gtg<gyd, gbq> $$0) {
      super($$0);
   }

   public void a(fgl $$0, gle $$1, int $$2, gyd $$3, float $$4, float $$5) {
      alz $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fgp $$7 = $$1.getBuffer(glo.i($$6));
         this.d().a($$0, $$7, $$2, gsk.a($$3, 0.0F));
      }
   }
}
