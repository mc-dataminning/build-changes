import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gmk {
   private final aur a = auu.c();
   private final Map<aun, String> b;

   public gmk() {
      this.a.a();
      Builder<aun, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         ats $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<aun> a(List<aun> $$0) {
      List<aun> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (aun $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public auw a() {
      List<att> $$0 = this.a.h();
      return new ava(atv.b, $$0);
   }
}
