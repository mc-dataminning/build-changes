import com.google.common.collect.Maps;
import java.util.Map;

public class gja extends giz<cet, fsp<cet>> {
   private static final Map<cet.a, akn> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cet.a.b, new akn("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cet.a.a, new akn("textures/entity/cow/red_mooshroom.png"));
   });

   public gja(ght.a $$0) {
      super($$0, new fsp<>($$0.a(fvv.aC)), 0.7F);
      this.a(new gma<>(this, $$0.c()));
   }

   public akn a(cet $$0) {
      return a.get($$0.u());
   }
}
