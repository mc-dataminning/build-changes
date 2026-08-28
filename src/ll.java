import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class ll implements lq {
   private final lr<ll> a;
   private final int b;

   public static MapCodec<ll> a(lr<ll> $$0) {
      return ayv.j.xmap($$1 -> new ll($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zh<? super ByteBuf, ll> b(lr<ll> $$0) {
      return zf.g.a($$1 -> new ll($$0, $$1), $$0x -> $$0x.b);
   }

   private ll(lr<ll> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lr<ll> a() {
      return this.a;
   }

   public float b() {
      return (float)axx.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axx.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axx.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axx.a(this.b) / 255.0F;
   }

   public static ll a(lr<ll> $$0, int $$1) {
      return new ll($$0, $$1);
   }

   public static ll a(lr<ll> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axx.a(1.0F, $$1, $$2, $$3));
   }
}
