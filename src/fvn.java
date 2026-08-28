import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fvn extends gad {
   private static final ali a = ali.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final gad w;
   @Nullable
   private final ali x;
   private final xa y;
   private final List<fvn.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fyd C = fyd.d();

   fvn(gad $$0, int $$1, @Nullable ali $$2, xa $$3, xa $$4, List<fvn.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aK_() {
      super.aK_();
      this.w.o();
   }

   @Override
   protected void aS_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fvf(this.l.f().a(o.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fuy.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fvf(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
      this.c();
   }

   private fyd m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fyd $$2 = fyd.e();
      $$2.a(6);

      for (fvn.b $$3 : this.z) {
         $$2.a(ful.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fxx.a(this.C, this.J());
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.getDevice().b().a(this.m.h().e(), 1.0);
      this.b($$0);
      $$0.a(gsl::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public xa i() {
      return wz.a(this.l, this.y);
   }

   @Override
   public void aP_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final gad a;
      private final xa b;
      private xa c = wz.a;
      private int d = 250;
      @Nullable
      private ali e;
      private final List<fvn.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(gad $$0, xa $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fvn.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fvn.a a(ali $$0) {
         this.e = $$0;
         return this;
      }

      public fvn.a a(xa $$0) {
         this.c = $$0;
         return this;
      }

      public fvn.a a(xa $$0, Consumer<fvn> $$1) {
         this.f.add(new fvn.b($$0, $$1));
         return this;
      }

      public fvn.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fvn a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fvn(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xa a, Consumer<fvn> b) {
   }
}
