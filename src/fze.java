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

public class fze extends fov<fze.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alp m = alp.b("world_list/error_highlighted");
   static final alp n = alp.b("world_list/error");
   static final alp o = alp.b("world_list/marked_join_highlighted");
   static final alp p = alp.b("world_list/marked_join");
   static final alp q = alp.b("world_list/warning_highlighted");
   static final alp r = alp.b("world_list/warning");
   static final alp s = alp.b("world_list/join_highlighted");
   static final alp u = alp.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xk w = xk.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xk x = xk.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xk y = xk.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xk z = xk.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xk A = xk.c("selectWorld.locked").a(n.m);
   static final xk B = xk.c("selectWorld.conversion.tooltip").a(n.m);
   static final xk C = xk.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xk D = xk.c("selectWorld.experimental");
   private final fyy E;
   private CompletableFuture<List<evx>> F;
   @Nullable
   private List<evx> G;
   private String H;
   private final fze.b I;

   public fze(fyy $$0, flz $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fze $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fze.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.L();
      }

      this.a(this.J());
   }

   @Override
   protected void j() {
      this.aI_().forEach(fze.a::close);
      super.j();
   }

   @Nullable
   private List<evx> J() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void K() {
      this.F = this.L();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fsb.a($$0)) {
         Optional<fze.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hey.a(awv.Bg, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      List<evx> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<evx> $$0) {
      if ($$0 == null) {
         this.M();
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

   private CompletableFuture<List<evx>> L() {
      evw.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (evv var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fyq.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<evx> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (evx $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fze.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, evx $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void M() {
      this.j();
      this.b(this.I);
      this.N();
   }

   private void N() {
      this.o();
      this.E.d(true);
   }

   private void c(xk $$0) {
      this.c.a(new fta(xk.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable fze.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fze.c $$1 ? $$1.f : null);
   }

   public Optional<fze.c> b() {
      fze.a $$0 = this.g();
      return $$0 instanceof fze.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fyy c() {
      return this.E;
   }

   @Override
   public void a(frw $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fov.a<fze.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fze.a {
      private static final xk a = xk.c("selectWorld.loading_list");
      private final flz b;

      public b(flz $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = ftg.a(ae.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public xk a() {
         return a;
      }
   }

   public final class c extends fze.a {
      private static final int b = 32;
      private static final int c = 32;
      private final flz d;
      private final fyy e;
      final evx f;
      private final ftb g;
      @Nullable
      private Path h;
      private long i;

      public c(final fze $$1, final evx $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = ftb.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fbi> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fze.v.warn("{}", fbg.a(this.h, $$1));
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
               fze.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xk a() {
         xk $$0 = xk.a("narrator.select.world_info", this.f.b(), xk.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xj.a($$0, fze.A);
         }

         if (this.f.e()) {
            $$0 = xj.a($$0, fze.D);
         }

         return xk.a("narrator.select", $$0);
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fze.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hcn.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xk $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(glq::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alp $$16 = $$15 ? fze.s : fze.u;
            alp $$17 = $$15 ? fze.q : fze.r;
            alp $$18 = $$15 ? fze.m : fze.n;
            alp $$19 = $$15 ? fze.o : fze.p;
            if (this.f instanceof evx.c || this.f instanceof evx.b) {
               $$0.a(glq::H, $$18, $$3, $$2, 32, 32);
               $$0.a(glq::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(glq::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fze.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(glq::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fze.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(glq::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fze.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(glq::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(glq::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fze.w.g(), fze.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(glq::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fze.y.g(), fze.z.g()));
                  }
               }
            } else {
               $$0.a(glq::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fze.this.a((fze.a)this);
            if (!($$0 - (double)fze.this.s() <= 32.0) && ae.c() - this.i >= 250L) {
               this.i = ae.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hey.a(awv.Bg, 1.0F));
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
            if (this.f instanceof evx.c) {
               this.d.a(ftj.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fze.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fsp($$0 -> {
            if ($$0) {
               this.d.a(new fto(true));
               this.e();
            }

            this.d.a(this.e);
         }, xk.c("selectWorld.deleteQuestion"), xk.a("selectWorld.deleteWarning", this.f.b()), xk.c("selectWorld.deleteButton"), xj.e));
      }

      public void e() {
         evw $$0 = this.d.m();
         String $$1 = this.f.a();

         try (evw.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fqi.b(this.d, $$1);
            fze.v.error("Failed to delete world {}", $$1, var8);
         }

         fze.this.K();
      }

      public void g() {
         this.k();
         String $$0 = this.f.a();

         evw.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fqi.a(this.d, $$0);
            fze.v.error("Failed to access level {}", $$0, var6);
            fze.this.K();
            return;
         } catch (fbg var7) {
            fze.v.warn("{}", var7.getMessage());
            this.d.a(ftj.a(() -> this.d.a(this.e)));
            return;
         }

         fyt $$5;
         try {
            $$5 = fyt.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fze.this.K();
               }

               this.d.a(this.e);
            });
         } catch (ux | vd | IOException var5) {
            $$1.c();
            fqi.a(this.d, $$0);
            fze.v.error("Failed to load world data {}", $$0, var5);
            fze.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (evw.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dhd, fza> $$1 = this.d.x().a($$0);
            dhd $$2 = (dhd)$$1.getFirst();
            fza $$3 = (fza)$$1.getSecond();
            Path $$4 = fyq.a($$0.a(evu.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fsp(
                        $$3x -> this.d.a((ftr)($$3x ? fyq.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xk.c("selectWorld.recreate.customized.title"),
                        xk.c("selectWorld.recreate.customized.text"),
                        xj.i,
                        xj.e
                     )
                  );
            } else {
               this.d.a(fyq.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fbg var8) {
            fze.v.warn("{}", var8.getMessage());
            this.d.a(ftj.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fze.v.error("Unable to recreate world", var9);
            this.d.a(new fsk(() -> this.d.a(this.e), xk.c("selectWorld.recreate.error.title"), xk.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new ftc(xk.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ffl.a($$1));
            } catch (Throwable var7) {
               fze.v.error("Invalid icon for world {}", this.f.a(), var7);
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
