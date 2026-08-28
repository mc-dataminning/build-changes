import com.google.common.collect.Maps;
import java.util.Map;

public final class gsr extends gqr<cjc, gyx, gcj> {
   private static final Map<cjj, aku> a = af.a(Maps.newEnumMap(cjj.class), $$0 -> {
      $$0.put(cjj.a, aku.b("textures/entity/horse/horse_white.png"));
      $$0.put(cjj.b, aku.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cjj.c, aku.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cjj.d, aku.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cjj.e, aku.b("textures/entity/horse/horse_black.png"));
      $$0.put(cjj.f, aku.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cjj.g, aku.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gsr(gsb.a $$0) {
      super($$0, new gcj($$0.a(gez.bd)), new gcj($$0.a(gez.bf)));
      this.a(new gwe(this));
      this.a(new gwd(this, $$0.f(), $$0.h()));
   }

   public aku a(gyx $$0) {
      return a.get($$0.a);
   }

   public gyx b() {
      return new gyx();
   }

   public void a(cjc $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.ag().v();
   }
}
