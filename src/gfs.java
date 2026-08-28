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

public class gfs extends fvh<gfs.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ali m = ali.b("world_list/error_highlighted");
   static final ali n = ali.b("world_list/error");
   static final ali o = ali.b("world_list/marked_join_highlighted");
   static final ali p = ali.b("world_list/marked_join");
   static final ali q = ali.b("world_list/warning_highlighted");
   static final ali r = ali.b("world_list/warning");
   static final ali s = ali.b("world_list/join_highlighted");
   static final ali u = ali.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xa w = xa.c("selectWorld.tooltip.fromNewerVersion1").a(o.m);
   static final xa x = xa.c("selectWorld.tooltip.fromNewerVersion2").a(o.m);
   static final xa y = xa.c("selectWorld.tooltip.snapshot1").a(o.g);
   static final xa z = xa.c("selectWorld.tooltip.snapshot2").a(o.g);
   static final xa A = xa.c("selectWorld.locked").a(o.m);
   static final xa B = xa.c("selectWorld.conversion.tooltip").a(o.m);
   static final xa C = xa.c("selectWorld.incompatible.tooltip").a(o.m);
   static final xa D = xa.c("selectWorld.experimental");
   private final gfm E;
   private CompletableFuture<List<ezw>> F;
   @Nullable
   private List<ezw> G;
   private String H;
   private final gfs.b I;

   public gfs(gfm $$0, frd $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gfs $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gfs.b($$1);
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
      this.aI_().forEach(gfs.a::close);
      super.s();
   }

   @Nullable
   private List<ezw> M() {
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
      if (fyn.a($$0)) {
         Optional<gfs.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hos.a(awp.Bv, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      List<ezw> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ezw> $$0) {
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

   private CompletableFuture<List<ezw>> O() {
      ezv.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ezu var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gfe.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(p.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ezw> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ezw $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gfs.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, ezw $$1) {
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

   private void c(xa $$0) {
      this.c.a(new fzm(xa.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gfs.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gfs.c $$1 ? $$1.f : null);
   }

   public Optional<gfs.c> b() {
      gfs.a $$0 = this.p();
      return $$0 instanceof gfs.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gfm c() {
      return this.E;
   }

   @Override
   public void a(fyi $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fvh.a<gfs.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gfs.a {
      private static final xa a = xa.c("selectWorld.loading_list");
      private final frd b;

      public b(frd $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fzs.a(ag.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public xa a() {
         return a;
      }
   }

   public final class c extends gfs.a {
      private static final int b = 32;
      private static final int c = 32;
      private final frd d;
      private final gfm e;
      final ezw f;
      private final fzn g;
      @Nullable
      private Path h;
      private long i;

      public c(final gfs $$1, final ezw $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fzn.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ffh> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     gfs.v.warn("{}", fff.a(this.h, $$1));
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
               gfs.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xa a() {
         xa $$0 = xa.a("narrator.select.world_info", this.f.b(), xa.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wz.a($$0, gfs.A);
         }

         if (this.f.e()) {
            $$0 = wz.a($$0, gfs.D);
         }

         return xa.a("narrator.select", $$0);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gfs.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hmi.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xa $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gsl::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ali $$16 = $$15 ? gfs.s : gfs.u;
            ali $$17 = $$15 ? gfs.q : gfs.r;
            ali $$18 = $$15 ? gfs.m : gfs.n;
            ali $$19 = $$15 ? gfs.o : gfs.p;
            if (this.f instanceof ezw.c || this.f instanceof ezw.b) {
               $$0.a(gsl::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gsl::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gsl::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gfs.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gsl::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gfs.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gsl::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gfs.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gsl::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gsl::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gfs.w.g(), gfs.x.g()));
                  }
               } else if (!ac.b().g()) {
                  $$0.a(gsl::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gfs.y.g(), gfs.z.g()));
                  }
               }
            } else {
               $$0.a(gsl::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gfs.this.a((gfs.a)this);
            if (!($$0 - (double)gfs.this.u() <= 32.0) && ag.c() - this.i >= 250L) {
               this.i = ag.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hos.a(awp.Bv, 1.0F));
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
            if (this.f instanceof ezw.c) {
               this.d.a(fzv.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gfs.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fzb($$0 -> {
            if ($$0) {
               this.d.a(new gaa(true));
               this.e();
            }

            this.d.a(this.e);
         }, xa.c("selectWorld.deleteQuestion"), xa.a("selectWorld.deleteWarning", this.f.b()), xa.c("selectWorld.deleteButton"), wz.e));
      }

      public void e() {
         ezv $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ezv.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fwu.b(this.d, $$1);
            gfs.v.error("Failed to delete world {}", $$1, var8);
         }

         gfs.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         ezv.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fwu.a(this.d, $$0);
            gfs.v.error("Failed to access level {}", $$0, var6);
            gfs.this.N();
            return;
         } catch (fff var7) {
            gfs.v.warn("{}", var7.getMessage());
            this.d.a(fzv.a(() -> this.d.a(this.e)));
            return;
         }

         gfh $$5;
         try {
            $$5 = gfh.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gfs.this.N();
               }

               this.d.a(this.e);
            });
         } catch (uk | ur | IOException var5) {
            $$1.c();
            fwu.a(this.d, $$0);
            gfs.v.error("Failed to load world data {}", $$0, var5);
            gfs.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (ezv.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dkb, gfo> $$1 = this.d.x().a($$0);
            dkb $$2 = (dkb)$$1.getFirst();
            gfo $$3 = (gfo)$$1.getSecond();
            Path $$4 = gfe.a($$0.a(ezt.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fzb(
                        $$3x -> this.d.a((gad)($$3x ? gfe.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xa.c("selectWorld.recreate.customized.title"),
                        xa.c("selectWorld.recreate.customized.text"),
                        wz.i,
                        wz.e
                     )
                  );
            } else {
               this.d.a(gfe.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fff var8) {
            gfs.v.warn("{}", var8.getMessage());
            this.d.a(fzv.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gfs.v.error("Unable to recreate world", var9);
            this.d.a(new fyw(() -> this.d.a(this.e), xa.c("selectWorld.recreate.error.title"), xa.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fzo(xa.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fkg.a($$1));
            } catch (Throwable var7) {
               gfs.v.error("Invalid icon for world {}", this.f.a(), var7);
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
