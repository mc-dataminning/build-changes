import com.google.common.collect.Maps;
import java.util.Map;

public class gtk extends gqx<chk, gzo, gbq> {
   private static final Map<chk.a, akv> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chk.a.b, akv.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chk.a.a, akv.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gtk(gsd.a $$0) {
      super($$0, new gbq($$0.a(gfb.bB)), new gbq($$0.a(gfb.bC)), 0.7F);
      this.a(new gwn(this, $$0.d()));
   }

   public akv a(gzo $$0) {
      return a.get($$0.a);
   }

   public gzo b() {
      return new gzo();
   }

   public void a(chk $$0, gzo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
