import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fzt {
   private final ato a = atr.c();
   private final Map<atk, String> b;

   public fzt() {
      this.a.a();
      Builder<atk, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         aso $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atk> a(List<atk> $$0) {
      List<atk> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atk $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.a($$2);
      return $$1;
   }

   public att a() {
      List<asp> $$0 = this.a.g();
      return new atw(asr.b, $$0);
   }
}
