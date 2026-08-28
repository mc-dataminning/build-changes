import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gcd {
   private final auk a = aun.c();
   private final Map<aug, String> b;

   public gcd() {
      this.a.a();
      Builder<aug, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         atk $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<aug> a(List<aug> $$0) {
      List<aug> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (aug $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public aup a() {
      List<atl> $$0 = this.a.h();
      return new aus(atn.b, $$0);
   }
}
