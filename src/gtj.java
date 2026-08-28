import com.google.common.collect.Maps;
import java.util.Map;

public class gtj extends gqw<chk, gzn, gbq> {
   private static final Map<chk.a, aku> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chk.a.b, aku.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chk.a.a, aku.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gtj(gsc.a $$0) {
      super($$0, new gbq($$0.a(gfb.bB)), new gbq($$0.a(gfb.bC)), 0.7F);
      this.a(new gwm(this, $$0.d()));
   }

   public aku a(gzn $$0) {
      return a.get($$0.a);
   }

   public gzn b() {
      return new gzn();
   }

   public void a(chk $$0, gzn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
