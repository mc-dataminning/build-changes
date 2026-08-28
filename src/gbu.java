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

public class gbu extends frj<gbu.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ald m = ald.b("world_list/error_highlighted");
   static final ald n = ald.b("world_list/error");
   static final ald o = ald.b("world_list/marked_join_highlighted");
   static final ald p = ald.b("world_list/marked_join");
   static final ald q = ald.b("world_list/warning_highlighted");
   static final ald r = ald.b("world_list/warning");
   static final ald s = ald.b("world_list/join_highlighted");
   static final ald u = ald.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wv w = wv.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wv x = wv.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wv y = wv.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wv z = wv.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wv A = wv.c("selectWorld.locked").a(n.m);
   static final wv B = wv.c("selectWorld.conversion.tooltip").a(n.m);
   static final wv C = wv.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wv D = wv.c("selectWorld.experimental");
   private final gbo E;
   private CompletableFuture<List<exa>> F;
   @Nullable
   private List<exa> G;
   private String H;
   private final gbu.b I;

   public gbu(gbo $$0, fnd $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gbu $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gbu.b($$1);
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
      this.aD_().forEach(gbu.a::close);
      super.s();
   }

   @Nullable
   private List<exa> M() {
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
      if (fup.a($$0)) {
         Optional<gbu.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hkk.a(awk.Bp, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      List<exa> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<exa> $$0) {
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

   private CompletableFuture<List<exa>> O() {
      ewz.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ewy var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gbg.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<exa> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (exa $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gbu.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, exa $$1) {
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

   private void c(wv $$0) {
      this.c.a(new fvo(wv.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gbu.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gbu.c $$1 ? $$1.f : null);
   }

   public Optional<gbu.c> b() {
      gbu.a $$0 = this.p();
      return $$0 instanceof gbu.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gbo c() {
      return this.E;
   }

   @Override
   public void a(fuk $$0) {
      if (this.aD_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends frj.a<gbu.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gbu.a {
      private static final wv a = wv.c("selectWorld.loading_list");
      private final fnd b;

      public b(fnd $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fvu.a(af.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public wv a() {
         return a;
      }
   }

   public final class c extends gbu.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fnd d;
      private final gbo e;
      final exa f;
      private final fvp g;
      @Nullable
      private Path h;
      private long i;

      public c(final gbu $$1, final exa $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fvp.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fcl> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     gbu.v.warn("{}", fcj.a(this.h, $$1));
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
               gbu.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wv a() {
         wv $$0 = wv.a("narrator.select.world_info", this.f.b(), wv.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wu.a($$0, gbu.A);
         }

         if (this.f.e()) {
            $$0 = wu.a($$0, gbu.D);
         }

         return wv.a("narrator.select", $$0);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gbu.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hia.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wv $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(goi::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ald $$16 = $$15 ? gbu.s : gbu.u;
            ald $$17 = $$15 ? gbu.q : gbu.r;
            ald $$18 = $$15 ? gbu.m : gbu.n;
            ald $$19 = $$15 ? gbu.o : gbu.p;
            if (this.f instanceof exa.c || this.f instanceof exa.b) {
               $$0.a(goi::H, $$18, $$3, $$2, 32, 32);
               $$0.a(goi::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(goi::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gbu.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(goi::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gbu.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(goi::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gbu.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(goi::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(goi::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gbu.w.g(), gbu.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(goi::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gbu.y.g(), gbu.z.g()));
                  }
               }
            } else {
               $$0.a(goi::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gbu.this.a((gbu.a)this);
            if (!($$0 - (double)gbu.this.u() <= 32.0) && af.c() - this.i >= 250L) {
               this.i = af.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hkk.a(awk.Bp, 1.0F));
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
            if (this.f instanceof exa.c) {
               this.d.a(fvx.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gbu.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fvd($$0 -> {
            if ($$0) {
               this.d.a(new fwc(true));
               this.e();
            }

            this.d.a(this.e);
         }, wv.c("selectWorld.deleteQuestion"), wv.a("selectWorld.deleteWarning", this.f.b()), wv.c("selectWorld.deleteButton"), wu.e));
      }

      public void e() {
         ewz $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ewz.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fsw.b(this.d, $$1);
            gbu.v.error("Failed to delete world {}", $$1, var8);
         }

         gbu.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         ewz.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fsw.a(this.d, $$0);
            gbu.v.error("Failed to access level {}", $$0, var6);
            gbu.this.N();
            return;
         } catch (fcj var7) {
            gbu.v.warn("{}", var7.getMessage());
            this.d.a(fvx.a(() -> this.d.a(this.e)));
            return;
         }

         gbj $$5;
         try {
            $$5 = gbj.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gbu.this.N();
               }

               this.d.a(this.e);
            });
         } catch (uh | un | IOException var5) {
            $$1.c();
            fsw.a(this.d, $$0);
            gbu.v.error("Failed to load world data {}", $$0, var5);
            gbu.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (ewz.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dht, gbq> $$1 = this.d.x().a($$0);
            dht $$2 = (dht)$$1.getFirst();
            gbq $$3 = (gbq)$$1.getSecond();
            Path $$4 = gbg.a($$0.a(ewx.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fvd(
                        $$3x -> this.d.a((fwf)($$3x ? gbg.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wv.c("selectWorld.recreate.customized.title"),
                        wv.c("selectWorld.recreate.customized.text"),
                        wu.i,
                        wu.e
                     )
                  );
            } else {
               this.d.a(gbg.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fcj var8) {
            gbu.v.warn("{}", var8.getMessage());
            this.d.a(fvx.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gbu.v.error("Unable to recreate world", var9);
            this.d.a(new fuy(() -> this.d.a(this.e), wv.c("selectWorld.recreate.error.title"), wv.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fvq(wv.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fgo.a($$1));
            } catch (Throwable var7) {
               gbu.v.error("Invalid icon for world {}", this.f.a(), var7);
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
