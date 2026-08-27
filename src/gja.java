import com.google.common.collect.Maps;
import java.util.Map;

public class gja extends giz<cer, fsp<cer>> {
   private static final Map<cer.a, akm> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cer.a.b, new akm("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cer.a.a, new akm("textures/entity/cow/red_mooshroom.png"));
   });

   public gja(ght.a $$0) {
      super($$0, new fsp<>($$0.a(fvv.aC)), 0.7F);
      this.a(new gma<>(this, $$0.c()));
   }

   public akm a(cer $$0) {
      return a.get($$0.u());
   }
}
