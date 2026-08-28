import io.netty.buffer.ByteBuf;

public class zs<B extends ByteBuf, L extends wk> {
   private final zd.a<B, zo<? super L>, zq<? extends zo<? super L>>> a = zd.a(zo::a);
   private final zp b;

   public zs(zp $$0) {
      this.b = $$0;
   }

   public <T extends zo<? super L>> zs<B, L> a(zq<T> $$0, ze<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public ze<B, zo<? super L>> a() {
      return this.a.a();
   }
}
