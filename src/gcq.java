import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class gcq extends frz {
   private static final int a = 32;
   private static final String c = "telemetry.event.required";
   private static final String d = "telemetry.event.optional";
   private static final String e = "telemetry.event.optional.disabled";
   private static final wy f = wy.c("telemetry_info.property_title").a(n.t);
   private final frm m;
   private gcq.a n;
   @Nullable
   private DoubleConsumer o;

   public gcq(int $$0, int $$1, int $$2, int $$3, frm $$4) {
      super($$0, $$1, $$2, $$3, wy.i());
      this.m = $$4;
      this.n = this.c(fos.Q().C());
   }

   public void b(boolean $$0) {
      this.n = this.c($$0);
      this.h();
   }

   public void q() {
      this.n = this.c(fos.Q().C());
      this.h();
   }

   private gcq.a c(boolean $$0) {
      gcq.b $$1 = new gcq.b(this.r());
      List<hob> $$2 = new ArrayList<>(hob.g());
      $$2.sort(Comparator.comparing(hob::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         hob $$4 = $$2.get($$3);
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
   protected void c(fro $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p();
      int $$5 = this.e();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.n.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fvz $$0) {
      $$0.a(fvy.a, this.n.b());
   }

   private wy a(wy $$0, boolean $$1) {
      return (wy)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(gcq.b $$0, hob $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.m, this.a(wy.a($$3, $$1.e()), $$2));
      $$0.b(this.m, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.m, this.a(f, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(hob $$0, gcq.b $$1, boolean $$2) {
      for (hod<?> $$3 : $$0.b()) {
         $$1.a(this.m, this.a($$3.a(), $$2));
      }
   }

   private int r() {
      return this.g - this.b();
   }

   static record a(fvr a, wy b) {
   }

   static class b {
      private final int a;
      private final fvu b;
      private final xm c = wy.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fvu.d();
         this.b.c().a();
         this.b.a(fvv.a($$0));
      }

      public void a(frm $$0, wy $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(frm $$0, wy $$1, int $$2) {
         this.b.a(new fsw($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(frm $$0, wy $$1) {
         this.b.a(new fsw($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fvv.b($$0));
      }

      public gcq.a a() {
         this.b.a();
         return new gcq.a(this.b, this.c);
      }
   }
}
