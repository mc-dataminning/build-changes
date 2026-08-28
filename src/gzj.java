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

public class gzj {
   private static final Logger a = LogUtils.getLogger();
   private static final alc b = new alc("atlases", ".json");
   private final List<gzi> c;

   private gzj(List<gzi> $$0) {
      this.c = $$0;
   }

   public List<Function<gzh, gyy>> a(avd $$0) {
      final Map<alj, gzi.b> $$1 = new HashMap<>();
      gzi.a $$2 = new gzi.a() {
         @Override
         public void a(alj $$0, gzi.b $$1x) {
            gzi.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<alj> $$0) {
            Iterator<Entry<alj, gzi.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<alj, gzi.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<gzh, gyy>> $$3 = ImmutableList.builder();
      $$3.add((Function<gzh, gyy>)$$0x -> gyu.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static gzj a(avd $$0, alj $$1) {
      alj $$2 = b.a($$1);
      List<gzi> $$3 = new ArrayList<>();

      for (avb $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends gzi>)gzl.h.parse($$6).getOrThrow());
         } catch (Exception var11) {
            a.error("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new gzj($$3);
   }
}
