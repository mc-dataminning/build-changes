import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record jc(je b, je c) implements Iterable<je> {
   public static final zb<ByteBuf, jc> a = new zb<ByteBuf, jc>() {
      public jc a(ByteBuf $$0) {
         return new jc(wa.b($$0), wa.b($$0));
      }

      public void a(ByteBuf $$0, jc $$1) {
         wa.a($$0, $$1.f());
         wa.a($$0, $$1.g());
      }
   };

   public jc(final je b, final je c) {
      this.b = je.a(b, c);
      this.c = je.b(b, c);
   }

   public static jc a(je $$0) {
      return new jc($$0, $$0);
   }

   public static jc a(je $$0, je $$1) {
      return new jc($$0, $$1);
   }

   public jc b(je $$0) {
      return new jc(je.a(this.b, $$0), je.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(je $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public eyn b() {
      return eyn.a(this.b, this.c);
   }

   @Override
   public Iterator<je> iterator() {
      return je.c(this.b, this.c).iterator();
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

   public jc a(jj $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jj.b.a ? a(this.b, je.b(this.b, this.c.a($$0, $$1))) : a(je.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public jc b(jj $$0, int $$1) {
      return $$1 == 0 ? this : new jc(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public jc a(ki $$0) {
      return new jc(this.b.a($$0), this.c.a($$0));
   }

   public je f() {
      return this.b;
   }

   public je g() {
      return this.c;
   }
}
