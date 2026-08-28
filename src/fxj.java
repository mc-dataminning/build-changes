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

public class fxj extends fmz<fxj.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alj m = alj.b("world_list/error_highlighted");
   static final alj n = alj.b("world_list/error");
   static final alj o = alj.b("world_list/marked_join_highlighted");
   static final alj p = alj.b("world_list/marked_join");
   static final alj q = alj.b("world_list/warning_highlighted");
   static final alj r = alj.b("world_list/warning");
   static final alj s = alj.b("world_list/join_highlighted");
   static final alj u = alj.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xj w = xj.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xj x = xj.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xj y = xj.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xj z = xj.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xj A = xj.c("selectWorld.locked").a(n.m);
   static final xj B = xj.c("selectWorld.conversion.tooltip").a(n.m);
   static final xj C = xj.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xj D = xj.c("selectWorld.experimental");
   private final fxd E;
   private CompletableFuture<List<euc>> F;
   @Nullable
   private List<euc> G;
   private String H;
   private final fxj.b I;

   public fxj(fxd $$0, fke $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fxj $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fxj.b($$1);
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
      this.aH_().forEach(fxj.a::close);
      super.k();
   }

   @Nullable
   private List<euc> K() {
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
      if (fqg.a($$0)) {
         Optional<fxj.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hcw.a(awn.Av, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      List<euc> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<euc> $$0) {
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

   private CompletableFuture<List<euc>> M() {
      eub.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eua var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fwv.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<euc> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (euc $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fxj.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, euc $$1) {
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

   private void c(xj $$0) {
      this.c.a(new frf(xj.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fxj.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fxj.c $$1 ? $$1.f : null);
   }

   public Optional<fxj.c> c() {
      fxj.a $$0 = this.h();
      return $$0 instanceof fxj.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fxd J() {
      return this.E;
   }

   @Override
   public void a(fqb $$0) {
      if (this.aH_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fmz.a<fxj.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fxj.a {
      private static final xj a = xj.c("selectWorld.loading_list");
      private final fke b;

      public b(fke $$0) {
         this.b = $$0;
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = frl.a(ae.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xj a() {
         return a;
      }
   }

   public final class c extends fxj.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fke d;
      private final fxd e;
      final euc f;
      private final frg g;
      @Nullable
      private Path h;
      private long i;

      public c(final fxj $$1, final euc $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = frg.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ezp> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fxj.v.warn("{}", ezn.a(this.h, $$1));
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
               fxj.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xj a() {
         xj $$0 = xj.a("narrator.select.world_info", this.f.b(), xj.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xi.a($$0, fxj.A);
         }

         if (this.f.e()) {
            $$0 = xi.a($$0, fxj.D);
         }

         return xj.a("narrator.select", $$0);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fxj.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hal.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xj $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(gjq::B, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alj $$16 = $$15 ? fxj.s : fxj.u;
            alj $$17 = $$15 ? fxj.q : fxj.r;
            alj $$18 = $$15 ? fxj.m : fxj.n;
            alj $$19 = $$15 ? fxj.o : fxj.p;
            if (this.f instanceof euc.c || this.f instanceof euc.b) {
               $$0.a(gjq::B, $$18, $$3, $$2, 32, 32);
               $$0.a(gjq::B, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gjq::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fxj.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gjq::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fxj.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gjq::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fxj.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gjq::B, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gjq::B, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fxj.w.g(), fxj.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gjq::B, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fxj.y.g(), fxj.z.g()));
                  }
               }
            } else {
               $$0.a(gjq::B, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fxj.this.a((fxj.a)this);
            if (!($$0 - (double)fxj.this.s() <= 32.0) && ae.c() - this.i >= 250L) {
               this.i = ae.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hcw.a(awn.Av, 1.0F));
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
            if (this.f instanceof euc.c) {
               this.d.a(fro.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fxj.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fqu($$0 -> {
            if ($$0) {
               this.d.a(new frt(true));
               this.e();
            }

            this.d.a(this.e);
         }, xj.c("selectWorld.deleteQuestion"), xj.a("selectWorld.deleteWarning", this.f.b()), xj.c("selectWorld.deleteButton"), xi.e));
      }

      public void e() {
         eub $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eub.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fom.b(this.d, $$1);
            fxj.v.error("Failed to delete world {}", $$1, var8);
         }

         fxj.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eub.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fom.a(this.d, $$0);
            fxj.v.error("Failed to access level {}", $$0, var6);
            fxj.this.L();
            return;
         } catch (ezn var7) {
            fxj.v.warn("{}", var7.getMessage());
            this.d.a(fro.a(() -> this.d.a(this.e)));
            return;
         }

         fwy $$5;
         try {
            $$5 = fwy.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fxj.this.L();
               }

               this.d.a(this.e);
            });
         } catch (uw | vc | IOException var5) {
            $$1.c();
            fom.a(this.d, $$0);
            fxj.v.error("Failed to load world data {}", $$0, var5);
            fxj.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eub.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dfq, fxf> $$1 = this.d.x().a($$0);
            dfq $$2 = (dfq)$$1.getFirst();
            fxf $$3 = (fxf)$$1.getSecond();
            Path $$4 = fwv.a($$0.a(etz.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fqu(
                        $$3x -> this.d.a((frw)($$3x ? fwv.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xj.c("selectWorld.recreate.customized.title"),
                        xj.c("selectWorld.recreate.customized.text"),
                        xi.i,
                        xi.e
                     )
                  );
            } else {
               this.d.a(fwv.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ezn var8) {
            fxj.v.warn("{}", var8.getMessage());
            this.d.a(fro.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fxj.v.error("Unable to recreate world", var9);
            this.d.a(new fqp(() -> this.d.a(this.e), xj.c("selectWorld.recreate.error.title"), xj.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new frh(xj.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fdr.a($$1));
            } catch (Throwable var7) {
               fxj.v.error("Invalid icon for world {}", this.f.a(), var7);
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
