import com.google.common.collect.Maps;
import java.util.Map;

public class hck extends hcw<hff, gim> {
   private static final ali a = ali.b("invisible");
   private static final Map<clx, ali> b = Maps.newEnumMap(
      Map.of(
         clx.a,
         a,
         clx.b,
         ali.b("textures/entity/horse/horse_markings_white.png"),
         clx.c,
         ali.b("textures/entity/horse/horse_markings_whitefield.png"),
         clx.d,
         ali.b("textures/entity/horse/horse_markings_whitedots.png"),
         clx.e,
         ali.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hck(haf<hff, gim> $$0) {
      super($$0);
   }

   public void a(flo $$0, gsa $$1, int $$2, hff $$3, float $$4, float $$5) {
      ali $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         flr $$7 = $$1.getBuffer(gsl.j($$6));
         this.d().a($$0, $$7, $$2, gzj.a($$3, 0.0F));
      }
   }
}
