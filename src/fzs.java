import com.google.common.collect.Maps;
import java.util.Map;

public class fzs extends fzr<byk, fjo<byk>> {
   private static final Map<byk.a, ahg> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(byk.a.b, new ahg("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(byk.a.a, new ahg("textures/entity/cow/red_mooshroom.png"));
   });

   public fzs(fyl.a $$0) {
      super($$0, new fjo<>($$0.a(fmu.az)), 0.7F);
      this.a(new gcr<>(this, $$0.c()));
   }

   public ahg a(byk $$0) {
      return a.get($$0.w());
   }
}
