import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yl(String d, @Nullable hl e) implements yk {
   public static final MapCodec<yl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yl::b)).apply($$0, yl::new));
   public static final yk.a<yl> b = new yk.a<>(a, "entity");

   public yl(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hl a(String $$0) {
      try {
         hm $$1 = new hm(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<uk> a(ew $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bue> $$1 = this.e.b($$0);
         return $$1.stream().map(dm::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yk.a<?> a() {
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
         if ($$0 instanceof yl $$1 && this.d.equals($$1.d)) {
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
   public hl c() {
      return this.e;
   }
}
