import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class fup extends fra {
   static final Logger a = LogUtils.getLogger();
   private static final xi b = xi.c("pack.available.title");
   private static final xi c = xi.c("pack.selected.title");
   private static final xi d = xi.c("pack.openFolder");
   private static final int s = 200;
   private static final xi u = xi.c("pack.dropInfo").a(n.h);
   private static final xi v = xi.c("pack.folderInfo");
   private static final int w = 20;
   private static final ali x = ali.b("textures/misc/unknown_pack.png");
   private final fow y = new fow(this);
   private final fuo z;
   @Nullable
   private fup.a A;
   private long B;
   private fuq C;
   private fuq D;
   private final Path E;
   private flh F;
   private final Map<String, ali> G = Maps.newHashMap();

   public fup(aul $$0, Consumer<aul> $$1, Path $$2, xi $$3) {
      super($$3);
      this.z = new fuo(this::E, this::a, $$0, $$1);
      this.E = $$2;
      this.A = fup.a.a($$2);
   }

   @Override
   public void d() {
      this.z.c();
      this.D();
   }

   private void D() {
      if (this.A != null) {
         try {
            this.A.close();
            this.A = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aR_() {
      fpa $$0 = this.y.a(fpa.d().a(5));
      $$0.c().b();
      $$0.a(new fmo(this.n(), this.p));
      $$0.a(new fmo(u, this.p));
      this.C = this.c(new fuq(this.m, this, 200, this.o - 66, b));
      this.D = this.c(new fuq(this.m, this, 200, this.o - 66, c));
      fpa $$1 = this.y.b(fpa.e().a(8));
      $$1.a(flh.a(d, $$0x -> ae.m().a(this.E)).a(fms.a(v)).a());
      this.F = $$1.a(flh.a(xh.d, $$0x -> this.d()).a());
      this.F();
      this.y.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      this.C.a(200, this.y);
      this.C.m(this.n / 2 - 15 - 200);
      this.D.a(200, this.y);
      this.D.m(this.n / 2 + 15);
   }

   @Override
   public void e() {
      if (this.A != null) {
         try {
            if (this.A.a()) {
               this.B = 20L;
            }
         } catch (IOException var2) {
            a.warn("Failed to poll for directory {} changes, stopping", this.E);
            this.D();
         }
      }

      if (this.B > 0L && --this.B == 0L) {
         this.F();
      }
   }

   private void E() {
      this.a(this.D, this.z.b());
      this.a(this.C, this.z.a());
      this.F.j = !this.D.aI_().isEmpty();
   }

   private void a(fuq $$0, Stream<fuo.a> $$1) {
      $$0.aI_().clear();
      fuq.a $$2 = $$0.h();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fuq.a $$3x = new fuq.a(this.m, $$0, $$2x);
         $$0.aI_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fuq $$0) {
      fuq $$1 = this.D == $$0 ? this.C : this.D;
      this.a(fkr.a($$1.i(), $$1, this));
   }

   public void m() {
      this.D.a(null);
      this.C.a(null);
   }

   private void F() {
      this.z.d();
      this.E();
      this.B = 0L;
      this.G.clear();
   }

   protected static void a(fji $$0, List<Path> $$1, Path $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      $$1.forEach($$2x -> {
         try (Stream<Path> $$3x = Files.walk($$2x)) {
            $$3x.forEach($$3xx -> {
               try {
                  ae.b($$2x.getParent(), $$2, $$3xx);
               } catch (IOException var5) {
                  a.warn("Failed to copy datapack file  from {} to {}", new Object[]{$$3xx, $$2, var5});
                  $$3.setTrue();
               }
            });
         } catch (IOException var8) {
            a.warn("Failed to copy datapack file from {} to {}", $$2x, $$2);
            $$3.setTrue();
         }
      });
      if ($$3.isTrue()) {
         fnq.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.m.a(new fpy($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            auk<Path> $$4 = new auk<Path>(this.m.bf()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<eze> $$5 = new ArrayList<>();

            for (Path $$6 : $$0) {
               try {
                  Path $$7 = $$4.a($$6, $$5);
                  if ($$7 == null) {
                     a.warn("Path {} does not seem like pack", $$6);
                  } else {
                     $$2.add($$7);
                     $$3.remove($$7);
                  }
               } catch (IOException var10) {
                  a.warn("Failed to check {} for packs", $$6, var10);
               }
            }

            if (!$$5.isEmpty()) {
               this.m.a(fqs.b(() -> this.m.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.m, $$2, this.E);
               this.F();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.m.a(new fpt(() -> this.m.a(this), xi.c("pack.dropRejected.title"), xi.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.m.a(this);
      }, xi.c("pack.dropConfirm"), xi.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private ali a(gye $$0, aui $$1) {
      try {
         ali var9;
         try (atm $$2 = $$1.f()) {
            aus<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return x;
            }

            String $$4 = $$1.g();
            ali $$5 = ali.b("pack/" + ae.a($$4, ali::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               fdb $$7 = fdb.a($$6);
               $$0.a($$5, new gxq($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return x;
      }
   }

   private ali a(aui $$0) {
      return this.G.computeIfAbsent($$0.g(), $$1 -> this.a(this.m.aa(), $$0));
   }

   static class a implements AutoCloseable {
      private final WatchService a;
      private final Path b;

      public a(Path $$0) throws IOException {
         this.b = $$0;
         this.a = $$0.getFileSystem().newWatchService();

         try {
            this.b($$0);

            try (DirectoryStream<Path> $$1 = Files.newDirectoryStream($$0)) {
               for (Path $$2 : $$1) {
                  if (Files.isDirectory($$2, LinkOption.NOFOLLOW_LINKS)) {
                     this.b($$2);
                  }
               }
            }
         } catch (Exception var7) {
            this.a.close();
            throw var7;
         }
      }

      @Nullable
      public static fup.a a(Path $$0) {
         try {
            return new fup.a($$0);
         } catch (IOException var2) {
            fup.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
            return null;
         }
      }

      private void b(Path $$0) throws IOException {
         $$0.register(this.a, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
      }

      public boolean a() throws IOException {
         boolean $$0 = false;

         WatchKey $$1;
         while (($$1 = this.a.poll()) != null) {
            for (WatchEvent<?> $$3 : $$1.pollEvents()) {
               $$0 = true;
               if ($$1.watchable() == this.b && $$3.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                  Path $$4 = this.b.resolve((Path)$$3.context());
                  if (Files.isDirectory($$4, LinkOption.NOFOLLOW_LINKS)) {
                     this.b($$4);
                  }
               }
            }

            $$1.reset();
         }

         return $$0;
      }

      @Override
      public void close() throws IOException {
         this.a.close();
      }
   }
}
