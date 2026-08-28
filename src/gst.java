import com.google.common.collect.Maps;
import java.util.Map;

public final class gst extends gqt<cjd, gyz, gcl> {
   private static final Map<cjk, akv> a = af.a(Maps.newEnumMap(cjk.class), $$0 -> {
      $$0.put(cjk.a, akv.b("textures/entity/horse/horse_white.png"));
      $$0.put(cjk.b, akv.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cjk.c, akv.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cjk.d, akv.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cjk.e, akv.b("textures/entity/horse/horse_black.png"));
      $$0.put(cjk.f, akv.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cjk.g, akv.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gst(gsd.a $$0) {
      super($$0, new gcl($$0.a(gfb.bd)), new gcl($$0.a(gfb.bf)));
      this.a(new gwg(this));
      this.a(new gwf(this, $$0.f(), $$0.h()));
   }

   public akv a(gyz $$0) {
      return a.get($$0.a);
   }

   public gyz b() {
      return new gyz();
   }

   public void a(cjd $$0, gyz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.ak().v();
   }
}
