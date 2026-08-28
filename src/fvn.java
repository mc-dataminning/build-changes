import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fvn implements bak {
   a("bitmap", fvk.a.a),
   b("ttf", fvp.a),
   c("space", fhl.a.a),
   d("unihex", fvq.b.a),
   e("reference", fvo.a);

   public static final Codec<fvn> f = bak.a(fvn::values);
   private final String g;
   private final MapCodec<? extends fvm> h;

   private fvn(final String $$0, final MapCodec<? extends fvm> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fvm> a() {
      return this.h;
   }
}
