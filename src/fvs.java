import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fvs {
   private final asz a = atc.c();
   private final Map<asv, String> b;

   public fvs() {
      this.a.a();
      Builder<asv, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         arz $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<asv> a(List<asv> $$0) {
      List<asv> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (asv $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.a($$2);
      return $$1;
   }

   public ate a() {
      List<asa> $$0 = this.a.g();
      return new ath(asc.b, $$0);
   }
}
