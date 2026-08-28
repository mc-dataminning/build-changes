import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gde {
   private final auo a = aur.c();
   private final Map<auk, String> b;

   public gde() {
      this.a.a();
      Builder<auk, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         ato $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<auk> a(List<auk> $$0) {
      List<auk> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (auk $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public aut a() {
      List<atp> $$0 = this.a.h();
      return new auw(atr.b, $$0);
   }
}
