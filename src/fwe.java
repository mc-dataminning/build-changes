import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fwe implements bak {
   a("bitmap", fwb.a.a),
   b("ttf", fwg.a),
   c("space", fhy.a.a),
   d("unihex", fwh.b.a),
   e("reference", fwf.a);

   public static final Codec<fwe> f = bak.a(fwe::values);
   private final String g;
   private final MapCodec<? extends fwd> h;

   private fwe(final String $$0, final MapCodec<? extends fwd> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fwd> a() {
      return this.h;
   }
}
