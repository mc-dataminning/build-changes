import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fxc implements bax {
   a("bitmap", fwz.a.a),
   b("ttf", fxe.a),
   c("space", fiu.a.a),
   d("unihex", fxf.b.a),
   e("reference", fxd.a);

   public static final Codec<fxc> f = bax.a(fxc::values);
   private final String g;
   private final MapCodec<? extends fxb> h;

   private fxc(final String $$0, final MapCodec<? extends fxb> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fxb> a() {
      return this.h;
   }
}
