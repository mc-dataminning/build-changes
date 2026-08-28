import com.google.common.collect.Maps;
import java.util.Map;

public class gti extends gqv<chj, gzm, gbo> {
   private static final Map<chj.a, aku> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chj.a.b, aku.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chj.a.a, aku.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gti(gsb.a $$0) {
      super($$0, new gbo($$0.a(gez.bB)), new gbo($$0.a(gez.bC)), 0.7F);
      this.a(new gwl(this, $$0.d()));
   }

   public aku a(gzm $$0) {
      return a.get($$0.a);
   }

   public gzm b() {
      return new gzm();
   }

   public void a(chj $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
