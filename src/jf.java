import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record jf(jh b, jh c) implements Iterable<jh> {
   public static final zt<ByteBuf, jf> a = new zt<ByteBuf, jf>() {
      public jf a(ByteBuf $$0) {
         return new jf(ws.b($$0), ws.b($$0));
      }

      public void a(ByteBuf $$0, jf $$1) {
         ws.a($$0, $$1.f());
         ws.a($$0, $$1.g());
      }
   };

   public jf(final jh b, final jh c) {
      this.b = jh.a(b, c);
      this.c = jh.b(b, c);
   }

   public static jf a(jh $$0) {
      return new jf($$0, $$0);
   }

   public static jf a(jh $$0, jh $$1) {
      return new jf($$0, $$1);
   }

   public jf b(jh $$0) {
      return new jf(jh.a(this.b, $$0), jh.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(jh $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public fbn b() {
      return fbn.a(this.b, this.c);
   }

   @Override
   public Iterator<jh> iterator() {
      return jh.c(this.b, this.c).iterator();
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

   public jf a(jm $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jm.b.a ? a(this.b, jh.b(this.b, this.c.a($$0, $$1))) : a(jh.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public jf b(jm $$0, int $$1) {
      return $$1 == 0 ? this : new jf(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public jf a(kl $$0) {
      return new jf(this.b.a($$0), this.c.a($$0));
   }

   public jh f() {
      return this.b;
   }

   public jh g() {
      return this.c;
   }
}
