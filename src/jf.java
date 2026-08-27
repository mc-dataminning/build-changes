import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;
import java.util.stream.IntStream;
import javax.annotation.concurrent.Immutable;

@Immutable
public class jf implements Comparable<jf> {
   public static final Codec<jf> f = Codec.INT_STREAM
      .comapFlatMap($$0 -> ac.a($$0, 3).map($$0x -> new jf($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()));
   public static final jf g = new jf(0, 0, 0);
   private int a;
   private int b;
   private int c;

   public static Codec<jf> v(int $$0) {
      return avu.a(
         f,
         (Function<jf, DataResult<jf>>)($$1 -> Math.abs($$1.u()) < $$0 && Math.abs($$1.v()) < $$0 && Math.abs($$1.w()) < $$0
               ? DataResult.success($$1)
               : DataResult.error(() -> "Position out of range, expected at most " + $$0 + ": " + $$1))
      );
   }

   public jf(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof jf $$1)) {
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

   public int i(jf $$0) {
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

   protected jf u(int $$0) {
      this.a = $$0;
      return this;
   }

   protected jf t(int $$0) {
      this.b = $$0;
      return this;
   }

   protected jf s(int $$0) {
      this.c = $$0;
      return this;
   }

   public jf c(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new jf(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public jf f(jf $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   public jf e(jf $$0) {
      return this.c(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public jf o(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? g : new jf(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public jf p() {
      return this.n(1);
   }

   public jf n(int $$0) {
      return this.b(ih.b, $$0);
   }

   public jf o() {
      return this.m(1);
   }

   public jf m(int $$0) {
      return this.b(ih.a, $$0);
   }

   public jf n() {
      return this.l(1);
   }

   public jf l(int $$0) {
      return this.b(ih.c, $$0);
   }

   public jf m() {
      return this.k(1);
   }

   public jf k(int $$0) {
      return this.b(ih.d, $$0);
   }

   public jf l() {
      return this.j(1);
   }

   public jf j(int $$0) {
      return this.b(ih.e, $$0);
   }

   public jf k() {
      return this.i(1);
   }

   public jf i(int $$0) {
      return this.b(ih.f, $$0);
   }

   public jf b(ih $$0) {
      return this.b($$0, 1);
   }

   public jf b(ih $$0, int $$1) {
      return $$1 == 0 ? this : new jf(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public jf b(ih.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == ih.a.a ? $$1 : 0;
         int $$3 = $$0 == ih.a.b ? $$1 : 0;
         int $$4 = $$0 == ih.a.c ? $$1 : 0;
         return new jf(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public jf d(jf $$0) {
      return new jf(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public boolean a(jf $$0, double $$1) {
      return this.j($$0) < awm.k($$1);
   }

   public boolean a(iv $$0, double $$1) {
      return this.b($$0) < awm.k($$1);
   }

   public double j(jf $$0) {
      return this.d((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public double b(iv $$0) {
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

   public int k(jf $$0) {
      float $$1 = (float)Math.abs($$0.u() - this.u());
      float $$2 = (float)Math.abs($$0.v() - this.v());
      float $$3 = (float)Math.abs($$0.w() - this.w());
      return (int)($$1 + $$2 + $$3);
   }

   public int a(ih.a $$0) {
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
