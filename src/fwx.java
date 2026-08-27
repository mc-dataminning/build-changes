import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fwx {
   private final ati a = atl.c();
   private final Map<ate, String> b;

   public fwx() {
      this.a.a();
      Builder<ate, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         asi $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<ate> a(List<ate> $$0) {
      List<ate> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (ate $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.a($$2);
      return $$1;
   }

   public atn a() {
      List<asj> $$0 = this.a.g();
      return new atq(asl.b, $$0);
   }
}
