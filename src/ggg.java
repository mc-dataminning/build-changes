import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ggg {
   private final aua a = aud.c();
   private final Map<atw, String> b;

   public ggg() {
      this.a.a();
      Builder<atw, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         atb $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atw> a(List<atw> $$0) {
      List<atw> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atw $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public auf a() {
      List<atc> $$0 = this.a.h();
      return new aui(ate.b, $$0);
   }
}
