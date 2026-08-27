import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class la implements kw {
   public static final MapCodec<la> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, la::new));
   public static final yv<wi, la> b = yv.a(yt.f, $$0 -> $$0.d, la::new);
   public static final kw.a<la> c = new kw.a<la>() {
      public la a(kx<la> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new la($$3);
      }
   };
   private final int d;

   public la(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(iz.a $$0) {
      return String.format(Locale.ROOT, "%s %d", le.j.b(this.a()), this.d);
   }

   @Override
   public kx<la> a() {
      return ky.aV;
   }

   public int b() {
      return this.d;
   }
}
