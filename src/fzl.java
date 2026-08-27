import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class fzl {
   private static final Logger a = LogUtils.getLogger();
   private static final aer b = new aer("atlases", ".json");
   private final List<fzk> c;

   private fzl(List<fzk> $$0) {
      this.c = $$0;
   }

   public List<Function<fzj, fza>> a(anv $$0) {
      final Map<aey, fzk.b> $$1 = new HashMap<>();
      fzk.a $$2 = new fzk.a() {
         @Override
         public void a(aey $$0, fzk.b $$1x) {
            fzk.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<aey> $$0) {
            Iterator<Entry<aey, fzk.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<aey, fzk.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<fzj, fza>> $$3 = ImmutableList.builder();
      $$3.add((Function<fzj, fza>)$$0x -> fyw.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static fzl a(anv $$0, aey $$1) {
      aey $$2 = b.a($$1);
      List<fzk> $$3 = new ArrayList<>();

      for (ant $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends fzk>)fzn.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new fzl($$3);
   }
}
