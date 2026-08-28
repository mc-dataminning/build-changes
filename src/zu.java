import io.netty.buffer.ByteBuf;

public class zu<B extends ByteBuf, L extends wp> {
   private final zg.a<B, zq<? super L>, zs<? extends zq<? super L>>> a = zg.a(zq::a);
   private final zr b;

   public zu(zr $$0) {
      this.b = $$0;
   }

   public <T extends zq<? super L>> zu<B, L> a(zs<T> $$0, zh<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zh<B, zq<? super L>> a() {
      return this.a.a();
   }
}
