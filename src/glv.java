import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class glv {
   private final auz a = avc.c();
   private final Map<auu, String> b;

   public glv() {
      this.a.a();
      Builder<auu, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         atz $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<auu> a(List<auu> $$0) {
      List<auu> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (auu $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public ave a() {
      List<aua> $$0 = this.a.h();
      return new avh(auc.b, $$0);
   }
}
