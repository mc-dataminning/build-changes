import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fvp extends gaf {
   private static final alk a = alk.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final gaf w;
   @Nullable
   private final alk x;
   private final xc y;
   private final List<fvp.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fyf C = fyf.d();

   fvp(gaf $$0, int $$1, @Nullable alk $$2, xc $$3, xc $$4, List<fvp.b> $$5, @Nullable Runnable $$6) {
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
      this.C.a(new fvh(this.l.f().a(o.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fva.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fvh(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         ful var10000 = this.c($$1);
      });
      this.c();
   }

   private fyf m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fyf $$2 = fyf.e();
      $$2.a(6);

      for (fvp.b $$3 : this.z) {
         $$2.a(fun.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fxz.a(this.C, this.J());
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.getDevice().b().a(this.m.h().e(), 1.0);
      this.b($$0);
      $$0.a(gsn::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public xc i() {
      return xb.a(this.l, this.y);
   }

   @Override
   public void aP_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final gaf a;
      private final xc b;
      private xc c = xb.a;
      private int d = 250;
      @Nullable
      private alk e;
      private final List<fvp.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(gaf $$0, xc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fvp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fvp.a a(alk $$0) {
         this.e = $$0;
         return this;
      }

      public fvp.a a(xc $$0) {
         this.c = $$0;
         return this;
      }

      public fvp.a a(xc $$0, Consumer<fvp> $$1) {
         this.f.add(new fvp.b($$0, $$1));
         return this;
      }

      public fvp.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fvp a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fvp(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xc a, Consumer<fvp> b) {
   }
}
