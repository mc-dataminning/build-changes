import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gbd {
   private final aud a = aug.c();
   private final Map<atz, String> b;

   public gbd() {
      this.a.a();
      Builder<atz, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         atd $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atz> a(List<atz> $$0) {
      List<atz> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atz $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public aui a() {
      List<ate> $$0 = this.a.g();
      return new aul(atg.b, $$0);
   }
}
