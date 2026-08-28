import com.google.common.collect.Maps;
import java.util.Map;

public final class gss extends gqs<cjd, gyy, gcl> {
   private static final Map<cjk, aku> a = af.a(Maps.newEnumMap(cjk.class), $$0 -> {
      $$0.put(cjk.a, aku.b("textures/entity/horse/horse_white.png"));
      $$0.put(cjk.b, aku.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cjk.c, aku.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cjk.d, aku.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cjk.e, aku.b("textures/entity/horse/horse_black.png"));
      $$0.put(cjk.f, aku.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cjk.g, aku.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gss(gsc.a $$0) {
      super($$0, new gcl($$0.a(gfb.bd)), new gcl($$0.a(gfb.bf)));
      this.a(new gwf(this));
      this.a(new gwe(this, $$0.f(), $$0.h()));
   }

   public aku a(gyy $$0) {
      return a.get($$0.a);
   }

   public gyy b() {
      return new gyy();
   }

   public void a(cjd $$0, gyy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.ag().v();
   }
}
