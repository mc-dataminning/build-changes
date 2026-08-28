import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fxp implements bam {
   a("bitmap", fxm.a.a),
   b("ttf", fxr.a),
   c("space", fim.a.a),
   d("unihex", fxs.b.a),
   e("reference", fxq.a);

   public static final Codec<fxp> f = bam.a(fxp::values);
   private final String g;
   private final MapCodec<? extends fxo> h;

   private fxp(final String $$0, final MapCodec<? extends fxo> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fxo> a() {
      return this.h;
   }
}
