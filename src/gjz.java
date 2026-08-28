import com.google.common.collect.Maps;
import java.util.Map;

public class gjz extends gjy<cfn, fto<cfn>> {
   private static final Map<cfn.a, alb> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfn.a.b, new alb("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfn.a.a, new alb("textures/entity/cow/red_mooshroom.png"));
   });

   public gjz(gis.a $$0) {
      super($$0, new fto<>($$0.a(fwu.aC)), 0.7F);
      this.a(new gmz<>(this, $$0.c()));
   }

   public alb a(cfn $$0) {
      return a.get($$0.u());
   }
}
