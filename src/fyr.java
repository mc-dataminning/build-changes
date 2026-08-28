import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fyr {
   private final ath a = atk.c();
   private final Map<atd, String> b;

   public fyr() {
      this.a.a();
      Builder<atd, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         ash $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atd> a(List<atd> $$0) {
      List<atd> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atd $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public atm a() {
      List<asi> $$0 = this.a.g();
      return new atp(ask.b, $$0);
   }
}
