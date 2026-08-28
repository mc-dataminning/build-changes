import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hie() implements hig<bxa> {
   public static final Codec<bxa> a = bxa.c;
   public static final hig.a<hie, bxa> b = hig.a.a(MapCodec.unit(new hie()), a);

   @Nullable
   public bxa a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$2 == null ? null : $$2.fx();
   }

   @Override
   public hig.a<hie, bxa> a() {
      return b;
   }

   @Override
   public Codec<bxa> b() {
      return a;
   }
}
