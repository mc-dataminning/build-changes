import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record vu(String d, @Nullable ge e) implements vt {
   public static final MapCodec<vu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(vu::b)).apply($$0, vu::new));
   public static final vt.a<vu> b = new vt.a<>(a, "entity");

   public vu(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static ge a(String $$0) {
      try {
         gf $$1 = new gf(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<rz> a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bkq> $$1 = this.e.b($$0);
         return $$1.stream().map(cn::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public vt.a<?> a() {
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
         if ($$0 instanceof vu $$1 && this.d.equals($$1.d)) {
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
   public ge c() {
      return this.e;
   }
}
