import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gfk {
   private final avg a = avj.c();
   private final Map<avc, String> b;

   public gfk() {
      this.a.a();
      Builder<avc, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         auf $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<avc> a(List<avc> $$0) {
      List<avc> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (avc $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public avl a() {
      List<aug> $$0 = this.a.h();
      return new avo(aui.b, $$0);
   }
}
