import com.google.common.collect.Maps;
import java.util.Map;

public class gnz extends gny<cgi, gtx, fwr> {
   private static final Map<cgi.a, alb> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cgi.a.b, alb.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cgi.a.a, alb.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gnz(gms.a $$0) {
      super($$0, new fwr($$0.a(gaa.bj)), 0.7F);
      this.a(new gra(this, $$0.d()));
   }

   public alb a(gtx $$0) {
      return a.get($$0.a);
   }

   public gtx c() {
      return new gtx();
   }

   public void a(cgi $$0, gtx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
