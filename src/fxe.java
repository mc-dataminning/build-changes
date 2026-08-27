import com.google.common.collect.Maps;
import java.util.Map;

public class fxe extends fxd<bxe, fhi<bxe>> {
   private static final Map<bxe.a, agi> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bxe.a.b, new agi("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bxe.a.a, new agi("textures/entity/cow/red_mooshroom.png"));
   });

   public fxe(fvx.a $$0) {
      super($$0, new fhi<>($$0.a(fkn.aw)), 0.7F);
      this.a(new gaa<>(this, $$0.c()));
   }

   public agi a(bxe $$0) {
      return a.get($$0.w());
   }
}
