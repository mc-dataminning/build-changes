import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fzx(fzy d) {
   public static final fzx a = new fzx(fzy.b);
   public static final Codec<fzx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(fzy.a.optionalFieldOf("scaling", fzy.b).forGetter(fzx::a)).apply($$0, fzx::new)
   );
   public static final aml<fzx> c = aml.a("gui", b);

   public fzy a() {
      return this.d;
   }
}
