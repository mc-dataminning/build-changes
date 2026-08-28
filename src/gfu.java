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

public class gfu extends fvj<gfu.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alk m = alk.b("world_list/error_highlighted");
   static final alk n = alk.b("world_list/error");
   static final alk o = alk.b("world_list/marked_join_highlighted");
   static final alk p = alk.b("world_list/marked_join");
   static final alk q = alk.b("world_list/warning_highlighted");
   static final alk r = alk.b("world_list/warning");
   static final alk s = alk.b("world_list/join_highlighted");
   static final alk u = alk.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xc w = xc.c("selectWorld.tooltip.fromNewerVersion1").a(o.m);
   static final xc x = xc.c("selectWorld.tooltip.fromNewerVersion2").a(o.m);
   static final xc y = xc.c("selectWorld.tooltip.snapshot1").a(o.g);
   static final xc z = xc.c("selectWorld.tooltip.snapshot2").a(o.g);
   static final xc A = xc.c("selectWorld.locked").a(o.m);
   static final xc B = xc.c("selectWorld.conversion.tooltip").a(o.m);
   static final xc C = xc.c("selectWorld.incompatible.tooltip").a(o.m);
   static final xc D = xc.c("selectWorld.experimental");
   private final gfo E;
   private CompletableFuture<List<ezy>> F;
   @Nullable
   private List<ezy> G;
   private String H;
   private final gfu.b I;

   public gfu(gfo $$0, frf $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gfu $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gfu.b($$1);
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
      this.aI_().forEach(gfu.a::close);
      super.s();
   }

   @Nullable
   private List<ezy> M() {
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
      if (fyp.a($$0)) {
         Optional<gfu.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hou.a(awr.Bv, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      List<ezy> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ezy> $$0) {
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

   private CompletableFuture<List<ezy>> O() {
      ezx.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ezw var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gfg.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(p.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ezy> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ezy $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gfu.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, ezy $$1) {
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

   private void c(xc $$0) {
      this.c.a(new fzo(xc.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gfu.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gfu.c $$1 ? $$1.f : null);
   }

   public Optional<gfu.c> b() {
      gfu.a $$0 = this.p();
      return $$0 instanceof gfu.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gfo c() {
      return this.E;
   }

   @Override
   public void a(fyk $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fvj.a<gfu.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gfu.a {
      private static final xc a = xc.c("selectWorld.loading_list");
      private final frf b;

      public b(frf $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fzu.a(ag.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public xc a() {
         return a;
      }
   }

   public final class c extends gfu.a {
      private static final int b = 32;
      private static final int c = 32;
      private final frf d;
      private final gfo e;
      final ezy f;
      private final fzp g;
      @Nullable
      private Path h;
      private long i;

      public c(final gfu $$1, final ezy $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fzp.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ffj> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     gfu.v.warn("{}", ffh.a(this.h, $$1));
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
               gfu.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xc a() {
         xc $$0 = xc.a("narrator.select.world_info", this.f.b(), xc.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xb.a($$0, gfu.A);
         }

         if (this.f.e()) {
            $$0 = xb.a($$0, gfu.D);
         }

         return xc.a("narrator.select", $$0);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gfu.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hmk.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xc $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gsn::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alk $$16 = $$15 ? gfu.s : gfu.u;
            alk $$17 = $$15 ? gfu.q : gfu.r;
            alk $$18 = $$15 ? gfu.m : gfu.n;
            alk $$19 = $$15 ? gfu.o : gfu.p;
            if (this.f instanceof ezy.c || this.f instanceof ezy.b) {
               $$0.a(gsn::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gsn::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gsn::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gfu.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gsn::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gfu.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gsn::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gfu.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gsn::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gsn::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gfu.w.g(), gfu.x.g()));
                  }
               } else if (!ac.b().g()) {
                  $$0.a(gsn::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gfu.y.g(), gfu.z.g()));
                  }
               }
            } else {
               $$0.a(gsn::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gfu.this.a((gfu.a)this);
            if (!($$0 - (double)gfu.this.u() <= 32.0) && ag.c() - this.i >= 250L) {
               this.i = ag.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hou.a(awr.Bv, 1.0F));
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
            if (this.f instanceof ezy.c) {
               this.d.a(fzx.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gfu.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fzd($$0 -> {
            if ($$0) {
               this.d.a(new gac(true));
               this.e();
            }

            this.d.a(this.e);
         }, xc.c("selectWorld.deleteQuestion"), xc.a("selectWorld.deleteWarning", this.f.b()), xc.c("selectWorld.deleteButton"), xb.e));
      }

      public void e() {
         ezx $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ezx.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fww.b(this.d, $$1);
            gfu.v.error("Failed to delete world {}", $$1, var8);
         }

         gfu.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         ezx.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fww.a(this.d, $$0);
            gfu.v.error("Failed to access level {}", $$0, var6);
            gfu.this.N();
            return;
         } catch (ffh var7) {
            gfu.v.warn("{}", var7.getMessage());
            this.d.a(fzx.a(() -> this.d.a(this.e)));
            return;
         }

         gfj $$5;
         try {
            $$5 = gfj.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gfu.this.N();
               }

               this.d.a(this.e);
            });
         } catch (ul | us | IOException var5) {
            $$1.c();
            fww.a(this.d, $$0);
            gfu.v.error("Failed to load world data {}", $$0, var5);
            gfu.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (ezx.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dkd, gfq> $$1 = this.d.x().a($$0);
            dkd $$2 = (dkd)$$1.getFirst();
            gfq $$3 = (gfq)$$1.getSecond();
            Path $$4 = gfg.a($$0.a(ezv.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fzd(
                        $$3x -> this.d.a((gaf)($$3x ? gfg.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xc.c("selectWorld.recreate.customized.title"),
                        xc.c("selectWorld.recreate.customized.text"),
                        xb.i,
                        xb.e
                     )
                  );
            } else {
               this.d.a(gfg.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ffh var8) {
            gfu.v.warn("{}", var8.getMessage());
            this.d.a(fzx.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gfu.v.error("Unable to recreate world", var9);
            this.d.a(new fyy(() -> this.d.a(this.e), xc.c("selectWorld.recreate.error.title"), xc.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fzq(xc.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fki.a($$1));
            } catch (Throwable var7) {
               gfu.v.error("Invalid icon for world {}", this.f.a(), var7);
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
