import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ke implements ka {
   public static final Codec<ke> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, ke::new));
   public static final xs<vf, ke> b = xs.a(xq.d, $$0 -> $$0.d, ke::new);
   public static final ka.a<ke> c = new ka.a<ke>() {
      public ke a(kb<ke> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new ke($$3);
      }
   };
   private final int d;

   public ke(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(Locale.ROOT, "%s %d", ki.j.b(this.a()), this.d);
   }

   @Override
   public kb<ke> a() {
      return kc.aT;
   }

   public int b() {
      return this.d;
   }
}
