import com.google.common.collect.Maps;
import java.util.Map;

public class gsx extends gqk<cik, gyy, gbc> {
   private static final Map<cik.a, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cik.a.b, alz.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cik.a.a, alz.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gsx(grq.a $$0) {
      super($$0, new gbc($$0.a(gen.by)), new gbc($$0.a(gen.bz)), 0.7F);
      this.a(new gwa(this, $$0.d()));
   }

   public alz a(gyy $$0) {
      return a.get($$0.a);
   }

   public gyy b() {
      return new gyy();
   }

   public void a(cik $$0, gyy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
