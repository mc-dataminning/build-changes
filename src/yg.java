import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yg(String d, @Nullable hi e) implements yf {
   public static final MapCodec<yg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yg::b)).apply($$0, yg::new));
   public static final yf.a<yg> b = new yf.a<>(a, "entity");

   public yg(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hi a(String $$0) {
      try {
         hj $$1 = new hj(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<uf> a(et $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends btj> $$1 = this.e.b($$0);
         return $$1.stream().map(dk::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yf.a<?> a() {
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
         if ($$0 instanceof yg $$1 && this.d.equals($$1.d)) {
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
   public hi c() {
      return this.e;
   }
}
