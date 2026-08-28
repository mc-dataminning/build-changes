import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yq(Either<hn, String> d, String e) implements xj {
   public static final MapCodec<yq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hn.a, Codec.STRING).fieldOf("name").forGetter(yq::b), Codec.STRING.fieldOf("objective").forGetter(yq::c))
            .apply($$0, yq::new)
   );
   public static final MapCodec<yq> b = a.fieldOf("score");
   public static final xj.a<yq> c = new xj.a<>(b, "score");

   @Override
   public xj.a<?> a() {
      return c;
   }

   private far a(ew $$0) throws CommandSyntaxException {
      Optional<hn> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bue> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fj.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return far.c($$1.get().a());
         }
      } else {
         return far.c((String)this.d.right().orElseThrow());
      }
   }

   private xw a(far $$0, ew $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fas $$3 = $$2.aJ();
         fak $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fao $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(zb.b));
            }
         }
      }

      return xi.i();
   }

   @Override
   public xw a(@Nullable ew $$0, @Nullable bue $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xi.i();
      } else {
         far $$3 = this.a($$0);
         far $$4 = (far)($$1 != null && $$3.equals(far.cz) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hn, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}
