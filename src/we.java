import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record we(String d, @Nullable gc e) implements wd {
   public static final MapCodec<we> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(we::b)).apply($$0, we::new));
   public static final wd.a<we> b = new wd.a<>(a, "entity");

   public we(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gc a(String $$0) {
      try {
         gd $$1 = new gd(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<sj> a(ds $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends blf> $$1 = this.e.b($$0);
         return $$1.stream().map(cm::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public wd.a<?> a() {
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
         if ($$0 instanceof we $$1 && this.d.equals($$1.d)) {
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
   public gc c() {
      return this.e;
   }
}
