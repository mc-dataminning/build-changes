import io.netty.buffer.ByteBuf;

public class za<B extends ByteBuf, L extends vv> {
   private final ym.a<B, yw<? super L>, yy<? extends yw<? super L>>> a = ym.a(yw::a);
   private final yx b;

   public za(yx $$0) {
      this.b = $$0;
   }

   public <T extends yw<? super L>> za<B, L> a(yy<T> $$0, yn<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yn<B, yw<? super L>> a() {
      return this.a.a();
   }
}
