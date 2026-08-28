import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yd(Either<hp, String> d, String e) implements ww {
   public static final MapCodec<yd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hp.a, Codec.STRING).fieldOf("name").forGetter(yd::b), Codec.STRING.fieldOf("objective").forGetter(yd::c))
            .apply($$0, yd::new)
   );
   public static final MapCodec<yd> b = a.fieldOf("score");
   public static final ww.a<yd> c = new ww.a<>(b, "score");

   @Override
   public ww.a<?> a() {
      return c;
   }

   private fdy a(ex $$0) throws CommandSyntaxException {
      Optional<hp> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bvs> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fk.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fdy.c($$1.get().a());
         }
      } else {
         return fdy.c((String)this.d.right().orElseThrow());
      }
   }

   private xj a(fdy $$0, ex $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fdz $$3 = $$2.aJ();
         fdr $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fdv $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yo.b));
            }
         }
      }

      return wv.i();
   }

   @Override
   public xj a(@Nullable ex $$0, @Nullable bvs $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wv.i();
      } else {
         fdy $$3 = this.a($$0);
         fdy $$4 = (fdy)($$1 != null && $$3.equals(fdy.cn) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hp, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}
