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

public class goq {
   public static final goq a = new goq(Map.of());
   private static final char b = '#';
   private final Map<String, hhy> c;

   goq(Map<String, hhy> $$0) {
      this.c = $$0;
   }

   @Nullable
   public hhy a(String $$0) {
      if (b($$0)) {
         $$0 = $$0.substring(1);
      }

      return this.c.get($$0);
   }

   private static boolean b(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public static goq.a a(JsonObject $$0, aku $$1) {
      goq.a.a $$2 = new goq.a.a();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         a($$1, $$3.getKey(), $$3.getValue().getAsString(), $$2);
      }

      return $$2.a();
   }

   private static void a(aku $$0, String $$1, String $$2, goq.a.a $$3) {
      if (b($$2)) {
         $$3.a($$1, $$2.substring(1));
      } else {
         aku $$4 = aku.c($$2);
         if ($$4 == null) {
            throw new JsonParseException($$2 + " is not valid resource location");
         }

         $$3.a($$1, new hhy($$0, $$4));
      }
   }

   public static record a(Map<String, goq.d> b) {
      public static final goq.a a = new goq.a(Map.of());

      public Map<String, goq.d> a() {
         return this.b;
      }

      public static class a {
         private final Map<String, goq.d> a = new HashMap<>();

         public goq.a.a a(String $$0, String $$1) {
            this.a.put($$0, new goq.b($$1));
            return this;
         }

         public goq.a.a a(String $$0, hhy $$1) {
            this.a.put($$0, new goq.e($$1));
            return this;
         }

         public goq.a a() {
            return this.a.isEmpty() ? goq.a.a : new goq.a(Map.copyOf(this.a));
         }
      }
   }

   static record b(String a) implements goq.d {
   }

   public static class c {
      private static final Logger a = LogUtils.getLogger();
      private final List<goq.a> b = new ArrayList<>();

      public goq.c a(goq.a $$0) {
         this.b.addLast($$0);
         return this;
      }

      public goq.c b(goq.a $$0) {
         this.b.addFirst($$0);
         return this;
      }

      public goq a(hic $$0) {
         if (this.b.isEmpty()) {
            return goq.a;
         } else {
            Object2ObjectMap<String, hhy> $$1 = new Object2ObjectArrayMap();
            Object2ObjectMap<String, goq.b> $$2 = new Object2ObjectArrayMap();

            for (goq.a $$3 : Lists.reverse(this.b)) {
               $$3.b.forEach(($$2x, $$3x) -> {
                  Objects.requireNonNull($$3x);
                  switch ($$3x) {
                     case goq.e $$6x:
                        $$2.remove($$2x);
                        $$1.put($$2x, $$6x.a());
                        break;
                     case goq.b $$7x:
                        $$1.remove($$2x);
                        $$2.put($$2x, $$7x);
                        break;
                     default:
                        throw new MatchException(null, null);
                  }
               });
            }

            if ($$2.isEmpty()) {
               return new goq($$1);
            } else {
               boolean $$4 = true;

               while ($$4) {
                  $$4 = false;
                  ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, goq.b>> $$5 = Object2ObjectMaps.fastIterator($$2);

                  while ($$5.hasNext()) {
                     it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, goq.b> $$6 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, goq.b>)$$5.next();
                     hhy $$7 = (hhy)$$1.get(((goq.b)$$6.getValue()).a);
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
                        .map($$0x -> "\t#" + (String)$$0x.getKey() + "-> #" + ((goq.b)$$0x.getValue()).a + "\n")
                        .collect(Collectors.joining())
                  );
               }

               return new goq($$1);
            }
         }
      }
   }

   public sealed interface d permits goq.e, goq.b {
   }

   static record e(hhy a) implements goq.d {
   }
}
