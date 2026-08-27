import com.google.common.collect.Maps;
import java.util.Map;

public class gef extends gee<cbq, fnv<cbq>> {
   private static final Map<cbq.a, ajh> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbq.a.b, new ajh("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cbq.a.a, new ajh("textures/entity/cow/red_mooshroom.png"));
   });

   public gef(gcy.a $$0) {
      super($$0, new fnv<>($$0.a(frc.ay)), 0.7F);
      this.a(new ghe<>(this, $$0.c()));
   }

   public ajh a(cbq $$0) {
      return a.get($$0.s());
   }
}
