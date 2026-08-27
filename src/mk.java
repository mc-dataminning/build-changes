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
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class mk implements jk {
   @Nullable
   private static final Path d = null;
   private static final Logger e = LogUtils.getLogger();
   private final jm f;
   private final Iterable<Path> g;
   private final List<mk.a> h = Lists.newArrayList();

   public mk(jm $$0, Iterable<Path> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public mk a(mk.a $$0) {
      this.h.add($$0);
      return this;
   }

   private qu a(String $$0, qu $$1) {
      qu $$2 = $$1;

      for (mk.a $$3 : this.h) {
         $$2 = $$3.apply($$0, $$2);
      }

      return $$2;
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      Path $$1 = this.f.a();
      List<CompletableFuture<?>> $$2 = Lists.newArrayList();

      for (Path $$3 : this.g) {
         $$2.add(CompletableFuture.<CompletableFuture>supplyAsync(() -> {
            try {
               CompletableFuture var5x;
               try (Stream<Path> $$3x = Files.walk($$3)) {
                  var5x = CompletableFuture.allOf($$3x.filter($$0xx -> $$0xx.toString().endsWith(".snbt")).map($$3xx -> CompletableFuture.runAsync(() -> {
                        mk.c $$4 = this.a($$3xx, this.a($$3, $$3xx));
                        this.a($$0, $$4, $$1);
                     }, ac.f())).toArray(CompletableFuture[]::new));
               }

               return var5x;
            } catch (Exception var9) {
               throw new RuntimeException("Failed to read structure input directory, aborting", var9);
            }
         }, ac.f()).thenCompose($$0x -> $$0x));
      }

      return ac.c($$2);
   }

   @Override
   public final String a() {
      return "SNBT -> NBT";
   }

   private String a(Path $$0, Path $$1) {
      String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
      return $$2.substring(0, $$2.length() - ".snbt".length());
   }

   private mk.c a(Path $$0, String $$1) {
      try {
         mk.c var11;
         try (BufferedReader $$2 = Files.newBufferedReader($$0)) {
            String $$3 = IOUtils.toString($$2);
            qu $$4 = this.a($$1, rg.a($$3));
            ByteArrayOutputStream $$5 = new ByteArrayOutputStream();
            HashingOutputStream $$6 = new HashingOutputStream(Hashing.sha1(), $$5);
            re.a($$4, $$6);
            byte[] $$7 = $$5.toByteArray();
            HashCode $$8 = $$6.hash();
            String $$9;
            if (d != null) {
               $$9 = rg.c($$4);
            } else {
               $$9 = null;
            }

            var11 = new mk.c($$1, $$7, $$9, $$8);
         }

         return var11;
      } catch (Throwable var14) {
         throw new mk.b($$0, var14);
      }
   }

   private void a(ji $$0, mk.c $$1, Path $$2) {
      if ($$1.c != null) {
         Path $$3 = d.resolve($$1.a + ".snbt");

         try {
            mj.a(ji.a, $$3, $$1.c);
         } catch (IOException var7) {
            e.error("Couldn't write structure SNBT {} at {}", new Object[]{$$1.a, $$3, var7});
         }
      }

      Path $$5 = $$2.resolve($$1.a + ".nbt");

      try {
         $$0.writeIfNeeded($$5, $$1.b, $$1.d);
      } catch (IOException var6) {
         e.error("Couldn't write structure {} at {}", new Object[]{$$1.a, $$5, var6});
      }
   }

   @FunctionalInterface
   public interface a {
      qu apply(String var1, qu var2);
   }

   static class b extends RuntimeException {
      public b(Path $$0, Throwable $$1) {
         super($$0.toAbsolutePath().toString(), $$1);
      }
   }

   static record c(String a, byte[] b, @Nullable String c, HashCode d) {
   }
}
