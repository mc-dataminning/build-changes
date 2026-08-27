import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record il(in b, in c) implements Iterable<in> {
   public static final ys<ByteBuf, il> a = new ys<ByteBuf, il>() {
      public il a(ByteBuf $$0) {
         return new il(vu.b($$0), vu.b($$0));
      }

      public void a(ByteBuf $$0, il $$1) {
         vu.a($$0, $$1.f());
         vu.a($$0, $$1.g());
      }
   };

   public il(in b, in c) {
      this.b = in.a(b, c);
      this.c = in.b(b, c);
   }

   public static il a(in $$0) {
      return new il($$0, $$0);
   }

   public static il a(in $$0, in $$1) {
      return new il($$0, $$1);
   }

   public il b(in $$0) {
      return new il(in.a(this.b, $$0), in.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(in $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public etk b() {
      return etk.a(this.b, this.c);
   }

   @Override
   public Iterator<in> iterator() {
      return in.c(this.b, this.c).iterator();
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

   public il a(is $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == is.b.a ? a(this.b, in.b(this.b, this.c.a($$0, $$1))) : a(in.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public il b(is $$0, int $$1) {
      return $$1 == 0 ? this : new il(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public il a(jr $$0) {
      return new il(this.b.a($$0), this.c.a($$0));
   }

   public in f() {
      return this.b;
   }

   public in g() {
      return this.c;
   }
}
