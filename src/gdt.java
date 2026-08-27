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

public class gdt {
   private static final Logger a = LogUtils.getLogger();
   private static final agm b = new agm("atlases", ".json");
   private final List<gds> c;

   private gdt(List<gds> $$0) {
      this.c = $$0;
   }

   public List<Function<gdr, gdi>> a(aps $$0) {
      final Map<agt, gds.b> $$1 = new HashMap<>();
      gds.a $$2 = new gds.a() {
         @Override
         public void a(agt $$0, gds.b $$1x) {
            gds.b $$2 = $$1.put($$0, $$1);
            if ($$2 != null) {
               $$2.a();
            }
         }

         @Override
         public void a(Predicate<agt> $$0) {
            Iterator<Entry<agt, gds.b>> $$1 = $$1.entrySet().iterator();

            while ($$1.hasNext()) {
               Entry<agt, gds.b> $$2 = $$1.next();
               if ($$0.test($$2.getKey())) {
                  $$2.getValue().a();
                  $$1.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<gdr, gdi>> $$3 = ImmutableList.builder();
      $$3.add((Function<gdr, gdi>)$$0x -> gde.a());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static gdt a(aps $$0, agt $$1) {
      agt $$2 = b.a($$1);
      List<gds> $$3 = new ArrayList<>();

      for (apq $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, JsonParser.parseReader($$5));
            $$3.addAll((Collection<? extends gds>)gdv.h.parse($$6).getOrThrow(false, a::error));
         } catch (Exception var11) {
            a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new gdt($$3);
   }
}
