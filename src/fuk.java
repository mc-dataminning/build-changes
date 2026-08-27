import com.google.common.collect.Maps;
import java.util.Map;

public class fuk extends fuj<bvk, fer<bvk>> {
   private static final Map<bvk.a, aez> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvk.a.b, new aez("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bvk.a.a, new aez("textures/entity/cow/red_mooshroom.png"));
   });

   public fuk(ftd.a $$0) {
      super($$0, new fer<>($$0.a(fhw.aw)), 0.7F);
      this.a(new fxg<>(this, $$0.c()));
   }

   public aez a(bvk $$0) {
      return a.get($$0.t());
   }
}
