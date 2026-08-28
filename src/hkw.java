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

public class hkw {
   private static final Logger a = LogUtils.getLogger();
   private static final alk b = new alk("atlases", ".json");
   private final List<hkv> c;

   private hkw(List<hkv> $$0) {
      this.c = $$0;
   }

   public List<Function<hku, hkk>> a(avo $$0) {
      final Map<alr, hkv.b> $$1 = new HashMap<>();
      hkv.a $$2 = new hkv.a() {
         @Override
         public void a(alr $$0, hkv.b $$1x) {
            hkv.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<alr> $$0) {
            Iterator<Entry<alr, hkv.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<alr, hkv.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<hku, hkk>> $$3 = ImmutableList.builder();
      $$3.add((Function<hku, hkk>)$$0x -> hkf.b());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static hkw a(avo $$0, alr $$1) {
      alr $$2 = b.a($$1);
      List<hkv> $$3 = new ArrayList<>();

      for (avm $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends hkv>)hkx.b.parse($$6).getOrThrow());
         } catch (Exception var11) {
            a.error("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new hkw($$3);
   }
}
