import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class gdj extends fss {
   private static final int a = 32;
   private static final String c = "telemetry.event.required";
   private static final String d = "telemetry.event.optional";
   private static final String e = "telemetry.event.optional.disabled";
   private static final wy f = wy.c("telemetry_info.property_title").a(o.t);
   private final fsf m;
   private gdj.a n;
   @Nullable
   private DoubleConsumer o;

   public gdj(int $$0, int $$1, int $$2, int $$3, fsf $$4) {
      super($$0, $$1, $$2, $$3, wy.i());
      this.m = $$4;
      this.n = this.c(fpo.Q().C());
   }

   public void b(boolean $$0) {
      this.n = this.c($$0);
      this.h();
   }

   public void q() {
      this.n = this.c(fpo.Q().C());
      this.h();
   }

   private gdj.a c(boolean $$0) {
      gdj.b $$1 = new gdj.b(this.r());
      List<how> $$2 = new ArrayList<>(how.g());
      $$2.sort(Comparator.comparing(how::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         how $$4 = $$2.get($$3);
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
   protected void c(fsh $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p();
      int $$5 = this.e();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.n.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fws $$0) {
      $$0.a(fwr.a, this.n.b());
   }

   private wy a(wy $$0, boolean $$1) {
      return (wy)($$1 ? $$0.f().a(o.h) : $$0);
   }

   private void a(gdj.b $$0, how $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.m, this.a(wy.a($$3, $$1.e()), $$2));
      $$0.b(this.m, $$1.f().a(o.h));
      $$0.a(9 / 2);
      $$0.a(this.m, this.a(f, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(how $$0, gdj.b $$1, boolean $$2) {
      for (hoy<?> $$3 : $$0.b()) {
         $$1.a(this.m, this.a($$3.a(), $$2));
      }
   }

   private int r() {
      return this.g - this.b();
   }

   static record a(fwk a, wy b) {
   }

   static class b {
      private final int a;
      private final fwn b;
      private final xm c = wy.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fwn.d();
         this.b.c().a();
         this.b.a(fwo.a($$0));
      }

      public void a(fsf $$0, wy $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(fsf $$0, wy $$1, int $$2) {
         this.b.a(new ftp($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(fsf $$0, wy $$1) {
         this.b.a(new ftp($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fwo.b($$0));
      }

      public gdj.a a() {
         this.b.a();
         return new gdj.a(this.b, this.c);
      }
   }
}
