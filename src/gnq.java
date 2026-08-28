import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gnq {
   public static final gnq a = new gnq(Map.of());
   private static final char b = '#';
   private final Map<String, hgs> c;

   gnq(Map<String, hgs> $$0) {
      this.c = $$0;
   }

   @Nullable
   public hgs a(String $$0) {
      if (b($$0)) {
         $$0 = $$0.substring(1);
      }

      return this.c.get($$0);
   }

   private static boolean b(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public static gnq.a a(JsonObject $$0, aku $$1) {
      gnq.a.a $$2 = new gnq.a.a();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         a($$1, $$3.getKey(), $$3.getValue().getAsString(), $$2);
      }

      return $$2.a();
   }

   private static void a(aku $$0, String $$1, String $$2, gnq.a.a $$3) {
      if (b($$2)) {
         $$3.a($$1, $$2.substring(1));
      } else {
         aku $$4 = aku.c($$2);
         if ($$4 == null) {
            throw new JsonParseException($$2 + " is not valid resource location");
         }

         $$3.a($$1, new hgs($$0, $$4));
      }
   }

   public static record a(Map<String, gnq.d> b) {
      public static final gnq.a a = new gnq.a(Map.of());

      public Map<String, gnq.d> a() {
         return this.b;
      }

      public static class a {
         private final Map<String, gnq.d> a = new HashMap<>();

         public gnq.a.a a(String $$0, String $$1) {
            this.a.put($$0, new gnq.b($$1));
            return this;
         }

         public gnq.a.a a(String $$0, hgs $$1) {
            this.a.put($$0, new gnq.e($$1));
            return this;
         }

         public gnq.a a() {
            return this.a.isEmpty() ? gnq.a.a : new gnq.a(Map.copyOf(this.a));
         }
      }
   }

   static record b(String a) implements gnq.d {
   }

   public static class c {
      private static final Logger a = LogUtils.getLogger();
      private final List<gnq.a> b = new ArrayList<>();

      public gnq.c a(gnq.a $$0) {
         this.b.addLast($$0);
         return this;
      }

      public gnq.c b(gnq.a $$0) {
         this.b.addFirst($$0);
         return this;
      }

      public gnq a(hgw $$0) {
         if (this.b.isEmpty()) {
            return gnq.a;
         } else {
            Object2ObjectMap<String, hgs> $$1 = new Object2ObjectArrayMap();
            Object2ObjectMap<String, gnq.b> $$2 = new Object2ObjectArrayMap();

            for (gnq.a $$3 : Lists.reverse(this.b)) {
               $$3.b.forEach(($$2x, $$3x) -> {
                  Objects.requireNonNull($$3x);
                  switch ($$3x) {
                     case gnq.e $$6x:
                        $$1.put($$2x, $$6x.a());
                        break;
                     case gnq.b $$7x:
                        $$2.put($$2x, $$7x);
                        break;
                     default:
                        throw new MatchException(null, null);
                  }
               });
            }

            if ($$2.isEmpty()) {
               return new gnq($$1);
            } else {
               boolean $$4 = true;

               while ($$4) {
                  $$4 = false;
                  ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gnq.b>> $$5 = Object2ObjectMaps.fastIterator($$2);

                  while ($$5.hasNext()) {
                     it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gnq.b> $$6 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gnq.b>)$$5.next();
                     hgs $$7 = (hgs)$$1.get(((gnq.b)$$6.getValue()).a);
                     if ($$7 != null) {
                        $$1.put((String)$$6.getKey(), $$7);
                        $$5.remove();
                        $$4 = true;
                     }
                  }
               }

               if (!$$2.isEmpty()) {
                  a.warn(
                     "Unresolved texture references in {}:\n{}",
                     $$0.get(),
                     $$2.entrySet()
                        .stream()
                        .map($$0x -> "\t#" + (String)$$0x.getKey() + "-> #" + ((gnq.b)$$0x.getValue()).a + "\n")
                        .collect(Collectors.joining())
                  );
               }

               return new gnq($$1);
            }
         }
      }
   }

   public sealed interface d permits gnq.e, gnq.b {
   }

   static record e(hgs a) implements gnq.d {
   }
}
