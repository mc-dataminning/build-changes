import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ggd {
   private final atz a = auc.c();
   private final Map<atv, String> b;

   public ggd() {
      this.a.a();
      Builder<atv, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         ata $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atv> a(List<atv> $$0) {
      List<atv> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atv $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public aue a() {
      List<atb> $$0 = this.a.h();
      return new auh(atd.b, $$0);
   }
}
