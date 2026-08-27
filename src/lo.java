import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.function.ToIntFunction;
import org.slf4j.Logger;

public interface lo {
   ToIntFunction<String> a = ad.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.put("type", 0);
      $$0.put("parent", 1);
      $$0.defaultReturnValue(2);
   });
   Comparator<String> b = Comparator.comparingInt(a).thenComparing($$0 -> (String)$$0);
   Logger c = LogUtils.getLogger();

   CompletableFuture<?> a(lm var1);

   String a();

   static <T> CompletableFuture<?> a(lm $$0, jc.a $$1, Codec<T> $$2, T $$3, Path $$4) {
      akr<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
      JsonElement $$6 = ad.a($$2.encodeStart($$5, $$3), IllegalStateException::new);
      return a($$0, $$6, $$4);
   }

   static CompletableFuture<?> a(lm $$0, JsonElement $$1, Path $$2) {
      return CompletableFuture.runAsync(() -> {
         try {
            ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
            HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), $$3);
            JsonWriter $$5 = new JsonWriter(new OutputStreamWriter($$4, StandardCharsets.UTF_8));

            try {
               $$5.setSerializeNulls(false);
               $$5.setIndent("  ");
               ayc.a($$5, $$1, b);
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
      }, ad.f());
   }

   @FunctionalInterface
   public interface a<T extends lo> {
      T create(lq var1);
   }
}
