import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yt(Either<hn, String> d, String e) implements xm {
   public static final MapCodec<yt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hn.a, Codec.STRING).fieldOf("name").forGetter(yt::b), Codec.STRING.fieldOf("objective").forGetter(yt::c))
            .apply($$0, yt::new)
   );
   public static final MapCodec<yt> b = a.fieldOf("score");
   public static final xm.a<yt> c = new xm.a<>(b, "score");

   @Override
   public xm.a<?> a() {
      return c;
   }

   private fav a(ew $$0) throws CommandSyntaxException {
      Optional<hn> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bui> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fj.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fav.c($$1.get().a());
         }
      } else {
         return fav.c((String)this.d.right().orElseThrow());
      }
   }

   private xz a(fav $$0, ew $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         faw $$3 = $$2.aJ();
         fao $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fas $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(ze.b));
            }
         }
      }

      return xl.i();
   }

   @Override
   public xz a(@Nullable ew $$0, @Nullable bui $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xl.i();
      } else {
         fav $$3 = this.a($$0);
         fav $$4 = (fav)($$1 != null && $$3.equals(fav.cz) ? $$1 : $$3);
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
