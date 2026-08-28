import com.google.common.collect.Maps;
import java.util.Map;

public class gkc extends gkb<cfq, ftr<cfq>> {
   private static final Map<cfq.a, ale> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfq.a.b, new ale("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfq.a.a, new ale("textures/entity/cow/red_mooshroom.png"));
   });

   public gkc(giv.a $$0) {
      super($$0, new ftr<>($$0.a(fwx.aC)), 0.7F);
      this.a(new gnc<>(this, $$0.c()));
   }

   public ale a(cfq $$0) {
      return a.get($$0.u());
   }
}
