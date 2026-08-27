import com.google.common.collect.Maps;
import java.util.Map;

public class gah extends gag<byp, fkc<byp>> {
   private static final Map<byp.a, ahh> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(byp.a.b, new ahh("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(byp.a.a, new ahh("textures/entity/cow/red_mooshroom.png"));
   });

   public gah(fza.a $$0) {
      super($$0, new fkc<>($$0.a(fni.ay)), 0.7F);
      this.a(new gdg<>(this, $$0.c()));
   }

   public ahh a(byp $$0) {
      return a.get($$0.w());
   }
}
