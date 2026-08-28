import com.google.common.collect.Maps;
import java.util.Map;

public class gss extends gqf<cib, gyt, gax> {
   private static final Map<cib.a, alp> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cib.a.b, alp.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cib.a.a, alp.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gss(grl.a $$0) {
      super($$0, new gax($$0.a(gei.bB)), new gax($$0.a(gei.bC)), 0.7F);
      this.a(new gvv(this, $$0.d()));
   }

   public alp a(gyt $$0) {
      return a.get($$0.a);
   }

   public gyt b() {
      return new gyt();
   }

   public void a(cib $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
