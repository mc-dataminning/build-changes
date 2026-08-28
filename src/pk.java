import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class pk implements mb {
   private static final Logger d = LogUtils.getLogger();
   private final md e;
   private final Iterable<Path> f;
   private final List<pk.a> g = Lists.newArrayList();

   public pk(md $$0, Iterable<Path> $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public pk a(pk.a $$0) {
      this.g.add($$0);
      return this;
   }

   private uf a(String $$0, uf $$1) {
      uf $$2 = $$1;

      for (pk.a $$3 : this.g) {
         $$2 = $$3.apply($$0, $$2);
      }

      return $$2;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      Path $$1 = this.e.a();
      List<CompletableFuture<?>> $$2 = Lists.newArrayList();

      for (Path $$3 : this.f) {
         $$2.add(CompletableFuture.<CompletableFuture>supplyAsync(() -> {
            try {
               CompletableFuture var5x;
               try (Stream<Path> $$3x = Files.walk($$3)) {
                  var5x = CompletableFuture.allOf($$3x.filter($$0xx -> $$0xx.toString().endsWith(".snbt")).map($$3xx -> CompletableFuture.runAsync(() -> {
                        pk.c $$4 = this.a($$3xx, this.a($$3, $$3xx));
                        this.a($$0, $$4, $$1);
                     }, ad.g())).toArray(CompletableFuture[]::new));
               }

               return var5x;
            } catch (Exception var9) {
               throw new RuntimeException("Failed to read structure input directory, aborting", var9);
            }
         }, ad.g()).thenCompose($$0x -> $$0x));
      }

      return ad.e($$2);
   }

   @Override
   public final String a() {
      return "SNBT -> NBT";
   }

   private String a(Path $$0, Path $$1) {
      String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
      return $$2.substring(0, $$2.length() - ".snbt".length());
   }

   private pk.c a(Path $$0, String $$1) {
      try {
         pk.c var10;
         try (BufferedReader $$2 = Files.newBufferedReader($$0)) {
            String $$3 = IOUtils.toString($$2);
            uf $$4 = this.a($$1, uu.a($$3));
            ByteArrayOutputStream $$5 = new ByteArrayOutputStream();
            HashingOutputStream $$6 = new HashingOutputStream(Hashing.sha1(), $$5);
            us.a($$4, $$6);
            byte[] $$7 = $$5.toByteArray();
            HashCode $$8 = $$6.hash();
            var10 = new pk.c($$1, $$7, $$8);
         }

         return var10;
      } catch (Throwable var13) {
         throw new pk.b($$0, var13);
      }
   }

   private void a(lz $$0, pk.c $$1, Path $$2) {
      Path $$3 = $$2.resolve($$1.a + ".nbt");

      try {
         $$0.writeIfNeeded($$3, $$1.b, $$1.c);
      } catch (IOException var6) {
         d.error("Couldn't write structure {} at {}", new Object[]{$$1.a, $$3, var6});
      }
   }

   @FunctionalInterface
   public interface a {
      uf apply(String var1, uf var2);
   }

   static class b extends RuntimeException {
      public b(Path $$0, Throwable $$1) {
         super($$0.toAbsolutePath().toString(), $$1);
      }
   }

   static record c(String a, byte[] b, HashCode c) {
   }
}
