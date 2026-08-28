import io.netty.buffer.ByteBuf;

public class zs<B extends ByteBuf, L extends wn> {
   private final ze.a<B, zo<? super L>, zq<? extends zo<? super L>>> a = ze.a(zo::a);
   private final zp b;

   public zs(zp $$0) {
      this.b = $$0;
   }

   public <T extends zo<? super L>> zs<B, L> a(zq<T> $$0, zf<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zf<B, zo<? super L>> a() {
      return this.a.a();
   }
}
