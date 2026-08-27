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

public class fyl {
   private static final Logger a = LogUtils.getLogger();
   private static final aei b = new aei("atlases", ".json");
   private final List<fyk> c;

   private fyl(List<fyk> $$0) {
      this.c = $$0;
   }

   public List<Function<fyj, fya>> a(ank $$0) {
      final Map<aep, fyk.b> $$1 = new HashMap<>();
      fyk.a $$2 = new fyk.a() {
         @Override
         public void a(aep $$0, fyk.b $$1x) {
            fyk.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<aep> $$0) {
            Iterator<Entry<aep, fyk.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<aep, fyk.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<fyj, fya>> $$3 = ImmutableList.builder();
      $$3.add((Function<fyj, fya>)$$0x -> fxw.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static fyl a(ank $$0, aep $$1) {
      aep $$2 = b.a($$1);
      List<fyk> $$3 = new ArrayList<>();

      for (ani $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends fyk>)fyn.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new fyl($$3);
   }
}
