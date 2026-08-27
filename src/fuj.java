import com.google.common.collect.Maps;
import java.util.Map;

public class fuj extends fui<buz, fer<buz>> {
   private static final Map<buz.a, aeu> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(buz.a.b, new aeu("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(buz.a.a, new aeu("textures/entity/cow/red_mooshroom.png"));
   });

   public fuj(ftc.a $$0) {
      super($$0, new fer<>($$0.a(fhw.aw)), 0.7F);
      this.a(new fxf<>(this, $$0.c()));
   }

   public aeu a(buz $$0) {
      return a.get($$0.q());
   }
}
