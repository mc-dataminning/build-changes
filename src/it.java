import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record it(iv b, iv c) implements Iterable<iv> {
   public static final yy<ByteBuf, it> a = new yy<ByteBuf, it>() {
      public it a(ByteBuf $$0) {
         return new it(vw.c($$0), vw.c($$0));
      }

      public void a(ByteBuf $$0, it $$1) {
         vw.a($$0, $$1.f());
         vw.a($$0, $$1.g());
      }
   };

   public it(final iv b, final iv c) {
      this.b = iv.a(b, c);
      this.c = iv.b(b, c);
   }

   public static it a(iv $$0) {
      return new it($$0, $$0);
   }

   public static it a(iv $$0, iv $$1) {
      return new it($$0, $$1);
   }

   public it b(iv $$0) {
      return new it(iv.a(this.b, $$0), iv.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(iv $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public ffl b() {
      return ffl.a(this.b, this.c);
   }

   @Override
   public Iterator<iv> iterator() {
      return iv.c(this.b, this.c).iterator();
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

   public it a(jb $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jb.b.a ? a(this.b, iv.b(this.b, this.c.a($$0, $$1))) : a(iv.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public it b(jb $$0, int $$1) {
      return $$1 == 0 ? this : new it(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public it a(ka $$0) {
      return new it(this.b.a($$0), this.c.a($$0));
   }

   public iv f() {
      return this.b;
   }

   public iv g() {
      return this.c;
   }
}
