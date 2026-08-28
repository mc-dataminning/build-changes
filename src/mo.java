import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import org.slf4j.Logger;

public interface mo {
   ToIntFunction<String> a = ag.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.put("type", 0);
      $$0.put("parent", 1);
      $$0.defaultReturnValue(2);
   });
   Comparator<String> b = Comparator.comparingInt(a).thenComparing($$0 -> (String)$$0);
   Logger c = LogUtils.getLogger();

   CompletableFuture<?> a(mm var1);

   String a();

   static <T> CompletableFuture<?> a(mm $$0, Codec<T> $$1, mq.a $$2, Map<alk, T> $$3) {
      return a($$0, $$1, $$2::a, $$3);
   }

   static <T, E> CompletableFuture<?> a(mm $$0, Codec<E> $$1, Function<T, Path> $$2, Map<T, E> $$3) {
      return a($$0, (Function<Object, JsonElement>)($$1x -> (JsonElement)$$1.encodeStart(JsonOps.INSTANCE, $$1x).getOrThrow()), $$2, $$3);
   }

   static <T, E> CompletableFuture<?> a(mm $$0, Function<E, JsonElement> $$1, Function<T, Path> $$2, Map<T, E> $$3) {
      return CompletableFuture.allOf($$3.entrySet().stream().map($$3x -> {
         Path $$4 = $$2.apply((T)$$3x.getKey());
         JsonElement $$5 = $$1.apply((E)$$3x.getValue());
         return a($$0, $$5, $$4);
      }).toArray(CompletableFuture[]::new));
   }

   static <T> CompletableFuture<?> a(mm $$0, ji.a $$1, Codec<T> $$2, T $$3, Path $$4) {
      ali<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
      return a($$0, $$5, $$2, $$3, $$4);
   }

   static <T> CompletableFuture<?> a(mm $$0, Codec<T> $$1, T $$2, Path $$3) {
      return a($$0, JsonOps.INSTANCE, $$1, $$2, $$3);
   }

   private static <T> CompletableFuture<?> a(mm $$0, DynamicOps<JsonElement> $$1, Codec<T> $$2, T $$3, Path $$4) {
      JsonElement $$5 = (JsonElement)$$2.encodeStart($$1, $$3).getOrThrow();
      return a($$0, $$5, $$4);
   }

   static CompletableFuture<?> a(mm $$0, JsonElement $$1, Path $$2) {
      return CompletableFuture.runAsync(() -> {
         try {
            ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
            HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), $$3);
            JsonWriter $$5 = new JsonWriter(new OutputStreamWriter($$4, StandardCharsets.UTF_8));

            try {
               $$5.setSerializeNulls(false);
               $$5.setIndent("  ");
               azg.a($$5, $$1, b);
            } catch (Throwable var9) {
               try {
                  $$5.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }

               throw var9;
            }

            $$5.close();
            $$0.writeIfNeeded($$2, $$3.toByteArray(), $$4.hash());
         } catch (IOException var10) {
            c.error("Failed to save file to {}", $$2, var10);
         }
      }, ag.h().a("saveStable"));
   }

   @FunctionalInterface
   public interface a<T extends mo> {
      T create(mq var1);
   }
}
