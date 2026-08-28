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

public class fwa extends flv<fwa.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alh m = alh.b("world_list/error_highlighted");
   static final alh n = alh.b("world_list/error");
   static final alh o = alh.b("world_list/marked_join_highlighted");
   static final alh p = alh.b("world_list/marked_join");
   static final alh q = alh.b("world_list/warning_highlighted");
   static final alh r = alh.b("world_list/warning");
   static final alh s = alh.b("world_list/join_highlighted");
   static final alh u = alh.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xh w = xh.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xh x = xh.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xh y = xh.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xh z = xh.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xh A = xh.c("selectWorld.locked").a(n.m);
   static final xh B = xh.c("selectWorld.conversion.tooltip").a(n.m);
   static final xh C = xh.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xh D = xh.c("selectWorld.experimental");
   private final fvv E;
   private CompletableFuture<List<etl>> F;
   @Nullable
   private List<etl> G;
   private String H;
   private final fwa.b I;

   public fwa(fvv $$0, fja $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fwa $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fwa.b($$1);
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
      this.aJ_().forEach(fwa.a::close);
      super.k();
   }

   @Nullable
   private List<etl> K() {
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
      if (fpc.a($$0)) {
         Optional<fwa.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hbk.a(awk.Av, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      List<etl> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<etl> $$0) {
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

   private CompletableFuture<List<etl>> M() {
      etk.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (etj var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fvp.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<etl> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (etl $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fwa.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, etl $$1) {
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

   private void c(xh $$0) {
      this.c.a(new fqb(xh.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fwa.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fwa.c $$1 ? $$1.f : null);
   }

   public Optional<fwa.c> c() {
      fwa.a $$0 = this.h();
      return $$0 instanceof fwa.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fvv J() {
      return this.E;
   }

   @Override
   public void a(fox $$0) {
      if (this.aJ_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends flv.a<fwa.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fwa.a {
      private static final xh a = xh.c("selectWorld.loading_list");
      private final fja b;

      public b(fja $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fqh.a(ad.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xh a() {
         return a;
      }
   }

   public final class c extends fwa.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fja d;
      private final fvv e;
      final etl f;
      private final fqc g;
      @Nullable
      private Path h;
      private long i;

      public c(final fwa $$1, final etl $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fqc.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eyy> $$1 = this.d.bg().a(this.h);
                  if (!$$1.isEmpty()) {
                     fwa.v.warn("{}", eyw.a(this.h, $$1));
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
               fwa.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xh a() {
         xh $$0 = xh.a("narrator.select.world_info", this.f.b(), xh.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xg.a($$0, fwa.A);
         }

         if (this.f.e()) {
            $$0 = xg.a($$0, fwa.D);
         }

         return xh.a("narrator.select", $$0);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fwa.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gyz.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xh $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(gig::B, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alh $$16 = $$15 ? fwa.s : fwa.u;
            alh $$17 = $$15 ? fwa.q : fwa.r;
            alh $$18 = $$15 ? fwa.m : fwa.n;
            alh $$19 = $$15 ? fwa.o : fwa.p;
            if (this.f instanceof etl.c || this.f instanceof etl.b) {
               $$0.a(gig::B, $$18, $$3, $$2, 32, 32);
               $$0.a(gig::B, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gig::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fwa.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gig::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fwa.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gig::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fwa.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gig::B, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gig::B, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fwa.w.g(), fwa.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gig::B, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fwa.y.g(), fwa.z.g()));
                  }
               }
            } else {
               $$0.a(gig::B, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fwa.this.a((fwa.a)this);
            if (!($$0 - (double)fwa.this.s() <= 32.0) && ad.c() - this.i >= 250L) {
               this.i = ad.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hbk.a(awk.Av, 1.0F));
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
            if (this.f instanceof etl.c) {
               this.d.a(fqk.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fwa.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fpq($$0 -> {
            if ($$0) {
               this.d.a(new fqp(true));
               this.e();
            }

            this.d.a(this.e);
         }, xh.c("selectWorld.deleteQuestion"), xh.a("selectWorld.deleteWarning", this.f.b()), xh.c("selectWorld.deleteButton"), xg.e));
      }

      public void e() {
         etk $$0 = this.d.m();
         String $$1 = this.f.a();

         try (etk.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fni.b(this.d, $$1);
            fwa.v.error("Failed to delete world {}", $$1, var8);
         }

         fwa.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         etk.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fni.a(this.d, $$0);
            fwa.v.error("Failed to access level {}", $$0, var6);
            fwa.this.L();
            return;
         } catch (eyw var7) {
            fwa.v.warn("{}", var7.getMessage());
            this.d.a(fqk.a(() -> this.d.a(this.e)));
            return;
         }

         fvr $$5;
         try {
            $$5 = fvr.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fwa.this.L();
               }

               this.d.a(this.e);
            });
         } catch (uu | va | IOException var5) {
            $$1.c();
            fni.a(this.d, $$0);
            fwa.v.error("Failed to load world data {}", $$0, var5);
            fwa.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (etk.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dez, fvx> $$1 = this.d.x().a($$0);
            dez $$2 = (dez)$$1.getFirst();
            fvx $$3 = (fvx)$$1.getSecond();
            Path $$4 = fvp.a($$0.a(eti.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fpq(
                        $$3x -> this.d.a((fqs)($$3x ? fvp.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xh.c("selectWorld.recreate.customized.title"),
                        xh.c("selectWorld.recreate.customized.text"),
                        xg.i,
                        xg.e
                     )
                  );
            } else {
               this.d.a(fvp.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eyw var8) {
            fwa.v.warn("{}", var8.getMessage());
            this.d.a(fqk.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fwa.v.error("Unable to recreate world", var9);
            this.d.a(new fpl(() -> this.d.a(this.e), xh.c("selectWorld.recreate.error.title"), xh.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fqd(xh.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fct.a($$1));
            } catch (Throwable var7) {
               fwa.v.error("Invalid icon for world {}", this.f.a(), var7);
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
