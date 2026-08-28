import io.netty.buffer.ByteBuf;

public class zz<B extends ByteBuf, L extends wu> {
   private final zl.a<B, zv<? super L>, zx<? extends zv<? super L>>> a = zl.a(zv::a);
   private final zw b;

   public zz(zw $$0) {
      this.b = $$0;
   }

   public <T extends zv<? super L>> zz<B, L> a(zx<T> $$0, zm<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zm<B, zv<? super L>> a() {
      return this.a.a();
   }
}
