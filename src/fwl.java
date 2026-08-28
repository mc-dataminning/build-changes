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

public class fwl extends fmd<fwl.a> {
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
   static final xi w = xi.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xi x = xi.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xi y = xi.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xi z = xi.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xi A = xi.c("selectWorld.locked").a(n.m);
   static final xi B = xi.c("selectWorld.conversion.tooltip").a(n.m);
   static final xi C = xi.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xi D = xi.c("selectWorld.experimental");
   private final fwf E;
   private CompletableFuture<List<etr>> F;
   @Nullable
   private List<etr> G;
   private String H;
   private final fwl.b I;

   public fwl(fwf $$0, fji $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fwl $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fwl.b($$1);
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
      this.aI_().forEach(fwl.a::close);
      super.k();
   }

   @Nullable
   private List<etr> K() {
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
      if (fpk.a($$0)) {
         Optional<fwl.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hbv.a(awl.Av, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      List<etr> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<etr> $$0) {
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

   private CompletableFuture<List<etr>> M() {
      etq.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (etp var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fvx.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<etr> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (etr $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fwl.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, etr $$1) {
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

   private void c(xi $$0) {
      this.c.a(new fqj(xi.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fwl.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fwl.c $$1 ? $$1.f : null);
   }

   public Optional<fwl.c> c() {
      fwl.a $$0 = this.h();
      return $$0 instanceof fwl.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fwf J() {
      return this.E;
   }

   @Override
   public void a(fpf $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fmd.a<fwl.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fwl.a {
      private static final xi a = xi.c("selectWorld.loading_list");
      private final fji b;

      public b(fji $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fqp.a(ae.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xi a() {
         return a;
      }
   }

   public final class c extends fwl.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fji d;
      private final fwf e;
      final etr f;
      private final fqk g;
      @Nullable
      private Path h;
      private long i;

      public c(final fwl $$1, final etr $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fqk.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eze> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fwl.v.warn("{}", ezc.a(this.h, $$1));
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
               fwl.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xi a() {
         xi $$0 = xi.a("narrator.select.world_info", this.f.b(), xi.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xh.a($$0, fwl.A);
         }

         if (this.f.e()) {
            $$0 = xh.a($$0, fwl.D);
         }

         return xi.a("narrator.select", $$0);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fwl.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gzk.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xi $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(gir::B, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ali $$16 = $$15 ? fwl.s : fwl.u;
            ali $$17 = $$15 ? fwl.q : fwl.r;
            ali $$18 = $$15 ? fwl.m : fwl.n;
            ali $$19 = $$15 ? fwl.o : fwl.p;
            if (this.f instanceof etr.c || this.f instanceof etr.b) {
               $$0.a(gir::B, $$18, $$3, $$2, 32, 32);
               $$0.a(gir::B, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gir::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fwl.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gir::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fwl.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gir::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fwl.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gir::B, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gir::B, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fwl.w.g(), fwl.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gir::B, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fwl.y.g(), fwl.z.g()));
                  }
               }
            } else {
               $$0.a(gir::B, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fwl.this.a((fwl.a)this);
            if (!($$0 - (double)fwl.this.s() <= 32.0) && ae.c() - this.i >= 250L) {
               this.i = ae.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hbv.a(awl.Av, 1.0F));
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
            if (this.f instanceof etr.c) {
               this.d.a(fqs.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fwl.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fpy($$0 -> {
            if ($$0) {
               this.d.a(new fqx(true));
               this.e();
            }

            this.d.a(this.e);
         }, xi.c("selectWorld.deleteQuestion"), xi.a("selectWorld.deleteWarning", this.f.b()), xi.c("selectWorld.deleteButton"), xh.e));
      }

      public void e() {
         etq $$0 = this.d.m();
         String $$1 = this.f.a();

         try (etq.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fnq.b(this.d, $$1);
            fwl.v.error("Failed to delete world {}", $$1, var8);
         }

         fwl.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         etq.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fnq.a(this.d, $$0);
            fwl.v.error("Failed to access level {}", $$0, var6);
            fwl.this.L();
            return;
         } catch (ezc var7) {
            fwl.v.warn("{}", var7.getMessage());
            this.d.a(fqs.a(() -> this.d.a(this.e)));
            return;
         }

         fwa $$5;
         try {
            $$5 = fwa.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fwl.this.L();
               }

               this.d.a(this.e);
            });
         } catch (uv | vb | IOException var5) {
            $$1.c();
            fnq.a(this.d, $$0);
            fwl.v.error("Failed to load world data {}", $$0, var5);
            fwl.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (etq.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dff, fwh> $$1 = this.d.x().a($$0);
            dff $$2 = (dff)$$1.getFirst();
            fwh $$3 = (fwh)$$1.getSecond();
            Path $$4 = fvx.a($$0.a(eto.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fpy(
                        $$3x -> this.d.a((fra)($$3x ? fvx.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xi.c("selectWorld.recreate.customized.title"),
                        xi.c("selectWorld.recreate.customized.text"),
                        xh.i,
                        xh.e
                     )
                  );
            } else {
               this.d.a(fvx.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ezc var8) {
            fwl.v.warn("{}", var8.getMessage());
            this.d.a(fqs.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fwl.v.error("Unable to recreate world", var9);
            this.d.a(new fpt(() -> this.d.a(this.e), xi.c("selectWorld.recreate.error.title"), xi.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fql(xi.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fdb.a($$1));
            } catch (Throwable var7) {
               fwl.v.error("Invalid icon for world {}", this.f.a(), var7);
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
