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

public class fzx extends fpo<fzx.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final aku m = aku.b("world_list/error_highlighted");
   static final aku n = aku.b("world_list/error");
   static final aku o = aku.b("world_list/marked_join_highlighted");
   static final aku p = aku.b("world_list/marked_join");
   static final aku q = aku.b("world_list/warning_highlighted");
   static final aku r = aku.b("world_list/warning");
   static final aku s = aku.b("world_list/join_highlighted");
   static final aku u = aku.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wo w = wo.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wo x = wo.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wo y = wo.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wo z = wo.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wo A = wo.c("selectWorld.locked").a(n.m);
   static final wo B = wo.c("selectWorld.conversion.tooltip").a(n.m);
   static final wo C = wo.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wo D = wo.c("selectWorld.experimental");
   private final fzr E;
   private CompletableFuture<List<evg>> F;
   @Nullable
   private List<evg> G;
   private String H;
   private final fzx.b I;

   public fzx(fzr $$0, flj $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fzx $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fzx.b($$1);
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
      this.aH_().forEach(fzx.a::close);
      super.s();
   }

   @Nullable
   private List<evg> M() {
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
      if (fsu.a($$0)) {
         Optional<fzx.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hid.a(awa.Bg, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      List<evg> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<evg> $$0) {
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

   private CompletableFuture<List<evg>> O() {
      evf.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eve var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fzj.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<evg> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (evg $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fzx.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, evg $$1) {
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

   private void c(wo $$0) {
      this.c.a(new ftt(wo.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable fzx.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fzx.c $$1 ? $$1.f : null);
   }

   public Optional<fzx.c> b() {
      fzx.a $$0 = this.p();
      return $$0 instanceof fzx.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fzr c() {
      return this.E;
   }

   @Override
   public void a(fsp $$0) {
      if (this.aH_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fpo.a<fzx.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fzx.a {
      private static final wo a = wo.c("selectWorld.loading_list");
      private final flj b;

      public b(flj $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = ftz.a(af.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public wo a() {
         return a;
      }
   }

   public final class c extends fzx.a {
      private static final int b = 32;
      private static final int c = 32;
      private final flj d;
      private final fzr e;
      final evg f;
      private final ftu g;
      @Nullable
      private Path h;
      private long i;

      public c(final fzx $$1, final evg $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = ftu.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<far> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     fzx.v.warn("{}", fap.a(this.h, $$1));
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
               fzx.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wo a() {
         wo $$0 = wo.a("narrator.select.world_info", this.f.b(), wo.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wn.a($$0, fzx.A);
         }

         if (this.f.e()) {
            $$0 = wn.a($$0, fzx.D);
         }

         return wo.a("narrator.select", $$0);
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fzx.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hfq.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wo $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gmh::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            aku $$16 = $$15 ? fzx.s : fzx.u;
            aku $$17 = $$15 ? fzx.q : fzx.r;
            aku $$18 = $$15 ? fzx.m : fzx.n;
            aku $$19 = $$15 ? fzx.o : fzx.p;
            if (this.f instanceof evg.c || this.f instanceof evg.b) {
               $$0.a(gmh::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gmh::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gmh::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzx.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gmh::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzx.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gmh::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzx.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gmh::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gmh::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fzx.w.g(), fzx.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gmh::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fzx.y.g(), fzx.z.g()));
                  }
               }
            } else {
               $$0.a(gmh::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fzx.this.a((fzx.a)this);
            if (!($$0 - (double)fzx.this.u() <= 32.0) && af.c() - this.i >= 250L) {
               this.i = af.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hid.a(awa.Bg, 1.0F));
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
            if (this.f instanceof evg.c) {
               this.d.a(fuc.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fzx.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fti($$0 -> {
            if ($$0) {
               this.d.a(new fuh(true));
               this.e();
            }

            this.d.a(this.e);
         }, wo.c("selectWorld.deleteQuestion"), wo.a("selectWorld.deleteWarning", this.f.b()), wo.c("selectWorld.deleteButton"), wn.e));
      }

      public void e() {
         evf $$0 = this.d.m();
         String $$1 = this.f.a();

         try (evf.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            frb.b(this.d, $$1);
            fzx.v.error("Failed to delete world {}", $$1, var8);
         }

         fzx.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         evf.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            frb.a(this.d, $$0);
            fzx.v.error("Failed to access level {}", $$0, var6);
            fzx.this.N();
            return;
         } catch (fap var7) {
            fzx.v.warn("{}", var7.getMessage());
            this.d.a(fuc.a(() -> this.d.a(this.e)));
            return;
         }

         fzm $$5;
         try {
            $$5 = fzm.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fzx.this.N();
               }

               this.d.a(this.e);
            });
         } catch (ub | uh | IOException var5) {
            $$1.c();
            frb.a(this.d, $$0);
            fzx.v.error("Failed to load world data {}", $$0, var5);
            fzx.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (evf.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dgm, fzt> $$1 = this.d.x().a($$0);
            dgm $$2 = (dgm)$$1.getFirst();
            fzt $$3 = (fzt)$$1.getSecond();
            Path $$4 = fzj.a($$0.a(evd.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fti(
                        $$3x -> this.d.a((fuk)($$3x ? fzj.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wo.c("selectWorld.recreate.customized.title"),
                        wo.c("selectWorld.recreate.customized.text"),
                        wn.i,
                        wn.e
                     )
                  );
            } else {
               this.d.a(fzj.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fap var8) {
            fzx.v.warn("{}", var8.getMessage());
            this.d.a(fuc.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fzx.v.error("Unable to recreate world", var9);
            this.d.a(new ftd(() -> this.d.a(this.e), wo.c("selectWorld.recreate.error.title"), wo.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new ftv(wo.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(feu.a($$1));
            } catch (Throwable var7) {
               fzx.v.error("Invalid icon for world {}", this.f.a(), var7);
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
