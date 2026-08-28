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

public class heo {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = new akn("atlases", ".json");
   private final List<hen> c;

   private heo(List<hen> $$0) {
      this.c = $$0;
   }

   public List<Function<hem, hed>> a(aup $$0) {
      final Map<aku, hen.b> $$1 = new HashMap<>();
      hen.a $$2 = new hen.a() {
         @Override
         public void a(aku $$0, hen.b $$1x) {
            hen.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<aku> $$0) {
            Iterator<Entry<aku, hen.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<aku, hen.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<hem, hed>> $$3 = ImmutableList.builder();
      $$3.add((Function<hem, hed>)$$0x -> hdz.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static heo a(aup $$0, aku $$1) {
      aku $$2 = b.a($$1);
      List<hen> $$3 = new ArrayList<>();

      for (aun $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends hen>)heq.h.parse($$6).getOrThrow());
         } catch (Exception var11) {
            a.error("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new heo($$3);
   }
}
