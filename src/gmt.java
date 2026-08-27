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

public class gmt {
   private static final Logger a = LogUtils.getLogger();
   private static final ajy b = new ajy("atlases", ".json");
   private final List<gms> c;

   private gmt(List<gms> $$0) {
      this.c = $$0;
   }

   public List<Function<gmr, gmi>> a(ato $$0) {
      final Map<akf, gms.b> $$1 = new HashMap<>();
      gms.a $$2 = new gms.a() {
         @Override
         public void a(akf $$0, gms.b $$1x) {
            gms.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<akf> $$0) {
            Iterator<Entry<akf, gms.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<akf, gms.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<gmr, gmi>> $$3 = ImmutableList.builder();
      $$3.add((Function<gmr, gmi>)$$0x -> gme.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static gmt a(ato $$0, akf $$1) {
      akf $$2 = b.a($$1);
      List<gms> $$3 = new ArrayList<>();

      for (atm $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends gms>)gmv.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new gmt($$3);
   }
}
