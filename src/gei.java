import com.google.common.collect.Maps;
import java.util.Map;

public class gei extends geh<cbr, fnx<cbr>> {
   private static final Map<cbr.a, ajh> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbr.a.b, new ajh("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cbr.a.a, new ajh("textures/entity/cow/red_mooshroom.png"));
   });

   public gei(gdb.a $$0) {
      super($$0, new fnx<>($$0.a(fre.aC)), 0.7F);
      this.a(new ghh<>(this, $$0.c()));
   }

   public ajh a(cbr $$0) {
      return a.get($$0.s());
   }
}
