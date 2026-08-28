import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fvg implements bak {
   a("bitmap", fvd.a.a),
   b("ttf", fvi.a),
   c("space", fhd.a.a),
   d("unihex", fvj.b.a),
   e("reference", fvh.a);

   public static final Codec<fvg> f = bak.a(fvg::values);
   private final String g;
   private final MapCodec<? extends fvf> h;

   private fvg(final String $$0, final MapCodec<? extends fvf> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fvf> a() {
      return this.h;
   }
}
