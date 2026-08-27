import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record lc(float d) implements kz {
   public static final Codec<lc> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, lc::new));
   public static final zc<wp, lc> b = zc.a(za.i, $$0 -> $$0.d, lc::new);
   public static final kz.a<lc> c = new kz.a<lc>() {
      public lc a(la<lc> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new lc($$3);
      }
   };

   @Override
   public la<lc> a() {
      return lb.H;
   }

   @Override
   public String a(jc.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", lh.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
