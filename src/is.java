import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record is(iu b, iu c) implements Iterable<iu> {
   public static final yu<ByteBuf, is> a = new yu<ByteBuf, is>() {
      public is a(ByteBuf $$0) {
         return new is(vs.b($$0), vs.b($$0));
      }

      public void a(ByteBuf $$0, is $$1) {
         vs.a($$0, $$1.f());
         vs.a($$0, $$1.g());
      }
   };

   public is(final iu b, final iu c) {
      this.b = iu.a(b, c);
      this.c = iu.b(b, c);
   }

   public static is a(iu $$0) {
      return new is($$0, $$0);
   }

   public static is a(iu $$0, iu $$1) {
      return new is($$0, $$1);
   }

   public is b(iu $$0) {
      return new is(iu.a(this.b, $$0), iu.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(iu $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public fdr b() {
      return fdr.a(this.b, this.c);
   }

   @Override
   public Iterator<iu> iterator() {
      return iu.c(this.b, this.c).iterator();
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

   public is a(ja $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == ja.b.a ? a(this.b, iu.b(this.b, this.c.a($$0, $$1))) : a(iu.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public is b(ja $$0, int $$1) {
      return $$1 == 0 ? this : new is(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public is a(jz $$0) {
      return new is(this.b.a($$0), this.c.a($$0));
   }

   public iu f() {
      return this.b;
   }

   public iu g() {
      return this.c;
   }
}
