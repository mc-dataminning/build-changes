import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgx() implements hhf<alf<div>> {
   public static final Codec<alf<div>> a = alf.a(mg.bn);
   public static final hhf.a<hgx, alf<div>> b = hhf.a.a(MapCodec.unit(new hgx()), a);

   @Nullable
   public alf<div> a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hhf.a<hgx, alf<div>> a() {
      return b;
   }

   @Override
   public Codec<alf<div>> b() {
      return a;
   }
}
