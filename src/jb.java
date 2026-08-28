import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record jb(jd b, jd c) implements Iterable<jd> {
   public static final yx<ByteBuf, jb> a = new yx<ByteBuf, jb>() {
      public jb a(ByteBuf $$0) {
         return new jb(vw.b($$0), vw.b($$0));
      }

      public void a(ByteBuf $$0, jb $$1) {
         vw.a($$0, $$1.f());
         vw.a($$0, $$1.g());
      }
   };

   public jb(final jd b, final jd c) {
      this.b = jd.a(b, c);
      this.c = jd.b(b, c);
   }

   public static jb a(jd $$0) {
      return new jb($$0, $$0);
   }

   public static jb a(jd $$0, jd $$1) {
      return new jb($$0, $$1);
   }

   public jb b(jd $$0) {
      return new jb(jd.a(this.b, $$0), jd.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(jd $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public ewv b() {
      return ewv.a(this.b, this.c);
   }

   @Override
   public Iterator<jd> iterator() {
      return jd.c(this.b, this.c).iterator();
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

   public jb a(ji $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == ji.b.a ? a(this.b, jd.b(this.b, this.c.a($$0, $$1))) : a(jd.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public jb b(ji $$0, int $$1) {
      return $$1 == 0 ? this : new jb(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public jb a(kh $$0) {
      return new jb(this.b.a($$0), this.c.a($$0));
   }

   public jd f() {
      return this.b;
   }

   public jd g() {
      return this.c;
   }
}
