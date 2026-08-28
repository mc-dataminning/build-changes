import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yk(String d, @Nullable hk e) implements yj {
   public static final MapCodec<yk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yk::b)).apply($$0, yk::new));
   public static final yj.a<yk> b = new yj.a<>(a, "entity");

   public yk(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hk a(String $$0) {
      try {
         hl $$1 = new hl(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<uj> a(ev $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends btz> $$1 = this.e.b($$0);
         return $$1.stream().map(dl::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yj.a<?> a() {
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
         if ($$0 instanceof yk $$1 && this.d.equals($$1.d)) {
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
   public hk c() {
      return this.e;
   }
}
