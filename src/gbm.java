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

public class gbm {
   private static final Logger a = LogUtils.getLogger();
   private static final afz b = new afz("atlases", ".json");
   private final List<gbl> c;

   private gbm(List<gbl> $$0) {
      this.c = $$0;
   }

   public List<Function<gbk, gbb>> a(apd $$0) {
      final Map<agg, gbl.b> $$1 = new HashMap<>();
      gbl.a $$2 = new gbl.a() {
         @Override
         public void a(agg $$0, gbl.b $$1x) {
            gbl.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<agg> $$0) {
            Iterator<Entry<agg, gbl.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<agg, gbl.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<gbk, gbb>> $$3 = ImmutableList.builder();
      $$3.add((Function<gbk, gbb>)$$0x -> gax.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static gbm a(apd $$0, agg $$1) {
      agg $$2 = b.a($$1);
      List<gbl> $$3 = new ArrayList<>();

      for (apb $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends gbl>)gbo.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new gbm($$3);
   }
}
