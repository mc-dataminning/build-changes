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

public class gck extends fys {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("pack.available.title");
   private static final wy c = wy.c("pack.selected.title");
   private static final wy d = wy.c("pack.openFolder");
   private static final int s = 200;
   private static final wy u = wy.c("pack.dropInfo").a(o.h);
   private static final wy v = wy.c("pack.folderInfo");
   private static final int w = 20;
   private static final alg x = alg.b("textures/misc/unknown_pack.png");
   private final fwo y = new fwo(this);
   private final gcj z;
   @Nullable
   private gck.a A;
   private long B;
   private gcl C;
   private gcl D;
   private final Path E;
   private fta F;
   private final Map<String, alg> G = Maps.newHashMap();

   public gck(aun $$0, Consumer<aun> $$1, Path $$2, wy $$3) {
      super($$3);
      this.z = new gcj(this::F, this::a, $$0, $$1);
      this.E = $$2;
      this.A = gck.a.a($$2);
   }

   @Override
   public void aL_() {
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
   protected void aO_() {
      fws $$0 = this.y.a(fws.d().a(5));
      $$0.c().b();
      $$0.a(new fuh(this.n(), this.p));
      $$0.a(new fuh(u, this.p));
      this.C = this.c(new gcl(this.m, this, 200, this.o - 66, b));
      this.D = this.c(new gcl(this.m, this, 200, this.o - 66, c));
      fws $$1 = this.y.b(fws.e().a(8));
      $$1.a(fta.a(d, $$0x -> ag.n().a(this.E)).a(ful.a(v)).a());
      this.F = $$1.a(fta.a(wx.d, $$0x -> this.aL_()).a());
      this.G();
      this.y.a($$1x -> {
         fsy var10000 = this.c($$1x);
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
      this.F.j = !this.D.aE_().isEmpty();
   }

   private void a(gcl $$0, Stream<gcj.a> $$1) {
      $$0.aE_().clear();
      gcl.a $$2 = $$0.p();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         gcl.a $$3x = new gcl.a(this.m, $$0, $$2x);
         $$0.aE_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(gcl $$0) {
      gcl $$1 = this.D == $$0 ? this.C : this.D;
      this.a(fsj.a($$1.q(), $$1, this));
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

   protected static void a(fpt $$0, List<Path> $$1, Path $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      $$1.forEach($$2x -> {
         try (Stream<Path> $$3x = Files.walk($$2x)) {
            $$3x.forEach($$3xx -> {
               try {
                  ag.b($$2x.getParent(), $$2, $$3xx);
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
         fvj.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.m.a(new fxq($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            aum<Path> $$4 = new aum<Path>(this.m.be()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<fet> $$5 = new ArrayList<>();

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
               this.m.a(fyk.b(() -> this.m.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.m, $$2, this.E);
               this.G();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.m.a(new fxl(() -> this.m.a(this), wy.c("pack.dropRejected.title"), wy.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.m.a(this);
      }, wy.c("pack.dropConfirm"), wy.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private alg a(hjs $$0, auk $$1) {
      try {
         alg var9;
         try (atp $$2 = $$1.f()) {
            auu<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return x;
            }

            String $$4 = $$1.g();
            alg $$5 = alg.b("pack/" + ag.a($$4, alg::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               fiz $$7 = fiz.a($$6);
               $$0.a($$5, new hjd($$5::toString, $$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return x;
      }
   }

   private alg a(auk $$0) {
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
      public static gck.a a(Path $$0) {
         try {
            return new gck.a($$0);
         } catch (IOException var2) {
            gck.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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
