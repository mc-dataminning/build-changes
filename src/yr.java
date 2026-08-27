import io.netty.buffer.ByteBuf;

public class yr<B extends ByteBuf, L extends vm> {
   private final yd.a<B, yn<? super L>, yp<? extends yn<? super L>>> a = yd.a(yn::a);
   private final yo b;

   public yr(yo $$0) {
      this.b = $$0;
   }

   public <T extends yn<? super L>> yr<B, L> a(yp<T> $$0, ye<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public ye<B, yn<? super L>> a() {
      return this.a.a();
   }
}
