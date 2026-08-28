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

public class gff extends fuu<gff.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alr m = alr.b("world_list/error_highlighted");
   static final alr n = alr.b("world_list/error");
   static final alr o = alr.b("world_list/marked_join_highlighted");
   static final alr p = alr.b("world_list/marked_join");
   static final alr q = alr.b("world_list/warning_highlighted");
   static final alr r = alr.b("world_list/warning");
   static final alr s = alr.b("world_list/join_highlighted");
   static final alr u = alr.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xg w = xg.c("selectWorld.tooltip.fromNewerVersion1").a(o.m);
   static final xg x = xg.c("selectWorld.tooltip.fromNewerVersion2").a(o.m);
   static final xg y = xg.c("selectWorld.tooltip.snapshot1").a(o.g);
   static final xg z = xg.c("selectWorld.tooltip.snapshot2").a(o.g);
   static final xg A = xg.c("selectWorld.locked").a(o.m);
   static final xg B = xg.c("selectWorld.conversion.tooltip").a(o.m);
   static final xg C = xg.c("selectWorld.incompatible.tooltip").a(o.m);
   static final xg D = xg.c("selectWorld.experimental");
   private final gez E;
   private CompletableFuture<List<fai>> F;
   @Nullable
   private List<fai> G;
   private String H;
   private final gff.b I;

   public gff(gez $$0, fqq $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gff $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gff.b($$1);
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
      this.aE_().forEach(gff.a::close);
      super.s();
   }

   @Nullable
   private List<fai> M() {
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
      if (fya.a($$0)) {
         Optional<gff.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hoi.a(awy.Bv, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      List<fai> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<fai> $$0) {
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

   private CompletableFuture<List<fai>> O() {
      fah.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (fag var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         ger.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(p.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<fai> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (fai $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gff.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, fai $$1) {
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

   private void c(xg $$0) {
      this.c.a(new fyz(xg.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gff.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gff.c $$1 ? $$1.f : null);
   }

   public Optional<gff.c> b() {
      gff.a $$0 = this.p();
      return $$0 instanceof gff.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gez c() {
      return this.E;
   }

   @Override
   public void a(fxv $$0) {
      if (this.aE_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fuu.a<gff.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gff.a {
      private static final xg a = xg.c("selectWorld.loading_list");
      private final fqq b;

      public b(fqq $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fzf.a(ag.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public xg a() {
         return a;
      }
   }

   public final class c extends gff.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fqq d;
      private final gez e;
      final fai f;
      private final fza g;
      @Nullable
      private Path h;
      private long i;

      public c(final gff $$1, final fai $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fza.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fft> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     gff.v.warn("{}", ffr.a(this.h, $$1));
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
               gff.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xg a() {
         xg $$0 = xg.a("narrator.select.world_info", this.f.b(), xg.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xf.a($$0, gff.A);
         }

         if (this.f.e()) {
            $$0 = xf.a($$0, gff.D);
         }

         return xg.a("narrator.select", $$0);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gff.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hly.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xg $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gry::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alr $$16 = $$15 ? gff.s : gff.u;
            alr $$17 = $$15 ? gff.q : gff.r;
            alr $$18 = $$15 ? gff.m : gff.n;
            alr $$19 = $$15 ? gff.o : gff.p;
            if (this.f instanceof fai.c || this.f instanceof fai.b) {
               $$0.a(gry::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gry::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gry::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gff.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gry::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gff.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gry::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gff.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gry::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gry::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gff.w.g(), gff.x.g()));
                  }
               } else if (!ac.b().g()) {
                  $$0.a(gry::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gff.y.g(), gff.z.g()));
                  }
               }
            } else {
               $$0.a(gry::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gff.this.a((gff.a)this);
            if (!($$0 - (double)gff.this.u() <= 32.0) && ag.c() - this.i >= 250L) {
               this.i = ag.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hoi.a(awy.Bv, 1.0F));
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
            if (this.f instanceof fai.c) {
               this.d.a(fzi.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gff.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fyo($$0 -> {
            if ($$0) {
               this.d.a(new fzn(true));
               this.e();
            }

            this.d.a(this.e);
         }, xg.c("selectWorld.deleteQuestion"), xg.a("selectWorld.deleteWarning", this.f.b()), xg.c("selectWorld.deleteButton"), xf.e));
      }

      public void e() {
         fah $$0 = this.d.m();
         String $$1 = this.f.a();

         try (fah.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fwh.b(this.d, $$1);
            gff.v.error("Failed to delete world {}", $$1, var8);
         }

         gff.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         fah.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fwh.a(this.d, $$0);
            gff.v.error("Failed to access level {}", $$0, var6);
            gff.this.N();
            return;
         } catch (ffr var7) {
            gff.v.warn("{}", var7.getMessage());
            this.d.a(fzi.a(() -> this.d.a(this.e)));
            return;
         }

         geu $$5;
         try {
            $$5 = geu.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gff.this.N();
               }

               this.d.a(this.e);
            });
         } catch (ul | us | IOException var5) {
            $$1.c();
            fwh.a(this.d, $$0);
            gff.v.error("Failed to load world data {}", $$0, var5);
            gff.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (fah.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dkn, gfb> $$1 = this.d.x().a($$0);
            dkn $$2 = (dkn)$$1.getFirst();
            gfb $$3 = (gfb)$$1.getSecond();
            Path $$4 = ger.a($$0.a(faf.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fyo(
                        $$3x -> this.d.a((fzq)($$3x ? ger.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xg.c("selectWorld.recreate.customized.title"),
                        xg.c("selectWorld.recreate.customized.text"),
                        xf.i,
                        xf.e
                     )
                  );
            } else {
               this.d.a(ger.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ffr var8) {
            gff.v.warn("{}", var8.getMessage());
            this.d.a(fzi.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gff.v.error("Unable to recreate world", var9);
            this.d.a(new fyj(() -> this.d.a(this.e), xg.c("selectWorld.recreate.error.title"), xg.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fzb(xg.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fkf.a($$1));
            } catch (Throwable var7) {
               gff.v.error("Invalid icon for world {}", this.f.a(), var7);
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
