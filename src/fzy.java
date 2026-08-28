import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fzy extends fpp<fzy.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akv m = akv.b("world_list/error_highlighted");
   static final akv n = akv.b("world_list/error");
   static final akv o = akv.b("world_list/marked_join_highlighted");
   static final akv p = akv.b("world_list/marked_join");
   static final akv q = akv.b("world_list/warning_highlighted");
   static final akv r = akv.b("world_list/warning");
   static final akv s = akv.b("world_list/join_highlighted");
   static final akv u = akv.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wp w = wp.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wp x = wp.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wp y = wp.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wp z = wp.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wp A = wp.c("selectWorld.locked").a(n.m);
   static final wp B = wp.c("selectWorld.conversion.tooltip").a(n.m);
   static final wp C = wp.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wp D = wp.c("selectWorld.experimental");
   private final fzs E;
   private CompletableFuture<List<evg>> F;
   @Nullable
   private List<evg> G;
   private String H;
   private final fzy.b I;

   public fzy(fzs $$0, flj $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fzy $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fzy.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.O();
      }

      this.a(this.M());
   }

   @Override
   protected void s() {
      this.aH_().forEach(fzy.a::close);
      super.s();
   }

   @Nullable
   private List<evg> M() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void N() {
      this.F = this.O();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fsv.a($$0)) {
         Optional<fzy.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hik.a(awa.Bf, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      List<evg> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<evg> $$0) {
      if ($$0 == null) {
         this.P();
      } else {
         this.a(this.H, $$0);
      }

      this.G = $$0;
   }

   public void a(String $$0) {
      if (this.G != null && !$$0.equals(this.H)) {
         this.a($$0, this.G);
      }

      this.H = $$0;
   }

   private CompletableFuture<List<evg>> O() {
      evf.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eve var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fzk.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<evg> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (evg $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fzy.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, evg $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void P() {
      this.s();
      this.b(this.I);
      this.Q();
   }

   private void Q() {
      this.h();
      this.E.d(true);
   }

   private void c(wp $$0) {
      this.c.a(new ftu(wp.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable fzy.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fzy.c $$1 ? $$1.f : null);
   }

   public Optional<fzy.c> b() {
      fzy.a $$0 = this.p();
      return $$0 instanceof fzy.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fzs c() {
      return this.E;
   }

   @Override
   public void a(fsq $$0) {
      if (this.aH_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fpp.a<fzy.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fzy.a {
      private static final wp a = wp.c("selectWorld.loading_list");
      private final flj b;

      public b(flj $$0) {
         this.b = $$0;
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fua.a(af.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public wp a() {
         return a;
      }
   }

   public final class c extends fzy.a {
      private static final int b = 32;
      private static final int c = 32;
      private final flj d;
      private final fzs e;
      final evg f;
      private final ftv g;
      @Nullable
      private Path h;
      private long i;

      public c(final fzy $$1, final evg $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = ftv.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<far> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     fzy.v.warn("{}", fap.a(this.h, $$1));
                     this.h = null;
                  } else {
                     $$0 = Files.readAttributes(this.h, BasicFileAttributes.class);
                  }
               }

               if (!$$0.isRegularFile()) {
                  this.h = null;
               }
            } catch (NoSuchFileException var3) {
               this.h = null;
            } catch (IOException var4) {
               fzy.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wp a() {
         wp $$0 = wp.a("narrator.select.world_info", this.f.b(), wp.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wo.a($$0, fzy.A);
         }

         if (this.f.e()) {
            $$0 = wo.a($$0, fzy.D);
         }

         return wp.a("narrator.select", $$0);
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fzy.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hga.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wp $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gmi::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            akv $$16 = $$15 ? fzy.s : fzy.u;
            akv $$17 = $$15 ? fzy.q : fzy.r;
            akv $$18 = $$15 ? fzy.m : fzy.n;
            akv $$19 = $$15 ? fzy.o : fzy.p;
            if (this.f instanceof evg.c || this.f instanceof evg.b) {
               $$0.a(gmi::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gmi::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gmi::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzy.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gmi::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzy.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gmi::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzy.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gmi::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gmi::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fzy.w.g(), fzy.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gmi::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fzy.y.g(), fzy.z.g()));
                  }
               }
            } else {
               $$0.a(gmi::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fzy.this.a((fzy.a)this);
            if (!($$0 - (double)fzy.this.u() <= 32.0) && af.c() - this.i >= 250L) {
               this.i = af.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hik.a(awa.Bf, 1.0F));
                  this.c();
               }

               return true;
            }
         }
      }

      public boolean b() {
         return this.f.u();
      }

      public void c() {
         if (this.f.u()) {
            if (this.f instanceof evg.c) {
               this.d.a(fud.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fzy.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new ftj($$0 -> {
            if ($$0) {
               this.d.a(new fui(true));
               this.e();
            }

            this.d.a(this.e);
         }, wp.c("selectWorld.deleteQuestion"), wp.a("selectWorld.deleteWarning", this.f.b()), wp.c("selectWorld.deleteButton"), wo.e));
      }

      public void e() {
         evf $$0 = this.d.m();
         String $$1 = this.f.a();

         try (evf.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            frc.b(this.d, $$1);
            fzy.v.error("Failed to delete world {}", $$1, var8);
         }

         fzy.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         evf.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            frc.a(this.d, $$0);
            fzy.v.error("Failed to access level {}", $$0, var6);
            fzy.this.N();
            return;
         } catch (fap var7) {
            fzy.v.warn("{}", var7.getMessage());
            this.d.a(fud.a(() -> this.d.a(this.e)));
            return;
         }

         fzn $$5;
         try {
            $$5 = fzn.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fzy.this.N();
               }

               this.d.a(this.e);
            });
         } catch (ub | uh | IOException var5) {
            $$1.c();
            frc.a(this.d, $$0);
            fzy.v.error("Failed to load world data {}", $$0, var5);
            fzy.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (evf.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dgm, fzu> $$1 = this.d.x().a($$0);
            dgm $$2 = (dgm)$$1.getFirst();
            fzu $$3 = (fzu)$$1.getSecond();
            Path $$4 = fzk.a($$0.a(evd.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new ftj(
                        $$3x -> this.d.a((ful)($$3x ? fzk.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wp.c("selectWorld.recreate.customized.title"),
                        wp.c("selectWorld.recreate.customized.text"),
                        wo.i,
                        wo.e
                     )
                  );
            } else {
               this.d.a(fzk.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fap var8) {
            fzy.v.warn("{}", var8.getMessage());
            this.d.a(fud.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fzy.v.error("Unable to recreate world", var9);
            this.d.a(new fte(() -> this.d.a(this.e), wp.c("selectWorld.recreate.error.title"), wp.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new ftw(wp.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(feu.a($$1));
            } catch (Throwable var7) {
               fzy.v.error("Invalid icon for world {}", this.f.a(), var7);
               this.h = null;
            }
         } else {
            this.g.a();
         }
      }

      @Override
      public void close() {
         this.g.close();
      }

      public String i() {
         return this.f.b();
      }
   }
}
