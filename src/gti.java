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

public class gti {
   public static final gti a = new gti(Map.of());
   private static final char b = '#';
   private final Map<String, hmx> c;

   gti(Map<String, hmx> $$0) {
      this.c = $$0;
   }

   @Nullable
   public hmx a(String $$0) {
      if (b($$0)) {
         $$0 = $$0.substring(1);
      }

      return this.c.get($$0);
   }

   private static boolean b(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public static gti.a a(JsonObject $$0, alr $$1) {
      gti.a.a $$2 = new gti.a.a();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         a($$1, $$3.getKey(), $$3.getValue().getAsString(), $$2);
      }

      return $$2.a();
   }

   private static void a(alr $$0, String $$1, String $$2, gti.a.a $$3) {
      if (b($$2)) {
         $$3.a($$1, $$2.substring(1));
      } else {
         alr $$4 = alr.c($$2);
         if ($$4 == null) {
            throw new JsonParseException($$2 + " is not valid resource location");
         }

         $$3.a($$1, new hmx($$0, $$4));
      }
   }

   public static record a(Map<String, gti.d> b) {
      public static final gti.a a = new gti.a(Map.of());

      public Map<String, gti.d> a() {
         return this.b;
      }

      public static class a {
         private final Map<String, gti.d> a = new HashMap<>();

         public gti.a.a a(String $$0, String $$1) {
            this.a.put($$0, new gti.b($$1));
            return this;
         }

         public gti.a.a a(String $$0, hmx $$1) {
            this.a.put($$0, new gti.e($$1));
            return this;
         }

         public gti.a a() {
            return this.a.isEmpty() ? gti.a.a : new gti.a(Map.copyOf(this.a));
         }
      }
   }

   static record b(String a) implements gti.d {
   }

   public static class c {
      private static final Logger a = LogUtils.getLogger();
      private final List<gti.a> b = new ArrayList<>();

      public gti.c a(gti.a $$0) {
         this.b.addLast($$0);
         return this;
      }

      public gti.c b(gti.a $$0) {
         this.b.addFirst($$0);
         return this;
      }

      public gti a(hnb $$0) {
         if (this.b.isEmpty()) {
            return gti.a;
         } else {
            Object2ObjectMap<String, hmx> $$1 = new Object2ObjectArrayMap();
            Object2ObjectMap<String, gti.b> $$2 = new Object2ObjectArrayMap();

            for (gti.a $$3 : Lists.reverse(this.b)) {
               $$3.b.forEach(($$2x, $$3x) -> {
                  Objects.requireNonNull($$3x);
                  switch ($$3x) {
                     case gti.e $$6x:
                        $$2.remove($$2x);
                        $$1.put($$2x, $$6x.a());
                        break;
                     case gti.b $$7x:
                        $$1.remove($$2x);
                        $$2.put($$2x, $$7x);
                        break;
                     default:
                        throw new MatchException(null, null);
                  }
               });
            }

            if ($$2.isEmpty()) {
               return new gti($$1);
            } else {
               boolean $$4 = true;

               while ($$4) {
                  $$4 = false;
                  ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gti.b>> $$5 = Object2ObjectMaps.fastIterator($$2);

                  while ($$5.hasNext()) {
                     it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gti.b> $$6 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gti.b>)$$5.next();
                     hmx $$7 = (hmx)$$1.get(((gti.b)$$6.getValue()).a);
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
                     $$0.debugName(),
                     $$2.entrySet()
                        .stream()
                        .map($$0x -> "\t#" + (String)$$0x.getKey() + "-> #" + ((gti.b)$$0x.getValue()).a + "\n")
                        .collect(Collectors.joining())
                  );
               }

               return new gti($$1);
            }
         }
      }
   }

   public sealed interface d permits gti.e, gti.b {
   }

   static record e(hmx a) implements gti.d {
   }
}
