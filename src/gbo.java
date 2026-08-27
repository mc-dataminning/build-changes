import com.google.common.collect.Maps;
import java.util.Map;

public class gbo extends gbz<bzj, fjj<bzj>> {
   private static final Map<bzl, agt> a = ac.a(Maps.newEnumMap(bzl.class), $$0 -> {
      $$0.put(bzl.a, null);
      $$0.put(bzl.b, new agt("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bzl.c, new agt("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bzl.d, new agt("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bzl.e, new agt("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gbo(fzj<bzj, fjj<bzj>> $$0) {
      super($$0);
   }

   public void a(epd $$0, fsi $$1, int $$2, bzj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      agt $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.ce()) {
         eph $$11 = $$1.getBuffer(fsq.i($$10));
         this.c().a($$0, $$11, $$2, fyp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
