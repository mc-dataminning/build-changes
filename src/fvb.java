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

public class fvb extends fkw<fvb.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alb m = alb.b("world_list/error_highlighted");
   static final alb n = alb.b("world_list/error");
   static final alb o = alb.b("world_list/marked_join_highlighted");
   static final alb p = alb.b("world_list/marked_join");
   static final alb q = alb.b("world_list/warning_highlighted");
   static final alb r = alb.b("world_list/warning");
   static final alb s = alb.b("world_list/join_highlighted");
   static final alb u = alb.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xd w = xd.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xd x = xd.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xd y = xd.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xd z = xd.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xd A = xd.c("selectWorld.locked").a(n.m);
   static final xd B = xd.c("selectWorld.conversion.tooltip").a(n.m);
   static final xd C = xd.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xd D = xd.c("selectWorld.experimental");
   private final fuw E;
   private CompletableFuture<List<esi>> F;
   @Nullable
   private List<esi> G;
   private String H;
   private final fvb.b I;

   public fvb(fuw $$0, fib $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fvb $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fvb.b($$1);
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
      this.aK_().forEach(fvb.a::close);
      super.k();
   }

   @Nullable
   private List<esi> K() {
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
      if (foc.a($$0)) {
         Optional<fvb.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gzz.a(awd.Ax, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      List<esi> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<esi> $$0) {
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

   private CompletableFuture<List<esi>> M() {
      esh.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (esg var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fuq.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<esi> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (esi $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fvb.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, esi $$1) {
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
      this.c.a(new fpc(xd.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fvb.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fvb.c $$1 ? $$1.f : null);
   }

   public Optional<fvb.c> c() {
      fvb.a $$0 = this.h();
      return $$0 instanceof fvb.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fuw J() {
      return this.E;
   }

   @Override
   public void a(fnx $$0) {
      if (this.aK_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fkw.a<fvb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fvb.a {
      private static final xd a = xd.c("selectWorld.loading_list");
      private final fib b;

      public b(fib $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fpi.a(ad.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xd a() {
         return a;
      }
   }

   public final class c extends fvb.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fib d;
      private final fuw e;
      final esi f;
      private final fpd g;
      @Nullable
      private Path h;
      private long i;

      public c(final fvb $$1, final esi $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fpd.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<exv> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     fvb.v.warn("{}", ext.a(this.h, $$1));
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
               fvb.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xd a() {
         xd $$0 = xd.a("narrator.select.world_info", this.f.b(), xd.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xc.a($$0, fvb.A);
         }

         if (this.f.e()) {
            $$0 = xc.a($$0, fvb.D);
         }

         return xd.a("narrator.select", $$0);
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fvb.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gxr.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xd $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(ghe::C, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alb $$16 = $$15 ? fvb.s : fvb.u;
            alb $$17 = $$15 ? fvb.q : fvb.r;
            alb $$18 = $$15 ? fvb.m : fvb.n;
            alb $$19 = $$15 ? fvb.o : fvb.p;
            if (this.f instanceof esi.c || this.f instanceof esi.b) {
               $$0.a(ghe::C, $$18, $$3, $$2, 32, 32);
               $$0.a(ghe::C, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(ghe::C, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvb.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(ghe::C, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvb.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(ghe::C, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fvb.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(ghe::C, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(ghe::C, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fvb.w.g(), fvb.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(ghe::C, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fvb.y.g(), fvb.z.g()));
                  }
               }
            } else {
               $$0.a(ghe::C, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fvb.this.a((fvb.a)this);
            if (!($$0 - (double)fvb.this.s() <= 32.0) && ad.c() - this.i >= 250L) {
               this.i = ad.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gzz.a(awd.Ax, 1.0F));
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
            if (this.f instanceof esi.c) {
               this.d.a(fpl.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fvb.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new foq($$0 -> {
            if ($$0) {
               this.d.a(new fpq(true));
               this.e();
            }

            this.d.a(this.e);
         }, xd.c("selectWorld.deleteQuestion"), xd.a("selectWorld.deleteWarning", this.f.b()), xd.c("selectWorld.deleteButton"), xc.e));
      }

      public void e() {
         esh $$0 = this.d.m();
         String $$1 = this.f.a();

         try (esh.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fmj.b(this.d, $$1);
            fvb.v.error("Failed to delete world {}", $$1, var8);
         }

         fvb.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         esh.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fmj.a(this.d, $$0);
            fvb.v.error("Failed to access level {}", $$0, var6);
            fvb.this.L();
            return;
         } catch (ext var7) {
            fvb.v.warn("{}", var7.getMessage());
            this.d.a(fpl.a(() -> this.d.a(this.e)));
            return;
         }

         fus $$5;
         try {
            $$5 = fus.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fvb.this.L();
               }

               this.d.a(this.e);
            });
         } catch (uq | uw | IOException var5) {
            $$1.c();
            fmj.a(this.d, $$0);
            fvb.v.error("Failed to load world data {}", $$0, var5);
            fvb.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (esh.c $$0 = this.d.m().d(this.f.a())) {
            Pair<ddw, fuy> $$1 = this.d.x().a($$0);
            ddw $$2 = (ddw)$$1.getFirst();
            fuy $$3 = (fuy)$$1.getSecond();
            Path $$4 = fuq.a($$0.a(esf.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new foq(
                        $$3x -> this.d.a((fpt)($$3x ? fuq.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xd.c("selectWorld.recreate.customized.title"),
                        xd.c("selectWorld.recreate.customized.text"),
                        xc.i,
                        xc.e
                     )
                  );
            } else {
               this.d.a(fuq.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ext var8) {
            fvb.v.warn("{}", var8.getMessage());
            this.d.a(fpl.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fvb.v.error("Unable to recreate world", var9);
            this.d.a(new fol(() -> this.d.a(this.e), xd.c("selectWorld.recreate.error.title"), xd.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fpe(xd.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fbp.a($$1));
            } catch (Throwable var7) {
               fvb.v.error("Invalid icon for world {}", this.f.a(), var7);
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
