import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gks {
   private final aun a = auq.c();
   private final Map<auj, String> b;

   public gks() {
      this.a.a();
      Builder<auj, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         ato $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<auj> a(List<auj> $$0) {
      List<auj> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (auj $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public aus a() {
      List<atp> $$0 = this.a.h();
      return new auv(atr.b, $$0);
   }
}
