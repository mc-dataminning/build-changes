import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gfm {
   private final auv a = auz.c();
   private final Map<aur, String> b;

   public gfm() {
      this.a.a();
      Builder<aur, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         atv $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<aur> a(List<aur> $$0) {
      List<aur> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (aur $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public avb a() {
      List<atw> $$0 = this.a.h();
      return new ave(aty.b, $$0);
   }
}
