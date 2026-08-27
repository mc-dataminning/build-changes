import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kz implements kv {
   public static final Codec<kz> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, kz::new));
   public static final ys<wf, kz> b = ys.a(yq.f, $$0 -> $$0.d, kz::new);
   public static final kv.a<kz> c = new kv.a<kz>() {
      public kz a(kw<kz> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new kz($$3);
      }
   };
   private final int d;

   public kz(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(iy.a $$0) {
      return String.format(Locale.ROOT, "%s %d", ld.j.b(this.a()), this.d);
   }

   @Override
   public kw<kz> a() {
      return kx.aS;
   }

   public int b() {
      return this.d;
   }
}
