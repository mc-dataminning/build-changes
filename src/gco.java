import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gco {
   private final aul a = auo.c();
   private final Map<auh, String> b;

   public gco() {
      this.a.a();
      Builder<auh, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         atl $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<auh> a(List<auh> $$0) {
      List<auh> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (auh $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public auq a() {
      List<atm> $$0 = this.a.h();
      return new aut(ato.b, $$0);
   }
}
