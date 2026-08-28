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

public class fxb extends fms<fxb.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final all m = all.b("world_list/error_highlighted");
   static final all n = all.b("world_list/error");
   static final all o = all.b("world_list/marked_join_highlighted");
   static final all p = all.b("world_list/marked_join");
   static final all q = all.b("world_list/warning_highlighted");
   static final all r = all.b("world_list/warning");
   static final all s = all.b("world_list/join_highlighted");
   static final all u = all.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xl w = xl.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xl x = xl.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xl y = xl.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xl z = xl.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xl A = xl.c("selectWorld.locked").a(n.m);
   static final xl B = xl.c("selectWorld.conversion.tooltip").a(n.m);
   static final xl C = xl.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xl D = xl.c("selectWorld.experimental");
   private final fwv E;
   private CompletableFuture<List<etv>> F;
   @Nullable
   private List<etv> G;
   private String H;
   private final fxb.b I;

   public fxb(fwv $$0, fjx $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fxb $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fxb.b($$1);
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
      this.aI_().forEach(fxb.a::close);
      super.k();
   }

   @Nullable
   private List<etv> K() {
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
      if (fpz.a($$0)) {
         Optional<fxb.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hcl.a(awo.Av, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      List<etv> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<etv> $$0) {
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

   private CompletableFuture<List<etv>> M() {
      etu.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ett var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fwn.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<etv> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (etv $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fxb.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, etv $$1) {
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

   private void c(xl $$0) {
      this.c.a(new fqy(xl.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fxb.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fxb.c $$1 ? $$1.f : null);
   }

   public Optional<fxb.c> c() {
      fxb.a $$0 = this.h();
      return $$0 instanceof fxb.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fwv J() {
      return this.E;
   }

   @Override
   public void a(fpu $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fms.a<fxb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fxb.a {
      private static final xl a = xl.c("selectWorld.loading_list");
      private final fjx b;

      public b(fjx $$0) {
         this.b = $$0;
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fre.a(ae.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xl a() {
         return a;
      }
   }

   public final class c extends fxb.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fjx d;
      private final fwv e;
      final etv f;
      private final fqz g;
      @Nullable
      private Path h;
      private long i;

      public c(final fxb $$1, final etv $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fqz.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ezi> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fxb.v.warn("{}", ezg.a(this.h, $$1));
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
               fxb.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xl a() {
         xl $$0 = xl.a("narrator.select.world_info", this.f.b(), xl.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xk.a($$0, fxb.A);
         }

         if (this.f.e()) {
            $$0 = xk.a($$0, fxb.D);
         }

         return xl.a("narrator.select", $$0);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fxb.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = haa.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xl $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(gjh::B, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            all $$16 = $$15 ? fxb.s : fxb.u;
            all $$17 = $$15 ? fxb.q : fxb.r;
            all $$18 = $$15 ? fxb.m : fxb.n;
            all $$19 = $$15 ? fxb.o : fxb.p;
            if (this.f instanceof etv.c || this.f instanceof etv.b) {
               $$0.a(gjh::B, $$18, $$3, $$2, 32, 32);
               $$0.a(gjh::B, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gjh::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fxb.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gjh::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fxb.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gjh::B, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fxb.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gjh::B, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gjh::B, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fxb.w.g(), fxb.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gjh::B, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fxb.y.g(), fxb.z.g()));
                  }
               }
            } else {
               $$0.a(gjh::B, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fxb.this.a((fxb.a)this);
            if (!($$0 - (double)fxb.this.s() <= 32.0) && ae.c() - this.i >= 250L) {
               this.i = ae.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hcl.a(awo.Av, 1.0F));
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
            if (this.f instanceof etv.c) {
               this.d.a(frh.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fxb.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fqn($$0 -> {
            if ($$0) {
               this.d.a(new frm(true));
               this.e();
            }

            this.d.a(this.e);
         }, xl.c("selectWorld.deleteQuestion"), xl.a("selectWorld.deleteWarning", this.f.b()), xl.c("selectWorld.deleteButton"), xk.e));
      }

      public void e() {
         etu $$0 = this.d.m();
         String $$1 = this.f.a();

         try (etu.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fof.b(this.d, $$1);
            fxb.v.error("Failed to delete world {}", $$1, var8);
         }

         fxb.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         etu.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fof.a(this.d, $$0);
            fxb.v.error("Failed to access level {}", $$0, var6);
            fxb.this.L();
            return;
         } catch (ezg var7) {
            fxb.v.warn("{}", var7.getMessage());
            this.d.a(frh.a(() -> this.d.a(this.e)));
            return;
         }

         fwq $$5;
         try {
            $$5 = fwq.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fxb.this.L();
               }

               this.d.a(this.e);
            });
         } catch (uy | ve | IOException var5) {
            $$1.c();
            fof.a(this.d, $$0);
            fxb.v.error("Failed to load world data {}", $$0, var5);
            fxb.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (etu.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dfj, fwx> $$1 = this.d.x().a($$0);
            dfj $$2 = (dfj)$$1.getFirst();
            fwx $$3 = (fwx)$$1.getSecond();
            Path $$4 = fwn.a($$0.a(ets.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fqn(
                        $$3x -> this.d.a((frp)($$3x ? fwn.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xl.c("selectWorld.recreate.customized.title"),
                        xl.c("selectWorld.recreate.customized.text"),
                        xk.i,
                        xk.e
                     )
                  );
            } else {
               this.d.a(fwn.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ezg var8) {
            fxb.v.warn("{}", var8.getMessage());
            this.d.a(frh.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fxb.v.error("Unable to recreate world", var9);
            this.d.a(new fqi(() -> this.d.a(this.e), xl.c("selectWorld.recreate.error.title"), xl.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fra(xl.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fdk.a($$1));
            } catch (Throwable var7) {
               fxb.v.error("Invalid icon for world {}", this.f.a(), var7);
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
