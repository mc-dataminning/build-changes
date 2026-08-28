import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gbn {
   private final aue a = auh.c();
   private final Map<aua, String> b;

   public gbn() {
      this.a.a();
      Builder<aua, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         ate $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<aua> a(List<aua> $$0) {
      List<aua> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (aua $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public auj a() {
      List<atf> $$0 = this.a.g();
      return new aum(ath.b, $$0);
   }
}
