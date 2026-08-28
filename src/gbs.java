import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gbs {
   private final aug a = auj.c();
   private final Map<auc, String> b;

   public gbs() {
      this.a.a();
      Builder<auc, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         atg $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<auc> a(List<auc> $$0) {
      List<auc> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (auc $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public aul a() {
      List<ath> $$0 = this.a.g();
      return new auo(atj.b, $$0);
   }
}
