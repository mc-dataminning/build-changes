import com.google.common.collect.Maps;
import java.util.Map;

public class gkg extends gkf<cfu, ftv<cfu>> {
   private static final Map<cfu.a, alf> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfu.a.b, new alf("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfu.a.a, new alf("textures/entity/cow/red_mooshroom.png"));
   });

   public gkg(giz.a $$0) {
      super($$0, new ftv<>($$0.a(fxb.aC)), 0.7F);
      this.a(new gng<>(this, $$0.c()));
   }

   public alf a(cfu $$0) {
      return a.get($$0.u());
   }
}
