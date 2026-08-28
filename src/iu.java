import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record iu(iw b, iw c) implements Iterable<iw> {
   public static final ze<ByteBuf, iu> a = new ze<ByteBuf, iu>() {
      public iu a(ByteBuf $$0) {
         return new iu(vy.c($$0), vy.c($$0));
      }

      public void a(ByteBuf $$0, iu $$1) {
         vy.a($$0, $$1.f());
         vy.a($$0, $$1.g());
      }
   };

   public iu(final iw b, final iw c) {
      this.b = iw.a(b, c);
      this.c = iw.b(b, c);
   }

   public static iu a(iw $$0) {
      return new iu($$0, $$0);
   }

   public static iu a(iw $$0, iw $$1) {
      return new iu($$0, $$1);
   }

   public iu b(iw $$0) {
      return new iu(iw.a(this.b, $$0), iw.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(iw $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public ffx b() {
      return ffx.a(this.b, this.c);
   }

   @Override
   public Iterator<iw> iterator() {
      return iw.c(this.b, this.c).iterator();
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

   public iu a(jc $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jc.b.a ? a(this.b, iw.b(this.b, this.c.a($$0, $$1))) : a(iw.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public iu b(jc $$0, int $$1) {
      return $$1 == 0 ? this : new iu(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public iu a(kb $$0) {
      return new iu(this.b.a($$0), this.c.a($$0));
   }

   public iw f() {
      return this.b;
   }

   public iw g() {
      return this.c;
   }
}
