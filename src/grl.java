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

public class grl {
   public static final grl a = new grl(Map.of());
   private static final char b = '#';
   private final Map<String, hkw> c;

   grl(Map<String, hkw> $$0) {
      this.c = $$0;
   }

   @Nullable
   public hkw a(String $$0) {
      if (b($$0)) {
         $$0 = $$0.substring(1);
      }

      return this.c.get($$0);
   }

   private static boolean b(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public static grl.a a(JsonObject $$0, alg $$1) {
      grl.a.a $$2 = new grl.a.a();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         a($$1, $$3.getKey(), $$3.getValue().getAsString(), $$2);
      }

      return $$2.a();
   }

   private static void a(alg $$0, String $$1, String $$2, grl.a.a $$3) {
      if (b($$2)) {
         $$3.a($$1, $$2.substring(1));
      } else {
         alg $$4 = alg.c($$2);
         if ($$4 == null) {
            throw new JsonParseException($$2 + " is not valid resource location");
         }

         $$3.a($$1, new hkw($$0, $$4));
      }
   }

   public static record a(Map<String, grl.d> b) {
      public static final grl.a a = new grl.a(Map.of());

      public Map<String, grl.d> a() {
         return this.b;
      }

      public static class a {
         private final Map<String, grl.d> a = new HashMap<>();

         public grl.a.a a(String $$0, String $$1) {
            this.a.put($$0, new grl.b($$1));
            return this;
         }

         public grl.a.a a(String $$0, hkw $$1) {
            this.a.put($$0, new grl.e($$1));
            return this;
         }

         public grl.a a() {
            return this.a.isEmpty() ? grl.a.a : new grl.a(Map.copyOf(this.a));
         }
      }
   }

   static record b(String a) implements grl.d {
   }

   public static class c {
      private static final Logger a = LogUtils.getLogger();
      private final List<grl.a> b = new ArrayList<>();

      public grl.c a(grl.a $$0) {
         this.b.addLast($$0);
         return this;
      }

      public grl.c b(grl.a $$0) {
         this.b.addFirst($$0);
         return this;
      }

      public grl a(hla $$0) {
         if (this.b.isEmpty()) {
            return grl.a;
         } else {
            Object2ObjectMap<String, hkw> $$1 = new Object2ObjectArrayMap();
            Object2ObjectMap<String, grl.b> $$2 = new Object2ObjectArrayMap();

            for (grl.a $$3 : Lists.reverse(this.b)) {
               $$3.b.forEach(($$2x, $$3x) -> {
                  Objects.requireNonNull($$3x);
                  switch ($$3x) {
                     case grl.e $$6x:
                        $$2.remove($$2x);
                        $$1.put($$2x, $$6x.a());
                        break;
                     case grl.b $$7x:
                        $$1.remove($$2x);
                        $$2.put($$2x, $$7x);
                        break;
                     default:
                        throw new MatchException(null, null);
                  }
               });
            }

            if ($$2.isEmpty()) {
               return new grl($$1);
            } else {
               boolean $$4 = true;

               while ($$4) {
                  $$4 = false;
                  ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, grl.b>> $$5 = Object2ObjectMaps.fastIterator($$2);

                  while ($$5.hasNext()) {
                     it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, grl.b> $$6 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, grl.b>)$$5.next();
                     hkw $$7 = (hkw)$$1.get(((grl.b)$$6.getValue()).a);
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
                        .map($$0x -> "\t#" + (String)$$0x.getKey() + "-> #" + ((grl.b)$$0x.getValue()).a + "\n")
                        .collect(Collectors.joining())
                  );
               }

               return new grl($$1);
            }
         }
      }
   }

   public sealed interface d permits grl.e, grl.b {
   }

   static record e(hkw a) implements grl.d {
   }
}
