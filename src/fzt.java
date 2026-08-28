import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class fzt extends fzx {
   public static final ali a = ali.b("textures/gui/title/mojangstudios.png");
   private static final int d = axy.a(255, 239, 50, 61);
   private static final int e = axy.a(255, 0, 0, 0);
   private static final IntSupplier f = () -> frd.Q().n.a().c() ? e : d;
   private static final int g = 240;
   private static final float h = 60.0F;
   private static final int i = 60;
   private static final int j = 120;
   private static final float k = 0.0625F;
   private static final float l = 0.95F;
   public static final long b = 1000L;
   public static final long c = 500L;
   private final frd m;
   private final avb n;
   private final Consumer<Optional<Throwable>> o;
   private final boolean p;
   private float q;
   private long r = -1L;
   private long s = -1L;

   public fzt(frd $$0, avb $$1, Consumer<Optional<Throwable>> $$2, boolean $$3) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
   }

   public static void a(hlc $$0) {
      $$0.a(a, (hkr)(new fzt.a()));
   }

   private static int a(int $$0, int $$1) {
      return $$0 & 16777215 | $$1 << 24;
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      int $$4 = $$0.a();
      int $$5 = $$0.b();
      long $$6 = ag.c();
      if (this.p && this.s == -1L) {
         this.s = $$6;
      }

      float $$7 = this.r > -1L ? (float)($$6 - this.r) / 1000.0F : -1.0F;
      float $$8 = this.s > -1L ? (float)($$6 - this.s) / 500.0F : -1.0F;
      float $$10;
      if ($$7 >= 1.0F) {
         if (this.m.z != null) {
            this.m.z.a($$0, 0, 0, $$3);
         }

         int $$9 = azo.f((1.0F - azo.a($$7 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         $$0.a(gsl.G(), 0, 0, $$4, $$5, a(f.getAsInt(), $$9));
         $$10 = 1.0F - azo.a($$7 - 1.0F, 0.0F, 1.0F);
      } else if (this.p) {
         if (this.m.z != null && $$8 < 1.0F) {
            this.m.z.a($$0, $$1, $$2, $$3);
         }

         int $$11 = azo.c(azo.a((double)$$8, 0.15, 1.0) * 255.0);
         $$0.a(gsl.G(), 0, 0, $$4, $$5, a(f.getAsInt(), $$11));
         $$10 = azo.a($$8, 0.0F, 1.0F);
      } else {
         int $$13 = f.getAsInt();
         RenderSystem.getDevice().b().a(this.m.h().d(), $$13);
         $$10 = 1.0F;
      }

      int $$15 = (int)((double)$$0.a() * 0.5);
      int $$16 = (int)((double)$$0.b() * 0.5);
      double $$17 = Math.min((double)$$0.a() * 0.75, (double)$$0.b()) * 0.25;
      int $$18 = (int)($$17 * 0.5);
      double $$19 = $$17 * 4.0;
      int $$20 = (int)($$19 * 0.5);
      int $$21 = axy.a($$10);
      $$0.a($$0x -> gsl.K(), a, $$15 - $$20, $$16 - $$18, -0.0625F, 0.0F, $$20, (int)$$17, 120, 60, 120, 120, $$21);
      $$0.a($$0x -> gsl.K(), a, $$15, $$16 - $$18, 0.0625F, 60.0F, $$20, (int)$$17, 120, 60, 120, 120, $$21);
      int $$22 = (int)((double)$$0.b() * 0.8325);
      float $$23 = this.n.b();
      this.q = azo.a(this.q * 0.95F + $$23 * 0.050000012F, 0.0F, 1.0F);
      if ($$7 < 1.0F) {
         this.a($$0, $$4 / 2 - $$20, $$22 - 5, $$4 / 2 + $$20, $$22 + 5, 1.0F - azo.a($$7, 0.0F, 1.0F));
      }

      if ($$7 >= 2.0F) {
         this.m.a(null);
      }

      if (this.r == -1L && this.n.c() && (!this.p || $$8 >= 2.0F)) {
         try {
            this.n.d();
            this.o.accept(Optional.empty());
         } catch (Throwable var24) {
            this.o.accept(Optional.of(var24));
         }

         this.r = ag.c();
         if (this.m.z != null) {
            this.m.z.b(this.m, $$0.a(), $$0.b());
         }
      }
   }

   private void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      int $$6 = azo.f((float)($$3 - $$1 - 2) * this.q);
      int $$7 = Math.round($$5 * 255.0F);
      int $$8 = axy.a($$7, 255, 255, 255);
      $$0.a($$1 + 2, $$2 + 2, $$1 + $$6, $$4 - 2, $$8);
      $$0.a($$1 + 1, $$2, $$3 - 1, $$2 + 1, $$8);
      $$0.a($$1 + 1, $$4, $$3 - 1, $$4 - 1, $$8);
      $$0.a($$1, $$2, $$1 + 1, $$4, $$8);
      $$0.a($$3, $$2, $$3 - 1, $$4, $$8);
   }

   @Override
   public boolean a() {
      return true;
   }

   static class a extends hkr {
      public a() {
         super(fzt.a);
      }

      @Override
      public hlb a(avf $$0) throws IOException {
         avi $$1 = frd.Q().ae().d();

         hlb var4;
         try (InputStream $$2 = $$1.open(fzt.a)) {
            var4 = new hlb(fkg.a($$2), new hmx(true, true));
         }

         return var4;
      }
   }
}
