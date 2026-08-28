import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjb() implements hjg<dai> {
   public static final Codec<dai> a = dai.j;
   public static final hjg.a<hjb, dai> b = hjg.a.a(MapCodec.unit(new hjb()), a);

   public dai a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$4;
   }

   @Override
   public hjg.a<hjb, dai> a() {
      return b;
   }

   @Override
   public Codec<dai> b() {
      return a;
   }
}
