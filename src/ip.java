import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record ip(ir b, ir c) implements Iterable<ir> {
   public static final zc<ByteBuf, ip> a = new zc<ByteBuf, ip>() {
      public ip a(ByteBuf $$0) {
         return new ip(we.b($$0), we.b($$0));
      }

      public void a(ByteBuf $$0, ip $$1) {
         we.a($$0, $$1.f());
         we.a($$0, $$1.g());
      }
   };

   public ip(ir b, ir c) {
      this.b = ir.a(b, c);
      this.c = ir.b(b, c);
   }

   public static ip a(ir $$0) {
      return new ip($$0, $$0);
   }

   public static ip a(ir $$0, ir $$1) {
      return new ip($$0, $$1);
   }

   public ip b(ir $$0) {
      return new ip(ir.a(this.b, $$0), ir.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(ir $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public ewp b() {
      return ewp.a(this.b, this.c);
   }

   @Override
   public Iterator<ir> iterator() {
      return ir.c(this.b, this.c).iterator();
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

   public ip a(iw $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == iw.b.a ? a(this.b, ir.b(this.b, this.c.a($$0, $$1))) : a(ir.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public ip b(iw $$0, int $$1) {
      return $$1 == 0 ? this : new ip(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public ip a(jv $$0) {
      return new ip(this.b.a($$0), this.c.a($$0));
   }

   public ir f() {
      return this.b;
   }

   public ir g() {
      return this.c;
   }
}
