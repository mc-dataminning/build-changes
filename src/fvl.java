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

public class fvl extends flg<fvl.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alc m = alc.b("world_list/error_highlighted");
   static final alc n = alc.b("world_list/error");
   static final alc o = alc.b("world_list/marked_join_highlighted");
   static final alc p = alc.b("world_list/marked_join");
   static final alc q = alc.b("world_list/warning_highlighted");
   static final alc r = alc.b("world_list/warning");
   static final alc s = alc.b("world_list/join_highlighted");
   static final alc u = alc.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xd w = xd.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xd x = xd.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xd y = xd.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xd z = xd.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xd A = xd.c("selectWorld.locked").a(n.m);
   static final xd B = xd.c("selectWorld.conversion.tooltip").a(n.m);
   static final xd C = xd.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xd D = xd.c("selectWorld.experimental");
   private final fvg E;
   private CompletableFuture<List<esw>> F;
   @Nullable
   private List<esw> G;
   private String H;
   private final fvl.b I;

   public fvl(fvg $$0, fil $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fvl $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fvl.b($$1);
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
      this.aI_().forEach(fvl.a::close);
      super.k();
   }

   @Nullable
   private List<esw> K() {
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
      if (fom.a($$0)) {
         Optional<fvl.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(haq.a(awe.Ax, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      List<esw> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<esw> $$0) {
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

   private CompletableFuture<List<esw>> M() {
      esv.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (esu var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fva.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<esw> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (esw $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fvl.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, esw $$1) {
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

   private void c(xd $$0) {
      this.c.a(new fpm(xd.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fvl.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fvl.c $$1 ? $$1.f : null);
   }

   public Optional<fvl.c> c() {
      fvl.a $$0 = this.h();
      return $$0 instanceof fvl.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fvg J() {
      return this.E;
   }

   @Override
   public void a(foh $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends flg.a<fvl.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fvl.a {
      private static final xd a = xd.c("selectWorld.loading_list");
      private final fil b;

      public b(fil $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fps.a(ad.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xd a() {
         return a;
      }
   }

   public final class c extends fvl.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fil d;
      private final fvg e;
      final esw f;
      private final fpn g;
      @Nullable
      private Path h;
      private long i;

      public c(final fvl $$1, final esw $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fpn.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eyj> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fvl.v.warn("{}", eyh.a(this.h, $$1));
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
               fvl.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xd a() {
         xd $$0 = xd.a("narrator.select.world_info", this.f.b(), xd.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xc.a($$0, fvl.A);
         }

         if (this.f.e()) {
            $$0 = xc.a($$0, fvl.D);
         }

         return xd.a("narrator.select", $$0);
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fvl.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gyi.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xd $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(ghq::B, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alc $$16 = $$15 ? fvl.s : fvl.u;
            alc $$17 = $$15 ? fvl.q : fvl.r;
            alc $$18 = $$15 ? fvl.m : fvl.n;
            alc $$19 = $$15 ? fvl.o : fvl.p;
            if (this.f instanceof esw.c || this.f instanceof esw.b) {
               $$0.a(ghq::B, $$18, $$3, $$2, 32, 32);
               $$0.a(ghq::B, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(ghq::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvl.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(ghq::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvl.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(ghq::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvl.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(ghq::B, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(ghq::B, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fvl.w.g(), fvl.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(ghq::B, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fvl.y.g(), fvl.z.g()));
                  }
               }
            } else {
               $$0.a(ghq::B, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fvl.this.a((fvl.a)this);
            if (!($$0 - (double)fvl.this.s() <= 32.0) && ad.c() - this.i >= 250L) {
               this.i = ad.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(haq.a(awe.Ax, 1.0F));
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
            if (this.f instanceof esw.c) {
               this.d.a(fpv.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fvl.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fpb($$0 -> {
            if ($$0) {
               this.d.a(new fqa(true));
               this.e();
            }

            this.d.a(this.e);
         }, xd.c("selectWorld.deleteQuestion"), xd.a("selectWorld.deleteWarning", this.f.b()), xd.c("selectWorld.deleteButton"), xc.e));
      }

      public void e() {
         esv $$0 = this.d.m();
         String $$1 = this.f.a();

         try (esv.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fmt.b(this.d, $$1);
            fvl.v.error("Failed to delete world {}", $$1, var8);
         }

         fvl.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         esv.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fmt.a(this.d, $$0);
            fvl.v.error("Failed to access level {}", $$0, var6);
            fvl.this.L();
            return;
         } catch (eyh var7) {
            fvl.v.warn("{}", var7.getMessage());
            this.d.a(fpv.a(() -> this.d.a(this.e)));
            return;
         }

         fvc $$5;
         try {
            $$5 = fvc.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fvl.this.L();
               }

               this.d.a(this.e);
            });
         } catch (uq | uw | IOException var5) {
            $$1.c();
            fmt.a(this.d, $$0);
            fvl.v.error("Failed to load world data {}", $$0, var5);
            fvl.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (esv.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dek, fvi> $$1 = this.d.x().a($$0);
            dek $$2 = (dek)$$1.getFirst();
            fvi $$3 = (fvi)$$1.getSecond();
            Path $$4 = fva.a($$0.a(est.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fpb(
                        $$3x -> this.d.a((fqd)($$3x ? fva.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xd.c("selectWorld.recreate.customized.title"),
                        xd.c("selectWorld.recreate.customized.text"),
                        xc.i,
                        xc.e
                     )
                  );
            } else {
               this.d.a(fva.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eyh var8) {
            fvl.v.warn("{}", var8.getMessage());
            this.d.a(fpv.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fvl.v.error("Unable to recreate world", var9);
            this.d.a(new fow(() -> this.d.a(this.e), xd.c("selectWorld.recreate.error.title"), xd.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fpo(xd.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fce.a($$1));
            } catch (Throwable var7) {
               fvl.v.error("Invalid icon for world {}", this.f.a(), var7);
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
