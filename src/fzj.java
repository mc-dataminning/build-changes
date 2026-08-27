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

public class fzj {
   private static final Logger a = LogUtils.getLogger();
   private static final aep b = new aep("atlases", ".json");
   private final List<fzi> c;

   private fzj(List<fzi> $$0) {
      this.c = $$0;
   }

   public List<Function<fzh, fyy>> a(ant $$0) {
      final Map<aew, fzi.b> $$1 = new HashMap<>();
      fzi.a $$2 = new fzi.a() {
         @Override
         public void a(aew $$0, fzi.b $$1x) {
            fzi.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<aew> $$0) {
            Iterator<Entry<aew, fzi.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<aew, fzi.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<fzh, fyy>> $$3 = ImmutableList.builder();
      $$3.add((Function<fzh, fyy>)$$0x -> fyu.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static fzj a(ant $$0, aew $$1) {
      aew $$2 = b.a($$1);
      List<fzi> $$3 = new ArrayList<>();

      for (anr $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends fzi>)fzl.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new fzj($$3);
   }
}
