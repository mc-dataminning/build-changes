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

public class fvp extends flk<fvp.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ale m = ale.b("world_list/error_highlighted");
   static final ale n = ale.b("world_list/error");
   static final ale o = ale.b("world_list/marked_join_highlighted");
   static final ale p = ale.b("world_list/marked_join");
   static final ale q = ale.b("world_list/warning_highlighted");
   static final ale r = ale.b("world_list/warning");
   static final ale s = ale.b("world_list/join_highlighted");
   static final ale u = ale.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xe w = xe.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xe x = xe.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xe y = xe.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xe z = xe.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xe A = xe.c("selectWorld.locked").a(n.m);
   static final xe B = xe.c("selectWorld.conversion.tooltip").a(n.m);
   static final xe C = xe.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xe D = xe.c("selectWorld.experimental");
   private final fvk E;
   private CompletableFuture<List<eta>> F;
   @Nullable
   private List<eta> G;
   private String H;
   private final fvp.b I;

   public fvp(fvk $$0, fip $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fvp $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fvp.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.M();
      }

      this.a(this.K());
   }

   @Override
   protected void k() {
      this.aJ_().forEach(fvp.a::close);
      super.k();
   }

   @Nullable
   private List<eta> K() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void L() {
      this.F = this.M();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (foq.a($$0)) {
         Optional<fvp.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hav.a(awg.Ax, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      List<eta> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eta> $$0) {
      if ($$0 == null) {
         this.N();
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

   private CompletableFuture<List<eta>> M() {
      esz.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (esy var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fve.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eta> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eta $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fvp.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, eta $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void N() {
      this.k();
      this.b(this.I);
      this.O();
   }

   private void O() {
      this.o();
      this.E.d(true);
   }

   private void c(xe $$0) {
      this.c.a(new fpq(xe.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fvp.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fvp.c $$1 ? $$1.f : null);
   }

   public Optional<fvp.c> c() {
      fvp.a $$0 = this.h();
      return $$0 instanceof fvp.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fvk J() {
      return this.E;
   }

   @Override
   public void a(fol $$0) {
      if (this.aJ_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends flk.a<fvp.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fvp.a {
      private static final xe a = xe.c("selectWorld.loading_list");
      private final fip b;

      public b(fip $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fpw.a(ad.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xe a() {
         return a;
      }
   }

   public final class c extends fvp.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fip d;
      private final fvk e;
      final eta f;
      private final fpr g;
      @Nullable
      private Path h;
      private long i;

      public c(final fvp $$1, final eta $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fpr.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eyn> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fvp.v.warn("{}", eyl.a(this.h, $$1));
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
               fvp.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xe a() {
         xe $$0 = xe.a("narrator.select.world_info", this.f.b(), xe.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xd.a($$0, fvp.A);
         }

         if (this.f.e()) {
            $$0 = xd.a($$0, fvp.D);
         }

         return xe.a("narrator.select", $$0);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fvp.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gyn.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xe $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(ghv::B, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ale $$16 = $$15 ? fvp.s : fvp.u;
            ale $$17 = $$15 ? fvp.q : fvp.r;
            ale $$18 = $$15 ? fvp.m : fvp.n;
            ale $$19 = $$15 ? fvp.o : fvp.p;
            if (this.f instanceof eta.c || this.f instanceof eta.b) {
               $$0.a(ghv::B, $$18, $$3, $$2, 32, 32);
               $$0.a(ghv::B, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(ghv::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvp.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(ghv::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvp.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(ghv::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvp.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(ghv::B, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(ghv::B, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fvp.w.g(), fvp.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(ghv::B, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fvp.y.g(), fvp.z.g()));
                  }
               }
            } else {
               $$0.a(ghv::B, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fvp.this.a((fvp.a)this);
            if (!($$0 - (double)fvp.this.s() <= 32.0) && ad.c() - this.i >= 250L) {
               this.i = ad.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hav.a(awg.Ax, 1.0F));
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
            if (this.f instanceof eta.c) {
               this.d.a(fpz.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fvp.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fpf($$0 -> {
            if ($$0) {
               this.d.a(new fqe(true));
               this.e();
            }

            this.d.a(this.e);
         }, xe.c("selectWorld.deleteQuestion"), xe.a("selectWorld.deleteWarning", this.f.b()), xe.c("selectWorld.deleteButton"), xd.e));
      }

      public void e() {
         esz $$0 = this.d.m();
         String $$1 = this.f.a();

         try (esz.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fmx.b(this.d, $$1);
            fvp.v.error("Failed to delete world {}", $$1, var8);
         }

         fvp.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         esz.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fmx.a(this.d, $$0);
            fvp.v.error("Failed to access level {}", $$0, var6);
            fvp.this.L();
            return;
         } catch (eyl var7) {
            fvp.v.warn("{}", var7.getMessage());
            this.d.a(fpz.a(() -> this.d.a(this.e)));
            return;
         }

         fvg $$5;
         try {
            $$5 = fvg.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fvp.this.L();
               }

               this.d.a(this.e);
            });
         } catch (ur | ux | IOException var5) {
            $$1.c();
            fmx.a(this.d, $$0);
            fvp.v.error("Failed to load world data {}", $$0, var5);
            fvp.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (esz.c $$0 = this.d.m().d(this.f.a())) {
            Pair<den, fvm> $$1 = this.d.x().a($$0);
            den $$2 = (den)$$1.getFirst();
            fvm $$3 = (fvm)$$1.getSecond();
            Path $$4 = fve.a($$0.a(esx.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fpf(
                        $$3x -> this.d.a((fqh)($$3x ? fve.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xe.c("selectWorld.recreate.customized.title"),
                        xe.c("selectWorld.recreate.customized.text"),
                        xd.i,
                        xd.e
                     )
                  );
            } else {
               this.d.a(fve.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eyl var8) {
            fvp.v.warn("{}", var8.getMessage());
            this.d.a(fpz.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fvp.v.error("Unable to recreate world", var9);
            this.d.a(new fpa(() -> this.d.a(this.e), xe.c("selectWorld.recreate.error.title"), xe.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fps(xe.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fci.a($$1));
            } catch (Throwable var7) {
               fvp.v.error("Invalid icon for world {}", this.f.a(), var7);
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
