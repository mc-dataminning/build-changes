import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yr(Either<hn, String> d, String e) implements xk {
   public static final MapCodec<yr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hn.a, Codec.STRING).fieldOf("name").forGetter(yr::b), Codec.STRING.fieldOf("objective").forGetter(yr::c))
            .apply($$0, yr::new)
   );
   public static final MapCodec<yr> b = a.fieldOf("score");
   public static final xk.a<yr> c = new xk.a<>(b, "score");

   @Override
   public xk.a<?> a() {
      return c;
   }

   private fbc a(ew $$0) throws CommandSyntaxException {
      Optional<hn> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bul> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fj.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fbc.c($$1.get().a());
         }
      } else {
         return fbc.c((String)this.d.right().orElseThrow());
      }
   }

   private xx a(fbc $$0, ew $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fbd $$3 = $$2.aJ();
         fav $$4 = $$3.a(this.e);
         if ($$4 != null) {
            faz $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(zc.b));
            }
         }
      }

      return xj.i();
   }

   @Override
   public xx a(@Nullable ew $$0, @Nullable bul $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xj.i();
      } else {
         fbc $$3 = this.a($$0);
         fbc $$4 = (fbc)($$1 != null && $$3.equals(fbc.cA) ? $$1 : $$3);
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
