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

public class gdj extends fsy<gdj.a> {
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
   static final wy w = wy.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wy x = wy.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wy y = wy.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wy z = wy.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wy A = wy.c("selectWorld.locked").a(n.m);
   static final wy B = wy.c("selectWorld.conversion.tooltip").a(n.m);
   static final wy C = wy.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wy D = wy.c("selectWorld.experimental");
   private final gdd E;
   private CompletableFuture<List<eyo>> F;
   @Nullable
   private List<eyo> G;
   private String H;
   private final gdj.b I;

   public gdj(gdd $$0, fos $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gdj $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gdj.b($$1);
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
      this.aD_().forEach(gdj.a::close);
      super.s();
   }

   @Nullable
   private List<eyo> M() {
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
      if (fwe.a($$0)) {
         Optional<gdj.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hmh.a(awn.Bs, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      List<eyo> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eyo> $$0) {
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

   private CompletableFuture<List<eyo>> O() {
      eyn.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eym var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gcv.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eyo> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eyo $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gdj.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, eyo $$1) {
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
      this.c.a(new fxd(wy.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gdj.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gdj.c $$1 ? $$1.f : null);
   }

   public Optional<gdj.c> b() {
      gdj.a $$0 = this.p();
      return $$0 instanceof gdj.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gdd c() {
      return this.E;
   }

   @Override
   public void a(fvz $$0) {
      if (this.aD_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fsy.a<gdj.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gdj.a {
      private static final wy a = wy.c("selectWorld.loading_list");
      private final fos b;

      public b(fos $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fxj.a(af.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public wy a() {
         return a;
      }
   }

   public final class c extends gdj.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fos d;
      private final gdd e;
      final eyo f;
      private final fxe g;
      @Nullable
      private Path h;
      private long i;

      public c(final gdj $$1, final eyo $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fxe.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fdz> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     gdj.v.warn("{}", fdx.a(this.h, $$1));
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
               gdj.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wy a() {
         wy $$0 = wy.a("narrator.select.world_info", this.f.b(), wy.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wx.a($$0, gdj.A);
         }

         if (this.f.e()) {
            $$0 = wx.a($$0, gdj.D);
         }

         return wy.a("narrator.select", $$0);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gdj.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hjw.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wy $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gqc::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alg $$16 = $$15 ? gdj.s : gdj.u;
            alg $$17 = $$15 ? gdj.q : gdj.r;
            alg $$18 = $$15 ? gdj.m : gdj.n;
            alg $$19 = $$15 ? gdj.o : gdj.p;
            if (this.f instanceof eyo.c || this.f instanceof eyo.b) {
               $$0.a(gqc::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gqc::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gqc::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gdj.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gqc::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gdj.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gqc::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gdj.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gqc::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gqc::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gdj.w.g(), gdj.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gqc::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gdj.y.g(), gdj.z.g()));
                  }
               }
            } else {
               $$0.a(gqc::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gdj.this.a((gdj.a)this);
            if (!($$0 - (double)gdj.this.u() <= 32.0) && af.c() - this.i >= 250L) {
               this.i = af.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hmh.a(awn.Bs, 1.0F));
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
            if (this.f instanceof eyo.c) {
               this.d.a(fxm.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gdj.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fws($$0 -> {
            if ($$0) {
               this.d.a(new fxr(true));
               this.e();
            }

            this.d.a(this.e);
         }, wy.c("selectWorld.deleteQuestion"), wy.a("selectWorld.deleteWarning", this.f.b()), wy.c("selectWorld.deleteButton"), wx.e));
      }

      public void e() {
         eyn $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eyn.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            ful.b(this.d, $$1);
            gdj.v.error("Failed to delete world {}", $$1, var8);
         }

         gdj.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         eyn.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            ful.a(this.d, $$0);
            gdj.v.error("Failed to access level {}", $$0, var6);
            gdj.this.N();
            return;
         } catch (fdx var7) {
            gdj.v.warn("{}", var7.getMessage());
            this.d.a(fxm.a(() -> this.d.a(this.e)));
            return;
         }

         gcy $$5;
         try {
            $$5 = gcy.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gdj.this.N();
               }

               this.d.a(this.e);
            });
         } catch (uk | uq | IOException var5) {
            $$1.c();
            ful.a(this.d, $$0);
            gdj.v.error("Failed to load world data {}", $$0, var5);
            gdj.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (eyn.c $$0 = this.d.m().d(this.f.a())) {
            Pair<diz, gdf> $$1 = this.d.x().a($$0);
            diz $$2 = (diz)$$1.getFirst();
            gdf $$3 = (gdf)$$1.getSecond();
            Path $$4 = gcv.a($$0.a(eyl.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fws(
                        $$3x -> this.d.a((fxu)($$3x ? gcv.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wy.c("selectWorld.recreate.customized.title"),
                        wy.c("selectWorld.recreate.customized.text"),
                        wx.i,
                        wx.e
                     )
                  );
            } else {
               this.d.a(gcv.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fdx var8) {
            gdj.v.warn("{}", var8.getMessage());
            this.d.a(fxm.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gdj.v.error("Unable to recreate world", var9);
            this.d.a(new fwn(() -> this.d.a(this.e), wy.c("selectWorld.recreate.error.title"), wy.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fxf(wy.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fic.a($$1));
            } catch (Throwable var7) {
               gdj.v.error("Invalid icon for world {}", this.f.a(), var7);
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
