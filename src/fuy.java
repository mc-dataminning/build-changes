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
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class fuy {
   private static final Logger a = LogUtils.getLogger();
   private static final acj b = new acj("atlases", ".json");
   private final List<fuz> c;

   private fuy(List<fuz> $$0) {
      this.c = $$0;
   }

   public List<Supplier<fup>> a(akx $$0) {
      final Map<acq, fuz.b> $$1 = new HashMap<>();
      fuz.a $$2 = new fuz.a() {
         @Override
         public void a(acq $$0, fuz.b $$1x) {
            fuz.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<acq> $$0) {
            Iterator<Entry<acq, fuz.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<acq, fuz.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Supplier<fup>> $$3 = ImmutableList.builder();
      $$3.add(ful::a);
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static fuy a(akx $$0, acq $$1) {
      acq $$2 = b.a($$1);
      List<fuz> $$3 = new ArrayList<>();

      for (akv $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends fuz>)fvb.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new fuy($$3);
   }
}
