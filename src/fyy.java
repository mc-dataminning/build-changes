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

public class fyy extends fvi {
   static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("pack.available.title");
   private static final wp c = wp.c("pack.selected.title");
   private static final wp d = wp.c("pack.openFolder");
   private static final int s = 200;
   private static final wp u = wp.c("pack.dropInfo").a(n.h);
   private static final wp v = wp.c("pack.folderInfo");
   private static final int w = 20;
   private static final aku x = aku.b("textures/misc/unknown_pack.png");
   private final fte y = new fte(this);
   private final fyx z;
   @Nullable
   private fyy.a A;
   private long B;
   private fyz C;
   private fyz D;
   private final Path E;
   private fpq F;
   private final Map<String, aku> G = Maps.newHashMap();

   public fyy(aua $$0, Consumer<aua> $$1, Path $$2, wp $$3) {
      super($$3);
      this.z = new fyx(this::F, this::a, $$0, $$1);
      this.E = $$2;
      this.A = fyy.a.a($$2);
   }

   @Override
   public void aO_() {
      this.z.c();
      this.E();
   }

   private void E() {
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
      fti $$0 = this.y.a(fti.d().a(5));
      $$0.c().b();
      $$0.a(new fqx(this.n(), this.p));
      $$0.a(new fqx(u, this.p));
      this.C = this.c(new fyz(this.m, this, 200, this.o - 66, b));
      this.D = this.c(new fyz(this.m, this, 200, this.o - 66, c));
      fti $$1 = this.y.b(fti.e().a(8));
      $$1.a(fpq.a(d, $$0x -> af.n().a(this.E)).a(frb.a(v)).a());
      this.F = $$1.a(fpq.a(wo.d, $$0x -> this.aO_()).a());
      this.G();
      this.y.a($$1x -> {
         fpo var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      this.C.a(200, this.y);
      this.C.j(this.n / 2 - 15 - 200);
      this.D.a(200, this.y);
      this.D.j(this.n / 2 + 15);
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
            this.E();
         }
      }

      if (this.B > 0L && --this.B == 0L) {
         this.G();
      }
   }

   private void F() {
      this.a(this.D, this.z.b());
      this.a(this.C, this.z.a());
      this.F.j = !this.D.aH_().isEmpty();
   }

   private void a(fyz $$0, Stream<fyx.a> $$1) {
      $$0.aH_().clear();
      fyz.a $$2 = $$0.p();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fyz.a $$3x = new fyz.a(this.m, $$0, $$2x);
         $$0.aH_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fyz $$0) {
      fyz $$1 = this.D == $$0 ? this.C : this.D;
      this.a(foz.a($$1.q(), $$1, this));
   }

   public void m() {
      this.D.a(null);
      this.C.a(null);
   }

   private void G() {
      this.z.d();
      this.F();
      this.B = 0L;
      this.G.clear();
   }

   protected static void a(fmg $$0, List<Path> $$1, Path $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      $$1.forEach($$2x -> {
         try (Stream<Path> $$3x = Files.walk($$2x)) {
            $$3x.forEach($$3xx -> {
               try {
                  af.b($$2x.getParent(), $$2, $$3xx);
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
         frz.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.m.a(new fug($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            atz<Path> $$4 = new atz<Path>(this.m.be()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<fbo> $$5 = new ArrayList<>();

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
               this.m.a(fva.b(() -> this.m.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.m, $$2, this.E);
               this.G();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.m.a(new fub(() -> this.m.a(this), wp.c("pack.dropRejected.title"), wp.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.m.a(this);
      }, wp.c("pack.dropConfirm"), wp.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private aku a(hft $$0, atx $$1) {
      try {
         aku var9;
         try (atc $$2 = $$1.f()) {
            auh<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return x;
            }

            String $$4 = $$1.g();
            aku $$5 = aku.b("pack/" + af.a($$4, aku::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               ffr $$7 = ffr.a($$6);
               $$0.a($$5, new hfe($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return x;
      }
   }

   private aku a(atx $$0) {
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
      public static fyy.a a(Path $$0) {
         try {
            return new fyy.a($$0);
         } catch (IOException var2) {
            fyy.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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
