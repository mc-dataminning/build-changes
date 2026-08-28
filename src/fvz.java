import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fvz implements bak {
   a("bitmap", fvw.a.a),
   b("ttf", fwb.a),
   c("space", fht.a.a),
   d("unihex", fwc.b.a),
   e("reference", fwa.a);

   public static final Codec<fvz> f = bak.a(fvz::values);
   private final String g;
   private final MapCodec<? extends fvy> h;

   private fvz(final String $$0, final MapCodec<? extends fvy> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fvy> a() {
      return this.h;
   }
}
