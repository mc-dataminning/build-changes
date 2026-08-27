import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record ik(im b, im c) implements Iterable<im> {
   public static final yq<ByteBuf, ik> a = new yq<ByteBuf, ik>() {
      public ik a(ByteBuf $$0) {
         return new ik(vs.b($$0), vs.b($$0));
      }

      public void a(ByteBuf $$0, ik $$1) {
         vs.a($$0, $$1.f());
         vs.a($$0, $$1.g());
      }
   };

   public ik(im b, im c) {
      this.b = im.a(b, c);
      this.c = im.b(b, c);
   }

   public static ik a(im $$0) {
      return new ik($$0, $$0);
   }

   public static ik a(im $$0, im $$1) {
      return new ik($$0, $$1);
   }

   public ik b(im $$0) {
      return new ik(im.a(this.b, $$0), im.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(im $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public eta b() {
      return eta.a(this.b, this.c);
   }

   @Override
   public Iterator<im> iterator() {
      return im.c(this.b, this.c).iterator();
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

   public ik a(ir $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == ir.b.a ? a(this.b, im.b(this.b, this.c.a($$0, $$1))) : a(im.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public ik b(ir $$0, int $$1) {
      return $$1 == 0 ? this : new ik(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public ik a(jq $$0) {
      return new ik(this.b.a($$0), this.c.a($$0));
   }

   public im f() {
      return this.b;
   }

   public im g() {
      return this.c;
   }
}
