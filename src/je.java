import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record je(jg b, jg c) implements Iterable<jg> {
   public static final zf<ByteBuf, je> a = new zf<ByteBuf, je>() {
      public je a(ByteBuf $$0) {
         return new je(we.b($$0), we.b($$0));
      }

      public void a(ByteBuf $$0, je $$1) {
         we.a($$0, $$1.f());
         we.a($$0, $$1.g());
      }
   };

   public je(final jg b, final jg c) {
      this.b = jg.a(b, c);
      this.c = jg.b(b, c);
   }

   public static je a(jg $$0) {
      return new je($$0, $$0);
   }

   public static je a(jg $$0, jg $$1) {
      return new je($$0, $$1);
   }

   public je b(jg $$0) {
      return new je(jg.a(this.b, $$0), jg.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(jg $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public ezc b() {
      return ezc.a(this.b, this.c);
   }

   @Override
   public Iterator<jg> iterator() {
      return jg.c(this.b, this.c).iterator();
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

   public je a(jl $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jl.b.a ? a(this.b, jg.b(this.b, this.c.a($$0, $$1))) : a(jg.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public je b(jl $$0, int $$1) {
      return $$1 == 0 ? this : new je(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public je a(kk $$0) {
      return new je(this.b.a($$0), this.c.a($$0));
   }

   public jg f() {
      return this.b;
   }

   public jg g() {
      return this.c;
   }
}
