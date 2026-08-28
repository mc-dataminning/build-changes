import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fyj {
   private final atf a = ati.c();
   private final Map<atb, String> b;

   public fyj() {
      this.a.a();
      Builder<atb, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         asf $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atb> a(List<atb> $$0) {
      List<atb> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atb $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public atk a() {
      List<asg> $$0 = this.a.g();
      return new atn(asi.b, $$0);
   }
}
