import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gmi {
   private final aup a = aus.c();
   private final Map<aul, String> b;

   public gmi() {
      this.a.a();
      Builder<aul, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         atq $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<aul> a(List<aul> $$0) {
      List<aul> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (aul $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public auu a() {
      List<atr> $$0 = this.a.h();
      return new auy(att.b, $$0);
   }
}
