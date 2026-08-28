import com.google.common.collect.Maps;
import java.util.Map;

public class gkt extends gks<cfe, fuh<cfe>> {
   private static final Map<cfe.a, akk> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfe.a.b, new akk("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfe.a.a, new akk("textures/entity/cow/red_mooshroom.png"));
   });

   public gkt(gjm.a $$0) {
      super($$0, new fuh<>($$0.a(fxn.aC)), 0.7F);
      this.a(new gnt<>(this, $$0.c()));
   }

   public akk a(cfe $$0) {
      return a.get($$0.u());
   }
}
