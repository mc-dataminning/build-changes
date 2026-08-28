import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yk(String d, @Nullable gu e) implements yl {
   public static final MapCodec<yk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yk::b)).apply($$0, yk::new));
   public static final yl.a<yk> b = new yl.a<>(a, "block");

   public yk(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gu a(String $$0) {
      try {
         return gs.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ul> a(ew $$0) {
      if (this.e != null) {
         arp $$1 = $$0.e();
         jh $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dsy $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.v()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yl.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "block=" + this.d;
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
   public gu c() {
      return this.e;
   }
}
