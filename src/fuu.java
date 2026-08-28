import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fuu implements bai {
   a("bitmap", fur.a.a),
   b("ttf", fuw.a),
   c("space", fgr.a.a),
   d("unihex", fux.b.a),
   e("reference", fuv.a);

   public static final Codec<fuu> f = bai.a(fuu::values);
   private final String g;
   private final MapCodec<? extends fut> h;

   private fuu(final String $$0, final MapCodec<? extends fut> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fut> a() {
      return this.h;
   }
}
