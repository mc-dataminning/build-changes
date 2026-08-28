import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fxw {
   private final atw a = atz.c();
   private final Map<ats, String> b;

   public fxw() {
      this.a.a();
      Builder<ats, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         asw $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<ats> a(List<ats> $$0) {
      List<ats> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (ats $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.a($$2);
      return $$1;
   }

   public aub a() {
      List<asx> $$0 = this.a.g();
      return new aue(asz.b, $$0);
   }
}
