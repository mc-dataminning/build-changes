import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fze extends foo {
   private static final int a = 32;
   private static final String c = "telemetry.event.required";
   private static final String d = "telemetry.event.optional";
   private static final String e = "telemetry.event.optional.disabled";
   private static final wo f = wo.c("telemetry_info.property_title").a(n.t);
   private final fob m;
   private fze.a n;
   @Nullable
   private DoubleConsumer o;

   public fze(int $$0, int $$1, int $$2, int $$3, fob $$4) {
      super($$0, $$1, $$2, $$3, wo.i());
      this.m = $$4;
      this.n = this.c(flj.Q().C());
   }

   public void b(boolean $$0) {
      this.n = this.c($$0);
      this.h();
   }

   public void q() {
      this.n = this.c(flj.Q().C());
      this.h();
   }

   private fze.a c(boolean $$0) {
      fze.b $$1 = new fze.b(this.r());
      List<hjx> $$2 = new ArrayList<>(hjx.g());
      $$2.sort(Comparator.comparing(hjx::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         hjx $$4 = $$2.get($$3);
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
   protected void c(fod $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p();
      int $$5 = this.e();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.n.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fsp $$0) {
      $$0.a(fso.a, this.n.b());
   }

   private wo a(wo $$0, boolean $$1) {
      return (wo)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fze.b $$0, hjx $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.m, this.a(wo.a($$3, $$1.e()), $$2));
      $$0.b(this.m, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.m, this.a(f, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(hjx $$0, fze.b $$1, boolean $$2) {
      for (hjz<?> $$3 : $$0.b()) {
         $$1.a(this.m, this.a($$3.a(), $$2));
      }
   }

   private int r() {
      return this.g - this.b();
   }

   static record a(fsh a, wo b) {
   }

   static class b {
      private final int a;
      private final fsk b;
      private final xc c = wo.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fsk.d();
         this.b.c().a();
         this.b.a(fsl.a($$0));
      }

      public void a(fob $$0, wo $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(fob $$0, wo $$1, int $$2) {
         this.b.a(new fpm($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(fob $$0, wo $$1) {
         this.b.a(new fpm($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fsl.b($$0));
      }

      public fze.a a() {
         this.b.a();
         return new fze.a(this.b, this.c);
      }
   }
}
