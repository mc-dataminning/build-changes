import com.google.common.collect.Maps;
import java.util.Map;

public class fxg extends fxr<bwu, ffq<bwu>> {
   private static final Map<bww, aey> a = ac.a(Maps.newEnumMap(bww.class), $$0 -> {
      $$0.put(bww.a, null);
      $$0.put(bww.b, new aey("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bww.c, new aey("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bww.d, new aey("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bww.e, new aey("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fxg(fve<bwu, ffq<bwu>> $$0) {
      super($$0);
   }

   public void a(elr $$0, fog $$1, int $$2, bwu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aey $$10 = a.get($$3.gd());
      if ($$10 != null && !$$3.cd()) {
         elv $$11 = $$1.getBuffer(foo.i($$10));
         this.c().a($$0, $$11, $$2, fuk.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
