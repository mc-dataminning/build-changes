import com.google.common.collect.Maps;
import java.util.Map;

public class gtc extends gtn<gvs, fzl> {
   private static final Map<cjd, all> a = ae.a(Maps.newEnumMap(cjd.class), $$0 -> {
      $$0.put(cjd.a, null);
      $$0.put(cjd.b, all.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjd.c, all.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjd.d, all.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjd.e, all.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gtc(gqw<gvs, fzl> $$0) {
      super($$0);
   }

   public void a(fek $$0, gix $$1, int $$2, gvs $$3, float $$4, float $$5) {
      all $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         feo $$7 = $$1.getBuffer(gjh.i($$6));
         this.d().a($$0, $$7, $$2, gqb.a($$3, 0.0F));
      }
   }
}
