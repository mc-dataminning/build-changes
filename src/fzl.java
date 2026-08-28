import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fzl {
   private final atp a = ats.c();
   private final Map<atl, String> b;

   public fzl() {
      this.a.a();
      Builder<atl, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         asp $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<atl> a(List<atl> $$0) {
      List<atl> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (atl $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public atu a() {
      List<asq> $$0 = this.a.g();
      return new atx(ass.b, $$0);
   }
}
