import com.google.common.collect.Maps;
import java.util.Map;

public class fuo extends fun<bve, few<bve>> {
   private static final Map<bve.a, aew> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bve.a.b, new aew("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bve.a.a, new aew("textures/entity/cow/red_mooshroom.png"));
   });

   public fuo(fth.a $$0) {
      super($$0, new few<>($$0.a(fib.aw)), 0.7F);
      this.a(new fxk<>(this, $$0.c()));
   }

   public aew a(bve $$0) {
      return a.get($$0.t());
   }
}
