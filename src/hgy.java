import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgy() implements hhf<alf<bwm<?>>> {
   public static final Codec<alf<bwm<?>>> a = alf.a(mg.B);
   public static final hhf.a<hgy, alf<bwm<?>>> b = hhf.a.a(MapCodec.unit(new hgy()), a);

   @Nullable
   public alf<bwm<?>> a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$2 == null ? null : $$2.aq().r().h();
   }

   @Override
   public hhf.a<hgy, alf<bwm<?>>> a() {
      return b;
   }

   @Override
   public Codec<alf<bwm<?>>> b() {
      return a;
   }
}
