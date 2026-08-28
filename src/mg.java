import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class mg {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "// ";
   private final Path c;
   private final Path d;
   private final String e;
   private final Map<String, mg.b> f;
   private final Set<String> g = new HashSet<>();
   final Set<Path> h = new HashSet<>();
   private final int i;
   private int j;

   private Path b(String $$0) {
      return this.d.resolve(Hashing.sha1().hashString($$0, StandardCharsets.UTF_8).toString());
   }

   public mg(Path $$0, Collection<String> $$1, af $$2) throws IOException {
      this.e = $$2.c();
      this.c = $$0;
      this.d = $$0.resolve(".cache");
      Files.createDirectories(this.d);
      Map<String, mg.b> $$3 = new HashMap<>();
      int $$4 = 0;

      for (String $$5 : $$1) {
         Path $$6 = this.b($$5);
         this.h.add($$6);
         mg.b $$7 = a($$0, $$6);
         $$3.put($$5, $$7);
         $$4 += $$7.a();
      }

      this.f = $$3;
      this.i = $$4;
   }

   private static mg.b a(Path $$0, Path $$1) {
      if (Files.isReadable($$1)) {
         try {
            return mg.b.a($$0, $$1);
         } catch (Exception var3) {
            a.warn("Failed to parse cache {}, discarding", $$1, var3);
         }
      }

      return new mg.b("unknown", ImmutableMap.of());
   }

   public boolean a(String $$0) {
      mg.b $$1 = this.f.get($$0);
      return $$1 == null || !$$1.a.equals(this.e);
   }

   public CompletableFuture<mg.e> a(String $$0, mg.d $$1) {
      mg.b $$2 = this.f.get($$0);
      if ($$2 == null) {
         throw new IllegalStateException("Provider not registered: " + $$0);
      } else {
         mg.a $$3 = new mg.a($$0, this.e, $$2);
         return $$1.update($$3).thenApply($$1x -> $$3.a());
      }
   }

   public void a(mg.e $$0) {
      this.f.put($$0.a(), $$0.b());
      this.g.add($$0.a());
      this.j = this.j + $$0.c();
   }

   public void a() throws IOException {
      final Set<Path> $$0 = new HashSet<>();
      this.f.forEach(($$1x, $$2x) -> {
         if (this.g.contains($$1x)) {
            Path $$3 = this.b($$1x);
            $$2x.a(this.c, $$3, DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()) + "\t" + $$1x);
         }

         $$0.addAll($$2x.c().keySet());
      });
      $$0.add(this.c.resolve("version.json"));
      final MutableInt $$1 = new MutableInt();
      final MutableInt $$2 = new MutableInt();
      Files.walkFileTree(this.c, new SimpleFileVisitor<Path>() {
         public FileVisitResult a(Path $$0x, BasicFileAttributes $$1x) {
            if (mg.this.h.contains($$0)) {
               return FileVisitResult.CONTINUE;
            } else {
               $$1.increment();
               if ($$0.contains($$0)) {
                  return FileVisitResult.CONTINUE;
               } else {
                  try {
                     Files.delete($$0);
                  } catch (IOException var4) {
                     mg.a.warn("Failed to delete file {}", $$0, var4);
                  }

                  $$2.increment();
                  return FileVisitResult.CONTINUE;
               }
            }
         }
      });
      a.info("Caching: total files: {}, old count: {}, new count: {}, removed stale: {}, written: {}", new Object[]{$$1, this.i, $$0.size(), $$2, this.j});
   }

   class a implements md {
      private final String b;
      private final mg.b c;
      private final mg.c d;
      private final AtomicInteger e = new AtomicInteger();
      private volatile boolean f;

      a(final String $$0, final String $$1, final mg.b $$2) {
         this.b = $$0;
         this.c = $$2;
         this.d = new mg.c($$1);
      }

      private boolean a(Path $$0, HashCode $$1) {
         return !Objects.equals(this.c.a($$0), $$1) || !Files.exists($$0);
      }

      @Override
      public void writeIfNeeded(Path $$0, byte[] $$1, HashCode $$2) throws IOException {
         if (this.f) {
            throw new IllegalStateException("Cannot write to cache as it has already been closed");
         } else {
            if (this.a($$0, $$2)) {
               this.e.incrementAndGet();
               Files.createDirectories($$0.getParent());
               Files.write($$0, $$1);
            }

            this.d.a($$0, $$2);
         }
      }

      public mg.e a() {
         this.f = true;
         return new mg.e(this.b, this.d.a(), this.e.get());
      }
   }

   static record b(String a, ImmutableMap<Path, HashCode> b) {

      @Nullable
      public HashCode a(Path $$0) {
         return (HashCode)this.b.get($$0);
      }

      public int a() {
         return this.b.size();
      }

      public static mg.b a(Path $$0, Path $$1) throws IOException {
         mg.b var7;
         try (BufferedReader $$2 = Files.newBufferedReader($$1, StandardCharsets.UTF_8)) {
            String $$3 = $$2.readLine();
            if (!$$3.startsWith("// ")) {
               throw new IllegalStateException("Missing cache file header");
            }

            String[] $$4 = $$3.substring("// ".length()).split("\t", 2);
            String $$5 = $$4[0];
            Builder<Path, HashCode> $$6 = ImmutableMap.builder();
            $$2.lines().forEach($$2x -> {
               int $$3x = $$2x.indexOf(32);
               $$6.put($$0.resolve($$2x.substring($$3x + 1)), HashCode.fromString($$2x.substring(0, $$3x)));
            });
            var7 = new mg.b($$5, $$6.build());
         }

         return var7;
      }

      public void a(Path $$0, Path $$1, String $$2) {
         try (BufferedWriter $$3 = Files.newBufferedWriter($$1, StandardCharsets.UTF_8)) {
            $$3.write("// ");
            $$3.write(this.a);
            $$3.write(9);
            $$3.write($$2);
            $$3.newLine();
            UnmodifiableIterator var5 = this.b.entrySet().iterator();

            while (var5.hasNext()) {
               Entry<Path, HashCode> $$4 = (Entry<Path, HashCode>)var5.next();
               $$3.write($$4.getValue().toString());
               $$3.write(32);
               $$3.write($$0.relativize($$4.getKey()).toString());
               $$3.newLine();
            }
         } catch (IOException var9) {
            mg.a.warn("Unable write cachefile {}: {}", $$1, var9);
         }
      }

      public String b() {
         return this.a;
      }

      public ImmutableMap<Path, HashCode> c() {
         return this.b;
      }
   }

   static record c(String a, ConcurrentMap<Path, HashCode> b) {
      c(String $$0) {
         this($$0, new ConcurrentHashMap<>());
      }

      public void a(Path $$0, HashCode $$1) {
         this.b.put($$0, $$1);
      }

      public mg.b a() {
         return new mg.b(this.a, ImmutableMap.copyOf(this.b));
      }

      public String b() {
         return this.a;
      }

      public ConcurrentMap<Path, HashCode> c() {
         return this.b;
      }
   }

   @FunctionalInterface
   public interface d {
      CompletableFuture<?> update(md var1);
   }

   public static record e(String a, mg.b b, int c) {
   }
}
