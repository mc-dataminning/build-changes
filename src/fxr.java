import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fxr implements bao {
   a("bitmap", fxo.a.a),
   b("ttf", fxt.a),
   c("space", fio.a.a),
   d("unihex", fxu.b.a),
   e("reference", fxs.a);

   public static final Codec<fxr> f = bao.a(fxr::values);
   private final String g;
   private final MapCodec<? extends fxq> h;

   private fxr(final String $$0, final MapCodec<? extends fxq> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fxq> a() {
      return this.h;
   }
}
