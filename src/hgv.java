import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgv() implements hhf<cxr.a> {
   public static final Codec<cxr.a> a = cxr.a.d;
   public static final hhf.a<hgv, cxr.a> b = hhf.a.a(MapCodec.unit(new hgv()), a);

   public cxr.a a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      dbc $$5 = $$0.a(kj.P);
      if ($$5 == null || $$5.b()) {
         return cxr.a.a;
      } else {
         return $$5.a(czc.vz) ? cxr.a.c : cxr.a.b;
      }
   }

   @Override
   public hhf.a<hgv, cxr.a> a() {
      return b;
   }

   @Override
   public Codec<cxr.a> b() {
      return a;
   }
}
