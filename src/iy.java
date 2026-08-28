import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record iy(ja b, ja c) implements Iterable<ja> {
   public static final ys<ByteBuf, iy> a = new ys<ByteBuf, iy>() {
      public iy a(ByteBuf $$0) {
         return new iy(vr.b($$0), vr.b($$0));
      }

      public void a(ByteBuf $$0, iy $$1) {
         vr.a($$0, $$1.f());
         vr.a($$0, $$1.g());
      }
   };

   public iy(final ja b, final ja c) {
      this.b = ja.a(b, c);
      this.c = ja.b(b, c);
   }

   public static iy a(ja $$0) {
      return new iy($$0, $$0);
   }

   public static iy a(ja $$0, ja $$1) {
      return new iy($$0, $$1);
   }

   public iy b(ja $$0) {
      return new iy(ja.a(this.b, $$0), ja.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(ja $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public ewa b() {
      return ewa.a(this.b, this.c);
   }

   @Override
   public Iterator<ja> iterator() {
      return ja.c(this.b, this.c).iterator();
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

   public iy a(jf $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jf.b.a ? a(this.b, ja.b(this.b, this.c.a($$0, $$1))) : a(ja.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public iy b(jf $$0, int $$1) {
      return $$1 == 0 ? this : new iy(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public iy a(ke $$0) {
      return new iy(this.b.a($$0), this.c.a($$0));
   }

   public ja f() {
      return this.b;
   }

   public ja g() {
      return this.c;
   }
}
