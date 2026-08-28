import com.google.common.collect.Maps;
import java.util.Map;

public class gkv extends gku<cff, fuj<cff>> {
   private static final Map<cff.a, akk> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cff.a.b, new akk("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cff.a.a, new akk("textures/entity/cow/red_mooshroom.png"));
   });

   public gkv(gjo.a $$0) {
      super($$0, new fuj<>($$0.a(fxp.aC)), 0.7F);
      this.a(new gnv<>(this, $$0.c()));
   }

   public akk a(cff $$0) {
      return a.get($$0.t());
   }
}
