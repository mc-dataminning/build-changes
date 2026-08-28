import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record jh(jj b, jj c) implements Iterable<jj> {
   public static final yt<ByteBuf, jh> a = new yt<ByteBuf, jh>() {
      public jh a(ByteBuf $$0) {
         return new jh(vr.b($$0), vr.b($$0));
      }

      public void a(ByteBuf $$0, jh $$1) {
         vr.a($$0, $$1.f());
         vr.a($$0, $$1.g());
      }
   };

   public jh(final jj b, final jj c) {
      this.b = jj.a(b, c);
      this.c = jj.b(b, c);
   }

   public static jh a(jj $$0) {
      return new jh($$0, $$0);
   }

   public static jh a(jj $$0, jj $$1) {
      return new jh($$0, $$1);
   }

   public jh b(jj $$0) {
      return new jh(jj.a(this.b, $$0), jj.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(jj $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public fcp b() {
      return fcp.a(this.b, this.c);
   }

   @Override
   public Iterator<jj> iterator() {
      return jj.c(this.b, this.c).iterator();
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

   public jh a(jo $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jo.b.a ? a(this.b, jj.b(this.b, this.c.a($$0, $$1))) : a(jj.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public jh b(jo $$0, int $$1) {
      return $$1 == 0 ? this : new jh(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public jh a(kn $$0) {
      return new jh(this.b.a($$0), this.c.a($$0));
   }

   public jj f() {
      return this.b;
   }

   public jj g() {
      return this.c;
   }
}
