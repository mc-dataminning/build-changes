import io.netty.buffer.ByteBuf;

public class zg<B extends ByteBuf, L extends wb> {
   private final ys.a<B, zc<? super L>, ze<? extends zc<? super L>>> a = ys.a(zc::a);
   private final zd b;

   public zg(zd $$0) {
      this.b = $$0;
   }

   public <T extends zc<? super L>> zg<B, L> a(ze<T> $$0, yt<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yt<B, zc<? super L>> a() {
      return this.a.a();
   }
}
