import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ld implements kz {
   public static final Codec<ld> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, ld::new));
   public static final zc<wp, ld> b = zc.a(za.g, $$0 -> $$0.d, ld::new);
   public static final kz.a<ld> c = new kz.a<ld>() {
      public ld a(la<ld> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new ld($$3);
      }
   };
   private final int d;

   public ld(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(jc.a $$0) {
      return String.format(Locale.ROOT, "%s %d", lh.j.b(this.a()), this.d);
   }

   @Override
   public la<ld> a() {
      return lb.aW;
   }

   public int b() {
      return this.d;
   }
}
