import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record jg(ji b, ji c) implements Iterable<ji> {
   public static final yn<ByteBuf, jg> a = new yn<ByteBuf, jg>() {
      public jg a(ByteBuf $$0) {
         return new jg(vl.b($$0), vl.b($$0));
      }

      public void a(ByteBuf $$0, jg $$1) {
         vl.a($$0, $$1.f());
         vl.a($$0, $$1.g());
      }
   };

   public jg(final ji b, final ji c) {
      this.b = ji.a(b, c);
      this.c = ji.b(b, c);
   }

   public static jg a(ji $$0) {
      return new jg($$0, $$0);
   }

   public static jg a(ji $$0, ji $$1) {
      return new jg($$0, $$1);
   }

   public jg b(ji $$0) {
      return new jg(ji.a(this.b, $$0), ji.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(ji $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public fav b() {
      return fav.a(this.b, this.c);
   }

   @Override
   public Iterator<ji> iterator() {
      return ji.c(this.b, this.c).iterator();
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

   public jg a(jn $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jn.b.a ? a(this.b, ji.b(this.b, this.c.a($$0, $$1))) : a(ji.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public jg b(jn $$0, int $$1) {
      return $$1 == 0 ? this : new jg(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public jg a(km $$0) {
      return new jg(this.b.a($$0), this.c.a($$0));
   }

   public ji f() {
      return this.b;
   }

   public ji g() {
      return this.c;
   }
}
