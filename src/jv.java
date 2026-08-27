import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;
import java.util.stream.IntStream;
import javax.annotation.concurrent.Immutable;

@Immutable
public class jv implements Comparable<jv> {
   public static final Codec<jv> f = Codec.INT_STREAM
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new jv($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()));
   public static final jv g = new jv(0, 0, 0);
   private int a;
   private int b;
   private int c;

   public static Codec<jv> v(int $$0) {
      return axu.b(
         f,
         (Function<jv, DataResult<jv>>)($$1 -> Math.abs($$1.u()) < $$0 && Math.abs($$1.v()) < $$0 && Math.abs($$1.w()) < $$0
               ? DataResult.success($$1)
               : DataResult.error(() -> "Position out of range, expected at most " + $$0 + ": " + $$1))
      );
   }

   public jv(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof jv $$1)) {
         return false;
      } else if (this.u() != $$1.u()) {
         return false;
      } else {
         return this.v() != $$1.v() ? false : this.w() == $$1.w();
      }
   }

   @Override
   public int hashCode() {
      return (this.v() + this.w() * 31) * 31 + this.u();
   }

   public int i(jv $$0) {
      if (this.v() == $$0.v()) {
         return this.w() == $$0.w() ? this.u() - $$0.u() : this.w() - $$0.w();
      } else {
         return this.v() - $$0.v();
      }
   }

   public int u() {
      return this.a;
   }

   public int v() {
      return this.b;
   }

   public int w() {
      return this.c;
   }

   protected jv u(int $$0) {
      this.a = $$0;
      return this;
   }

   protected jv t(int $$0) {
      this.b = $$0;
      return this;
   }

   protected jv s(int $$0) {
      this.c = $$0;
      return this;
   }

   public jv c(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new jv(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public jv f(jv $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   public jv e(jv $$0) {
      return this.c(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public jv o(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? g : new jv(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public jv p() {
      return this.n(1);
   }

   public jv n(int $$0) {
      return this.b(iw.b, $$0);
   }

   public jv o() {
      return this.m(1);
   }

   public jv m(int $$0) {
      return this.b(iw.a, $$0);
   }

   public jv n() {
      return this.l(1);
   }

   public jv l(int $$0) {
      return this.b(iw.c, $$0);
   }

   public jv m() {
      return this.k(1);
   }

   public jv k(int $$0) {
      return this.b(iw.d, $$0);
   }

   public jv l() {
      return this.j(1);
   }

   public jv j(int $$0) {
      return this.b(iw.e, $$0);
   }

   public jv k() {
      return this.i(1);
   }

   public jv i(int $$0) {
      return this.b(iw.f, $$0);
   }

   public jv c(iw $$0) {
      return this.b($$0, 1);
   }

   public jv b(iw $$0, int $$1) {
      return $$1 == 0 ? this : new jv(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public jv b(iw.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == iw.a.a ? $$1 : 0;
         int $$3 = $$0 == iw.a.b ? $$1 : 0;
         int $$4 = $$0 == iw.a.c ? $$1 : 0;
         return new jv(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public jv d(jv $$0) {
      return new jv(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public boolean a(jv $$0, double $$1) {
      return this.j($$0) < aym.k($$1);
   }

   public boolean a(jk $$0, double $$1) {
      return this.b($$0) < aym.k($$1);
   }

   public double j(jv $$0) {
      return this.d((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public double b(jk $$0) {
      return this.c($$0.a(), $$0.b(), $$0.c());
   }

   public double c(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.u() + 0.5 - $$0;
      double $$4 = (double)this.v() + 0.5 - $$1;
      double $$5 = (double)this.w() + 0.5 - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double d(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.u() - $$0;
      double $$4 = (double)this.v() - $$1;
      double $$5 = (double)this.w() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public int k(jv $$0) {
      float $$1 = (float)Math.abs($$0.u() - this.u());
      float $$2 = (float)Math.abs($$0.v() - this.v());
      float $$3 = (float)Math.abs($$0.w() - this.w());
      return (int)($$1 + $$2 + $$3);
   }

   public int a(iw.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.u()).add("y", this.v()).add("z", this.w()).toString();
   }

   public String x() {
      return this.u() + ", " + this.v() + ", " + this.w();
   }
}
