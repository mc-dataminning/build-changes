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

public class gsl {
   public static final gsl a = new gsl(Map.of());
   private static final char b = '#';
   private final Map<String, hlx> c;

   gsl(Map<String, hlx> $$0) {
      this.c = $$0;
   }

   @Nullable
   public hlx a(String $$0) {
      if (b($$0)) {
         $$0 = $$0.substring(1);
      }

      return this.c.get($$0);
   }

   private static boolean b(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public static gsl.a a(JsonObject $$0, alg $$1) {
      gsl.a.a $$2 = new gsl.a.a();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         a($$1, $$3.getKey(), $$3.getValue().getAsString(), $$2);
      }

      return $$2.a();
   }

   private static void a(alg $$0, String $$1, String $$2, gsl.a.a $$3) {
      if (b($$2)) {
         $$3.a($$1, $$2.substring(1));
      } else {
         alg $$4 = alg.c($$2);
         if ($$4 == null) {
            throw new JsonParseException($$2 + " is not valid resource location");
         }

         $$3.a($$1, new hlx($$0, $$4));
      }
   }

   public static record a(Map<String, gsl.d> b) {
      public static final gsl.a a = new gsl.a(Map.of());

      public Map<String, gsl.d> a() {
         return this.b;
      }

      public static class a {
         private final Map<String, gsl.d> a = new HashMap<>();

         public gsl.a.a a(String $$0, String $$1) {
            this.a.put($$0, new gsl.b($$1));
            return this;
         }

         public gsl.a.a a(String $$0, hlx $$1) {
            this.a.put($$0, new gsl.e($$1));
            return this;
         }

         public gsl.a a() {
            return this.a.isEmpty() ? gsl.a.a : new gsl.a(Map.copyOf(this.a));
         }
      }
   }

   static record b(String a) implements gsl.d {
   }

   public static class c {
      private static final Logger a = LogUtils.getLogger();
      private final List<gsl.a> b = new ArrayList<>();

      public gsl.c a(gsl.a $$0) {
         this.b.addLast($$0);
         return this;
      }

      public gsl.c b(gsl.a $$0) {
         this.b.addFirst($$0);
         return this;
      }

      public gsl a(hmb $$0) {
         if (this.b.isEmpty()) {
            return gsl.a;
         } else {
            Object2ObjectMap<String, hlx> $$1 = new Object2ObjectArrayMap();
            Object2ObjectMap<String, gsl.b> $$2 = new Object2ObjectArrayMap();

            for (gsl.a $$3 : Lists.reverse(this.b)) {
               $$3.b.forEach(($$2x, $$3x) -> {
                  Objects.requireNonNull($$3x);
                  switch ($$3x) {
                     case gsl.e $$6x:
                        $$2.remove($$2x);
                        $$1.put($$2x, $$6x.a());
                        break;
                     case gsl.b $$7x:
                        $$1.remove($$2x);
                        $$2.put($$2x, $$7x);
                        break;
                     default:
                        throw new MatchException(null, null);
                  }
               });
            }

            if ($$2.isEmpty()) {
               return new gsl($$1);
            } else {
               boolean $$4 = true;

               while ($$4) {
                  $$4 = false;
                  ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gsl.b>> $$5 = Object2ObjectMaps.fastIterator($$2);

                  while ($$5.hasNext()) {
                     it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gsl.b> $$6 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gsl.b>)$$5.next();
                     hlx $$7 = (hlx)$$1.get(((gsl.b)$$6.getValue()).a);
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
                        .map($$0x -> "\t#" + (String)$$0x.getKey() + "-> #" + ((gsl.b)$$0x.getValue()).a + "\n")
                        .collect(Collectors.joining())
                  );
               }

               return new gsl($$1);
            }
         }
      }
   }

   public sealed interface d permits gsl.e, gsl.b {
   }

   static record e(hlx a) implements gsl.d {
   }
}
