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

public class geh extends ftw<geh.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alg m = alg.b("world_list/error_highlighted");
   static final alg n = alg.b("world_list/error");
   static final alg o = alg.b("world_list/marked_join_highlighted");
   static final alg p = alg.b("world_list/marked_join");
   static final alg q = alg.b("world_list/warning_highlighted");
   static final alg r = alg.b("world_list/warning");
   static final alg s = alg.b("world_list/join_highlighted");
   static final alg u = alg.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wy w = wy.c("selectWorld.tooltip.fromNewerVersion1").a(o.m);
   static final wy x = wy.c("selectWorld.tooltip.fromNewerVersion2").a(o.m);
   static final wy y = wy.c("selectWorld.tooltip.snapshot1").a(o.g);
   static final wy z = wy.c("selectWorld.tooltip.snapshot2").a(o.g);
   static final wy A = wy.c("selectWorld.locked").a(o.m);
   static final wy B = wy.c("selectWorld.conversion.tooltip").a(o.m);
   static final wy C = wy.c("selectWorld.incompatible.tooltip").a(o.m);
   static final wy D = wy.c("selectWorld.experimental");
   private final geb E;
   private CompletableFuture<List<ezi>> F;
   @Nullable
   private List<ezi> G;
   private String H;
   private final geh.b I;

   public geh(geb $$0, fpt $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable geh $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new geh.b($$1);
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
      this.aE_().forEach(geh.a::close);
      super.s();
   }

   @Nullable
   private List<ezi> M() {
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
      if (fxc.a($$0)) {
         Optional<geh.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hnj.a(awn.Bv, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fsm $$0, int $$1, int $$2, float $$3) {
      List<ezi> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ezi> $$0) {
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

   private CompletableFuture<List<ezi>> O() {
      ezh.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ezg var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gdt.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(p.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ezi> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ezi $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new geh.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, ezi $$1) {
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

   private void c(wy $$0) {
      this.c.a(new fyb(wy.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable geh.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof geh.c $$1 ? $$1.f : null);
   }

   public Optional<geh.c> b() {
      geh.a $$0 = this.p();
      return $$0 instanceof geh.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public geb c() {
      return this.E;
   }

   @Override
   public void a(fwx $$0) {
      if (this.aE_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends ftw.a<geh.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends geh.a {
      private static final wy a = wy.c("selectWorld.loading_list");
      private final fpt b;

      public b(fpt $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fyh.a(ag.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public wy a() {
         return a;
      }
   }

   public final class c extends geh.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fpt d;
      private final geb e;
      final ezi f;
      private final fyc g;
      @Nullable
      private Path h;
      private long i;

      public c(final geh $$1, final ezi $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fyc.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fet> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     geh.v.warn("{}", fer.a(this.h, $$1));
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
               geh.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wy a() {
         wy $$0 = wy.a("narrator.select.world_info", this.f.b(), wy.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wx.a($$0, geh.A);
         }

         if (this.f.e()) {
            $$0 = wx.a($$0, geh.D);
         }

         return wy.a("narrator.select", $$0);
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + geh.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hky.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wy $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(grc::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alg $$16 = $$15 ? geh.s : geh.u;
            alg $$17 = $$15 ? geh.q : geh.r;
            alg $$18 = $$15 ? geh.m : geh.n;
            alg $$19 = $$15 ? geh.o : geh.p;
            if (this.f instanceof ezi.c || this.f instanceof ezi.b) {
               $$0.a(grc::H, $$18, $$3, $$2, 32, 32);
               $$0.a(grc::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(grc::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(geh.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(grc::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(geh.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(grc::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(geh.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(grc::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(grc::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(geh.w.g(), geh.x.g()));
                  }
               } else if (!ac.b().g()) {
                  $$0.a(grc::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(geh.y.g(), geh.z.g()));
                  }
               }
            } else {
               $$0.a(grc::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            geh.this.a((geh.a)this);
            if (!($$0 - (double)geh.this.u() <= 32.0) && ag.c() - this.i >= 250L) {
               this.i = ag.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hnj.a(awn.Bv, 1.0F));
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
            if (this.f instanceof ezi.c) {
               this.d.a(fyk.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  geh.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fxq($$0 -> {
            if ($$0) {
               this.d.a(new fyp(true));
               this.e();
            }

            this.d.a(this.e);
         }, wy.c("selectWorld.deleteQuestion"), wy.a("selectWorld.deleteWarning", this.f.b()), wy.c("selectWorld.deleteButton"), wx.e));
      }

      public void e() {
         ezh $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ezh.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fvj.b(this.d, $$1);
            geh.v.error("Failed to delete world {}", $$1, var8);
         }

         geh.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         ezh.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fvj.a(this.d, $$0);
            geh.v.error("Failed to access level {}", $$0, var6);
            geh.this.N();
            return;
         } catch (fer var7) {
            geh.v.warn("{}", var7.getMessage());
            this.d.a(fyk.a(() -> this.d.a(this.e)));
            return;
         }

         gdw $$5;
         try {
            $$5 = gdw.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  geh.this.N();
               }

               this.d.a(this.e);
            });
         } catch (uk | uq | IOException var5) {
            $$1.c();
            fvj.a(this.d, $$0);
            geh.v.error("Failed to load world data {}", $$0, var5);
            geh.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (ezh.c $$0 = this.d.m().d(this.f.a())) {
            Pair<djq, ged> $$1 = this.d.x().a($$0);
            djq $$2 = (djq)$$1.getFirst();
            ged $$3 = (ged)$$1.getSecond();
            Path $$4 = gdt.a($$0.a(ezf.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fxq(
                        $$3x -> this.d.a((fys)($$3x ? gdt.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wy.c("selectWorld.recreate.customized.title"),
                        wy.c("selectWorld.recreate.customized.text"),
                        wx.i,
                        wx.e
                     )
                  );
            } else {
               this.d.a(gdt.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fer var8) {
            geh.v.warn("{}", var8.getMessage());
            this.d.a(fyk.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            geh.v.error("Unable to recreate world", var9);
            this.d.a(new fxl(() -> this.d.a(this.e), wy.c("selectWorld.recreate.error.title"), wy.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fyd(wy.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fiz.a($$1));
            } catch (Throwable var7) {
               geh.v.error("Invalid icon for world {}", this.f.a(), var7);
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
