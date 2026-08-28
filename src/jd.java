import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record jd(jf b, jf c) implements Iterable<jf> {
   public static final zc<ByteBuf, jd> a = new zc<ByteBuf, jd>() {
      public jd a(ByteBuf $$0) {
         return new jd(wb.b($$0), wb.b($$0));
      }

      public void a(ByteBuf $$0, jd $$1) {
         wb.a($$0, $$1.f());
         wb.a($$0, $$1.g());
      }
   };

   public jd(final jf b, final jf c) {
      this.b = jf.a(b, c);
      this.c = jf.b(b, c);
   }

   public static jd a(jf $$0) {
      return new jd($$0, $$0);
   }

   public static jd a(jf $$0, jf $$1) {
      return new jd($$0, $$1);
   }

   public jd b(jf $$0) {
      return new jd(jf.a(this.b, $$0), jf.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(jf $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public eyr b() {
      return eyr.a(this.b, this.c);
   }

   @Override
   public Iterator<jf> iterator() {
      return jf.c(this.b, this.c).iterator();
   }

   public int c() {
      return this.c.u() - this.b.u() + 1;
   }

   public int d() {
      return this.c.v() - this.b.v() + 1;
   }

   public int e() {
      return this.c.w() - this.b.w() + 1;
   }

   public jd a(jk $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jk.b.a ? a(this.b, jf.b(this.b, this.c.a($$0, $$1))) : a(jf.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public jd b(jk $$0, int $$1) {
      return $$1 == 0 ? this : new jd(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public jd a(kj $$0) {
      return new jd(this.b.a($$0), this.c.a($$0));
   }

   public jf f() {
      return this.b;
   }

   public jf g() {
      return this.c;
   }
}
