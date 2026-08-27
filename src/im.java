import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record im(io b, io c) implements Iterable<io> {
   public static final yv<ByteBuf, im> a = new yv<ByteBuf, im>() {
      public im a(ByteBuf $$0) {
         return new im(vx.b($$0), vx.b($$0));
      }

      public void a(ByteBuf $$0, im $$1) {
         vx.a($$0, $$1.f());
         vx.a($$0, $$1.g());
      }
   };

   public im(io b, io c) {
      this.b = io.a(b, c);
      this.c = io.b(b, c);
   }

   public static im a(io $$0) {
      return new im($$0, $$0);
   }

   public static im a(io $$0, io $$1) {
      return new im($$0, $$1);
   }

   public im b(io $$0) {
      return new im(io.a(this.b, $$0), io.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(io $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public euh b() {
      return euh.a(this.b, this.c);
   }

   @Override
   public Iterator<io> iterator() {
      return io.c(this.b, this.c).iterator();
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

   public im a(it $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == it.b.a ? a(this.b, io.b(this.b, this.c.a($$0, $$1))) : a(io.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public im b(it $$0, int $$1) {
      return $$1 == 0 ? this : new im(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public im a(js $$0) {
      return new im(this.b.a($$0), this.c.a($$0));
   }

   public io f() {
      return this.b;
   }

   public io g() {
      return this.c;
   }
}
