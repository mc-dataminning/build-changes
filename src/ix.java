import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record ix(iz b, iz c) implements Iterable<iz> {
   public static final zn<ByteBuf, ix> a = new zn<ByteBuf, ix>() {
      public ix a(ByteBuf $$0) {
         return new ix(wm.b($$0), wm.b($$0));
      }

      public void a(ByteBuf $$0, ix $$1) {
         wm.a($$0, $$1.f());
         wm.a($$0, $$1.g());
      }
   };

   public ix(final iz b, final iz c) {
      this.b = iz.a(b, c);
      this.c = iz.b(b, c);
   }

   public static ix a(iz $$0) {
      return new ix($$0, $$0);
   }

   public static ix a(iz $$0, iz $$1) {
      return new ix($$0, $$1);
   }

   public ix b(iz $$0) {
      return new ix(iz.a(this.b, $$0), iz.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(iz $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public evm b() {
      return evm.a(this.b, this.c);
   }

   @Override
   public Iterator<iz> iterator() {
      return iz.c(this.b, this.c).iterator();
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

   public ix a(je $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == je.b.a ? a(this.b, iz.b(this.b, this.c.a($$0, $$1))) : a(iz.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public ix b(je $$0, int $$1) {
      return $$1 == 0 ? this : new ix(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public ix a(kd $$0) {
      return new ix(this.b.a($$0), this.c.a($$0));
   }

   public iz f() {
      return this.b;
   }

   public iz g() {
      return this.c;
   }
}
