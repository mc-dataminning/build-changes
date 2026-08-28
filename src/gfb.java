import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class gfb extends fuk {
   private static final int a = 32;
   private static final String c = "telemetry.event.required";
   private static final String d = "telemetry.event.optional";
   private static final String e = "telemetry.event.optional.disabled";
   private static final xc f = xc.c("telemetry_info.property_title").a(o.t);
   private final ftx m;
   private gfb.a n;
   @Nullable
   private DoubleConsumer o;

   public gfb(int $$0, int $$1, int $$2, int $$3, ftx $$4) {
      super($$0, $$1, $$2, $$3, xc.i());
      this.m = $$4;
      this.n = this.c(frf.Q().C());
   }

   public void b(boolean $$0) {
      this.n = this.c($$0);
      this.h();
   }

   public void q() {
      this.n = this.c(frf.Q().C());
      this.h();
   }

   private gfb.a c(boolean $$0) {
      gfb.b $$1 = new gfb.b(this.r());
      List<hqo> $$2 = new ArrayList<>(hqo.g());
      $$2.sort(Comparator.comparing(hqo::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         hqo $$4 = $$2.get($$3);
         boolean $$5 = $$4.d() && !$$0;
         this.a($$1, $$4, $$5);
         if ($$3 < $$2.size() - 1) {
            $$1.a(9);
         }
      }

      return $$1.a();
   }

   public void a(@Nullable DoubleConsumer $$0) {
      this.o = $$0;
   }

   @Override
   public void a(double $$0) {
      super.a($$0);
      if (this.o != null) {
         this.o.accept(this.g());
      }
   }

   @Override
   protected int c() {
      return this.n.a().y();
   }

   @Override
   protected double o() {
      return 9.0;
   }

   @Override
   protected void c(ftz $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p();
      int $$5 = this.e();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.n.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fyk $$0) {
      $$0.a(fyj.a, this.n.b());
   }

   private xc a(xc $$0, boolean $$1) {
      return (xc)($$1 ? $$0.f().a(o.h) : $$0);
   }

   private void a(gfb.b $$0, hqo $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.m, this.a(xc.a($$3, $$1.e()), $$2));
      $$0.b(this.m, $$1.f().a(o.h));
      $$0.a(9 / 2);
      $$0.a(this.m, this.a(f, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(hqo $$0, gfb.b $$1, boolean $$2) {
      for (hqq<?> $$3 : $$0.b()) {
         $$1.a(this.m, this.a($$3.a(), $$2));
      }
   }

   private int r() {
      return this.g - this.b();
   }

   static record a(fyc a, xc b) {
   }

   static class b {
      private final int a;
      private final fyf b;
      private final xq c = xc.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fyf.d();
         this.b.c().a();
         this.b.a(fyg.a($$0));
      }

      public void a(ftx $$0, xc $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(ftx $$0, xc $$1, int $$2) {
         this.b.a(new fvh($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(ftx $$0, xc $$1) {
         this.b.a(new fvh($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fyg.b($$0));
      }

      public gfb.a a() {
         this.b.a();
         return new gfb.a(this.b, this.c);
      }
   }
}
