import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record wt(String d, @Nullable gg e) implements ws {
   public static final MapCodec<wt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(wt::b)).apply($$0, wt::new));
   public static final ws.a<wt> b = new ws.a<>(a, "entity");

   public wt(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gg a(String $$0) {
      try {
         gh $$1 = new gh(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<sw> a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bno> $$1 = this.e.b($$0);
         return $$1.stream().map(co::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public ws.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "entity=" + this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wt $$1 && this.d.equals($$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gg c() {
      return this.e;
   }
}
