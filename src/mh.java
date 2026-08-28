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
import java.util.function.ToIntFunction;
import org.slf4j.Logger;

public interface mh {
   ToIntFunction<String> a = ae.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.put("type", 0);
      $$0.put("parent", 1);
      $$0.defaultReturnValue(2);
   });
   Comparator<String> b = Comparator.comparingInt(a).thenComparing($$0 -> (String)$$0);
   Logger c = LogUtils.getLogger();

   CompletableFuture<?> a(mf var1);

   String a();

   static <T> CompletableFuture<?> a(mf $$0, Codec<T> $$1, mj.a $$2, Map<alz, T> $$3) {
      return CompletableFuture.allOf(
         $$3.entrySet().stream().map($$3x -> a($$0, $$1, $$3x.getValue(), $$2.a((alz)$$3x.getKey()))).toArray(CompletableFuture[]::new)
      );
   }

   static <T> CompletableFuture<?> a(mf $$0, js.a $$1, Codec<T> $$2, T $$3, Path $$4) {
      alx<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
      return a($$0, $$5, $$2, $$3, $$4);
   }

   static <T> CompletableFuture<?> a(mf $$0, Codec<T> $$1, T $$2, Path $$3) {
      return a($$0, JsonOps.INSTANCE, $$1, $$2, $$3);
   }

   private static <T> CompletableFuture<?> a(mf $$0, DynamicOps<JsonElement> $$1, Codec<T> $$2, T $$3, Path $$4) {
      JsonElement $$5 = (JsonElement)$$2.encodeStart($$1, $$3).getOrThrow();
      return a($$0, $$5, $$4);
   }

   static CompletableFuture<?> a(mf $$0, JsonElement $$1, Path $$2) {
      return CompletableFuture.runAsync(() -> {
         try {
            ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
            HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), $$3);
            JsonWriter $$5 = new JsonWriter(new OutputStreamWriter($$4, StandardCharsets.UTF_8));

            try {
               $$5.setSerializeNulls(false);
               $$5.setIndent("  ");
               azu.a($$5, $$1, b);
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
      }, ae.g().a("saveStable"));
   }

   @FunctionalInterface
   public interface a<T extends mh> {
      T create(mj var1);
   }
}
