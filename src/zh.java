import io.netty.buffer.ByteBuf;

public class zh<B extends ByteBuf, L extends wc> {
   private final yt.a<B, zd<? super L>, zf<? extends zd<? super L>>> a = yt.a(zd::a);
   private final ze b;

   public zh(ze $$0) {
      this.b = $$0;
   }

   public <T extends zd<? super L>> zh<B, L> a(zf<T> $$0, yu<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yu<B, zd<? super L>> a() {
      return this.a.a();
   }
}
